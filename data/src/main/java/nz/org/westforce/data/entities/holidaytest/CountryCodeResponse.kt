package nz.org.westforce.data.entities.holidaytest

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "soap12:Body", strict = false)
data class CountryCode(
    @Element(name = "description", required = false) val description: String?,
    @Element(name = "code", required = false) val code: String?)

