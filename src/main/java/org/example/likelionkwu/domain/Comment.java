@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId")
    private Long commentId;

    @Column(name = "commentAuthor", nullable = false, updatable = false)
    private String commentAuthor;

    @Column(name = "commentContent", nullable = false, updatable = false)
    private String commentContent;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    @Builder
    public Comment(Long commentId, String commentAuthor, String commentContent, Board board){
        this.commentId = commentId;
        this.commentAuthor = commentAuthor;
        this.commentContent = commentContent;
        this.board = board;
    }
}