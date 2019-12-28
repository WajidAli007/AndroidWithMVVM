package com.blueprint.architecture.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blueprint.architecture.myapplication.ui.movielist.MovieListFragment.Companion.newInstance

/**
 * Created by Wajid Ali
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, newInstance())
                    .commitNow()
        }
    }
}