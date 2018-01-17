package com.pguese.pfcwa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.adapter.AlphabetAdapter;
import com.pguese.pfcwa.data.BundleKeys;
import com.pguese.pfcwa.data.Const;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AlphabetActivity extends BaseActivity {

    @BindView(R.id.gridView)
    GridView gridView;
    @BindView(R.id.ivBack)
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        ButterKnife.bind(this);

        initData();
        initListener();
    }

    private void initData() {
        gridView.setAdapter(new AlphabetAdapter(this));
    }

    private void initListener() {

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (getIntent().getIntExtra(BundleKeys.KEY_DESTINATION, 0) == 0)
                    startActivityForResult(new Intent(getApplicationContext(), FlashcardActivity.class).putExtra(BundleKeys.KEY_INDEX, position), Const.REQ_HOME);
                else
                    startActivityForResult(new Intent(getApplicationContext(), ADAlphabetActivity.class).putExtra(BundleKeys.KEY_INDEX, position), Const.REQ_HOME);
            }
        });
    }

    @OnClick(R.id.ivBack)
    public void onViewClicked() {
        super.onBackPressed();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Const.REQ_HOME && resultCode == RESULT_OK)
            finish();
    }
}
