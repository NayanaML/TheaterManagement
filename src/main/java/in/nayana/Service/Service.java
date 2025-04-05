package in.nayana.Service;

import java.util.List;

import in.nayana.Entity.Theater;

public interface Service {
	
	
List<Theater> getAllTheater();

Theater getTheaterById(int id);

void deleteTheater(int id);

void saveTheater(Theater theater);

}
