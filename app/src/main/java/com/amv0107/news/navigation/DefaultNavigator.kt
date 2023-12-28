package com.amv0107.news.navigation

import com.amv0107.common_utils.Activities
import com.amv0107.common_utils.Navigator
import com.amv0107.news_presentation.GoToNewActivity
import com.amv0107.search_presentation.GoToSearchActivity

class DefaultNavigator: Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when(activities){
            Activities.NewsActivity -> { GoToNewActivity }
            Activities.SearchActivity -> { GoToSearchActivity }
        }
    }
}