package nz.org.westforce.data.di

import dagger.Component
import nz.org.westforce.data.network.WebServicesImpTest
import javax.inject.Singleton


@Singleton
@Component(modules = [TestNetworkModule::class])
interface TestWestforceCeditUnionComponent {
    fun inject(webServicesImpTest: WebServicesImpTest)
}

/*
@Singleton
@Component(modules = [AndroidInjectionModule::class])
interface TestWestforceCreditUnionMobileuiComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TestWestforceCreditUnionApplication): Builder

        fun build(): TestWestforceCreditUnionMobileuiComponent
    }

    fun inject(application: TestWestforceCreditUnionApplication)
}
*/

