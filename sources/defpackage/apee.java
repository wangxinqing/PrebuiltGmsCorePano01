package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: apee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apee {
    NULL(0),
    REFERENCE(1),
    ATTRIBUTE(2),
    STRING(3),
    FLOAT(4),
    DIMENSION(5),
    FRACTION(6),
    DYNAMIC_REFERENCE(7),
    DYNAMIC_ATTRIBUTE(8),
    INT_DEC(16),
    INT_HEX(17),
    INT_BOOLEAN(18),
    INT_COLOR_ARGB8(28),
    INT_COLOR_RGB8(29),
    INT_COLOR_ARGB4(30),
    INT_COLOR_RGB4(31);
    
    public static final Map r = null;
    public final byte q;

    static {
        int i;
        HashMap hashMap = new HashMap();
        for (apee apee : values()) {
            hashMap.put(Byte.valueOf(apee.q), apee);
        }
        r = Collections.unmodifiableMap(hashMap);
    }

    private apee(int i) {
        this.q = aoop.a((long) i);
    }
}
