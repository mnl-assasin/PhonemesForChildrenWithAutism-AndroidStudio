package com.pguese.pfcwa.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.data.Const;
import com.pguese.pfcwa.data.DatabaseHelper;
import com.pguese.pfcwa.widgets.TextViewCG;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FlashcardActivity extends BaseActivity {

    String TAG = FlashcardActivity.class.getSimpleName();

    DatabaseHelper dbHelper;
    SQLiteDatabase db;
    Cursor cursor;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivSpeak)
    ImageView ivSpeak;
    @BindView(R.id.ivFC1)
    ImageView ivFC1;
    @BindView(R.id.ivFC2)
    ImageView ivFC2;
    @BindView(R.id.ivFC3)
    ImageView ivFC3;
    @BindView(R.id.tvFlashcard)
    TextViewCG tvFlashcard;
    @BindView(R.id.ivFlashcard)
    ImageView ivFlashcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {

        dbHelper = DatabaseHelper.getInstance(this);
        db = dbHelper.getReadableDatabase();

        int index = getIntent().getIntExtra(Const.KEY_INDEX, 0);

//        cursor = db.query(DatabaseHelper.TBL_FLASHCARDS, new String[]{"id"}, "id=" + index, null, null, null, "name DESC");
        cursor = db.query(DatabaseHelper.TBL_FLASHCARDS, null, "id=?", new String[]{String.valueOf(index)}, null, null, "name DESC");
//        cursor = db.query(DatabaseHelper.TBL_FLASHCARDS, null, null, null, null, null, null);

        if (cursor != null) {
            Log.d(TAG, "Size: " + cursor.getCount());
            while (cursor.moveToNext()) {
                String name = cursor.getString(cursor.getColumnIndex("name"));
                Log.d(TAG, "Name: " + name);
            }
        }
    }

    @OnClick({R.id.ivBack, R.id.ivSpeak, R.id.ivFC1, R.id.ivFC2, R.id.ivFC3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivBack:
                super.onBackPressed();
                break;
            case R.id.ivSpeak:
                break;
            case R.id.ivFC1:
                break;
            case R.id.ivFC2:
                break;
            case R.id.ivFC3:
                break;
        }
    }
}
