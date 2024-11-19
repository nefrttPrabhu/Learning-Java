 class ma
 {
public static void main(String[] args)
    {
        Main obj = new Main();
        System.out.println("Enter the plain text: ");
        String text = "fakeflag";
        System.out.println(text);
        System.out.println("Enter the key: ");
        String key = "fakekey";
        System.out.println(key);
        double root = Math.sqrt(key.length());
        if (root != (long) root)
            System.out.println("Invalid key length.");
        else
        {
            int size = (int) root;
               
                System.out.println("Encrypted text = ");
                obj.keyconv(key, size);
                obj.div(text, size);
        }

    }
}