package com.projects.enzoftware.nutricoach.repository

import com.projects.enzoftware.nutricoach.network.NutriCoachApi
import com.projects.enzoftware.nutricoach.network.request.LoginRequest
import com.projects.enzoftware.nutricoach.network.response.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NutriCoachRepositoryImpl : NutriCoachRepository {
    override fun login(email: String, password: String, callback: NutriCoachCallback<LoginResponse>) {
        val request = NutriCoachApi.create().login(LoginRequest(email, password))
        request.enqueue(object: Callback<LoginResponse>{

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                callback.onError()
            }

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                callback.onSuccess(response.body())
            }
        })

    }

    override fun register(
        email: String,
        password: String,
        firstName: String,
        lastName: String,
        callback: NutriCoachCallback<String>
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}