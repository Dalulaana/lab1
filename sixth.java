public class sixth
{
    public static double power(int a, int n) 
    {
        if (n==0) 
        { return 1; } 
        else if (n>0) 
        { return a*power(a, n- 1); } 
        else 
        { return 1/(a*power(a,-n- 1)); }
    }
    public static void main(String[] args) 
    {
        int a=2;
        int n=10;
        double result=power(a, n);
        System.out.println(a+"^"+n+"="+result);
    }
}
