package nz.org.westforce.mobileui.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import nz.org.westforce.mobileui.LoginActivity

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [
        WestforceCreditUnionMobileuiModule::class,
        NetworkModule::class,
        WebServiceModule::class])
    abstract fun injectIntoLoginActivity(): LoginActivity
}