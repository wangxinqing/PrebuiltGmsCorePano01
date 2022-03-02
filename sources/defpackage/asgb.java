package defpackage;

/* renamed from: asgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asgb implements auco {
    OPERATION_STATUS_UNKNOWN(0),
    OPERATION_STATUS_ACTIVE(1),
    OPERATION_STATUS_CANCELLED(2),
    OPERATION_STATUS_FINISHED(3),
    OPERATION_STATUS_FAILED(4),
    OPERATION_STATUS_MISSING(5),
    OPERATION_STATUS_PENDING(6),
    OPERATION_STATUS_STARTING(7),
    OPERATION_STATUS_UPDATE_FAILED(8);
    
    public final int j;

    private asgb(int i) {
        this.j = i;
    }

    public static asgb a(int i) {
        switch (i) {
            case 0:
                return OPERATION_STATUS_UNKNOWN;
            case 1:
                return OPERATION_STATUS_ACTIVE;
            case 2:
                return OPERATION_STATUS_CANCELLED;
            case 3:
                return OPERATION_STATUS_FINISHED;
            case 4:
                return OPERATION_STATUS_FAILED;
            case 5:
                return OPERATION_STATUS_MISSING;
            case 6:
                return OPERATION_STATUS_PENDING;
            case 7:
                return OPERATION_STATUS_STARTING;
            case 8:
                return OPERATION_STATUS_UPDATE_FAILED;
            default:
                return null;
        }
    }

    public static aucq b() {
        return asga.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
