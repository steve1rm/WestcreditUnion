package nz.org.westforce.mobileui.di

import android.app.Activity
import android.app.Application
import android.app.Service
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasServiceInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class WestforceCreditUnionMobileuiApplication
    : Application(), HasActivityInjector, HasSupportFragmentInjector, HasServiceInjector {

    @Inject
    lateinit var dispatchingAndroidActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingAndroidSupportFragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var dispatchingAndroidServiceInjector: DispatchingAndroidInjector<Service>

    override fun onCreate() {
        super.onCreate()

        DaggerWestforceCreditUnionMobileuiComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> =
        dispatchingAndroidActivityInjector

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
        dispatchingAndroidSupportFragmentInjector

    override fun serviceInjector(): AndroidInjector<Service> =
        dispatchingAndroidServiceInjector
}
