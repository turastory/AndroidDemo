package co.riiid.vida.uichallanges

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.add
import androidx.fragment.app.commitNow
import co.riiid.vida.uichallanges.databinding.MainActivityBinding
import co.riiid.vida.uichallanges.ui.main.BottomFragment
import co.riiid.vida.uichallanges.ui.main.TopFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = MyFragmentFactory()
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commitNow {
                add<TopFragment>(R.id.top_container)
                add<BottomFragment>(R.id.bottom_container)
            }
        }
    }
}

class MyFragmentFactory : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            TopFragment::class.java.name -> TopFragment(5)
            else -> super.instantiate(classLoader, className)
        }
    }
}
