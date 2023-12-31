package src.main.java.com.socialnetwork.api.model.additional.keys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class BookmarkPk implements Serializable {
  @Column(name = "user_id")
  private int userId;

  @Column(name = "post_id")
  private int postId;

  public BookmarkPk() {
  }

  public BookmarkPk(int userId, int postId) {
    this.userId = userId;
    this.postId = postId;
  }
}
