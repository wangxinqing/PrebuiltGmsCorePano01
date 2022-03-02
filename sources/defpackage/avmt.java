package defpackage;

/* renamed from: avmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avmt implements auco {
    UNKNOWN_CONTACT_MODE(0),
    CHAT(1),
    PHONE(2),
    EMAIL(3),
    HANGOUTS(4),
    ENTERPRISE_SUPPORT(5),
    C2C(6),
    FEEDBACK_MODE(7);
    
    public final int i;

    private avmt(int i2) {
        this.i = i2;
    }

    public static avmt a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_CONTACT_MODE;
            case 1:
                return CHAT;
            case 2:
                return PHONE;
            case 3:
                return EMAIL;
            case 4:
                return HANGOUTS;
            case 5:
                return ENTERPRISE_SUPPORT;
            case 6:
                return C2C;
            case 7:
                return FEEDBACK_MODE;
            default:
                return null;
        }
    }

    public static aucq b() {
        return avms.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
