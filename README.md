# Overview #
This demo project was created in response to an interview challenge. 

## Project Requirements ##
* Complete the project in five hours.
* Use the Selenium Web Driver.
* Use a Selenium client, such as Firefox, to write browser tests but do not use the Selenium IDE.

## Requested Tests ##
* Log in.
* Create a course.
* Create, edit and delete an announcement.
* Create 20 assignments, then drag first assignment below the 3rd assignment on the course assignments page.

## Creating the Solution ##
Project Language: Java

Project Libraries and Technologies: Selenium, Maven, TestNG, and Lombok.

Rather than hammer out the tests in a static void main method, I built a small framework that uses the Page Object model. 

The framework deals with iFrames, page alerts, and locating elements through various means like: id, class, xpath...etc. 

Framework ideas were influenced by past frameworks I've personally created from scratch or worked with. 

In addition, I had to reference the selenium API documentation to accomplish new things such as reorder the assignments.