public class Main {
	public static void main( String[] args ) {

		Person pers1 = new Person.PersonBuilder("Pietro", "Smusi").setAge(18).build();
		Person pers2 = new Person.PersonBuilder("Mario", "Rossi").setAge(20).setAddress("Via Roma 15").build();

		System.out.println(pers1);
		System.out.println(pers2);

	}
}