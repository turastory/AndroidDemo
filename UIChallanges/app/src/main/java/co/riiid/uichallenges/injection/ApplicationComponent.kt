package co.riiid.uichallenges.injection

import co.riiid.uichallenges.MainActivity
import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}
