
package Programa;

import entidade.Comment;
import entidade.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        
        Comment c1 = new Comment("Boa Viagem");
        Comment c2 = new Comment("Nossa que legal");
        
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Viagem para Nova Zelandia",
                "Vou visitar esse pais maravilhoso",
                12);
        p1.addComment(c1);
        p1.addComment(c2);
        
        Comment c3 = new Comment("Boa Noite");
        Comment c4 = new Comment("Qua a forca esteja com voce");
        
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Boa Noite galera",
                "Ate amanha",
                5);
        
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
