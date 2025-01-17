package site.matzip.review.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import site.matzip.matzip.domain.MatzipType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
public class ReviewDetailDTO {
    private String profileImageUrl;
    private String matzipUrl;
    private Long reviewId;
    private Long authorId;
    private Long loginId;
    private int views;
    private String authorNickname;
    private LocalDateTime createDate;
    private String content;
    private String matzipName;
    private double rating;
    private MatzipType matzipType;
    private String address;
    private String phoneNumber;
    private int heartCount;
    private boolean isHeart;
    private Map<String, String> badgeImage;
    private List<String> imageUrls;

    public String getFormattedCreateDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return createDate.format(formatter);
    }
}