package defpackage;

/* renamed from: qct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qct implements auco {
    DEFAULT_GOOGLE_SIGN_IN_FLOW_STEP(0),
    RETRIEVE_ACCOUNT_LIST(1),
    REAUTH_ACCOUNT(2),
    DISPLAY_CONSENT_SCREEN(3),
    RECORD_CONSENT_GRANT(4),
    UPDATE_DEFAULT_GOOGLE_ACCOUNT(5);
    
    public final int g;

    private qct(int i) {
        this.g = i;
    }

    public static qct a(int i) {
        if (i == 0) {
            return DEFAULT_GOOGLE_SIGN_IN_FLOW_STEP;
        }
        if (i == 1) {
            return RETRIEVE_ACCOUNT_LIST;
        }
        if (i == 2) {
            return REAUTH_ACCOUNT;
        }
        if (i == 3) {
            return DISPLAY_CONSENT_SCREEN;
        }
        if (i == 4) {
            return RECORD_CONSENT_GRANT;
        }
        if (i != 5) {
            return null;
        }
        return UPDATE_DEFAULT_GOOGLE_ACCOUNT;
    }

    public static aucq b() {
        return qcs.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
