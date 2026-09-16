import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner keyboardOfDestiny = new Scanner(System.in);

        int numberOfSeparateUniverses = keyboardOfDestiny.nextInt();

        while (numberOfSeparateUniverses-- > 0) {

            int populationOfThisParticularPermutation =
                    keyboardOfDestiny.nextInt();

            int[] citizensOfThePermutation =
                    new int[populationOfThisParticularPermutation];

            for (int indexOfTheCurrentlyBeingInterrogatedCitizen = 0;
                 indexOfTheCurrentlyBeingInterrogatedCitizen
                         < populationOfThisParticularPermutation;
                 indexOfTheCurrentlyBeingInterrogatedCitizen++) {

                citizensOfThePermutation[
                        indexOfTheCurrentlyBeingInterrogatedCitizen
                ] = keyboardOfDestiny.nextInt();
            }

            for (int chosenVictimOfTheLexicographicalImprovementProcess = 1;
                 chosenVictimOfTheLexicographicalImprovementProcess
                         < populationOfThisParticularPermutation;
                 chosenVictimOfTheLexicographicalImprovementProcess++) {

                int currentPositionOfTheCitizenTryingToEscapeLeftward =
                        chosenVictimOfTheLexicographicalImprovementProcess;

                while (currentPositionOfTheCitizenTryingToEscapeLeftward > 0) {

                    int unfortunateCitizenStandingOnTheLeft =
                            citizensOfThePermutation[
                                    currentPositionOfTheCitizenTryingToEscapeLeftward - 1
                            ];

                    int ambitiousCitizenDemandingABetterPosition =
                            citizensOfThePermutation[
                                    currentPositionOfTheCitizenTryingToEscapeLeftward
                            ];

                    int numericalDistanceBetweenTheseTwoTroublemakers =
                            Math.abs(
                                    unfortunateCitizenStandingOnTheLeft
                                    - ambitiousCitizenDemandingABetterPosition
                            );

                    if (numericalDistanceBetweenTheseTwoTroublemakers > 1) {

                        citizensOfThePermutation[
                                currentPositionOfTheCitizenTryingToEscapeLeftward - 1
                        ] = ambitiousCitizenDemandingABetterPosition;

                        citizensOfThePermutation[
                                currentPositionOfTheCitizenTryingToEscapeLeftward
                        ] = unfortunateCitizenStandingOnTheLeft;

                        currentPositionOfTheCitizenTryingToEscapeLeftward--;

                    } else {
                        break;
                    }
                }
            }

            for (int positionOfTheFinallyVictoriousPermutationMember = 0;
                 positionOfTheFinallyVictoriousPermutationMember
                         < populationOfThisParticularPermutation;
                 positionOfTheFinallyVictoriousPermutationMember++) {

                System.out.print(
                        citizensOfThePermutation[
                                positionOfTheFinallyVictoriousPermutationMember
                        ] + " "
                );
            }

            System.out.println();
        }

       

	}
}
