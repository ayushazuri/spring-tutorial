#Important Points

1) Make a maven project
2) Add dependencies in the pom file, such as spring-core and spring-context.
3) Make a bean class, which is a POJO class, with some states, setters, and getters.
4) Make a config.xml file which will form the application context from which data will be added by the IOC.
5) Add all dependencies in beans attributes, and make various beans for each object. The IOC will automatically itself make the object with the help of this bean only.
6) You can make different bean, each bean means different objects. Add class to it, which is the path to the specific class and add a name which will be the object 	name.
5) In App.java make a ClassPathXmlApplicationContext which will be the IOC context, Add the file config as a string or string array to it, and a context will be created. 
6) use getBean(name) function of the context to get the bean and get the ready-made object with the help of bean in the config file without actually using the new keyword, thus achieving dependency injection.
7) There are three ways of making a bean, by using property and value elements, by using value as an attribute in property element, by using property as an attribute in bean element with the help of "p" defined in beans explicitly.
8) List, set, maps can also be injected with the help of spring, by using property, list and value element in the bean, or property, set, and value element, or property, map and entry(with attributes as key and value) elements.
9) Autowiring maps injects object to object without having to use the beans and ref in xml. It can be done via xml as well as annotations. It automatically maps and injects the object to another object. It can inject primitive data types or string, only objects.	
10) Autowiring in xml can be done via byName (name of the bean and object), byType (type/class of the bean and Reference type of the object) 