package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;

/* renamed from: amlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amlv {
    static final agzg a = new agzg("tiktok_systrace");
    private static final ThreadLocal b = new amls();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    public static amko a(amlw amlw) {
        amrl.a((Object) amlw);
        return b();
    }

    public static amkw b() {
        return ((amlu) b.get()).b;
    }

    static amkw c() {
        amkw b2 = b();
        return b2 == null ? new amki() : b2;
    }

    static void d() {
        a(true, (String) null);
    }

    private static void e(amkw amkw) {
        Trace.endSection();
        if (amkw.a() != null) {
            e(amkw.a());
        }
    }

    public static amkr a(String str) {
        return a(str, amlw.a);
    }

    static amkw b(amkw amkw) {
        return a((amlu) b.get(), amkw);
    }

    private static void d(amkw amkw) {
        if (amkw.a() != null) {
            d(amkw.a());
        }
        c(amkw.c());
    }

    public static void b(String str) {
        a(false, str);
    }

    public static String c(amkw amkw) {
        if (amkw.a() == null) {
            return amkw.c();
        }
        String c = c(amkw.a());
        String c2 = amkw.c();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 4 + String.valueOf(c2).length());
        sb.append(c);
        sb.append(" -> ");
        sb.append(c2);
        return sb.toString();
    }

    public static amkr a(String str, amlw amlw) {
        return a(str, amlw, amku.a);
    }

    public static boolean b(amlw amlw) {
        amrl.a((Object) amlw);
        return b() != null;
    }

    private static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static amkr a(String str, amlw amlw, amkv amkv) {
        amkw amkw;
        amrl.a((Object) amlw);
        amkw b2 = b();
        if (b2 == null) {
            d();
            amkw = new amkj(str);
        } else {
            amkw = b2.a(str, amkv);
        }
        b(amkw);
        return new amkr(amkw);
    }

    public static amks a(amkt amkt) {
        amks a2 = amks.a(2);
        for (amkw b2 = b(); b2 != null; b2 = b2.a()) {
            a2 = b2.a(amkt);
            a2.a = true;
            int i = a2.b - 1;
            if (i == 0 || i == 1) {
                break;
            }
        }
        return a2;
    }

    private static amkw a(amlu amlu, amkw amkw) {
        boolean z;
        amkw amkw2 = amlu.b;
        if (amkw2 == amkw) {
            return amkw;
        }
        if (amkw2 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                z = amlt.a();
            } else {
                int i = Build.VERSION.SDK_INT;
                z = "true".equals(agzi.a(a.a, "false"));
            }
            amlu.a = z;
        }
        if (amlu.a) {
            a(amkw2, amkw);
        }
        if ((amkw != null && amkw.e()) || (amkw2 != null && amkw2.e())) {
            int currentThreadTimeMillis = (int) SystemClock.currentThreadTimeMillis();
            int i2 = currentThreadTimeMillis - amlu.c;
            if (i2 > 0 && amkw2 != null && amkw2.e()) {
                amkw2.a(i2);
            }
            amlu.c = currentThreadTimeMillis;
        }
        amlu.b = amkw;
        return amkw2;
    }

    public static void a() {
        a(false, (String) null);
    }

    public static void a(amko amko, amlw amlw) {
        amrl.a((Object) amlw);
        b((amkw) amko);
    }

    static void a(amkw amkw) {
        amrl.a((Object) amkw);
        amlu amlu = (amlu) b.get();
        amkw amkw2 = amlu.b;
        String c = amkw2.c();
        String c2 = amkw.c();
        if (amkw == amkw2) {
            a(amlu, amkw2.a());
        } else {
            throw new IllegalStateException(amsu.a("Wrong trace, expected %s but got %s", c, c2));
        }
    }

    private static void a(amkw amkw, amkw amkw2) {
        if (amkw != null) {
            if (amkw2 != null) {
                if (amkw.a() == amkw2) {
                    Trace.endSection();
                    return;
                } else if (amkw == amkw2.a()) {
                    c(amkw2.c());
                    return;
                }
            }
            e(amkw);
        }
        if (amkw2 != null) {
            d(amkw2);
        }
    }

    static void a(amkw amkw, String str) {
        if (amkw instanceof amkf) {
            String c = c(amkw);
            if (!"".equals(c)) {
                String valueOf = String.valueOf(c);
                c = valueOf.length() == 0 ? new String(": ") : ": ".concat(valueOf);
            }
            amkd amkd = new amkd(c, str, ((amkf) amkw).d());
            amlr.a(amkd);
            throw amkd;
        }
        int i = Build.VERSION.SDK_INT;
        amkd amkd2 = new amkd(str);
        amlr.a(amkd2);
        throw amkd2;
    }

    static void a(boolean z, String str) {
        IllegalStateException illegalStateException;
        if (amkx.a()) {
            amkw b2 = b();
            if (b2 == null) {
                illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            } else {
                illegalStateException = b2 instanceof amkf ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((amkf) b2).d()) : null;
            }
            if (illegalStateException == null) {
                return;
            }
            if (z) {
                if (str == null) {
                    str = "Tracer";
                }
                Log.e(str, "Missing trace", illegalStateException);
                return;
            }
            throw illegalStateException;
        }
    }
}
