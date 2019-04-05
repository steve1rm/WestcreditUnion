package nz.org.westforce.data.entities.holidaytest

import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.NamespaceList
import org.simpleframework.xml.Root

@Root(name = "GetCountriesAvailable", strict = false)
@NamespaceList(value = [
    Namespace(reference = "http://www.holidaywebservice.com"),
    Namespace(reference="http://www.w3.org/2003/05/soap-envelope")])
data class CountriesAvailableRequest(
    @Element(name = "GetCountriesAvailable", required = false) val code: String)
