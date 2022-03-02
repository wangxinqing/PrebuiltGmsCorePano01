package defpackage;

/* renamed from: qbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qbp implements auco {
    DEFAULT_SIGNIN_STEP(0),
    FETCH_TOS_AND_PP(1),
    CHOOSE_ACCOUNT(2),
    RECORD_ACCOUNT_CHIP_CONSENT(3),
    PRE_CONSENT(4),
    CONSENT(5),
    SAVE_SELECTED_ACCOUNT(6),
    FALLBACK(7);
    
    public final int i;

    private qbp(int i2) {
        this.i = i2;
    }

    public static qbp a(int i2) {
        switch (i2) {
            case 0:
                return DEFAULT_SIGNIN_STEP;
            case 1:
                return FETCH_TOS_AND_PP;
            case 2:
                return CHOOSE_ACCOUNT;
            case 3:
                return RECORD_ACCOUNT_CHIP_CONSENT;
            case 4:
                return PRE_CONSENT;
            case 5:
                return CONSENT;
            case 6:
                return SAVE_SELECTED_ACCOUNT;
            case 7:
                return FALLBACK;
            default:
                return null;
        }
    }

    public static aucq b() {
        return qbo.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
