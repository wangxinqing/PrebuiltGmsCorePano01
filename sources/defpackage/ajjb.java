package defpackage;

import android.content.Context;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ajjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjb {
    public static ajja a;
    private static final InactiveReason b = new InactiveReason(12, "LocationDisabled");

    public static int a(List list) {
        for (int i : InactiveReason.a) {
            if (InactiveReason.a(list, i)) {
                return i;
            }
        }
        String valueOf = String.valueOf(list);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unknown inactive reason: ");
        sb.append(valueOf);
        ajix.c("GCoreUlr", 36, sb.toString());
        return 0;
    }

    public static hpg b(String str) {
        if (!c()) {
            return null;
        }
        try {
            return a.a.f(str);
        } catch (RuntimeException e) {
            ajjf.a(e);
            return null;
        }
    }

    public static boolean c() {
        return a != null && aztb.a.a().ag();
    }

    public static boolean d() {
        return a != null && aztb.a.a().ai();
    }

    public static hpe a() {
        if (c()) {
            return a.a.c();
        }
        return null;
    }

    public static void b() {
        if (c()) {
            try {
                a.c();
            } catch (RuntimeException e) {
                ajjf.a(e);
            }
        }
    }

    public static List a(AccountConfig accountConfig) {
        List e = accountConfig.e();
        if (accountConfig.m.e) {
            return e;
        }
        ArrayList arrayList = new ArrayList(e);
        arrayList.add(b);
        return arrayList;
    }

    public static void a(int i) {
        a("UlrError", i);
    }

    public static void b(String str, long j) {
        if (c()) {
            try {
                a.a.e(str).a(j);
            } catch (RuntimeException e) {
                ajjf.a(e);
            }
            a.a();
        }
    }

    public static synchronized void a(Context context) {
        synchronized (ajjb.class) {
            if (a == null) {
                a = new ajja(context);
            }
        }
    }

    public static void a(String str) {
        a(str, 1);
    }

    public static void a(String str, int i) {
        if (c()) {
            try {
                a.a.d(str).a(i);
            } catch (RuntimeException e) {
                ajjf.a(e);
            }
            a.a();
        }
    }

    public static void a(String str, int i, int i2) {
        if (c()) {
            try {
                hpb d = a.a.d(str);
                for (int i3 = 0; i3 < i2; i3++) {
                    d.a(i);
                }
            } catch (RuntimeException e) {
                ajjf.a(e);
            }
            a.a();
        }
    }

    public static void a(String str, long j) {
        if (c() && j != 0) {
            try {
                a.a.c(str).a(j);
            } catch (RuntimeException e) {
                ajjf.a(e);
            }
            a.a();
        }
    }

    public static void a(String str, ajkh ajkh) {
        if (ajkh != null && !str.isEmpty()) {
            a(str, ajkh.g);
        }
    }

    public static void a(String str, ReportingConfig reportingConfig) {
        try {
            a(str, (long) reportingConfig.b().size());
        } catch (RuntimeException e) {
            ajjf.a(e);
        }
    }

    public static void a(String str, boolean z) {
        ReentrantReadWriteLock.WriteLock writeLock;
        hov hov;
        if (c()) {
            try {
                hph hph = a.a;
                hph.e.writeLock().lock();
                try {
                    hot hot = (hot) hph.j.get(str);
                    if (hot == null) {
                        hph.e.writeLock().lock();
                        hov = new hov(hph, str);
                        hph.e.writeLock().unlock();
                        writeLock = hph.e.writeLock();
                    } else {
                        hov = (hov) hot;
                        writeLock = hph.e.writeLock();
                    }
                    writeLock.unlock();
                    hov.a(!z ? 0 : 1, 1, hph.b);
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(str.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(str));
                } catch (Throwable th) {
                    hph.e.writeLock().unlock();
                    throw th;
                }
            } catch (RuntimeException e2) {
                ajjf.a(e2);
            }
            a.a();
        }
    }

    public static void a(boolean z) {
        if (d()) {
            a.b(z);
        }
    }
}
