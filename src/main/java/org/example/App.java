package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Leader of Array" );

        Integer inc[];
        Integer sol[];

        Solution solution = new Solution();

        Integer a1[] = {2, 1, 3, 1, 2, 2, 3};
        solution.printArray(a1);
        sol = solution.solution(3, 5, a1);
        solution.printArray(sol);

        Integer a2[] = {2, 1, 3, 1, 2, 2, 3};
        inc = solution.increment(1,3, a2);
        solution.printArray(inc);
        sol = solution.solution(1, 3, inc);
        solution.printArray(sol);

        Integer a3[] = {2, 1, 3, 1, 2, 2, 3};
        inc = solution.increment(3,3, a3);
        solution.printArray(inc);
        sol = solution.solution(3, 5, inc);
        solution.printArray(sol);

        Integer a4[] = {1, 2, 2, 1, 2};
        solution.printArray(a4);
        sol = solution.solution(4, 2, a4);
        solution.printArray(sol);

        Integer a5[] = {1, 2, 2, 1, 2};
        inc = solution.increment(0,4, a5);
        solution.printArray(inc);
        sol = solution.solution(4, 2, inc);
        solution.printArray(sol);

    }
}
