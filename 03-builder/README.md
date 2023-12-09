# Builder Design Pattern Example

This example demonstrates the use of the Builder design pattern to build a car with two
trims: base (a.k.a. standard) and full (a.k.a full option or fully loaded).
A base trim is the simplest trim level in cars and a fully loaded car is the highest trim level available with most or all features included.

#
This is an example of the Builder design pattern in Java. The Builder is an inner static class within the Car class. It's used to construct a Car object piece by piece.

The Builder's constructor takes five parameters: `make`, `model`, `year`, `trimType`, and `transmission`, which are required attributes for a Car object.

The Builder has fields for `LeatherUpholstery`, `HeatedSeats`, `FrontSensors`, `RearSensors`, and `VacuumCleaner`, which are optional features for a car.

The Builder pattern allows for more readable code and makes it easier to handle many constructor parameters, especially when some of them are optional and the process of constructing an object is step-by-step.

## Usage

```shell
javac -d ./out $(find . | grep .java)
cd out
java App
```

```
Adding AM/FM Radio
Adding rear sensors
Car: Toyota Hilux 2023 base Manual transmission with 6 speeds.
The following trim specific features are also included: radio, rear sensors.


--------------------------------------

Adding AM/FM Radio
Adding rear sensors
Adding front sensors
Adding navigation
Adding leather upholstery.
Adding heated seats
Adding vacuum cleaner.
Car: Ford F-150 2023 full Automatic transmission with 10 speeds.
The following trim specific features are also included: radio, navigation, leather upholstery, heated seats, front sensors, rear sensors, vacuum cleaner.
```