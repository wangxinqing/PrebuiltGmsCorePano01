package defpackage;

/* renamed from: aegy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum aegy {
    UNKNOWN((byte) -1),
    SUCCESS((byte) 0),
    OP_CODE_NOT_SUPPORTED((byte) 1),
    INVALID_PARAMETER((byte) 2),
    UNSUPPORTED_ORGANIZATION_ID((byte) 3),
    OPERATION_FAILED((byte) 4);
    
    private final byte g;

    private aegy(byte b) {
        this.g = b;
    }

    public static aegy a(byte[] bArr) {
        if (bArr.length >= 2) {
            byte b = bArr[1];
            for (aegy aegy : values()) {
                if (aegy.g == b) {
                    return aegy;
                }
            }
        }
        return UNKNOWN;
    }
}
