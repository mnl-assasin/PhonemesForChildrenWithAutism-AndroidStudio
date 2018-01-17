package com.pguese.pfcwa.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.data.Const;
import com.pguese.pfcwa.utils.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ADAlphabetActivity extends BaseActivity {

    String TAG = "TAG_" + ADAlphabetSingleActivity.class.getCanonicalName();

    @BindViews({R.id.tvFC1, R.id.tvFC2, R.id.tvFC3, R.id.tvFC4})
    List<TextView> tvFCs;

    @BindViews({R.id.tvItem1, R.id.tvItem2, R.id.tvItem3, R.id.tvItem4, R.id.tvItem5,
            R.id.tvItem6, R.id.tvItem7, R.id.tvItem8, R.id.tvItem9, R.id.tvItem10})
    List<TextView> tvItems;
    @BindView(R.id.ivHome)
    ImageView ivHome;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivSpeak)
    ImageView ivSpeak;

    Random randomizer;

    List<Integer> answers;

    int correctAnswers;
    int currentAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adalphabet);
        ButterKnife.bind(this);

        initGame();
    }

    private void initGame() {

        randomizer = new Random();
        answers = new ArrayList<>();

        correctAnswers = 0;

        generateQuestion();
    }

    private void generateQuestion() {
        int answerIndex = generateAnswer();

        currentAnswer = randomizer.nextInt(4);
        populateOptions(answerIndex);
        updateUI();

    }

    private int generateAnswer() {

        int answer = randomizer.nextInt(26);

        if (answers.size() == 0) {
            answers.add(answer);
            return answer;
        } else if (answers.size() < 25) {
            if (Util.isExist(answers, answer))
                while (Util.isExist(answers, answer))
                    answer = randomizer.nextInt(26);
            answers.add(answer);
            return answer;
        }

        return -1;
    }

    private void populateOptions(int question) {

        List<Integer> options = new ArrayList<>();
        options.add(question);
        for (ctr = 0; ctr < 4; ctr++) {
            if (ctr == currentAnswer) {
                tvFCs.get(ctr).setText(Const.alphabet[question]);
            } else
                tvFCs.get(ctr).setText(Const.alphabet[getOption(options)]);

        }
    }

    private int getOption(List<Integer> options) {
        int option = randomizer.nextInt(26);

        if (Util.isExist(options, option))
            while (Util.isExist(options, option))
                option = randomizer.nextInt(26);

        options.add(option);
        return option;

    }

    @OnClick({R.id.tvFC1, R.id.tvFC2, R.id.tvFC3, R.id.tvFC4, R.id.ivHome, R.id.ivBack, R.id.ivSpeak})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvFC1:
                selectAnswer(0);
                break;
            case R.id.tvFC2:
                selectAnswer(1);
                break;
            case R.id.tvFC3:
                selectAnswer(2);
                break;
            case R.id.tvFC4:
                selectAnswer(3);
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
            tvItems.get(answers.size() - 1).setBackgroundResource(R.drawable.background_item_green);
        } else {
            tvItems.get(answers.size() - 1).setBackgroundResource(R.drawable.background_item_red);
        }
        Log.d(TAG, "Current question size: " + answers.size());
        if (answers.size() < 10)
            generateQuestion();
        else {
            Log.d(TAG, "Total correct options: " + correctAnswers);
        }


    }

    private void updateUI() {

        Log.d(TAG, "Question #: " + answers.size() + " Answer: " + tvFCs.get(currentAnswer).getText());
        tvItems.get(answers.size() - 1).setBackgroundResource(R.drawable.background_item_blue);


    }
}
