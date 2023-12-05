package weekThirteen;


/*
        Map<String, String>capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");
        capitals.put("China", "Beijing");
        capitals.put("Australia", "Canberra");


        capitals.forEach(key, value)->{
            System.out.printf("Country: %s - Capital: %s\n",key, value);
        });
        System.out.printf("The size of the HashMap is %d\n", capitals.size());
        System.out.printf("France is in the HashMap: %b\n",capitals.containsKey("France"));
        System.out.printf("The capital of France is %s\n",capitals.get("France"));
        capitals.remove("France");
*/
        // For extra credit you will trace through this code and analyze the function.
// Write the results for each test case.
        public class Ackermann {
            /**
             This program demonstrates a solution to the
             Ackermann’s Function programming challenge.
             */
            public static void main(String[] args)
            {
                System.out.println("ackermann(0, 0) = " + ackermann(0, 0)); //1.
                System.out.println("ackermann(0, 1) = " + ackermann(0, 1)); //2.
                System.out.println("ackermann(1, 1) = " + ackermann(1, 1)); //3.
                System.out.println("ackermann(1, 2) = " + ackermann(1, 2)); //4.
                System.out.println("ackermann(1, 3) = " + ackermann(1, 3)); //5.
                System.out.println("ackermann(2, 2) = " + ackermann(2, 2)); //6.
                System.out.println("ackermann(3, 2) = " + ackermann(3, 2)); //7.
            }
            /**
             This method implements Ackermann's Function, which
             takes two arguments, m and n.
             parameter m Obviously this is the m argument.
             parameter n Obviously this is the n argument.
             @return The result of Ackermann(m, n).
             */
            public static int ackermann(int m, int n)
            {
                if (m == 0)
                    return n + 1;
                else if (n == 0)
                    return ackermann(m - 1, 1);
                else
                    return ackermann(m - 1, ackermann(m, n - 1));
            }
        }


