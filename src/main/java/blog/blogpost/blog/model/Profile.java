package blog.blogpost.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;
    private String fName;
    private String lName;
    private String mName;
    private String emailId;
    private String phoneNo;
    private String pImage;
    @OneToOne(fetch = FetchType.EAGER)
    private Address address;
    @ManyToOne
    private List<Post> posts;
    @ManyToOne
    private List<Comment> comments;
}
