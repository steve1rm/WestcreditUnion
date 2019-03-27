package nz.org.westforce.data.network

import io.reactivex.schedulers.Schedulers
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableRequest
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableRequestEnvelope
import javax.inject.Inject

class WebServicesImp @Inject constructor(private val webServices: WebServices) {

    fun requestFromWebService() {
        webServices.getAvailableCountries(CountriesAvailableRequestEnvelope(CountriesAvailableRequest("UK")))
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.trampoline())
            .subscribe()
    }
}