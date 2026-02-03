public class SecondWordUppercase {
    public static void main(String[] args){
        String str="hello world java";
        String[] words=str.split("\\s+");
        if(words.length>=2){
            System.out.println(words[1].toUpperCase());
        } else {
            System.out.println("Second word not found");
        }
    }
}