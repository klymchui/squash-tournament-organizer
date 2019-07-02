package squash.tournament;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TournamentRepository extends MongoRepository<Tournament, String> {
}
