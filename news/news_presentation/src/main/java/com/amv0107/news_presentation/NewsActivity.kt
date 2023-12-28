package com.amv0107.news_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amv0107.common_utils.Navigator

class NewsActivity : AppCompatActivity() {

    companion object{
        fun launchActivity(activity: Activity) {
            val intent = Intent(activity, NewsActivity::class.java)
            activity.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}

object GoToNewActivity: Navigator {
    override fun navigate(activity: Activity) {
        NewsActivity.launchActivity(activity)
    }
}