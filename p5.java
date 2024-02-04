import java.util.List;
import java.util.Vector;

public class p5 {
    public static void main(String[] args){
        Board board = new Board();
        board.setTtl("제목1");
        board.setCn("sd");
        board.setWriter("sdf");
        List<Board> list = new Vector<>();
        list.add(board);
        list.add(new Board("제목","내용","작성자"));
        list.add(new Board("제목1","내용2","작성자4"));
        list.add(new Board("제목","내용"));
        System.out.println(list.toString());
        for(int i = 0; i < list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.getCn());
        }

    }

}
class Board{
    private String ttl;
    private String cn;
    private String writer;
    public Board(String ttl, String cn) {
        this.ttl = ttl;
        this.cn = cn;
        this.writer = "관리자";
    }
    public Board() {}
    public Board(String ttl, String cn, String writer){
        this.ttl = ttl;
        this.cn = cn;
        this.writer = writer;
    }
    public String getTtl(){
        return ttl;
    }

    public String getCn() {
        return cn;
    }

    public String getWriter() {
        return writer;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

}
