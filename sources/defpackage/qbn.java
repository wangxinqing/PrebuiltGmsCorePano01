package defpackage;

/* renamed from: qbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qbn implements auco {
    DEFAULT_CONSENT_STEP(0),
    GET_TOKEN(1),
    CONFIGURE_COOKIES(2),
    BROWSWER_CONSENT(3),
    NATIVE_CONSENT(4),
    RECORD_GRANTS(5),
    HANDLE_DEVICE_MANAGEMENT_ERRORS(6),
    HANDLE_LOCK_SCREEN_ERROR(7),
    REAUTH(8);
    
    public final int j;

    private qbn(int i) {
        this.j = i;
    }

    public static qbn a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_CONSENT_STEP;
            case 1:
                return GET_TOKEN;
            case 2:
                return CONFIGURE_COOKIES;
            case 3:
                return BROWSWER_CONSENT;
            case 4:
                return NATIVE_CONSENT;
            case 5:
                return RECORD_GRANTS;
            case 6:
                return HANDLE_DEVICE_MANAGEMENT_ERRORS;
            case 7:
                return HANDLE_LOCK_SCREEN_ERROR;
            case 8:
                return REAUTH;
            default:
                return null;
        }
    }

    public static aucq b() {
        return qbm.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
