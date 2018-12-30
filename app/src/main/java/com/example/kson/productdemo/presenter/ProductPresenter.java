package com.example.kson.productdemo.presenter;

import com.example.kson.productdemo.contract.product.ProductContract;
import com.example.kson.productdemo.model.ProductModel;

import java.util.HashMap;

public class ProductPresenter extends ProductContract.ProductPresenter {
    private ProductModel productModel;
    private ProductContract.IProductView productView;

    public ProductPresenter(ProductContract.IProductView productView){

        productModel = new ProductModel();
        this.productView = productView;

    }
    @Override
    public void getProductList(HashMap<String, String> params) {


    }
}
