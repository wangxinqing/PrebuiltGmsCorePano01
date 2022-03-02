package defpackage;

/* renamed from: qcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qcr implements auco {
    DEFAULT_AUTHORIZATION_STEP(0),
    RESOLVE_ACCOUNT(1),
    EXTERNAL_ACCOUNT_CHOOSER(2),
    EXTERNAL_REAUTH_ACCOUNT(3),
    AUTH_ACCOUNT(4),
    CONSENT_GET_COOKIES(5),
    CONSENT_SHOW_REMOTE_UI(6),
    EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY(7),
    CONSENT_RECORD_GRANTS(8),
    SET_DEFAULT_ACCOUNT(9),
    BUILD_GOOGLE_SIGN_IN_ACCOUNT(10);
    
    public final int l;

    private qcr(int i) {
        this.l = i;
    }

    public static qcr a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_AUTHORIZATION_STEP;
            case 1:
                return RESOLVE_ACCOUNT;
            case 2:
                return EXTERNAL_ACCOUNT_CHOOSER;
            case 3:
                return EXTERNAL_REAUTH_ACCOUNT;
            case 4:
                return AUTH_ACCOUNT;
            case 5:
                return CONSENT_GET_COOKIES;
            case 6:
                return CONSENT_SHOW_REMOTE_UI;
            case 7:
                return EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY;
            case 8:
                return CONSENT_RECORD_GRANTS;
            case 9:
                return SET_DEFAULT_ACCOUNT;
            case 10:
                return BUILD_GOOGLE_SIGN_IN_ACCOUNT;
            default:
                return null;
        }
    }

    public static aucq b() {
        return qcq.a;
    }

    public final int a() {
        return this.l;
    }

    public final String toString() {
        return Integer.toString(this.l);
    }
}
