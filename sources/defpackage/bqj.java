package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bqj {
    public static final ByteBuffer a = ByteBuffer.allocate(0);
    public static final bqb b = new bqc();
    public static final bqb c = new bqd();
    public static final bqb d = new bqe();
    public static final bqb e = new bqf();

    public static int a(apxg apxg, bqb bqb, Comparable comparable) {
        Object a2 = bqb.a();
        int a3 = bqb.a(apxg) - 1;
        int i = 0;
        while (i <= a3) {
            int i2 = (i + a3) >>> 1;
            int compareTo = ((Comparable) bqb.a(apxg, a2, i2)).compareTo(comparable);
            if (compareTo < 0) {
                i = i2 + 1;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                a3 = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
