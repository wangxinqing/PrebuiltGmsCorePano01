package defpackage;

import java.util.Map;

/* renamed from: alux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alux {
    public static final amic a;

    static {
        amia f = amic.f();
        f.a(amhv.NULL_VALUE);
        a = f.a();
    }

    public static final int a(amic amic) {
        amib amib = amib.KIND_NOT_SET;
        int i = 24;
        switch (amic.b.ordinal()) {
            case 1:
            case 2:
            case 4:
                return 24;
            case 3:
                return amic.b().length();
            case 5:
                int i2 = 24;
                for (Map.Entry entry : amic.d().a().entrySet()) {
                    i2 += ((String) entry.getKey()).length() + 24 + a((amic) entry.getValue());
                }
                return i2;
            case 6:
                for (amic a2 : amic.e().a()) {
                    i += a(a2);
                }
                return i;
            default:
                throw new IllegalArgumentException();
        }
    }
}
