package com.pguese.pfcwa.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.data.Const;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ADAlphabetActivity extends BaseActivity {

    String TAG = "LOG_" + ADAlphabetActivity.class.getSimpleName();

    @BindView(R.id.tvOption1)
    TextView tvOption1;
    @BindView(R.id.tvOption2)
    TextView tvOption2;
    @BindView(R.id.tvOption3)
    TextView tvOption3;
    @BindView(R.id.tvOption4)
    TextView tvOption4;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivSpeak)
    ImageView ivSpeak;

    TextView tvOptions[];

    Random randomizer;
    List<Integer> questionList;
    List<Integer> tempAnswers;
    int currentQuestion;
    int currentAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adalphabet);
        ButterKnife.bind(this);

        startGame();


    }

    private void startGame() {

        tvOptions = new TextView[]{tvOption1, tvOption2, tvOption3, tvOption4};
        questionList = new ArrayList<>();
        randomizer = new Random();

        initQuestion();
    }

    private void initQuestion() {

        currentQuestion = generateQuestion();
        questionList.add(currentQuestion);
        Log.d(TAG, "Question number: " + (questionList.size()) + "\nAnswer: " + currentQuestion + "\nCorresponding Letter: " + Const.alphabet[currentQuestion]);

        generateAnswers();


    }

    private int generateQuestion() {
        int q = -1;

        boolean b = true;
        while (b) {
            q = randomizer.nextInt(26);
            if (questionList.size() == 0)
                b = false;
            for (ctr = 0; ctr < questionList.size(); ctr++)
                if (questionList.get(ctr) != q)
                    b = false;
        }

        return q;
    }

    private void generateAnswers() {
        tempAnswers = new ArrayList<>();
        currentAnswer = randomizer.nextInt(4);
        Log.d(TAG, "Current answer: " + currentAnswer);
        tempAnswers.add(currentAnswer);
        for (ctr = 0; ctr < 4; ctr++) {


//            if (ctr == currentAnswer) {
//                Log.d(TAG, "CTR: " + ctr + " " + currentQuestion);
//                tvOptions[ctr].setText(Const.alphabet[currentQuestion]);
//            } else {
//                int tempAns = getRandomAnswer();
//                tvOptions[ctr].setText(Const.alphabet[tempAns]);
////                Log.d(TAG, "CTR: " + ctr + " " + tempAns);
//            }
//
        }
    }

    private int getRandomAnswer() {
        int ans = -1;

        boolean b = true;
        while (b) {
            ans = randomizer.nextInt(26);
            if (tempAnswers.size() == 0) {
                b = false;
                tempAnswers.add(ans);
            }
            for (ctr = 0; ctr < tempAnswers.size(); ctr++)
                if (tempAnswers.get(ctr) != ans && ans != currentAnswer) {
                    tempAnswers.add(ans);
                    b = false;
                }

        }

        return ans;
    }


    @OnClick({R.id.tvOption1, R.id.tvOption2, R.id.tvOption3, R.id.tvOption4, R.id.ivBack, R.id.ivSpeak})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvOption1:
                selectAnswer(0);
                break;
            case R.id.tvOption2:
                selectAnswer(1);
                break;
            case R.id.tvOption3:
                selectAnswer(2);
                break;
            case R.id.tvOption4:
                selectAnswer(3);
                break;
            case R.id.ivBack:
                break;
            case R.id.ivSpeak:
                break;
        }
    }

    private void selectAnswer(int ans) {
        if (ans == currentAnswer)
            Log.d(TAG, "Answer correct!");
        else
            Log.d(TAG, "Answer incorrect!");
        generateQuestion();
    }
}
