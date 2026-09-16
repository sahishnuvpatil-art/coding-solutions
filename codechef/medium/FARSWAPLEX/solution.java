import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{


        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        while (cases-- > 0) {

            int size = input.nextInt();
            int[] lineup = new int[size];
            int[] spot = new int[size + 1];

            for (int place = 0; place < size; place++) {
                lineup[place] = input.nextInt();
                spot[lineup[place]] = place;
            }

            ArrayList<Integer>[] rules = new ArrayList[size + 1];

            for (int number = 1; number <= size; number++) {
                rules[number] = new ArrayList<>();
            }

            int[] blockers = new int[size + 1];

            for (int number = 1; number < size; number++) {

                if (spot[number] < spot[number + 1]) {
                    rules[number].add(number + 1);
                    blockers[number + 1]++;
                } else {
                    rules[number + 1].add(number);
                    blockers[number]++;
                }
            }

            PriorityQueue<Integer> choices = new PriorityQueue<>();

            for (int number = 1; number <= size; number++) {
                if (blockers[number] == 0) {
                    choices.add(number);
                }
            }

            while (!choices.isEmpty()) {

                int winner = choices.poll();

                System.out.print(winner + " ");

                for (int follower : rules[winner]) {

                    blockers[follower]--;

                    if (blockers[follower] == 0) {
                        choices.add(follower);
                    }
                }
            }

            System.out.println();
        }

        
	}
}
