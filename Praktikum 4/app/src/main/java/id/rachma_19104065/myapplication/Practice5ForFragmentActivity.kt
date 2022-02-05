package id.rachma_19104065.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.rachma_19104065.myapplication.databinding.ActivityPractice5ForFragmentBinding

class Practice5ForFragmentActivity  : AppCompatActivity()  {
    private lateinit var binding : ActivityPractice5ForFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPractice5ForFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = Practice5FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(Practice5FirstFragment::class.java.simpleName)

        if (fragment !is Practice5FirstFragment){
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mFirstFragment, Practice5FirstFragment::class.java.simpleName)
                .commit()
        }

    }

}