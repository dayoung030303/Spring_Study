@NoArgsConstructor
@AllArgsContructor
@Getter
public class BoardRequest {
    private Long boardId;
    private String boardTitle;
    private String boardAuthor;
    private String boardContent;
    private List<Comment> comments;

    public Board todEntity(){
        return Board.builder().boardId(boardId)
                .boardTitle(boardTitle)
                .boardAuthor(boardAuthor)
                .boardContent(boardContent)
                .comments(comments)
                .build();
    }
}