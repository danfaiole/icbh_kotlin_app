package fms.android.discipulosembh

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.util.Log
import fms.android.discipulosembh.fragments.VideosFragment

class MainActivity : AppCompatActivity(),
        VideosFragment.OnFragmentInteractionListener
{
    override fun onFragmentInteraction(uri: Uri) {
        Log.i("Fragment", "Deu bom")
    }

    private lateinit var videosFragment: VideosFragment

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, videosFragment)
                    .addToBackStack(videosFragment.toString())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
//                textMessage.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
//                textMessage.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        videosFragment = VideosFragment.newInstance()
    }
}
