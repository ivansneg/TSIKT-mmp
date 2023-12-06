# TSIKT-mmp-client
# Class Main
- Includes two methods `start` and `main`.
  - `method start`: Contains build lines for an app using `FXMLoader` from JavaFX plugin.
  - `method main`: Launches an application.

# Class LoginController
- Implements logic for login.
  - `method onHelloButtonClick`: Calls and transfers data to the `startClient` method. If the answer is TRUE, switches to the next scene.
  - `method switchOnClick`: Uses the `loadScene` method to load the sign-up GUI.
  - `method loadScene`: Uses try-catch structure to load the Registration scene.
  - `method loadMainScene`: Uses try-catch structure to load the Main scene.

# Class RegController
- Implements registration logic.
  - `method onHelloButtonClick`: Calls and transfers data to the `startClient` method. If the answer is TRUE, switches to the next scene.
  - `method switchOnClick`: Uses the `loadScene` method to load the login GUI.
  - `method loadScene`: Uses try-catch structure to load the Login scene.
  - `method loadMainScene`: Uses try-catch structure to load the Main scene.

# Class MainSceneController
- Implements library loading and scene switching.
  - `method initialize`: Implements book loading logic, which consists of `bookLoader` and `bookIdLoader`.
  - Methods `loadScene1,2,3,4,5a,5b`: Switching between scenes of the library. Access to methods as `loadScene2,5a,5b` is controlled by the `isAdmin` method.
  - `method isAdmin`: Calls check if the user is an Admin. If not, no access.

# Class RequestSceneController
- Implements library loading and scene switching.
  - `method initialize`: Implements request loading logic, which consists of `requestLoader` and `requestIdLoader`.
  - Methods `loadScene1,2,3,4,5a,5b`: Switching between scenes of the library. Access to methods as `loadScene2,5a,5b` is controlled by the `isAdmin` method.
  - `method isAdmin`: Calls check if the user is an Admin. If not, no access.

# Class BookshelfController
- Implements library loading and scene switching.
  - `method initialize`: Implements book loading logic, which consists of `bookLoader` and `bookIdLoader`.
  - Methods `loadScene1,2,3,4,5a,5b`: Switching between scenes of the library. Access to methods as `loadScene2,5a,5b` is controlled by the `isAdmin` method.
  - `method isAdmin`: Calls check if the user is an Admin. If not, no access.

# Class AddBookController
- Implements library loading and scene switching.
  - `method addBookInstances`: Implements book-adding logic. If the answer is TRUE, switches to the next scene.
  - Methods `loadScene1,2,3,4,5a,5b`: Switching between scenes of the library. Access to methods as `loadScene2,5a,5b` is controlled by the `isAdmin` method.
  - `method isAdmin`: Calls check if the user is an Admin. If not, no access.

# Class SettingsController1
- Implements library loading and scene switching.
  - `method onHelloButtonClick`: Implements user registration by admin.
  - Methods `loadScene1,2,3,4,5a,5b`: Switching between scenes of the library. Access to methods as `loadScene2,5a,5b` is controlled by the `isAdmin` method.
  - `method isAdmin`: Calls check if the user is an Admin. If not, no access.

# Class SettingsController2
- Implements library loading and scene switching.
  - `method makeAdmin`: Implements user promotion to admin by admin.
  - Methods `loadScene1,2,3,4,5a,5b`: Switching between scenes of the library. Access to methods as `loadScene2,5a,5b` is controlled by the `isAdmin` method.
  - `method isAdmin`: Calls check if the user is an Admin. If not, no access.

# Class Client
- Implements connection between the client and server.
  - `method Client`: Constructor for the Client class to initialize the object's state.
  - `method bookBorrowing`: Implements book borrowing for the user via request sending.
  - `method bookLoading`: Sends commands to accept books from the server then sends them to GUI.
  - `method bookAdding`: Sends book data to the server.
  - `method startClient`: Sends login and registration data to the server.
  - `method requestLoading`: Sends a command to get requests from the server and sends the answer to GUI.
  - `method isAdmin`: Checks if the user is an admin by sending a request to the server.
  - `method bookApproving`: Sends bookId to the server and adds it to a certain user.
  - `method bookShelfLoading`: Gets books for the user from the server.
  - `method adminAdding`: Sends data to the server to make admin.
  - `method bookDeleting`: Sends a request to delete books.
  - `method bookIdLoader`: Gets book ids from the server.
  - `method deleteRequest`: Deletes requests from the server.

