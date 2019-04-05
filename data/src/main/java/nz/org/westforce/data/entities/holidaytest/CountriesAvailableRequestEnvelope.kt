package nz.org.westforce.data.entities.holidaytest

import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.NamespaceList
import org.simpleframework.xml.Root

@Root(name = "Envelope")
@NamespaceList(value = [
    Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance"),
    Namespace(prefix = "xsd", reference = "http://www.w3.org/2001/XMLSchema"),
    Namespace(prefix = "soap12", reference = "http://www.w3.org/2003/05/soap-envelope")
])
data class CountriesAvailableRequestEnvelope(
    @Element(name = "Body", required = false) val body: Body)

@Root(name = "Body", strict = false)
@Namespace(reference="http://www.w3.org/2003/05/soap-envelope", prefix ="soap12")
data class Body(
    @Element(name = "GetCountriesAvailable", required = false)
    val countriesAvailableRequest: CountriesAvailableRequest)

