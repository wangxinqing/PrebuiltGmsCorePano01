package defpackage;

import android.os.Build;

/* renamed from: ghk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ghk {
    public static final ghk[] a;
    private static final amzy d = amzy.a((Object) new ghl(196608, 8), (Object) new ghl(262144, 6));
    private static final amzy e = amzy.a((Object) new ghl(196608, 4), (Object) new ghl(262144, 4));
    private static final amzy f = amzy.a((Object) new ghl(65536, 0));
    private static final ghk g = new ghk(327680, d);
    private static final ghk h = new ghk(196608, e);
    private static final ghk i;
    public final int b;
    public final amzy c;

    static {
        int i2 = Build.VERSION.SDK_INT;
        ghk ghk = new ghk(65536, f);
        i = ghk;
        a = new ghk[]{g, h, ghk};
    }

    private ghk(int i2, amzy amzy) {
        if (i2 == 65536 || i2 == 196608 || i2 == 327680) {
            this.b = i2;
            anhk i3 = amzy.listIterator();
            int i4 = 0;
            while (i3.hasNext()) {
                int i5 = ((ghl) i3.next()).a;
                if (i5 >= i4) {
                    i4 = i5;
                } else {
                    throw new IllegalArgumentException("minRequirements must be sorted in ascending order of quality");
                }
            }
            this.c = amzy;
            return;
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("Invalid complexity: ");
        sb.append(i2);
        sb.append(". Must be HIGH, MEDIUM, LOW or NONE");
        throw new IllegalArgumentException(sb.toString());
    }
}
