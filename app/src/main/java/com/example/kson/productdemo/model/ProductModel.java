package com.example.kson.productdemo.model;

import com.example.kson.productdemo.contract.product.ProductContract;

import java.util.HashMap;

public class ProductModel implements ProductContract.IProductModel {
    @Override
    public void getProductList(String url, HashMap<String, String> params,IproductCallback callback) {

    }

    public interface IproductCallback {

    }
}
