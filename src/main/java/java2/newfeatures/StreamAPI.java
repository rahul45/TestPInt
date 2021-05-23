package java2.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
//
//        List<Float> productPriceList = new ArrayList<Float>();
//        for(Product product: productsList){
//            // filtering data of list
//            if(product.price<30000){
//                productPriceList.add(product.price);    // adding price to a productPriceList
//            }
//        }
//        System.out.println(productPriceList);   // displaying data
//
//        List<Product> productPriceList2 =productsList.stream()
//                .filter(p -> p.id ==2).collect(Collectors.toList());// filtering data
////                .map(p->p)        // fetching price
////                .collect(Collectors.toList()); // collecting as list
//        System.out.println(productPriceList2);

       //String str= streamIterate();
        //System.out.println(str);
       // primeNumber(50);
        add(5);


    }

    static String streamIterate(){
        Stream.iterate(1,element->element+1)
                .filter(element->element%2==0)
                .filter(element->element>0 && element<10)
                .forEach(element-> System.out.println(element));
        return "Hello";
    }

    static void primeNumber(int n){
        IntStream.rangeClosed(2, n)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                        .allMatch(j -> i%j != 0))
                .forEach(p -> {
                    System.out.println(p);
                });

    }

    static void add(int n){
        if(true){

        }
        int value= Stream.iterate(0,elem->elem+1)
                .limit(n)
                .reduce(0,(result,elem)->result+elem)
                .intValue();
        System.out.println(value);


    }


}

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}