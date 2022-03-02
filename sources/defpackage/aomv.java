package defpackage;

/* renamed from: aomv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aomv implements auco {
    SYNC_TRIGGER_UNKNOWN(0),
    SYNC_TRIGGER_MANUAL(1),
    SYNC_TRIGGER_TIMER(2),
    SYNC_TRIGGER_SUBSCRIPTION(3),
    SYNC_TRIGGER_PUSH_NOTIFICATION(4),
    SYNC_TRIGGER_READ(5),
    SYNC_TRIGGER_WRITE(6),
    UNRECOGNIZED(-1);
    
    private final int i;

    private aomv(int i2) {
        this.i = i2;
    }

    public static aomv a(int i2) {
        switch (i2) {
            case 0:
                return SYNC_TRIGGER_UNKNOWN;
            case 1:
                return SYNC_TRIGGER_MANUAL;
            case 2:
                return SYNC_TRIGGER_TIMER;
            case 3:
                return SYNC_TRIGGER_SUBSCRIPTION;
            case 4:
                return SYNC_TRIGGER_PUSH_NOTIFICATION;
            case 5:
                return SYNC_TRIGGER_READ;
            case 6:
                return SYNC_TRIGGER_WRITE;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aomu.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
