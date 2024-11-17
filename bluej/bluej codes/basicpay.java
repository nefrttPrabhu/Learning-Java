class basicpay
{
    public static void main(double bp)
    {
        double gs,ns,hra,it,dd,pf,da;
        da=0.4*bp;
        hra=0.3*bp;
        pf=0.1*bp;
        it=0.02*bp;
        gs=bp+da+hra;
        dd=pf+it;
        ns=gs-dd;
        System.out.println(ns);
        
    }
}