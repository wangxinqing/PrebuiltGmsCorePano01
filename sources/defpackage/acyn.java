package defpackage;

/* renamed from: acyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum acyn implements auco {
    UNKNOWN_SYNC_REASON(0),
    PUSH_MESSAGE(1),
    FLAG_CHANGE(2),
    ACCOUNT_CHANGE(3),
    PUSH_REGISTRATION(4),
    DEVICE_BOOT(5),
    APP_UPDATE(6);
    
    public static final aucp h = null;
    private final int i;

    static {
        h = new acym();
    }

    private acyn(int i2) {
        this.i = i2;
    }

    public static acyn a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_SYNC_REASON;
            case 1:
                return PUSH_MESSAGE;
            case 2:
                return FLAG_CHANGE;
            case 3:
                return ACCOUNT_CHANGE;
            case 4:
                return PUSH_REGISTRATION;
            case 5:
                return DEVICE_BOOT;
            case 6:
                return APP_UPDATE;
            default:
                return null;
        }
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
