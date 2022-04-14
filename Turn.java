public class Turn
{
    private int turnCount;

    public void Turn(int turnCount)
    {
        //counts number of turns
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> runningtotal = new ArrayList<Integer>();
        runningtotal.add(list.get(0));
        int prev_sum = list.get(0);
        int i = 1;
        while (i < list.size())
        {
            prev_sum += list.get(i);
            runningtotal.add(prev_sum);
            i++;
        }
        System.out.println();
        System.out.print("Combat took: " + i);
    }
}

