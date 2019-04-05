package nz.org.westforce.data.entities.holidaytest

import org.simpleframework.xml.Namespace
import org.simpleframework.xml.NamespaceList
import org.simpleframework.xml.Root
import org.simpleframework.xml.Element

@Root(name = "Envelope")
@NamespaceList(value = [
    Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance"),
    Namespace(prefix = "xsd", reference = " http://www.w3.org/2001/XMLSchema"),
    Namespace(prefix = "soap12", reference = "http://www.w3.org/2003/05/soap-envelope")])
data class CountriesAvailableResponseEnvelope(
    @Element(required = false, name = "Body") val countryCode: CountryCode)
