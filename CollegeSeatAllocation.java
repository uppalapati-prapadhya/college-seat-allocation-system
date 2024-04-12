import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CollegeSeatAllocation 
{
    static final int MAX_BRANCHES = 5;
    static final int MAX_STUDENTS = 60;
    static class Student {
    int rank;
    String name;
    int[] pref = new int[MAX_BRANCHES];
    }

    public static void allocateSeats(Student[] students, int[][] collegeAllotment, int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < MAX_BRANCHES; j++)
            {
                int college = students[i].pref[j] / 10 - 1;
                int branch = students[i].pref[j] % 10 - 1;
                if (collegeAllotment[college][branch] < 60)
                {
                    collegeAllotment[college][branch]++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int n, m, i, j;
        Scanner scanner;
        System.out.println("\nTHE COLLEGE SEAT ALLOCATION");
        System.out.println("----------------------------");
        System.out.println("<PRINTING FORMAT>");
        System.out.println("<RANK OF THE STUDENT><NAME OF THE STUDENT><ALLOCATED COLLEGE>-<ALLOCATED BRANCH>");
        try
        {
            scanner = new Scanner(new File("sampledata.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not open file");
            return;
        }
            n = scanner.nextInt();
            m = scanner.nextInt();
            Student[] students = new Student[MAX_STUDENTS];
            int[][] collegeAllotment = new int[n][MAX_BRANCHES];
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < m; j++)
                {
                    collegeAllotment[i][j] = 0;
                }
            }
            for (i = 0; i < n; i++)
            {
                students[i] = new Student();
                students[i].rank = scanner.nextInt();
                students[i].name = scanner.next();
                for (j = 0; j < m; j++)
                {
                    students[i].pref[j] = scanner.nextInt();
                }
            }
        scanner.close();
        allocateSeats(students, collegeAllotment, n, m);
        for (i = 0; i < n; i++)
        {
            System.out.print(students[i].rank + " " + students[i].name + " ");
            for (j = 0; j < m; j++)
            {
                int college = students[i].pref[j] / 10 - 1;
                int branch = students[i].pref[j] % 10 - 1;
                if (collegeAllotment[college][branch] > 0)
                {
                    collegeAllotment[college][branch]--;
                    System.out.print((college + 1) + "-" + (branch + 1) + " ");
                    break;
                }
            }
            System.out.println();
        }
    }
}