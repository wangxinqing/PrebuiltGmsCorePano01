package defpackage;

import android.util.Base64;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.crypto.Mac;

/* renamed from: plc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plc {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2 || i == 3) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new IllegalArgumentException("unknown rankingStrategy");
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        if (i != 4) {
            return i != 5 ? 5 : 8;
        }
        return 7;
    }

    public static int a(int i, int i2) {
        if (i == 0) {
            return i2 == 3 ? 2 : 1;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        throw new IllegalArgumentException("unknown queryTokenizer");
    }

    public static audx a(String str, auef auef) {
        if (str != null) {
            try {
                return (audx) auef.a(Base64.decode(str, 0));
            } catch (auda e) {
                oso.a((Throwable) e, "Corrupted message");
            }
        }
        try {
            return (audx) auef.a(auay.b);
        } catch (auda e2) {
            throw new AssertionError();
        }
    }

    public static GlobalSearchApplicationInfo a(otl otl) {
        String str;
        String str2;
        String str3 = null;
        if (otl == null) {
            return null;
        }
        if (!otl.b.isEmpty()) {
            str = otl.b;
        } else {
            str = null;
        }
        if (!otl.c.isEmpty()) {
            str2 = otl.c;
        } else {
            str2 = null;
        }
        int i = otl.d;
        int i2 = otl.e;
        int i3 = otl.f;
        String str4 = !otl.g.isEmpty() ? otl.g : null;
        String str5 = !otl.h.isEmpty() ? otl.h : null;
        if (!otl.i.isEmpty()) {
            str3 = otl.i;
        }
        return new GlobalSearchApplicationInfo(str, str2, i, i2, i3, str4, str5, str3);
    }

    private static Object a(Callable callable) {
        char c = 0;
        while (true) {
            try {
                return ((plb) callable).call();
            } catch (NoSuchAlgorithmException e) {
                if (c <= 0) {
                    c = 1;
                } else {
                    throw e;
                }
            }
        }
    }

    public static String a(long j) {
        if (j > 1073741824) {
            Locale locale = Locale.US;
            double d = (double) j;
            Double.isNaN(d);
            return String.format(locale, "%.2fGB", new Object[]{Double.valueOf(d / 1.073741824E9d)});
        } else if (j > 1048576) {
            Locale locale2 = Locale.US;
            double d2 = (double) j;
            Double.isNaN(d2);
            return String.format(locale2, "%.2fMB", new Object[]{Double.valueOf(d2 / 1048576.0d)});
        } else if (j > 1024) {
            Locale locale3 = Locale.US;
            double d3 = (double) j;
            Double.isNaN(d3);
            return String.format(locale3, "%.2fKB", new Object[]{Double.valueOf(d3 / 1024.0d)});
        } else {
            return String.format(Locale.US, "%d Bytes", new Object[]{Long.valueOf(j)});
        }
    }

    public static String a(audx audx) {
        return Base64.encodeToString(audx.k(), 0);
    }

    public static Mac a(String str) {
        try {
            return (Mac) a((Callable) new plb(str));
        } catch (NoSuchAlgorithmException e) {
            oso.b((Throwable) e, "Mac algorithm %s not available", str);
            return null;
        } catch (Exception e2) {
            throw new RuntimeException("Unexpected exception from Mac.getInstance", e2);
        }
    }

    public static otl a(GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        aucd o = otl.j.o();
        String b = amrk.b(globalSearchApplicationInfo.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        otl otl = (otl) o.b;
        b.getClass();
        otl.a |= 1;
        otl.b = b;
        String b2 = amrk.b(globalSearchApplicationInfo.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        otl otl2 = (otl) o.b;
        b2.getClass();
        int i = otl2.a | 2;
        otl2.a = i;
        otl2.c = b2;
        int i2 = globalSearchApplicationInfo.c;
        int i3 = i | 4;
        otl2.a = i3;
        otl2.d = i2;
        int i4 = globalSearchApplicationInfo.d;
        int i5 = i3 | 8;
        otl2.a = i5;
        otl2.e = i4;
        int i6 = globalSearchApplicationInfo.e;
        otl2.a = i5 | 16;
        otl2.f = i6;
        String b3 = amrk.b(globalSearchApplicationInfo.f);
        if (o.c) {
            o.c();
            o.c = false;
        }
        otl otl3 = (otl) o.b;
        b3.getClass();
        otl3.a |= 32;
        otl3.g = b3;
        String b4 = amrk.b(globalSearchApplicationInfo.g);
        if (o.c) {
            o.c();
            o.c = false;
        }
        otl otl4 = (otl) o.b;
        b4.getClass();
        otl4.a |= 64;
        otl4.h = b4;
        String b5 = amrk.b(globalSearchApplicationInfo.h);
        if (o.c) {
            o.c();
            o.c = false;
        }
        otl otl5 = (otl) o.b;
        b5.getClass();
        otl5.a |= 128;
        otl5.i = b5;
        return (otl) o.i();
    }

    public static oud a() {
        aucd o = oud.i.o();
        int intValue = ((Integer) ozx.bk.c()).intValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud = (oud) o.b;
        oud.a |= 1;
        oud.b = intValue;
        int intValue2 = ((Integer) ozx.bq.c()).intValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud2 = (oud) o.b;
        oud2.a |= 2;
        oud2.c = intValue2;
        boolean booleanValue = ((Boolean) ozx.bl.c()).booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud3 = (oud) o.b;
        oud3.a |= 4;
        oud3.d = booleanValue;
        boolean booleanValue2 = ((Boolean) pba.ao.c()).booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud4 = (oud) o.b;
        oud4.a |= 8;
        oud4.e = booleanValue2;
        boolean booleanValue3 = ((Boolean) pba.aC.c()).booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud5 = (oud) o.b;
        oud5.a |= 32;
        oud5.f = booleanValue3;
        int intValue3 = ((Integer) ozx.cq.c()).intValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud6 = (oud) o.b;
        oud6.a |= 64;
        oud6.g = intValue3;
        boolean j = axsj.a.a().j();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oud oud7 = (oud) o.b;
        oud7.a |= 128;
        oud7.h = j;
        return (oud) o.i();
    }
}
