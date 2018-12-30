package com.example.kson.productdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kson.productdemo.contract.product.ProductContract;
import com.example.kson.productdemo.presenter.ProductPresenter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements ProductContract.IProductView {

    private ProductPresenter productPresenter;
    @BindView(R.id.xrv_product)
    XRecyclerView mRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

    }

    /**
     *
     */
    private void initData() {
        productPresenter = new ProductPresenter(this);

    }

    @Override
    public void verifyKeywords(String msg) {

    }

    @Override
    public void networkError(String msgg) {

    }

    @Override
    public void failure(String msg, Exception e) {

    }

    @Override
    public void success(String result) {



    }
}
