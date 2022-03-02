package defpackage;

/* renamed from: asog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asog implements auco {
    UNKNOWN_PAYLOAD_STATUS(0),
    SUCCESS(1),
    LOCAL_ERROR(2),
    REMOTE_ERROR(3),
    ENDPOINT_IO_ERROR(4),
    MOVED_TO_NEW_MEDIUM(5),
    CONNECTION_CLOSED(6),
    LOCAL_CANCELLATION(7),
    REMOTE_CANCELLATION(8);
    
    public final int j;

    private asog(int i) {
        this.j = i;
    }

    public static asog a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PAYLOAD_STATUS;
            case 1:
                return SUCCESS;
            case 2:
                return LOCAL_ERROR;
            case 3:
                return REMOTE_ERROR;
            case 4:
                return ENDPOINT_IO_ERROR;
            case 5:
                return MOVED_TO_NEW_MEDIUM;
            case 6:
                return CONNECTION_CLOSED;
            case 7:
                return LOCAL_CANCELLATION;
            case 8:
                return REMOTE_CANCELLATION;
            default:
                return null;
        }
    }

    public static aucq b() {
        return asof.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
