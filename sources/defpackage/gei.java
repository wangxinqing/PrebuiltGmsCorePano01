package defpackage;

/* renamed from: gei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum gei {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError");
    
    public final String ac;

    private gei(String str) {
        this.ac = str;
    }

    public static gei a(String str) {
        return (gei) Enum.valueOf(gei.class, str);
    }

    public static boolean b(gei gei) {
        return NETWORK_ERROR.equals(gei) || SERVICE_UNAVAILABLE.equals(gei) || INTNERNAL_ERROR.equals(gei) || AUTH_SECURITY_ERROR.equals(gei);
    }

    public static final gei c(String str) {
        gei gei = UNKNOWN;
        for (gei gei2 : values()) {
            if (gei2.ac.equals(str)) {
                gei = gei2;
            }
        }
        return gei;
    }

    public static boolean a(gei gei) {
        return BAD_AUTHENTICATION.equals(gei) || CAPTCHA.equals(gei) || NEED_PERMISSION.equals(gei) || NEED_REMOTE_CONSENT.equals(gei) || NEEDS_BROWSER.equals(gei) || USER_CANCEL.equals(gei) || DEVICE_MANAGEMENT_REQUIRED.equals(gei) || DM_INTERNAL_ERROR.equals(gei) || DM_SYNC_DISABLED.equals(gei) || DM_ADMIN_BLOCKED.equals(gei) || DM_ADMIN_PENDING_APPROVAL.equals(gei) || DM_STALE_SYNC_REQUIRED.equals(gei) || DM_DEACTIVATED.equals(gei) || DM_REQUIRED.equals(gei) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(gei) || DM_SCREENLOCK_REQUIRED.equals(gei);
    }

    public final boolean b(String str) {
        return this.ac.equals(str);
    }
}
