# HerSheild
**HerShield** aims to be a “One-stop-shop” app for women security. Women can easily notify and start sharing their location by shaking her phone or by 
interaction with the user interface of the application. App has the ability to show the nearest safe location like a police station, railway station and others.
Women get the live location and personal info of the person who accepted the invitation for help. The Key feature of this app is that, For each emergency call,
the App will generate a special notification for those who are near to the woman and verified by Police so that they too can help as soon as possible.
<br/>
## Features
1. **Signup:** Enter an email email and set a password or directly sign in using “Google Sign In” feature.

2. **Personal Info:** Enter name, contact number, house number, street name and city.

<a href="https://drive.google.com/uc?export=view&id=1bxVj9eNj4wJRxY8aSBj_kcMX_hXRhNLO"><img src="https://drive.google.com/uc?export=view&id=1bxVj9eNj4wJRxY8aSBj_kcMX_hXRhNLO" width="200" height ="400" /> </a>  <a href="https://drive.google.com/uc?export=view&id=1GPG_MzrcN4mVLFTAmq0O9xfi-glYPS2k"><img src="https://drive.google.com/uc?export=view&id=1GPG_MzrcN4mVLFTAmq0O9xfi-glYPS2k" width="200" height ="400" /> </a>

3. **Login:** Login using email and password or directly sign in using “Google Sign In” feature.

4. **Track using problem id:** Person can track a woman using specific Problem Id.

5. **Home Page:** 

<a href="https://drive.google.com/uc?export=view&id=1FBybMUCgl3EGdJb-jDXnQZVC5nJaOX8O"><img src="https://drive.google.com/uc?export=view&id=1FBybMUCgl3EGdJb-jDXnQZVC5nJaOX8O" width="200" height ="400" /> </a>  <a href="https://drive.google.com/uc?export=view&id=1OPfu0ZpbdIbP0yOUpIbaifv-M7iaGjxE"><img src="https://drive.google.com/uc?export=view&id=1OPfu0ZpbdIbP0yOUpIbaifv-M7iaGjxE" width="200" height ="400" /> </a>  <a href="https://drive.google.com/uc?export=view&id=1kIFWHjGmG2UzB3gpqWnBTHK02ZZFOXjS"><img src="https://drive.google.com/uc?export=view&id=1kIFWHjGmG2UzB3gpqWnBTHK02ZZFOXjS" width="200" height ="400" /> </a>
   - **Share Location:** You can share your current location with your trusted person whenever you want.
  
   - **Need Help:** It’s the most important element of this app. Click on it whenever you are in trouble and want help from someone.
     You will be directed on the google map screen on clicking it. You can see your live location as well as the live location of the persons who are coming to help you. Markers will get added on the map for every person (tracking/coming to help you). You can see the details of the person on clicking the marker.
    - **Safe Locations:** You can easily get the location of nearby police stations, railway stations, airports and malls.
     - Click on the marker to get more detailed info of the particular safe location.
    - **Mark yourself as Safe:** Notification will be sent to the trusted person that you are safe and the problem will be terminated.
    - **Resend Alert:** You can resend notification to the trusted person.
    - **Take Picture:** Click images using your mobile camera. All the images will be stored in device storage.
      
   - **Shake Service:** The app includes a shake trigger as an emergency trigger for cases when the user is not able to use the interface and press the Need help button.
    - Simply, shake your mobile and only this will do all the things for you like sending notifications to the  trusted persons
  
   - **Audio Recording:** You can turn on the audio recording feature by clicking on “Audio recording button”. This feature will help you a lot when you want to collect some         evidence regarding the problem you had faced in the past.
    - The recorded audio will be saved in your device storage.
    
6. **Profile Page:** See your complete personal info as entered during signup on the personal info screen.

7. **History Page:** You can view the location/coordinate(latitude & longitude) of the path you have followed during a problem.
  * Select a problem id from drop down to see the the report of that problem
  * You can view the images that were clicked by you during the respective problem.
  * You can listen/play the audio that was recorded during the respective problem.
  
<a href="https://drive.google.com/uc?export=view&id=13Uj_AMHjyCRkGw3MS1Hi2y79kpxpCSvU"><img src="https://drive.google.com/uc?export=view&id=13Uj_AMHjyCRkGw3MS1Hi2y79kpxpCSvU" width="200" height ="400" /> 
  
8. **Trusted Person Page:**  See the list of all trusted persons added by you.

9. **Trusted Person Details:** Enter name, contact, email, address and relation and then click on the add person button to add a new trusted person in your list.

<a href="https://drive.google.com/uc?export=view&id=1ypEWaVPOI7BXXJjraJFxeLfRzt3-jI-h"><img src="https://drive.google.com/uc?export=view&id=1ypEWaVPOI7BXXJjraJFxeLfRzt3-jI-h" width="200" height ="400" /> <a href="https://drive.google.com/uc?export=view&id=1X-8Q9b0a64YUlQaZx1sUbXbzv7oEM3wn"><img src="https://drive.google.com/uc?export=view&id=1X-8Q9b0a64YUlQaZx1sUbXbzv7oEM3wn" width="200" height ="400" /> 

## Clone and Build Project
* Run Android Studio and Click on **Get from Version Control**
* Select Git and Paste Url of the repo and then clone the project
* The android studio will automatically download and configure all the required dependencies.\
***Make sure you have active internet connection, otherwise you may get several errors.***

## Technologies

* [Firebase Cloud Messaging](https://firebase.google.com/docs/cloud-messaging/): A cross-platform messaging solution. We used it to share location data between the users.
* [Firebase Realtime_Database](https://firebase.google.com/docs/database/): Realtime Cloud database provided by Firebase to be used by various users simultaneously. We used it to store the profile of the users and also making the connections between different users taking place.
* [Firebase Authentication](https://firebase.google.com/docs/auth/): Firebase Authentication provides backend services, easy-to-use SDKs, and ready-made UI libraries to authenticate users to our app. We used Phone Provider to validate user Phone with OTP. 
* [Google Maps Platform](https://cloud.google.com/maps-platform/): For the maps interface
* [Retrofit](https://square.github.io/retrofit/): A type-safe HTTP client for Android and Java

## Build With

* Android Studio
* Java

## Authors

* <a href="https://www.linkedin.com/in/rahul-dev-762b95179/"> **Rahul Dev** </a> 
* <a href="https://www.linkedin.com/in/ankit-kumar-52777662/"> **Ankit Kumar** </a>
* <a href="https://www.linkedin.com/in/medhavi-srivastava-77976b16a/">  **Medhavi Srivastava** </a>




