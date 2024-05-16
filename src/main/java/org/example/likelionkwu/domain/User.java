@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User{


    @Id
    private String username;

    @Builder
    public User(String username){
        this.username = username;
    }


}