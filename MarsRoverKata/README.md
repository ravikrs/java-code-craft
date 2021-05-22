## Task
You’re part of the team that explores Mars by sending remotely controlled vehicles to the surface of the planet.
Develop an API that translates the commands sent from earth to instructions that are understood by the rover.
## Functional Requirement
- You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
- The rover receives a character array of commands.
- Implement commands that move the rover forward/backward (f,b).
- Implement commands that turn the rover left/right (l,r).
- Implement wrapping at edges but be careful, planets are spheres. Connect the x edge to the other x edge, so (1,1)
  for x-1 to (5,1), but connect vertical edges towards themselves in inverted coordinates, so (1,1) for y-1 connects to
  (5,1).
- Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle,
  the rover moves up to the last possible point, aborts the sequence and reports the obstacle.
  
## Learnings
- Duplications & Design
- Rule of 3: if there are 3 duplications, create abstractions to reuse.
- Create a method instead of writing comments.
- code being easy to understand wins over removing duplication specially in tests.
- outside-in & inside-out designs in TDD:  stubs and mocks
- inside-out: first test parts of implementation. so first tests pieces of jig-saw and then test the puzzle. 
## Links
- [mars-rover-kata](https://kata-log.rocks/mars-rover-kata)