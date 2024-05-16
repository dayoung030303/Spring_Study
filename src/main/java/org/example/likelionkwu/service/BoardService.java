@RequiredArgsConstructor
@Service
public class BoardService{
    private final  BoardRepository boardRepository;

    public Board save(BoardRequest request){
        return boardRepository.save(request.toEntity());
    }
}