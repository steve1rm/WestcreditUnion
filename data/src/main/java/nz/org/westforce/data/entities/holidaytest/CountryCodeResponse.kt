package nz.org.westforce.data.entities.holidaytest

import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "Body", strict = false)
@Namespace(reference="http://www.w3.org/2003/05/soap-envelope")
data class CountryCode(
    @Element(name = "description", required = false) val description: String?,
    @Element(name = "code", required = false) val code: String?)

