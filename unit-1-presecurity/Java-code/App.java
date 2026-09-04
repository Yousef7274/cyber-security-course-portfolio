public class App {
    public static void main(String[] args) throws Exception {
int luku1 = 2;
int luku2 = 5;
if(luku1 == luku2){
    System.out.println("Numbers are equal");
 } else { 
    System.out.println("Numbers are not equal");
 }

 if(luku1 > luku2){
    System.out.println("It is bigger");
 } else if (luku1 < luku2){
    System.out.println("It is smaller");
 } else {
    System.out.println("Numbers are the same");
 }

 if(luku1 >= luku2){
    System.out.println("It is bigger or the same");
 }

 if(luku1 != luku2){
    System.out.println("Not equal");  
 }

 //tehtävä 2
 int luku3 = 7;

 // 1
 if(luku1 == luku2 || luku2 == luku3){
    System.out.println("luvut 1 ja 2 TAI 2 ja 3 ovat yhtäsuuria.");
 }

 // 2
 if(luku1 > luku2 && luku1 == luku3) {
    System.out.println("luku1 suurempi kuin luku2 JA luku1 yhtä suuri kuin luku3");
 }

 // 3
 if(luku1 == luku2 && luku2 == luku3){
    System.out.println("luku1 ja luku2 ja luku3 yhtä suuria");
 }

// 4
if(luku1 > luku2){
    System.out.println("luku1 suurempi kuin luku2");
} else if (luku2 > luku3) {
    System.out.println("luku2 suurempi kuin luku3");
}
// 5
if(luku1 == luku2){
    System.out.println("1 and 2 are the same");
} else if (luku1 == luku3) {
    System.out.println("1 and 3 are the same");
}

//tehtävä 3
String nimi1 = "Rasmus";
String nimi2 = "Rasmus";
String nimi3 = "Patrik";

if (nimi1.equals(nimi2)){
    System.out.println("nimet ovat samoja");
}
    if (nimi1.equals(nimi2)){
        System.out.println("nimet ovat eri");
    }
if (nimi1.equals(nimi2)){
    System.out.println("1 and 2");
} else if(nimi1.equals(nimi3)){
    System.out.println("1 and 3");
}

}




}
