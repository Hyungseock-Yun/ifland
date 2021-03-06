package com.archive.ifland.domain;

import com.archive.ifland.controller.ProfileForm;
import com.archive.ifland.exception.NotEnoughCountException;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class Profile extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "profile_id")
  private Long id;

  private String iflandNickName;

  private String ifStartYear;

  private String ifStartMonth;

  private String mbti;

  private String team;

  private String image;

  private String contents;

  @OneToMany(mappedBy = "profile")
  private List<Like> likes = new ArrayList<>();

  @OneToMany(mappedBy = "profile")
  private List<Hate> hates = new ArrayList<>();

  private String instagram;

  private String facebook;

  private String blog;

  private String kakaoView;

  private String openKakao;

  private int likeCount;

  @Column(name = "view")
  private int viewCount;

  @OneToMany(mappedBy = "profile")
  private List<ProfileComment> comments = new ArrayList<>();

  @OneToMany(mappedBy = "profile")
  private List<Tag> tags = new ArrayList<>();

  public Profile(ProfileForm profileForm) {
    iflandNickName = profileForm.getIflandNickName();
    ifStartYear = profileForm.getIfStartYear();
    ifStartMonth = profileForm.getIfStartMonth();
    mbti = profileForm.getMbti();
    team = profileForm.getTeam();
    image = profileForm.getImage();
    contents = profileForm.getContents();
    likes = profileForm.getLikes();
    hates = profileForm.getHates();
    instagram = profileForm.getInstagram();
    facebook = profileForm.getFacebook();
    blog = profileForm.getBlog();
    kakaoView = profileForm.getKakaoView();
    openKakao = profileForm.getOpenKakao();
    tags = profileForm.getTags();
  }

}
