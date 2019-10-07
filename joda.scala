val jodaDateTime: DateTime = new org.joda.time.DateTime(org.joda.time.DateTimeZone.UTC)

val format = DateTimeFormat.forPattern("yyyy-MM-dd")
println(format.print(jodaDateTime)) // 2019-10-07

println(Instant.now()) // 2019-10-07T11:17:58.023Z 
println(jodaDateTime.withZone(DateTimeZone.forID("Asia/Dhaka"))) // 2019-10-07T17:17:58.023+06:00





