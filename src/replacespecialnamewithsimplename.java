public class replacespecialnamewithsimplename {
    public static void main(String[] args) {
        String str= "Dear <|name|> , Thanks a lot";
        str= str.replace("<|name|>","Isha");
        System.out.println(str);
    }
}
