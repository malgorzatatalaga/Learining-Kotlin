package learn.hyperskill

import kotlinx.datetime.*
import kotlin.time.Duration

fun main() {
    /*
    The Instant class is used to accurately represent a specific moment in time;
    it complies with the UTC-SLS and ISO 8601 standards.
     */
    val instant1 = Instant.parse("2022-01-01T00:00:00Z")

    val instant2 = Instant.parse("2022-02-03T04:05:06Z")

    val instant3 = "2022-02-01T22:10:01.324Z".toInstant()

    val instant4 = "2022-02-01T09:10:01.324+10:00".toInstant()
    /*
    The following line throws a DateTimeParseException
    because Feb 29, 2001 isn't a real date
    val instant = Instant.parse("2001-02-29T00:00:00Z")
    */
    /*
    In order to create an Instant of the current date and time,
    we can use the Clock class as a time provider:
     */
    val currentInstant = Clock.System.now()
    println("Current instant: $currentInstant")
    /*
    The currentSystemDefault() member function provides the computer system time zone,
    while UTC sets the time zone to UTC (denoted as Z in ISO 8601)
     */
    val tz1 = TimeZone.currentSystemDefault()
    val tz2 = TimeZone.UTC
    println("Time zone of the computer system: $tz1")
    println("UTC: $tz2")
    /*
    Any other time zone is set with the help of the of() member function,
    which takes a string as a parameter.
     */
    val tz3 = TimeZone.of("Europe/Paris")
    println(tz3)
    /*
    In case the provided parameter of the of() function isn't valid, the IllegalTimeZoneException is thrown.
     */
    val tz4 = TimeZone.of("UTC+2")
    println(tz4)
    /*
    In order to get the time difference between 2 instants, we can use
    the until(other: Instant, unit: DateTimeUnit, timezone: TimeZone) member function,
    where instant is an instant to compare with, unit of DateTimeUnit class is explained below,
    and timezone is a time zone.
     */
    /*
    This function returns the difference as a whole number in the specified time or date units. The returned value is:
    - positive or zero if instant1 occurs earlier than instant2,
    - negative or zero if instant1 occurs later than instant2,
    - zero if instant1 is equal to instant2.
     */
    println(instant1.until(instant2, DateTimeUnit.WEEK, TimeZone.UTC))
    println(instant1.until(instant2, DateTimeUnit.DAY, TimeZone.UTC))
    println(instant1.until(instant2, DateTimeUnit.HOUR, TimeZone.UTC))
    println(instant1.until(instant2, DateTimeUnit.SECOND, TimeZone.UTC))
    //The time zone parameter of the until() function can be omitted if the DateTimeUnit is smaller than DAY.
    println(instant1.until(instant2, DateTimeUnit.HOUR))
    println(instant1.until(instant2, DateTimeUnit.SECOND))
    /*
    Subtracting two Instant objects creates a Kotlin Duration class object.
     */
    val duration: Duration = instant2 - instant1
    println("Druartion: $duration")
    println("Duration in whole days: ${duration.inWholeDays}")
    println("Duration in whole hours: ${duration.inWholeHours}")
    /*
    Two different Instant objects can be directly compared by using common logic operators,
    as in the following example:
     */
    println("Comparing instant objects:")
    if (instant1 > instant4) println(instant1) else println(instant4)
    /*
    The DateTimePeriod class is used for keeping the difference between two Instant objects
    split into date and time components.
     */
    val period: DateTimePeriod = instant1.periodUntil(instant2, TimeZone.UTC)
    /*
    A difference between two Instant objects can be acquired with the use of
    the periodUntil(other: Instant, timeZone: TimeZone) member function,
    where other is another Instant and timezone is a time zone.
     */
    println("DateTimePeriod object gives the difference as an ISO 8601 duration representation: $period")
    /*
    Date and time components can be accessed from the relevant properties named years,
    months, days, hours, minutes, seconds, and nanoseconds.
     */
    println("Date and time components: Months: ${period.months} Days: ${period.days} Hours: ${period.hours}")
    /*
    An important use of the DateTimePeriod class is to apply a time offset to an Instant
    with the Instant.plus() function, which adds an amount of time to an Instant,
    and the Instant.minus() function, which subtracts an amount of time from an Instant.
     */
    val after = instant1.plus(period, TimeZone.UTC)
    println("$instant1 after $period: $after")
    val before = instant1.minus(period, TimeZone.UTC)
    println("$instant1 before $period: $before")
}