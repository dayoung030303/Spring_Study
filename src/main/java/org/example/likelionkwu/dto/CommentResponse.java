@Getter
public class CommentResponse {
    private Long commentId;
    private String commentAuthor;
    private String commentContent;
    private List<board> board;

    public CommentResponse(Comment comment) {
        this.commentId = comment.getCommentId();
        this.commentAuthor = comment.getCommentAuthor();
        this.commentContent = comment.getCommentContent();
        this.board = comment.getBoard();
    }
}