# Machine Coding Low Level Design of Snakes and Ladders Game

This is a multiplayer implementation of the classic Snakes and Ladders game in Java. It includes the following features:

1. Multiplayer game: Supports multiple players.
2. Customizable board size: The board can be of any square size.
3. Snakes and Ladders: Includes custom entities for snakes and ladders.
4. Non-colliding entities: Ensures that the start and endpoint of snakes and ladders do not collide.
5. Customizable dice: The game uses a customizable dice that produces random numbers.
6. Runnable code: The code is ready to be executed.

## Getting Started

To run the Snakes and Ladders game, follow these steps:

1. Ensure that you have Java installed on your system.
2. Clone or download the repository to your local machine.
3. Open the project in your preferred Java development environment.
4. Compile and run the `Main` class.

## Customizing the Game

You can customize various aspects of the game:

- **Board Size**: Modify the size of the board by providing a different value when creating the `Board` object in the `Main` class.
- **Snakes**: Add or modify snakes by creating `Snake` objects with the desired start and end positions and adding them to the board using the `addEntity()` method.
- **Ladders**: Add or modify ladders by creating `Ladder` objects with the desired start and end positions and adding them to the board using the `addEntity()` method.
- **Dice**: Customize the dice by providing a different number of sides when creating the `Dice` object in the `Main` class.

## Game Execution

1. When you run the game, you will be prompted to enter the number of players.
2. After entering the number of players, the game will start.
3. Players take turns rolling the dice and moving their tokens on the board according to the dice roll.
4. If a player lands on a snake, they move down to the snake's tail.
5. If a player lands on a ladder, they move up to the ladder's top.
6. The game continues until one of the players reaches or exceeds the final position on the board.
7. The winner of the game will be displayed at the end.

## Contributing

Contributions to this Snakes and Ladders game project are welcome. If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This Snakes and Ladders game is released under the [MIT License](https://opensource.org/licenses/MIT).

## Acknowledgements

This game implementation was created by [Your Name]. Special thanks to [Name] for providing guidance and inspiration.
