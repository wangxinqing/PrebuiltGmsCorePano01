package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnn {
    private static final AtomicReference a = new AtomicReference((Object) null);

    public static agnm a(aghz aghz, String str) {
        amrl.a((Object) aghz);
        amrl.b(!TextUtils.isEmpty(str));
        agnm agnm = (agnm) a.getAndSet((Object) null);
        if (agnm != null) {
            agnm.b.a = str;
        }
        return agnm;
    }

    public static void b(aghz aghz) {
        amrl.a((Object) aghz);
        a.set((Object) null);
    }

    public static void a(aghz aghz) {
        amrl.a((Object) aghz);
        agnm agnm = (agnm) a.getAndSet((Object) null);
        if (agnm != null) {
            String str = agnm.b.a;
        }
    }

    public static boolean b(aghz aghz, String str) {
        amrl.a((Object) aghz);
        amrl.a((Object) str);
        return a.get() == null && a.compareAndSet((Object) null, new agnm(str));
    }

    public static void a(aghz aghz, String str, long j, long j2) {
        amrl.a((Object) aghz);
        agnm agnm = (agnm) a.get();
        if (agnm != null && agnm.b.b <= j) {
            String str2 = str;
            long j3 = j;
            agni a2 = agni.a(aghz.a, str2, j3, j + j2, Thread.currentThread().getId());
            synchronized (agnm.d) {
                agnm.d.add(a2);
            }
            agnm.a.incrementAndGet();
        }
    }

    public static barz[] a(aghz aghz, agnm agnm) {
        amrl.a((Object) aghz);
        agzj.c();
        if (agnm.a.get() == 0) {
            return null;
        }
        Comparator comparator = agnk.a;
        synchronized (agnm.d) {
            Collections.sort(agnm.d, comparator);
            agnm.b.a(agnm.d);
        }
        ArrayList arrayList = new ArrayList(agnm.c.keySet());
        Collections.sort(arrayList, comparator);
        agnm.b.a(arrayList);
        agnj agnj = new agnj(agnm.b);
        agnj.a(agnj.a, 0);
        if (agnj.b.size() == 1) {
            return null;
        }
        List list = agnj.b;
        return (barz[]) list.toArray(new barz[list.size()]);
    }
}
