package in.nayana.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.nayana.Entity.Theater;
import in.nayana.repo.TheaterRepository;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{
@Autowired
private TheaterRepository repo;
	@Override
	public List<Theater> getAllTheater() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Theater getTheaterById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteTheater(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public void saveTheater(Theater theater) {
		// TODO Auto-generated method stub
		repo.save(theater);
	}

}
