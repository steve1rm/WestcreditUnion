package nz.org.westforce.mobileui.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface WestforceCreditUnionMobileuiComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: WestforceCreditUnionMobileuiApplication): Builder

        fun build(): WestforceCreditUnionMobileuiComponent
    }

    fun inject(application: WestforceCreditUnionMobileuiApplication)
}
