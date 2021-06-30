# Dagger2-Implementation
Experimental project to evaluate implementation details of Dagger 2 and how it helps in performing dependency injection.


//Constructor injection is the recommended way of instanciating a class whenever possbie. It uses the @Inject annotation to identify the constructors of the class that need to be instanciated.

//Field injection is used for android framework classed like Activities and Fragments. Becuase in these class constructor is not accessible so we have to rely on provisional methods to instanciate the class that generally sits at the root of the injection graph.


//Method injection helps in triggering a method that contains reference of the class to be instanciated. In case of method injection we get the referene of the class to be instantiated in the form of this.

//Order of processing: constructor inject ...then field injection .. then method injection

//If the class to be instanciated is not being owned e.g. like a third party class, in such a case create a module and provide methods to create instances of the third party class along with all of its dependencies

//While injecting a value as an argument before instanciating an object, pass the value in the provider module.

//if the provider module contains all static class then mark the class of the provider module as abstract. In this way there is no need to create an instance of the Module class and the provider methods of the module class will be called directly without the compiler having to create an intance of module class.

##V.IMP: If there is an injeciton in the constructor and in the constructor the arguments are of primitive type(String, int, etc.) the compiler checks if in the module these arguments are provided in the argument of the module (and then passed onto the object of the constructor class) that is handling the constructor class if not, then it will check if in the module there is a dedicated @Provides methods for the given data type, if not then it will check if values are binded under COMPONENT.Builder's BindInstance annotation(based on data type)
