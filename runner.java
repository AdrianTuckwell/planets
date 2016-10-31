class Runner{

  public static void main(String[] args){

    Planet planet = new Planet("Mars", 908973);

String name = planet.getName();

int size = planet.getSize();

System.out.println(name + " is " + size);

planet.explode();



}

}