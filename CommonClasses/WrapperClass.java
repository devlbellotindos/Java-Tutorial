public class WrapperClass {
    public static void main(String[] args) {
        
        boolean flag = true;
        Boolean flagObj1 = flag;
        Boolean flagObj2 = Boolean.valueOf(flag);
        Boolean flagObj3 = true;

        System.out.println(flagObj1.toString());
        System.out.println(flagObj2);
        System.out.println(flagObj3);

        char letter = 'L';
        Character letterObj1 = letter;
        Character letterObj2 = Character.valueOf(letter);
        
        System.out.println(letterObj1.toString());
        System.out.println(letterObj2);

        byte header = 0x7F;
        Byte headerObj1 = header;
        Byte headerObj2 = Byte.valueOf(header);

        System.out.println(headerObj1.toString());
        System.out.println(headerObj2);

        short count = 777;
        Short countObj1 = count;
        Short countObj2 = Short.valueOf(count);

        System.out.println(countObj1.toString());
        System.out.println(countObj2);

        int number = 98765;
        Integer numberObj1 = number;
        Integer numberObj2 = Integer.valueOf(number); 

        System.out.println(numberObj1.toString());
        System.out.println(numberObj2);

        long value = 123456789;
        Long valueObj1 = value;
        Long valueObj2 = Long.valueOf(value);

        System.out.println(valueObj1.toString());
        System.out.println(valueObj2);

        float temp = (float)35.6;
        Float tempObj1 = temp;
        Float tempObj2 = Float.valueOf(temp);

        System.out.println(tempObj1.toString());
        System.out.println(tempObj2);

        double pi = 3.14159265358;
        Double piObj1 = pi;
        Double piObj2 = Double.valueOf(pi);
        Double piObj3 = 3.14159265358;

        System.out.println(piObj1.toString());
        System.out.println(piObj2);
        System.out.println(piObj3);
    }
}