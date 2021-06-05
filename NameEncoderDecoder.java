public class NameEncoderDecoder {

    public String encode(String name) {

        name = name.replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5');

        return "NOTFORYOU".concat(name).concat("YESNOTFORYOU");
    }

    public String decode(String name) {
        String str = "NOTFORYOU";
        String result;

        result = name.replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a')
                .replace("YESNOTFORYOU", "");

        return result.substring(str.length());
    }

//     public static void main(String[] args) {
//         NameEncoderDecoder nameCode = new NameEncoderDecoder();

//         System.out.println(nameCode.encode("Frankoni"));

//         System.out.println(nameCode.decode("NOTFORYOUFr5nk4n3YESNOTFORYOU"));

//         System.out.println(nameCode.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
//     }
}
