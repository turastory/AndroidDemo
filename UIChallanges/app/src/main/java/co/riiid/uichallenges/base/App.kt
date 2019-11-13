package co.riiid.uichallenges.base

import android.app.Application
import co.riiid.uichallenges.injection.DaggerApplicationComponent

class App : Application() {

    val appComponent = DaggerApplicationComponent.create()
}