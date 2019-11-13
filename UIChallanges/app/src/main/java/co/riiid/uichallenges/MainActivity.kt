package co.riiid.uichallenges

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.add
import androidx.fragment.app.commitNow
import co.riiid.uichallenges.base.App
import co.riiid.uichallenges.base.BaseActivity
import co.riiid.vida.uichallanges.databinding.MainActivityBinding
import co.riiid.uichallenges.main.BottomFragment
import co.riiid.uichallenges.main.TopFragment
import co.riiid.vida.uichallanges.R.id
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var runner: Runner

    private lateinit var binding: MainActivityBinding

    override fun injectDependencies() {
        (applicationContext as App).appComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = MyFragmentFactory()
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commitNow {
                add<TopFragment>(id.top_container)
                add<BottomFragment>(id.bottom_container)
            }
        }
    }
}

class MyFragmentFactory : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            TopFragment::class.java.name -> TopFragment(
                5
            )
            else -> super.instantiate(classLoader, className)
        }
    }
}
