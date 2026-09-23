# MyBank

To run backend, open project in IntelliJ or another compiler:
* Create locally MySql database 'mybank', set your db username and password in .env file
* Change your #GMAIL CREDENTIALS in .env file (Google application account)
* Change "profile.pictures.directory" property in 'application.properties' file. Frontend directory path + "/public/profile-pictures"
* Click "Run" arrow in compiler.
* To add roles to database, in your MySql client enter:
  * insert into mybank.roles(id, name) values (1, 'ADMIN')
  * insert into mybank.roles(id, name) values (2, 'CUSTOMER')
  * insert into mybank.roles(id, name) values (3, 'AUDITOR')
* To add admin user, register user and in your MySql client enter:
  * insert into mybank.users_roles(user_id, role_id) values (user_id, 1) #to add admin role
  * insert into mybank.users_roles(user_id, role_id) values (user_id, 3) #to add auditor role
