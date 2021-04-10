String name = "Fluffy";
String name1 = "Fluffy";
String name2 = new String("Fluffy");
name == name1
name == name2
String name3 = "Fluf"+"fy";
String name4 = "Fluf";
name4+= "fy"
name == name3
name == name4
String x = "Hello World";
String y = " Hello World".trim();
x == y
String singleString = "hello world";
String concat = "hello";
concat+=" world"
singleString == concat
String secondString = new String("hello world");
secondString = secondString.intern()
singleString == secondString
String first = "rat"+1;
String second = "r"+"a"+"t"+1;
String third = "r"+"a"+"t"+ new String("1");
first == second
first == second.intern()
first == third
first == third.intern()