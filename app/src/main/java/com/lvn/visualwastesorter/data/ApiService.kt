package com.lvn.visualwastesorter.data

import com.lvn.visualwastesorter.ui.post.PostResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    fun getPosts(): Call<ArrayList<PostResponse>>
}