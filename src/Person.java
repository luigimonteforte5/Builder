public class Person {
	private String firstName;
	private String lastName;
	private Integer age;
	private String address;

	public Person (PersonBuilder personBuilder){
		this.firstName = personBuilder.getFirstName();
		this.lastName = personBuilder.getLastName();
		this.age = personBuilder.getAge();
		this.address = personBuilder.getAddress();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge( int age ) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress( String address ) {
		this.address = address;
	}


	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Nome: ").append(firstName).append(", ");
		res.append("Cognome: ").append(lastName).append(", ");
		if (age != null){
			res.append("Età: ").append(age).append(", ");
		}
		if(address != null){
			res.append("Indirizzo: ").append(address).append(" ");
		}

		return res.toString();
	}

	public static class PersonBuilder{

		private String firstName;
		private String lastName;
		private int age;
		private String address;

		public PersonBuilder(String firstName, String lastName ){
			this.firstName = firstName;
			this.lastName = lastName;
		};

		public PersonBuilder setNome( String firstName ){
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder setCognome( String lastName ){
			this.lastName = lastName;
			return this;
		}

		public PersonBuilder setAge( int age ){
			this.age = age;
			return this;
		}

		public PersonBuilder setAddress( String address ){
			this.address = address;
			return this;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getAge() {
			return age;
		}

		public String getAddress() {
			return address;
		}

		public Person build (){
			return new Person(this);
		}

	}
}
