package defpackage;

/* renamed from: auby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auby {
    DOUBLE(0, 1, audb.DOUBLE),
    FLOAT(1, 1, audb.FLOAT),
    INT64(2, 1, audb.LONG),
    UINT64(3, 1, audb.LONG),
    INT32(4, 1, audb.INT),
    FIXED64(5, 1, audb.LONG),
    FIXED32(6, 1, audb.INT),
    BOOL(7, 1, audb.BOOLEAN),
    STRING(8, 1, audb.STRING),
    MESSAGE(9, 1, audb.MESSAGE),
    BYTES(10, 1, audb.BYTE_STRING),
    UINT32(11, 1, audb.INT),
    ENUM(12, 1, audb.ENUM),
    SFIXED32(13, 1, audb.INT),
    SFIXED64(14, 1, audb.LONG),
    SINT32(15, 1, audb.INT),
    SINT64(16, 1, audb.LONG),
    GROUP(17, 1, audb.MESSAGE),
    DOUBLE_LIST(18, 2, audb.DOUBLE),
    FLOAT_LIST(19, 2, audb.FLOAT),
    INT64_LIST(20, 2, audb.LONG),
    UINT64_LIST(21, 2, audb.LONG),
    INT32_LIST(22, 2, audb.INT),
    FIXED64_LIST(23, 2, audb.LONG),
    FIXED32_LIST(24, 2, audb.INT),
    BOOL_LIST(25, 2, audb.BOOLEAN),
    STRING_LIST(26, 2, audb.STRING),
    MESSAGE_LIST(27, 2, audb.MESSAGE),
    BYTES_LIST(28, 2, audb.BYTE_STRING),
    UINT32_LIST(29, 2, audb.INT),
    ENUM_LIST(30, 2, audb.ENUM),
    SFIXED32_LIST(31, 2, audb.INT),
    SFIXED64_LIST(32, 2, audb.LONG),
    SINT32_LIST(33, 2, audb.INT),
    SINT64_LIST(34, 2, audb.LONG),
    DOUBLE_LIST_PACKED(35, 3, audb.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, audb.FLOAT),
    INT64_LIST_PACKED(37, 3, audb.LONG),
    UINT64_LIST_PACKED(38, 3, audb.LONG),
    INT32_LIST_PACKED(39, 3, audb.INT),
    FIXED64_LIST_PACKED(40, 3, audb.LONG),
    FIXED32_LIST_PACKED(41, 3, audb.INT),
    BOOL_LIST_PACKED(42, 3, audb.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, audb.INT),
    ENUM_LIST_PACKED(44, 3, audb.ENUM),
    SFIXED32_LIST_PACKED(45, 3, audb.INT),
    SFIXED64_LIST_PACKED(46, 3, audb.LONG),
    SINT32_LIST_PACKED(47, 3, audb.INT),
    SINT64_LIST_PACKED(48, 3, audb.LONG),
    GROUP_LIST(49, 2, audb.MESSAGE),
    MAP(50, 4, audb.VOID);
    
    private static final auby[] aa = null;
    public final int Z;

    static {
        int i;
        aa = new auby[r1];
        for (auby auby : values()) {
            aa[auby.Z] = auby;
        }
    }

    private auby(int i, int i2, audb audb) {
        this.Z = i;
        audb audb2 = audb.VOID;
        if (i2 == 1) {
            audb.ordinal();
        }
    }
}
