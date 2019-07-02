package squash.tournament;

import org.springframework.data.annotation.Id;

public class Tournament {

    @Id
    private String id;
    private String name;

    public Tournament() {
    }

    public Tournament(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
