val jodaDateTime: DateTime = new org.joda.time.DateTime(org.joda.time.DateTimeZone.UTC)

val format = DateTimeFormat.forPattern("yyyy-MM-dd")
println(format.print(jodaDateTime)) // 2019-10-07

println(Instant.now()) // 2019-10-07T11:25:12.398Z
println(jodaDateTime.withZone(DateTimeZone.forID("Asia/Dhaka"))) // 2019-10-07T17:25:12.398+06:00
println(jodaDateTime.withZone(DateTimeZone.forID("Asia/Kolkata"))) // 2019-10-07T16:55:12.398+05:30







