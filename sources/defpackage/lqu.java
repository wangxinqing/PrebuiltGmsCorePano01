package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqu {
    public static final lqu a = new lqu("general", lqt.a, new lqs[]{lqt.a, lqt.b, lqt.d, lqt.c});
    public static final lqu b = new lqu("sharedWithMe", lqt.e, new lqs[]{lqt.a, lqt.e});
    public static final lqu c = new lqu("recent", lqt.d, new lqs[]{lqt.b, lqt.d, lqt.c});
    public static final lqu d = new lqu("starred", lqt.b, new lqs[]{lqt.a, lqt.b, lqt.d, lqt.c});
    public static final lqu e;
    private static final lqu[] i;
    private static final Map j;
    public final String f;
    public final lqs g;
    public final lqs[] h;

    static {
        lqu lqu = new lqu("search", lqt.b, new lqs[]{lqt.a, lqt.b, lqt.d, lqt.c});
        e = lqu;
        i = new lqu[]{a, b, c, d, lqu};
        HashMap hashMap = new HashMap();
        lqu[] lquArr = i;
        int length = lquArr.length;
        for (int i2 = 0; i2 < 5; i2++) {
            lqu lqu2 = lquArr[i2];
            if (((lqu) hashMap.put(lqu2.f, lqu2)) != null) {
                String str = lqu2.f;
                throw new IllegalStateException(str.length() == 0 ? new String("Duplicate SortType identifier: ") : "Duplicate SortType identifier: ".concat(str));
            }
        }
        j = Collections.unmodifiableMap(hashMap);
    }

    private lqu(String str, lqs lqs, lqs[] lqsArr) {
        iva.a((Object) str);
        this.f = str;
        iva.a((Object) lqs);
        this.g = lqs;
        this.h = (lqs[]) iva.a((Object) lqsArr);
    }

    public static lqu a(String str) {
        iva.a((Object) str);
        return (lqu) j.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ius.a(this.f, ((lqu) obj).f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f});
    }
}
