package squash.tournament;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tournament")
public class TournamentController {

    private final TournamentRepository tournamentRepository;

    public TournamentController(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @GetMapping
    public List<Tournament> getTournaments() {
        return tournamentRepository.findAll();
    }

    @PostMapping
    public void addTournament(@RequestBody Tournament tournament) {
        tournamentRepository.insert(tournament);
    }
}
