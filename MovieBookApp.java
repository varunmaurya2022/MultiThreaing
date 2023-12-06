class BookTicketSeat{
	int totalSeat=10;
	void BookSeat(int seats){
		if (totalSeat>=seats){
			System.out.println("Seat Book Successfully!");
			totalSeat=totalSeat-seats;
			System.out.println("Seat Left "+totalSeat);
		}
		else{
			System.out.println("Seat cannot be Booked!");
			System.out.println("Seat Left "+totalSeat);
		}
	}
}
class MovieBookApp extends Thread{
	static BookTicketSeat b;
	int seat;
	public void run(){
		b.BookSeat(seat);
	}
	public static void main(String... args){
		b=new BookTicketSeat();
		MovieBookApp deepak=new MovieBookApp();
		deepak.seat=6;
		deepak.start();
		MovieBookApp varun=new MovieBookApp();
		varun.seat=5;
		varun.start();
	}
} 