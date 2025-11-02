#!/usr/bin/env bash -ex

javac -d bin -cp bin src/game/EightBall.java
javac -d bin -cp bin src/game/EightBallRunner.java
java -cp bin game.EightBallRunner
