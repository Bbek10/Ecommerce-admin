package com.example.kiranapasaadmin.model

data class AddProductModel(
    val productName: String? = "",
    val productDescription: String? = "",
    val productCoverImg: String? = "",
    val productCategory: String? = "",
    val productId: String? = "",

    val productMrp: String? = "",
    val productSp: String? = "",
//    val stock : String? = "",//stock experimental

    val stock: String? = "", //stock_quantity
    //self
    var cart_quantity: String = "",
    val productImages: ArrayList<String>



)
