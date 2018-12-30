package com.example.kson.productdemo.contract.product;

import com.example.kson.productdemo.model.ProductModel;

import java.util.HashMap;

/**
 * 契约类统一管理接口
 */
public interface ProductContract {

   public abstract class ProductPresenter{
       public abstract void getProductList(HashMap<String,String> params);
   }

    interface IProductView{
        void verifyKeywords(String msg);//对必传参数校验
        void networkError(String msgg);
        void failure(String msg,Exception e);
        void success(String result );

    }

    interface IProductModel{
        void getProductList(String url,HashMap<String,String> params,ProductModel.IproductCallback callback);
    }


}
