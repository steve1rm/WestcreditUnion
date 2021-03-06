package nz.org.westforce.mobileui.network

import nz.org.westforce.data.network.WebServicesImp
import nz.org.westforce.mobileui.di.DaggerTestWestforceCreditUnionMobileuiComponent
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import javax.inject.Inject

class TestNetworkRequest {

    @Inject
    lateinit var webServicesImp: WebServicesImp

    @Before
    fun setup() {

        DaggerTestWestforceCreditUnionMobileuiComponent
            .builder()
            .build()
            .inject(this)

    }

    @Test
    fun `webserviceImp should not be null`() {
        assertThat(webServicesImp).isNotNull
    }
}
