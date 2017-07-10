package org.nla.foodtrack;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    private Presenter basePresenter;

    @BindView(R.id.toolbar) Toolbar toolbar;

    protected void setBasePresenter(Presenter presenter) {
        this.basePresenter = presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    @LayoutRes
    public abstract int getContentView();

    @Override
    protected void onStart() {
        super.onStart();
        basePresenter.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        basePresenter.stop();
    }
}
