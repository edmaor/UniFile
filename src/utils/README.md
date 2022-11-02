# UTILS
### CLONER
> We all know how ☕️Java works when copying an object, for those hwo don't know yet here's a little explanation:<br>
> Let's say you have an object User user1, and you want to make a copy of it:
```
User user1 = new User ("Edu", "Martorell);
User user2 = user1;

system.out.println(user1.getName()) -> Edu
system.out.println(user2.getName()) -> Edu
```
<img src="../staticfiles/javaCopy1.png" alt="javaCopy1" height="256">

> The result of this is that you now have two users in different variables that point at the same memory unit.<br>
> The problem of this is that when you change one, you change both.<br>
> So if you would want to change user2's name to **Victor** you would do this:
```
user2.setName("Victor")
system.out.println(user2.getName()) -> Victor

system.out.println(user1.getName()) -> Victor
```
---
###### The Objective:
> This only happens when you are working with non-primitive types, so we have the solution is to break each object to primitive types.
> But some objects have other objects in it... So just break them into primitive types again! 

<img src="../staticfiles/javaDeepCopy.png" alt="javaDeepCopy" height="256">

###### METHODS

| Modifier & Type | Method & Link                             |
|:---------------:|:------------------------------------------|
|     Object      | [cloneObject(Object _obj_)](#cloneobject) |

###### CloneObject
Makes a deep copy of an object, it gets stored in a different memory unit.
> Object cloneObject(Object object)
> * object -> The object to clone