# RealTimeNotificationSystem
It's a Real Time Notification System in which the frontend (React) and backend (Spring Boot) communicate using WebSocket.


Here are the steps to set up and run the project on your system:

Step 1: Setup Backend (Spring Boot)

   1. Clone the Repository
      git clone https://github.com/AbhishekGupta-developer/RealTimeNotificationSystem.git
      cd backend/NotificationSystem

   2. Build and Start the Spring Boot Application
      ./mvnw clean install
      ./mvnw spring-boot:run
      
      Ensure that the backend server is running on https://localhost

Step 2: Setup Frontend (React)

   1. Navigate to the Frontend Directory
      cd ../../frontend/notification-system

   2. Install Dependencies and Start the React Application
      npm install
      npm start
      
      Ensure that the frontend server is running on http://localhost:3000

Step 3: Send a Test Notification

   You can trigger a GET request to send a test message to the backend, which will then push the notification to the frontend.

   Using Postman
      Import the provided Postman collection from the repository (RealTimeNotificationSystem.postman_collection.json).

      Use the collection to send a GET request to:
      https://localhost/send-test-message
     