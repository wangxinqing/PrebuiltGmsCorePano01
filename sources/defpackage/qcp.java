package defpackage;

/* renamed from: qcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qcp implements auco {
    DEFAULT_ASSISTED_SIGN_IN_FLOW_STEP(0),
    FETCH_CREDENTIALS(1),
    CHOOSE_MULTI_CREDENTIAL(2),
    FETCH_TOS_AND_PP(3),
    CHOOSE_SINGLE_CREDENTIAL(4),
    COMPLETE_SIGN_IN_AND_START_CONFIRMATION(5),
    EXTEND_CONFIRMATION(6),
    RECORD_GRANTS(7),
    UPDATE_DEFAULT_ACCOUNT(8);
    
    public final int j;

    private qcp(int i) {
        this.j = i;
    }

    public static qcp a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_ASSISTED_SIGN_IN_FLOW_STEP;
            case 1:
                return FETCH_CREDENTIALS;
            case 2:
                return CHOOSE_MULTI_CREDENTIAL;
            case 3:
                return FETCH_TOS_AND_PP;
            case 4:
                return CHOOSE_SINGLE_CREDENTIAL;
            case 5:
                return COMPLETE_SIGN_IN_AND_START_CONFIRMATION;
            case 6:
                return EXTEND_CONFIRMATION;
            case 7:
                return RECORD_GRANTS;
            case 8:
                return UPDATE_DEFAULT_ACCOUNT;
            default:
                return null;
        }
    }

    public static aucq b() {
        return qco.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
