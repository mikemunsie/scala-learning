Notes:

- Access map values with ()
- Preferred to use getOrElse to make sure we always have a default
- Easily append or remove using += and -= with mutable maps (encouraged to not use mutable though)
- Scala prefers immutability for multi threading purposes and not locking a map to read it
- Tuples aggregrate values of different types
- Many scala devs enjoy putting all their code on one line... but that makes it unreadable
  Don't be like this guy:
    for (a <- (for (b <- 0 until 10)) yield a * 2.toString((1,2)) // You get the idea