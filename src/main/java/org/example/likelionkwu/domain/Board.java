@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardId")
    private Long boardId;

    @Column(name = "boardTitle", nullable = false, updatable = false)
    private String boardTitle;

    @Column(name = "boardAuthor", nullable = false, updatable = false)
    private String boardAuthor;

    @Column(name = "boardContent", nullable = false, updatable = false)
    private String boardContent;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @Builder
    public Board(Long boardId, String boardTitle, String boardAuthor, String boardContent, List<Comment> comments){
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardAuthor = boardAuthor;
        this.boardContent = boardContent;
        this.comments = comments;
    }
}