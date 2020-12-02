# Hero Squad

This is an app that allows you to recruit a well-balanced team of superheroes of your choosing.

## Author

* **Lorenah  Mbogo** 

## Demo
<img src="./Screenshot from 2020-11-30 08-39-48.png" width="100%"/>

## Getting Started

CLick on Green button to Clone this repository to your local machine.

Github: [https://github.com/LORENAH-MBOGO/MyHero-Squad]()

### Prerequisites

You need the following installed on your machine
- Java
- JDK - Java Development Kit
- Maven
- Gradle
- An IDE - Intellij


To confirm run the following command on linux
```
$ java --version       //java version
$ mvn --version        //maven version
$ gradle --version     //gradle version
```

## Installing

After cloning to your local machine navigate to the folder you cloned into and open it with intellij.
* Navigate into the ``` src/main/java/App.java ``` and click run in intellij.
* Go to your browser and type ``` localhost:4567 ```

##BEHAVIOUR DRIVEN DEVELOPMENT

| BEHAVIOR:Our program should handle |                  Input Example When it receives                   |           Output Example It should return           |
| ---------------------------------- | :---------------------------------------------------------------: | :-------------------------------------------------: |
| Add a new Squad                            |        Inputs:-maxSize="10" squadName="Avengers" squadCause="Fight Thanos"private String           |               A new squad has been added successfully               |
| Add a new Hero                               |              Input:- heroName="Iron Man" heroAge="42" heroPower="Rich" heroWeakness="The Past"|         A new hero as been added successfully           |
| Assign a hero to a squad                            |               Click add a squad             |                Hero is assigned to the squad               |
| Remove a hero from a squad                            |              click remove user from squad             |               Hero is unassigned from the squad               |
| Delete a squad                            |               Click delete squad            |                Squad is deleted and heroes assigned to that squad unassigned squads               |
| Delete a hero                            |               Click delete hero             |                Hero is deleted           |

## Running the Tests 

Create a test class for running tests in the application.

This is a sample test that tests if the getter method works


## Built With

* [Java](https://www.java.com/) -
* [Intellij Idea](https://www.jetbrains.com/idea/) -
* [Spark]() - Framework


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details



