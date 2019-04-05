package nz.org.westforce.data.network

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import nz.org.westforce.data.entities.holidaytest.Body
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableRequest
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableRequestEnvelope
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableResponseEnvelope
import javax.inject.Inject

class WebServicesImp @Inject constructor(private val webServices: WebServices) {

    fun requestFromWebService() {
        val result = webServices.getAvailableCountries(CountriesAvailableRequestEnvelope(Body(CountriesAvailableRequest("UK"))))
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.trampoline())
            .subscribeWith(object : Observer<CountriesAvailableResponseEnvelope> {
                override fun onComplete() {
                    println("onComplete")
                }

                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(t: CountriesAvailableResponseEnvelope) {
                    println(t.countryCode)
                }

                override fun onError(e: Throwable) {
                    println(e.message)
                }
            })
    }
}