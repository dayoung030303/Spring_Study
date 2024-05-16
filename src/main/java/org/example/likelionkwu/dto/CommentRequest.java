@NoArgsConstructor
@AllArgsContructor
@Getter
public class CommentRequest {
    private Long commentId;
    private String commentAuthor;
    private String commentContent;
    private List<board> board;

    public Board todEntity(){
        return Board.builder().commentId(commentId)
                .commentAuthor(commentAuthor)
                .commentContent(commentContent)
                .board(board)
                .build();
    }
}