package unit4;
import java.util.Scanner;
class Song {
	String title,author;
	int year;
	String country;
	public Song() {
		
	}
	public Song(int year,String country,String author,String title) {
		this.year=year;
		this.country=country;
		this.author=author;
		this.title=title;
	}
	void show() {
		System.out.print(year+"년 "+country+"국적의 "+author+"가 부른 "+title);
	}
	
	
}
public class ch4_3 {
	public static void main(String[] args) {
		Song song = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		song.show();
	}
}


