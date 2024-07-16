import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


// @Table(name = "USERS")
@Entity
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

}

