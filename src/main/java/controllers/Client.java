package controllers;

public class Client {

   String MobilePhone;
   int BonusRoleType;
   int CouponRoleType;

    public Client(String mobilePhone, int bonusRoleType, int couponRoleType) {
        MobilePhone = mobilePhone;
        BonusRoleType = bonusRoleType;
        CouponRoleType = couponRoleType;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
    }

    public int getBonusRoleType() {
        return BonusRoleType;
    }

    public void setBonusRoleType(int bonusRoleType) {
        BonusRoleType = bonusRoleType;
    }

    public int getCouponRoleType() {
        return CouponRoleType;
    }

    public void setCouponRoleType(int couponRoleType) {
        CouponRoleType = couponRoleType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
