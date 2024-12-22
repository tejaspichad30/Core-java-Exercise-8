package Exercise_8;

/*
 *  1. Movie Ticket Booking System:
 *  Create a Movie class with attributes for title, duration, and rating. 
 *  Implement methods to display movie details and check availability. 
 *  Create a Booking class that allows users to book tickets for a specific movie and displays the booking confirmation.
 */
	
	 class Movie
	{
		String title;
		int duration;
		String rating;
		int availableSeats;
		
		// Constructor 
		public Movie(String title,
					int duration,
					String rating,
					int availableSeats)
		{
			this.title = title;
			this.duration = duration;
			this.rating = rating;
			this.availableSeats = availableSeats;
			}
		
		//Method to display movie details 
		public void displayMoiveDetails()
		{
			System.out.println("Title : "+title);
			System.out.println("Duration : "+ duration + " minutes");
			System.out.println("Rating : "+rating);
			System.out.println("Available Seats : " +availableSeats);
			
		}
	}
// BOOKING class 
	class Booking
	{
		String Movie;
		int numberofseats;
		String language;
		String typeofmovie;
		String typeofseats;
		String payment;
		
		
		// Constructor 
		
		public Booking(String Movie,
					   String language,
					   String typeofmovie,
					   String typeofseats,
					   String payment)
		{
			this.Movie = Movie;
			this.language = language;
			this.typeofmovie = typeofmovie;
			this.typeofseats = typeofseats;
			this.payment = payment;
			
		}
		
		public void bookingConformation()
		{
			System.out.println("\n**************Booking Conformatin Status...**************");
			System.out.println("\nBooking for Movie :" + Movie);
			System.out.println("Choose your language : "+language);
			System.out.println("Movie Type : "+typeofmovie);
			System.out.println("Type of Seats : "+typeofseats);
			System.out.println("Payment Option : "+payment);
		}
	}
	public class Q1{
	public static void main(String[] args) {
		
		// Creating movie objects 
		
		Movie Movie1 = new Movie("Pushpa 2: The Rule",150,"8.9 on imdb",100);
		Movie Movie2 = new Movie("Death Note",130,"9.9 on imdb",200);
		Movie Movie3 = new Movie("Final Destination",140,"8.3 on imdb",90);
		
		// Display movie details 
		System.out.println("Movie 1 Details...");
		Movie1.displayMoiveDetails();
		System.out.println();
		
		System.out.println("Movie 2 Details...");
		Movie2.displayMoiveDetails();
		System.out.println();
		
		System.out.println("Movie 3 Details...");
		Movie3.displayMoiveDetails();
		System.out.println();
		
		// creating for booking 
		Booking booking1 = new Booking("Pushpa 2: The Rule","Hindi","3D","Premium","Cash");
		Booking booking2 = new Booking("Death Note","English","2D","Executive","Card");
		Booking booking3 = new Booking("Final Destination","English","3D","Normal","Online");
		
		// Displaying the booking details
		booking1.bookingConformation();
		System.out.println("Your Booking is done successfully");
		System.out.println();
		
		booking2.bookingConformation();
		System.out.println("Your Booking is done successfully");
		System.out.println();
		
		booking3.bookingConformation();
		System.out.println("Your Booking is done successfully");
		System.out.println();
		
		
	}
}
