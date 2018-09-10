import java.util.Scanner;

@SuppressWarnings("unused")

public class project1KelliKnipe_Final {

	public static void main(String[] args) {
		try {
			int programExit = 0; // variable used to loop and end program
			int questionExit = 0; // variable used to move to the next question after each question is answered

			String userInput = " ";
			String userName = "my friend";
			String outputAge = "0";
			String outputMonth = "Month";
			String outputColor = "Color";
			String outputSiblings = "Siblings";
			String smallQuit = "quit";
			String largeQuit = "Quit";
			String smallHelp = "help";
			String largeHelp = "Help";
			int helpSwitch = 0;
			int quitSwitch = 0;

			System.out.println("Welcome to Kelli Knipe's super accurate fortune teller");
			Scanner input = new Scanner(System.in);

			while (programExit < 2 && quitSwitch == 0) {

				System.out.println("Enter \"Help\" at any time for helpful information");
				System.out.println("Enter \"Quit\" at any time to exit the program");
				questionExit = 0;
				// 1) Ask for the user's first and last name

				while (questionExit == 0 && helpSwitch == 0 && quitSwitch == 0) {

					System.out.println("Enter your full name");
					System.out.print("> ");
					userInput = input.nextLine();

					if (userInput.equals(smallHelp) || userInput.equals(largeHelp)) {
						++helpSwitch;
					} else if (userInput.equals(smallQuit) || userInput.equals(largeQuit)) {
						++quitSwitch;
					} else {
						userName = userInput;
						++questionExit;
					}
				}

				while (questionExit == 1 && helpSwitch == 0 && quitSwitch == 0) {
					// 2) Ask for the user's age in integers and determine in how many years they
					// will retire based on their answer
					// Example: 2018
					System.out.println("How many years old are you? (enter using digits)");
					System.out.print("> ");

					userInput = input.nextLine();

					if (userInput.equals(smallHelp) || userInput.equals(largeHelp)) {
						++helpSwitch;
					} else if (userInput.equals(smallQuit) || userInput.equals(largeQuit)) {
						++quitSwitch;
					} else {

						int inputAge = Integer.valueOf(userInput); // inputAge is used for
						// determining userAge

						if (inputAge <= 17) {
							outputAge = "sometime after I die";
							++questionExit;
						} else if (inputAge > 17 && inputAge <= 40 && (inputAge % 3) == 0) {
							outputAge = "in 31 years ";
							++questionExit;
						} else if (inputAge > 17 && inputAge <= 40 && (inputAge % 3) == 1) {
							outputAge = "in 20 years ";
							++questionExit;
						} else if (inputAge > 17 && inputAge <= 40 && (inputAge % 3) == 2) {
							outputAge = "in 28 years ";
							++questionExit;
						} else if (inputAge > 40 && (inputAge % 3) == 0) {
							outputAge = "in 16 years ";
							++questionExit;
						} else if (inputAge > 40 && (inputAge % 3) == 1) {
							outputAge = "in 17 years ";
							++questionExit;
						} else if (inputAge > 40 && (inputAge % 3) == 2) {
							outputAge = "in 5 years ";
							++questionExit;
						}

					}
				}
			
			
			
			
			
		
		// 3) Ask for the user's birth month (project says in integers, but that seems
		// silly so we'll do that one better)
		// and determine the user's bank balance at retirement based on their answer
		// Example: April
		// Example: 4
		while (questionExit == 2 && helpSwitch == 0 && quitSwitch == 0) {
			
			System.out.println("Enter your birth month");
			System.out.print("> ");
			userInput = input.nextLine();
			switch (userInput) {
			case "quit":
			case "Quit":
				++quitSwitch;
				break;
			case "help":
			case "Help":
				++helpSwitch;
				break;
			case "1":
			case "jan":
			case "Jan":
			case "january":
			case "January":
				outputMonth = "$704,925.24";
				++questionExit;
				break;
			case "2":
			case "feb":
			case "Feb":
			case "february":
			case "February":
				outputMonth = "$1,301,901.77";
				++questionExit;
				break;
			case "3":
			case "mar":
			case "Mar":
			case "march":
			case "March":
				outputMonth = "$810,574.03";
				++questionExit;
				break;
			case "4":
			case "apr":
			case "Apr":
			case "april":
			case "April":
				outputMonth = "$1,469,185.45";
				++questionExit;
				break;
			case "5":
			case "may":
			case "May":
				outputMonth = "$894,655.99";
				++questionExit;
				break;
			case "6":
			case "jun":
			case "Jun":
			case "june":
			case "June":
				outputMonth = "$735,506.39";
				++questionExit;
				break;
			case "7":
			case "jul":
			case "Jul":
			case "july":
			case "July":
				outputMonth = "$674947.08";
				++questionExit;
				break;
			case "8":
			case "aug":
			case "Aug":
			case "august":
			case "August":
				outputMonth = "$1116611.66";
				++questionExit;
				break;
			case "9":
			case "sep":
			case "Sep":
			case "sept":
			case "Sept":
			case "september":
			case "September":
				outputMonth = "$736,596.61";
				++questionExit;
				break;
			case "10":
			case "oct":
			case "Oct":
			case "october":
			case "October":
				outputMonth = "$529,096.70";
				++questionExit;
				break;
			case "11":
			case "nov":
			case "Nov":
			case "november":
			case "November":
				outputMonth = "$8,008,135.00";
				++questionExit;
				break;
			case "12":
			case "dec":
			case "Dec":
			case "december":
			case "December":
				outputMonth = "$1,790,013.45";
				++questionExit;
				break;
			default:
				System.out.println("let's try that again");
				outputMonth = "$000,000,000.00";
				break;
			}
		}
		// 4) Ask for the user's favorite ROYGBIV color and determine their future mode
		// of
		// transportation based on their answer
		// Example: Red
		// Example: r
		while (questionExit == 3 && helpSwitch == 0 && quitSwitch == 0) {
			System.out.println("Enter your favorite ROYGBIV color");
			System.out.print("> ");
			userInput = input.nextLine();
			switch (userInput) {
			case "quit":
			case "Quit":
				++quitSwitch;
				break;
			case "help":
			case "Help":
				++helpSwitch;
				break;
			case "r":
			case "R":
			case "red":
			case "Red":
				outputColor = "Rockets";
				++questionExit;
				break;
			case "o":
			case "O":
			case "orange":
			case "Orange":
				outputColor = "Chariot";
				++questionExit;
				break;
			case "y":
			case "Y":
			case "yellow":
			case "Yellow":
				outputColor = "Centaur";
				++questionExit;
				break;
			case "g":
			case "G":
			case "green":
			case "Green":
				outputColor = "Superman's Back";
				++questionExit;
				break;
			case "b":
			case "B":
			case "blue":
			case "Blue":
				outputColor = "Helicopter";
				++questionExit;
				break;
			case "i":
			case "I":
			case "indigo":
			case "Indigo":
				outputColor = "Jet Ski";
				++questionExit;
				break;
			case "v":
			case "V":
			case "violet":
			case "Violet":
				outputColor = "Train";
				++questionExit;
				break;
			default:
				System.out.println("urm, try again?");
				outputColor = "Bionic Legs";
				break;
			}
		}
		// 5) Ask the user how many siblings they have and determine the location of
		// their
		// vacation home based on their answer. Include an answer for negative numbers
		// Example: 15
		while (programExit < 2 && questionExit == 4) {
			System.out.println("How many siblings do you have? (enter in integers)");
			System.out.print("> ");
			userInput = input.nextLine();
			if (userInput.equals(smallHelp) || userInput.equals(largeHelp)) {
				++helpSwitch;
			} else if (userInput.equals(smallQuit) || userInput.equals(largeQuit)) {
				++quitSwitch;
			} else if (!userInput.equals(smallHelp) || !userInput.equals(largeHelp) || !userInput.equals(smallQuit)
					|| !userInput.equals(largeQuit)) {
				if (Integer.valueOf(userInput) == 0) {
					outputSiblings = "Cair Paravel, Narnia";
					++questionExit;
				} else if (Integer.valueOf(userInput) == 1) {
					outputSiblings = "Yoshi's Island, Mushroom Kingdom";
					++questionExit;
				} else if (Integer.valueOf(userInput) == 2) {
					outputSiblings = "Asgard";
					++questionExit;
				} else if (Integer.valueOf(userInput) == 3) {
					outputSiblings = "Europa, Republic of Jupiter";
					++questionExit;
				} else if (Integer.valueOf(userInput) == 4) {
					outputSiblings = "New Home, Kepler-186f";
					++questionExit;
				} else if (Integer.valueOf(userInput) == 5) {
					outputSiblings = "Athshe";
					++questionExit;
				} else if (Integer.valueOf(userInput) == 6) {
					outputSiblings = "Gont, Earthsea";
					++questionExit;
				} else if (Integer.valueOf(userInput) < 0) {
					outputSiblings = "Bellona, United States";
					++questionExit;
				}
			}
		}
		// Finally, display the user's fortune
		// <userName> will retire <outputAge> with <outputMonth> in the bank,
		// a vacation home in <outputSiblings>, and will be getting around by
		// <outputColor>.
		if (questionExit == 5) {
			System.out.println("Let me consult the spirits:");
			System.out.println(userName + " will retire " + outputAge + "with " + outputMonth
					+ " in their bank,\na vacation home in " + outputSiblings + " and will travel by " + outputColor
					+ ".\n");
			++questionExit;
		}
		while (programExit < 1 && quitSwitch == 0 && helpSwitch == 0 && questionExit == 6) {
			System.out.println("Thanks for playing! Would you like to play again?");
			System.out.print("> ");
			userInput = input.nextLine();
			if (userInput.equals("y") || userInput.equals("Y") || userInput.equals("yes") || userInput.equals("Yes")) {
				questionExit = 0;
				programExit = 1;
			} else if (userInput.equals("n") || userInput.equals("N") || userInput.equals("no")
					|| userInput.equals("No")) {
				programExit = 2;
				quitSwitch = 0;
			} else {
				System.out.println("You didn't enter yes or no, please try again, ya dingus.\n");
			}
		}
		if (helpSwitch == 1 && quitSwitch == 0) {
			System.out.println(
					"Helpful tips:\nPress enter to enter an answer\nSiblings are those annoying people you grew up with and didn't like\nThe phrase \"ROYGBIV\" is a fake name representing the colors of a rainbow");
			System.out.println("R: Red");
			System.out.println("O: Orange");
			System.out.println("Y: Yellow");
			System.out.println("G: Green");
			System.out.println("B: Blue");
			System.out.println("I: Indigo");
			System.out.println("V: Violet");
			System.out.print("\n> ");
			helpSwitch = 0;
		}

		if (helpSwitch == 0 && quitSwitch == 1) {
			System.out.println("Nobody likes a quitter, " + userName);
			input.close();
			System.exit(0);
		} else if (helpSwitch == 0 && quitSwitch == 2) {
			System.out.println("Have a great day, goodbye!");
			//input.close();
		}
		}
		// Note: All examples are just example user inputs
		// Stretch Tasks done with while loops:
		// 1) Give the user the ability to quit the program at any time by typing "Quit"
		// or "quit".
		// Print "Nobody likes a quitter..." before exiting program
		// 2) Give the user the ability to type "Help" or "help" at any time and receive
		// troubleshooter documentation
	} catch (NumberFormatException a) {
		System.out.println("Please enter an integer, help, or quit next time, doofus");
	}
}
}

