# TSIKT-mmp-client
Semestral project on java for subject TSIKT
Class Main-includes two methods start and main. 
      method start - contains build lines for an app using FXMLoader from JavaFx plugin.
      method main - launches an application.
Class LoginController - implement logic for login.
      method onHelloButtonClick - Call and transfer data to startClient method.If answer of method is TRUE switches to next scene.
      method switchOnClick - using method loadScene loads sign up GUI.
      method loadScene - using try catch structure to load Registration scene.
      method loadMainScene - using try catch structure to load Main scene.
Class RegController - implemnts registration logic.
      method onHelloButtonClick - Call and transfer data to startClient method.If answer of method is TRUE switches to next scene.
      method switchOnClick - using method loadScene loads sign up GUI.
      method loadScene - using try catch structure to load Login scene.
      method loadMainScene - using try catch structure to load Main scene.
Class MainSceneController - implements library loading and scene switching
      method initialize - implements bookloading logic.Which consists of bookLoader and bookIdLoader.
      method loadScene1,2,3,4,5a,5b - switching between scenes of library.Access to method as loadScene2,5a,5b  is controlled by isAdmin method.
      method isAdmin - calls check if user is Admin.if not no access.
Class RequestSceneController - implements library loading and scene switching
      method initialize - implements requestloading logic.Which consists of requestLoader and requestIdLoader.
      method loadScene1,2,3,4,5a,5b - switching between scenes of library.Access to method as loadScene2,5a,5b  is controlled by isAdmin method.
      method isAdmin - calls check if user is Admin.if not no access.
Class BookshelfController - implements library loading and scene switching
      method initialize - implements bookloading logic.Which consists of bookLoader and bookIdLoader.
      method loadScene1,2,3,4,5a,5b - switching between scenes of library.Access to method as loadScene2,5a,5b  is controlled by isAdmin method.
      method isAdmin - calls check if user is Admin.if not no access.
Class AddBookController - implements library loading and scene switching
      method addBookInstances - implements bookadding logic.If answer of method is TRUE switches to next scene.
      method loadScene1,2,3,4,5a,5b - switching between scenes of library.Access to method as loadScene2,5a,5b  is controlled by isAdmin method.
      method isAdmin - calls check if user is Admin.if not no access.
Class SettingsController1 - implements library loading and scene switching
      method onHelloButtonClick - implements user registration by admin.
      method loadScene1,2,3,4,5a,5b - switching between scenes of library.Access to method as loadScene2,5a,5b  is controlled by isAdmin method.
      method isAdmin - calls check if user is Admin.if not no access.
Class SettingsController2 - implements library loading and scene switching
      method makeAdmin - implements user promotion to admin by admin.
      method loadScene1,2,3,4,5a,5b - switching between scenes of library.Access to method as loadScene2,5a,5b  is controlled by isAdmin method.
      method isAdmin - calls check if user is Admin.if not no access.
Class Client-implements connection between client and server.
      method Client - constuctor for Client class to initialize state of object.
      method bookBorrowing - implements book borrowing for user via request sending.
      method bookLoading - send commands to accept books from server then send them to GUI.
      method bookAdding - send book data to server.
      method startClient - send login and registration data to server.
      method requestLoading - send command to get request from server and send answer to GUI.
      method isAdmin - checks if user is admin by sending request to server.
      method bookApproving - send bookId to server and adding it to certain user
      method bookShelfLoading - get books for user from server.
      method adminAdding - send data to server to make admin.
      method bookDeleting - send request to delete books.
      method bookIdLoader - get book id's from the server.
      method deleteRequest - delete requests from the server.
