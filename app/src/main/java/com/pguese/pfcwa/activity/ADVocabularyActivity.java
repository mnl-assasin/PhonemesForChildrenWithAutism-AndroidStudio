package com.pguese.pfcwa.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.data.BundleKeys;
import com.pguese.pfcwa.data.FlashcardsHelper;
import com.pguese.pfcwa.model.FlashcardItem;
import com.pguese.pfcwa.utils.Util;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ADVocabularyActivity extends BaseActivity {

    @BindViews({R.id.ivFC1, R.id.ivFC2, R.id.ivFC3})
    List<ImageView> ivFCs;
    @BindViews({R.id.tvItem1, R.id.tvItem2, R.id.tvItem3})
    List<TextView> tvItems;
    @BindView(R.id.ivHome)
    ImageView ivHome;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivSpeak)
    ImageView ivSpeak;

    Random randomizer;

    List<FlashcardItem> options;

    int questions[][] = {{0, 1, 2}, {0, 2, 1}, {1, 0, 2},
            {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};

    int questionList[];

    int correctAnswers = 0;
    int currentAnswer;

    int questionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advocabulary);
        ButterKnife.bind(this);

        initGame();
    }

    private void initGame() {
        randomizer = new Random();
        questionList = questions[randomizer.nextInt(questions.length)];

        options = FlashcardsHelper.getFlashcards(getIntent().getIntExtra(BundleKeys.KEY_INDEX, 0));

        generateQuestion();


    }

    private void generateQuestion() {
        currentAnswer = questionList[questionIndex];

        populateOption(currentAnswer);

    }

    private void populateOption(int currentAnswer) {

        List<Integer> options = new ArrayList<>();
        options.add(currentAnswer);
        for (ctr = 0; ctr < 3; ctr++) {
            if (ctr == currentAnswer)
                Picasso.with(getApplicationContext()).load(getFlashcardDrawable(currentAnswer)).into(ivFCs.get(ctr));
            else
                Picasso.with(getApplicationContext()).load(getFlashcardDrawable(getOption(options))).into(ivFCs.get(ctr));
        }
    }

    private int getOption(List<Integer> options) {

        int option = randomizer.nextInt(3);
        if (Util.isExist(options, option))
            while (Util.isExist(options, option))
                option = randomizer.nextInt(26);

        options.add(option);
        return option;

    }

    private int getFlashcardDrawable(int i) {
        return options.get(i).getDrawable();
    }

    @OnClick({R.id.ivFC1, R.id.ivFC2, R.id.ivFC3, R.id.ivHome, R.id.ivBack, R.id.ivSpeak})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivFC1:
                selectAnswer(0);
                break;
            case R.id.ivFC2:
                selectAnswer(1);
                break;
            case R.id.ivFC3:
                selectAnswer(2);
                break;
            case R.id.ivHome:
                break;
            case R.id.ivBack:
                break;
            case R.id.ivSpeak:
                break;
        }
    }

    private void selectAnswer(int i) {
        if (i == currentAnswer) {
            correctAnswers++;
            tvItems.get(questionIndex).setBackgroundResource(R.drawable.background_item_green);
        } else {
            tvItems.get(questionIndex).setBackgroundResource(R.drawable.background_item_red);
        }

        if (questionIndex < 3) {
            questionIndex++;
            generateQuestion();

        } else {
//            Log.d(TAG, "Total correct options: " + correctAnswers);
        }
    }
}
