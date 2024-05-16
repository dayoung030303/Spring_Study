@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/api/board/create")
    public ResponseEntity<Board> createBoard(@RequestBody BoardRequest request){
        Board createdBoard = boardService.createBoard(request.getUsername(), request.getBoardTitle(), request.getBoardContent());
        return new ResponseEntity<>(createdBoard, HttpStatus.CREATED);
    }

    @GetMapping("/api/board")
    public ResponseEntity<List<Board>> totalselectBoard(){
        List<Board> boards = boardService.getAllBoards();
        return new ResponseEntity<>(boards, HttpStatus.OK);
    }

    @GetMapping("/api/board/boardId/{boardId}")
    public ResponseEntity<Board> oneselectBoard(@PathVariable Long boardId){
        Board board = boardService.getBoardById(boardId);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @GetMapping("/api/board/boardAuthor/{boardAuthor}")
    public ResponseEntity<List<Board>> usertotalselectBoard(@RequestParam String boardAuthor){
        List<Board> boards = boardService.getBoardsByAuthor(boardAuthor);
        return new ResponseEntity<>(boards, HttpStatus.OK);
    }
}