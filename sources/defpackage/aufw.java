package defpackage;

/* renamed from: aufw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aufw {
    DOUBLE(aufx.DOUBLE, 1),
    FLOAT(aufx.FLOAT, 5),
    INT64(aufx.LONG, 0),
    UINT64(aufx.LONG, 0),
    INT32(aufx.INT, 0),
    FIXED64(aufx.LONG, 1),
    FIXED32(aufx.INT, 5),
    BOOL(aufx.BOOLEAN, 0),
    STRING(aufx.STRING, 2),
    GROUP(aufx.MESSAGE, 3),
    MESSAGE(aufx.MESSAGE, 2),
    BYTES(aufx.BYTE_STRING, 2),
    UINT32(aufx.INT, 0),
    ENUM(aufx.ENUM, 0),
    SFIXED32(aufx.INT, 5),
    SFIXED64(aufx.LONG, 1),
    SINT32(aufx.INT, 0),
    SINT64(aufx.LONG, 0);
    
    public final aufx s;
    public final int t;

    private aufw(aufx aufx, int i) {
        this.s = aufx;
        this.t = i;
    }
}
