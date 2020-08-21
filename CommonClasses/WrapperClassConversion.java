public class WrapperClassConversion {
    public static void main(String[] args) {
        boolean flag = Boolean.parseBoolean("false");
        byte header = Byte.parseByte("-128");
        short count = Short.parseShort("777");
        int number = Integer.parseInt("98765");
        long value = Long.parseLong("123456789");
        float temp = Float.parseFloat("35.6");
        double pi = Double.parseDouble("3.14159265358");

        System.out.println(flag);
        System.out.println(header);
        System.out.println(count);
        System.out.println(number);
        System.out.println(value);
        System.out.println(temp);
        System.out.println(pi);

        System.out.println(Boolean.toString(flag));
        System.out.println(Byte.toString(header));
        System.out.println(Short.toString(count));
        System.out.println(Integer.toString(number));
        System.out.println(Long.toString(value));
        System.out.println(Float.toString(temp));
        System.out.println(Double.toString(pi));        

        System.out.println(Integer.toHexString(127));
        System.out.println(String.format("%X", 127));
        System.out.println(String.format("%b", flag));
    }    
}
