package com.knear.android.provider.response.viewcontractcode

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.knear.android.provider.response.errorresponse.ErrorResponse
import okhttp3.Response

data class ViewContractCodeResult(
    @SerializedName("jsonrpc") var jsonrpc : String? = null,
    @SerializedName("result") var result : Result = Result(),
    @SerializedName("id") var id : String? = null,
    @SerializedName("error") var error: ErrorResponse? = null
) {
    companion object {
        @JvmStatic
        @JvmName("create")
        fun Response.toViewContractCode() : ViewContractCodeResult {
            val gson = Gson()
            if(this.isSuccessful) {
                this.body?.let {
                    return gson.fromJson(it.string(), ViewContractCodeResult::class.java)
                }?: ViewContractCodeResult()
            }
            return ViewContractCodeResult()
        }
    }
}
