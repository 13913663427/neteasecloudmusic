package com.example.taojun.neteasecloudmusic.item;

import java.util.List;

public class UserItem {

    /**
     * loginType : 1
     * code : 200
     * account : {"id":122563748,"userName":"1_18251986292","type":1,"status":0,"whitelistAuthority":0,"createTime":1452495500473,"salt":"[B@6b56dc69","tokenVersion":0,"ban":0,"baoyueVersion":0,"donateVersion":0,"vipType":0,"viptypeVersion":0,"anonimousUser":false}
     * profile : {"detailDescription":"","djStatus":0,"followed":false,"avatarImgIdStr":"18686200114669622","backgroundImgIdStr":"2002210674180201","description":"","userId":122563748,"vipType":0,"accountStatus":0,"gender":0,"avatarImgId":18686200114669624,"nickname":"kilolo军曹","birthday":-2209017600000,"city":320500,"province":320000,"defaultAvatar":true,"avatarUrl":"https://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","experts":{},"expertTags":null,"authStatus":0,"mutual":false,"remarkName":null,"backgroundImgId":2002210674180201,"userType":0,"backgroundUrl":"https://p2.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg","signature":"","authority":0,"avatarImgId_str":"18686200114669622"}
     * bindings : [{"refreshTime":1452495534,"userId":122563748,"tokenJsonStr":"{\"countrycode\":\"\",\"cellphone\":\"18251986292\",\"hasPassword\":true}","url":"","expiresIn":2147483647,"expired":false,"id":59898546,"type":1},{"refreshTime":1539000861,"userId":122563748,"tokenJsonStr":"{\"access_token\":\"899009D3C3A9EA652B071DC1315EDA85\",\"refresh_token\":\"EA64853C3943C2D0A79276D1585433EB\",\"openid\":\"B69E9355AEC244292871EA794B60C0D5\",\"nickname\":\"友人A\",\"expires_in\":7776000}","url":"","expiresIn":7776000,"expired":false,"id":59898547,"type":5}]
     */

    private int loginType;
    private int code;
    private AccountBean account;
    private ProfileBean profile;
    private List<BindingsBean> bindings;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }






    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public static class AccountBean {
        /**
         * id : 122563748
         * userName : 1_18251986292
         * type : 1
         * status : 0
         * whitelistAuthority : 0
         * createTime : 1452495500473
         * salt : [B@6b56dc69
         * tokenVersion : 0
         * ban : 0
         * baoyueVersion : 0
         * donateVersion : 0
         * vipType : 0
         * viptypeVersion : 0
         * anonimousUser : false
         */

        private int id;
        private String userName;
        private int type;
        private int status;
        private int whitelistAuthority;
        private long createTime;
        private String salt;
        private int tokenVersion;
        private int ban;
        private int baoyueVersion;
        private int donateVersion;
        private int vipType;
        private int viptypeVersion;
        private boolean anonimousUser;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getWhitelistAuthority() {
            return whitelistAuthority;
        }

        public void setWhitelistAuthority(int whitelistAuthority) {
            this.whitelistAuthority = whitelistAuthority;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public int getTokenVersion() {
            return tokenVersion;
        }

        public void setTokenVersion(int tokenVersion) {
            this.tokenVersion = tokenVersion;
        }

        public int getBan() {
            return ban;
        }

        public void setBan(int ban) {
            this.ban = ban;
        }

        public int getBaoyueVersion() {
            return baoyueVersion;
        }

        public void setBaoyueVersion(int baoyueVersion) {
            this.baoyueVersion = baoyueVersion;
        }

        public int getDonateVersion() {
            return donateVersion;
        }

        public void setDonateVersion(int donateVersion) {
            this.donateVersion = donateVersion;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(int viptypeVersion) {
            this.viptypeVersion = viptypeVersion;
        }

        public boolean isAnonimousUser() {
            return anonimousUser;
        }

        public void setAnonimousUser(boolean anonimousUser) {
            this.anonimousUser = anonimousUser;
        }
    }

    public static class ProfileBean {
        /**
         * detailDescription :
         * djStatus : 0
         * followed : false
         * avatarImgIdStr : 18686200114669622
         * backgroundImgIdStr : 2002210674180201
         * description :
         * userId : 122563748
         * vipType : 0
         * accountStatus : 0
         * gender : 0
         * avatarImgId : 18686200114669624
         * nickname : kilolo军曹
         * birthday : -2209017600000
         * city : 320500
         * province : 320000
         * defaultAvatar : true
         * avatarUrl : https://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
         * experts : {}
         * expertTags : null
         * authStatus : 0
         * mutual : false
         * remarkName : null
         * backgroundImgId : 2002210674180201
         * userType : 0
         * backgroundUrl : https://p2.music.126.net/o3G7lWrGBQAvSRt3UuApTw==/2002210674180201.jpg
         * signature :
         * authority : 0
         * avatarImgId_str : 18686200114669622
         */

        private String detailDescription;
        private int djStatus;
        private boolean followed;
        private String avatarImgIdStr;
        private String backgroundImgIdStr;
        private String description;
        private int userId;
        private int vipType;
        private int accountStatus;
        private int gender;
        private long avatarImgId;
        private String nickname;
        private long birthday;
        private int city;
        private int province;
        private boolean defaultAvatar;
        private String avatarUrl;
        private ExpertsBean experts;
        private Object expertTags;
        private int authStatus;
        private boolean mutual;
        private Object remarkName;
        private long backgroundImgId;
        private int userType;
        private String backgroundUrl;
        private String signature;
        private int authority;
        private String avatarImgId_str;

        public String getDetailDescription() {
            return detailDescription;
        }

        public void setDetailDescription(String detailDescription) {
            this.detailDescription = detailDescription;
        }

        public int getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(int djStatus) {
            this.djStatus = djStatus;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public String getAvatarImgIdStr() {
            return avatarImgIdStr;
        }

        public void setAvatarImgIdStr(String avatarImgIdStr) {
            this.avatarImgIdStr = avatarImgIdStr;
        }

        public String getBackgroundImgIdStr() {
            return backgroundImgIdStr;
        }

        public void setBackgroundImgIdStr(String backgroundImgIdStr) {
            this.backgroundImgIdStr = backgroundImgIdStr;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public long getAvatarImgId() {
            return avatarImgId;
        }

        public void setAvatarImgId(long avatarImgId) {
            this.avatarImgId = avatarImgId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public boolean isDefaultAvatar() {
            return defaultAvatar;
        }

        public void setDefaultAvatar(boolean defaultAvatar) {
            this.defaultAvatar = defaultAvatar;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ExpertsBean experts) {
            this.experts = experts;
        }

        public Object getExpertTags() {
            return expertTags;
        }

        public void setExpertTags(Object expertTags) {
            this.expertTags = expertTags;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getAuthority() {
            return authority;
        }

        public void setAuthority(int authority) {
            this.authority = authority;
        }

        public String getAvatarImgId_str() {
            return avatarImgId_str;
        }

        public void setAvatarImgId_str(String avatarImgId_str) {
            this.avatarImgId_str = avatarImgId_str;
        }

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        /**
         * refreshTime : 1452495534
         * userId : 122563748
         * tokenJsonStr : {"countrycode":"","cellphone":"18251986292","hasPassword":true}
         * url :
         * expiresIn : 2147483647
         * expired : false
         * id : 59898546
         * type : 1
         */

        private int refreshTime;
        private int userId;
        private String tokenJsonStr;
        private String url;
        private int expiresIn;
        private boolean expired;
        private long id;
        private int type;

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
