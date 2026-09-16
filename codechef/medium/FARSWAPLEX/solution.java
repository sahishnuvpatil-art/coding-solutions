import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

        Scanner portalOfInfiniteKnowledge = new Scanner(System.in);

        int numberOfTimelines = portalOfInfiniteKnowledge.nextInt();

        while (numberOfTimelines-- > 0) {

            int lengthOfTheSacredPermutation =
                    portalOfInfiniteKnowledge.nextInt();

            int[] armyOfNumericalWarriors =
                    new int[lengthOfTheSacredPermutation];

            for (int identityOfTheCurrentlyArrivingWarrior = 0;
                 identityOfTheCurrentlyArrivingWarrior
                         < lengthOfTheSacredPermutation;
                 identityOfTheCurrentlyArrivingWarrior++) {

                armyOfNumericalWarriors[
                        identityOfTheCurrentlyArrivingWarrior
                ] = portalOfInfiniteKnowledge.nextInt();
            }

            for (int battlefieldStartingPoint = 0;
                 battlefieldStartingPoint < lengthOfTheSacredPermutation;
                 battlefieldStartingPoint++) {

                int locationOfTheChosenChampion = battlefieldStartingPoint;

                for (int wanderingWarrior = battlefieldStartingPoint;
                     wanderingWarrior < lengthOfTheSacredPermutation;
                     wanderingWarrior++) {

                    boolean permissionToInvadeTheLeftSide = true;

                    for (int guardianOfTheCurrentTerritory = battlefieldStartingPoint;
                         guardianOfTheCurrentTerritory < wanderingWarrior;
                         guardianOfTheCurrentTerritory++) {

                        if (Math.abs(
                                armyOfNumericalWarriors[wanderingWarrior]
                                - armyOfNumericalWarriors[guardianOfTheCurrentTerritory]
                            ) <= 1) {

                            permissionToInvadeTheLeftSide = false;
                            break;
                        }
                    }

                    if (permissionToInvadeTheLeftSide &&
                        armyOfNumericalWarriors[wanderingWarrior]
                        < armyOfNumericalWarriors[locationOfTheChosenChampion]) {

                        locationOfTheChosenChampion = wanderingWarrior;
                    }
                }

                int treasureCarriedByTheChosenChampion =
                        armyOfNumericalWarriors[locationOfTheChosenChampion];

                for (int backwardsMarch = locationOfTheChosenChampion;
                     backwardsMarch > battlefieldStartingPoint;
                     backwardsMarch--) {

                    armyOfNumericalWarriors[backwardsMarch] =
                            armyOfNumericalWarriors[backwardsMarch - 1];
                }

                armyOfNumericalWarriors[battlefieldStartingPoint] =
                        treasureCarriedByTheChosenChampion;
            }

            for (int finalVictoryPosition = 0;
                 finalVictoryPosition < lengthOfTheSacredPermutation;
                 finalVictoryPosition++) {

                System.out.print(
                        armyOfNumericalWarriors[finalVictoryPosition] + " "
                );
            }

            System.out.println();
        }


	}
}
