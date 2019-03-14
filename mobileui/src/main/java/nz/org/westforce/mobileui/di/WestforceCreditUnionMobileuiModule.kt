package nz.org.westforce.mobileui.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
class WestforceCreditUnionMobileuiModule {

    @Reusable
    @Provides
    fun provideContext(westforceCreditUnionMobileuiApplication: WestforceCreditUnionMobileuiApplication): Context =
        westforceCreditUnionMobileuiApplication.applicationContext
}
