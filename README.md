Reminder Application
====================

Getting Started
---------------

To build and test

    mvn package

Configuration
-------------

To run, create an `application.properties` file in the directory you intend
to run the jar from and include:

    twilio.account.sid=YOUR_ACCOUNT_SID
    twilio.auth.token=YOUR_AUTH_TOKEN
    twilio.from.phone=REGISTERED_NUMBER_TO_SEND_SMS_FROM

Run With Spring Boot
--------------------

    mvn spring-boot:run -Dspring.profiles.active=production -Demail=registeredemail@example.com

Run Jar
-------

After creating the jar with `mvn package`:

    java -jar target/reminder-1.0-SNAPSHOT.jar --spring.profiles.active=production --email=registeredemail@example.com
