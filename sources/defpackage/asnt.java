package defpackage;

/* renamed from: asnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asnt implements auco {
    UNKNOWN_BANDWIDTH_UPGRADE_RESULT(0),
    UPGRADE_RESULT_SUCCESS(1),
    UPGRADE_RESULT_ERROR(2),
    MEDIUM_ERROR(3),
    PROTOCOL_ERROR(4),
    RESULT_IO_ERROR(5),
    CHANNEL_ERROR(6),
    ALREADY_ON_MEDIUM_ERROR(7),
    UNFINISHED_ERROR(10);
    
    public final int j;

    private asnt(int i) {
        this.j = i;
    }

    public static asnt a(int i) {
        if (i == 10) {
            return UNFINISHED_ERROR;
        }
        switch (i) {
            case 0:
                return UNKNOWN_BANDWIDTH_UPGRADE_RESULT;
            case 1:
                return UPGRADE_RESULT_SUCCESS;
            case 2:
                return UPGRADE_RESULT_ERROR;
            case 3:
                return MEDIUM_ERROR;
            case 4:
                return PROTOCOL_ERROR;
            case 5:
                return RESULT_IO_ERROR;
            case 6:
                return CHANNEL_ERROR;
            case 7:
                return ALREADY_ON_MEDIUM_ERROR;
            default:
                return null;
        }
    }

    public static aucq b() {
        return asns.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
