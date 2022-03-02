package defpackage;

/* renamed from: aonh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aonh implements auco {
    UNKNOWN(0),
    INVALID_SHARD_NAME(1),
    SHARD_DELETE_FAILED(2),
    INVALID_SHARD_FORMAT(3),
    SHARD_OPEN_FAILED(4),
    CRC_MISMATCH(5),
    SHARD_READ_FAILED(6),
    WORK_DIR_DISAPPEARED(7),
    WORK_DIR_LIST_ERROR(8),
    UNRECOGNIZED(-1);
    
    private final int k;

    private aonh(int i) {
        this.k = i;
    }

    public static aonh a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INVALID_SHARD_NAME;
            case 2:
                return SHARD_DELETE_FAILED;
            case 3:
                return INVALID_SHARD_FORMAT;
            case 4:
                return SHARD_OPEN_FAILED;
            case 5:
                return CRC_MISMATCH;
            case 6:
                return SHARD_READ_FAILED;
            case 7:
                return WORK_DIR_DISAPPEARED;
            case 8:
                return WORK_DIR_LIST_ERROR;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aong.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
