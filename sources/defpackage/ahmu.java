package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* renamed from: ahmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmu {
    public final Comparable[] a;
    public final ahmt b;

    public ahmu(Comparable[] comparableArr, ByteBuffer byteBuffer, long j) {
        ahmt ahmt = new ahmt(comparableArr, byteBuffer, j);
        if (comparableArr.length > 1) {
            this.b = ahmt;
            this.a = comparableArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Expected at least 2 classes, found %s", new Object[]{Arrays.toString(comparableArr)}));
    }

    public static final void a(Map map, Comparable comparable, float f) {
        float f2;
        Float f3 = (Float) map.get(comparable);
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            f2 = 0.0f;
        }
        map.put(comparable, Float.valueOf(f2 + f));
    }

    public final int a() {
        return this.b.a.length;
    }

    @Deprecated
    public final ahms a(int i, float[] fArr) {
        return this.b.a(i, fArr);
    }
}
