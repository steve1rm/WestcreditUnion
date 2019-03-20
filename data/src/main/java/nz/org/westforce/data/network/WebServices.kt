package nz.org.westforce.data.network

import io.reactivex.Observable
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableRequestEnvelope
import nz.org.westforce.data.entities.holidaytest.CountriesAvailableResponseEnvelope
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface WebServices {
    @Headers("Content-Type: text/xml")
    @POST("/HolidayService_v2/HolidayService2.asmx")
    fun getAvailableCountries(@Body countriesAvailableRequest: CountriesAvailableRequestEnvelope): Observable<CountriesAvailableResponseEnvelope>
}
