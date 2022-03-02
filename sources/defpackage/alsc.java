package defpackage;

import java.util.Map;

/* renamed from: alsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alsc {
    public static String a(amic amic) {
        StringBuilder sb = new StringBuilder();
        a(amic, new alzd(sb));
        return sb.toString();
    }

    public static void a(amic amic, alzd alzd) {
        amib amib = amib.KIND_NOT_SET;
        switch (amic.b.ordinal()) {
            case 1:
                alzd.e();
                return;
            case 2:
                double a = amic.a();
                alzd.f();
                if (Double.isNaN(a)) {
                    throw new IllegalArgumentException("NaN values are not supported.");
                } else if (!Double.isInfinite(a)) {
                    long j = (long) a;
                    if (a != ((double) j)) {
                        alzd.a.append(a);
                        return;
                    } else {
                        alzd.a.append(j);
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("Infinite values are not supported.");
                }
            case 3:
                alzd.b(amic.b());
                return;
            case 4:
                alzd.a(amic.c());
                return;
            case 5:
                amhx d = amic.d();
                alzd.c();
                for (Map.Entry entry : d.a().entrySet()) {
                    alzd.a((String) entry.getKey());
                    a((amic) entry.getValue(), alzd);
                }
                alzd.d();
                return;
            case 6:
                amhu e = amic.e();
                alzd.a();
                for (amic a2 : e.a()) {
                    a(a2, alzd);
                }
                alzd.b();
                return;
            default:
                String valueOf = String.valueOf(amic.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Unsupported value type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
