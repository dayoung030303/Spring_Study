@Getter
public class BoardResponse {
    private Long boardId;
    private String boardTitle;
    private String boardAuthor;
    private String boardContent;
    private List<Comment> comments;

    public BoardResponse(Board board) {
        this.boardId = board.getBoardId();
        this.boardTitle = board.getBoardTitle();
        this.boardAuthor = board.getBoardAuthor();
        this.boardContent = board.getBoardContent();
        this.comments = board.getComments();
    }
}