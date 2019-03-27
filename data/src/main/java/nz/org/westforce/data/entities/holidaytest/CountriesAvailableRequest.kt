package nz.org.westforce.data.entities.holidaytest

import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "GetCountriesAvailable", strict = false)
@Namespace(reference = "http://www.holidaywebservice.com")
data class CountriesAvailableRequest(
    @Element(name = "GetCountriesAvailable", required = false) val code: String)
