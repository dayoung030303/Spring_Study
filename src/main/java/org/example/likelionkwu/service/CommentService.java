@RequiredArgsConstructor
@Service
public class CommentService{
    private final  CommentRepository commentRepository;

    public Board save(CommentRequest request){
        return commentRepository.save(request.toEntity());
    }
}