package d3dataTypesConcatination;

public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper classlar non-primitivdir
        //Wrapper class: Character-Boolean Short bas harfleri buyuktur
        int i =12;
        //i. yazinca method acilmaz.Burasi primitivedir
        Integer k=12;
        //k. yazinca methodlar acilir.Burasi class sinifindadir ondan dolayi methodlar acilir.Burasi Wrapperdir
        //autoboxing primitive turlerin otomatik olarak esdeger wrapper classlara donusturulmeisdir

        int num=13;
        Integer wrapperNum=num;
        System.out.println(wrapperNum);
        //Wrapper Byte i primitive byte a ceviriniz
        Byte s=19;
        byte primitiveS=s;
        System.out.println(primitiveS);







    }
}
