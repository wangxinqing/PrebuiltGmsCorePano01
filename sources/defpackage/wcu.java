package defpackage;

import android.util.ArrayMap;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wcu {
    public final ScheduledExecutorService a = tid.a();
    public wfn b;
    private final Map c = new ArrayMap();

    private final void a(long j) {
        wct wct = (wct) this.c.remove(Long.valueOf(j));
        if (wct != null) {
            wct.a();
            jjg jjg = vvj.a;
        }
    }

    private final void b(long j) {
        for (Long longValue : this.c.keySet()) {
            wct wct = (wct) this.c.get(Long.valueOf(longValue.longValue()));
            if (wct != null) {
                if (wct.d != null) {
                    wct.a();
                }
                wcs wcs = new wcs(this, wct);
                jjg jjg = vvj.a;
                tfu b2 = tfu.b(wcs, j, this.a);
                wct.a();
                wct.d = b2;
            }
        }
    }

    private static long c(ShareTarget shareTarget) {
        return (long) Arrays.hashCode(new Object[]{shareTarget.b, shareTarget.c, Integer.valueOf(shareTarget.d), Boolean.valueOf(shareTarget.i), shareTarget.j, Boolean.valueOf(shareTarget.k)});
    }

    public final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.c.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a(((Long) arrayList.get(i)).longValue());
        }
    }

    public static boolean a(ShareTarget shareTarget, ShareTarget shareTarget2) {
        return c(shareTarget) == c(shareTarget2);
    }

    public final synchronized void c() {
        b(ayni.a.a().L());
    }

    public final synchronized List a() {
        return amzy.a(this.c.values());
    }

    public final synchronized void a(ShareTarget shareTarget) {
        a(c(shareTarget));
    }

    public final synchronized void a(ShareTarget shareTarget, String str, byte[] bArr) {
        long c2 = c(shareTarget);
        Map map = this.c;
        Long valueOf = Long.valueOf(c2);
        wct wct = (wct) map.get(valueOf);
        if (wct != null) {
            wct.a();
        }
        this.c.put(valueOf, new wct(str, bArr, shareTarget));
        jjg jjg = vvj.a;
    }

    public final synchronized void b() {
        b(ayni.a.a().K());
    }

    public final synchronized boolean b(ShareTarget shareTarget) {
        wct wct;
        wct = (wct) this.c.get(Long.valueOf(c(shareTarget)));
        return wct == null || wct.d != null;
    }

    public final synchronized void a(wct wct, String str) {
        long c2 = c(wct.c);
        if (((wct) this.c.get(Long.valueOf(c2))) == wct) {
            a(c2);
            wfn wfn = this.b;
            if (wfn != null) {
                jjg jjg = vvj.a;
                wgu wgu = wfn.a;
                wgu.a((Runnable) new wfo(wgu, str));
            }
        }
    }
}
