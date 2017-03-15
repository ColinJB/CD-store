class CD {
  public String mArtistName;
  public String mAlbumName;
  public Integer mYear;
  public Integer mPrice;

  public CD(String artistName, String albumName, Integer year, Integer price) {
    mArtistName = artistName;
    mAlbumName = albumName;
    mYear = year;
    mPrice = price;
  }
}

class Coupon {
  public String mCode;
  public Integer mDiscount;

  public Coupon(String code, Integer discount) {
    mCode = code;
    mDiscount = discount;
  }
}
