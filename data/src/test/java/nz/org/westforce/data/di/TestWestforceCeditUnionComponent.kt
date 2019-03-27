package nz.org.westforce.data.di

import dagger.Component
import nz.org.westforce.data.network.WebServicesImpTest
import javax.inject.Singleton


@Singleton
@Component(modules = [TestNetworkModule::class])
interface TestWestforceCeditUnionComponent {
    fun inject(webServicesImpTest: WebServicesImpTest)
}
