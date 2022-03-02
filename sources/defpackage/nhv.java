package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: nhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nhv implements aora {
    public final List a;
    public final Object b = new Object();
    public ScheduledFuture c;
    public int d = 0;
    private final Context e;
    private final nge f;
    private final ExecutorService g;
    private final ngm h;
    private final amsn i;
    private aorr j = null;
    private int k;

    public nhv(nge nge, ExecutorService executorService, ngm ngm, Context context, amsn amsn, List list) {
        this.f = nge;
        this.g = executorService;
        this.h = ngm;
        this.e = context;
        this.a = list;
        this.i = amsn;
    }

    public final void a() {
        aorr aorr;
        int i2;
        int i3;
        oq oqVar;
        synchronized (this.b) {
            aorr = this.j;
        }
        oq oqVar2 = null;
        if (aorr != null) {
            synchronized (this.b) {
                if (!this.a.isEmpty()) {
                    oqVar = (oq) this.a.remove(0);
                } else {
                    oqVar = null;
                }
            }
            this.f.b(ngm.a(((nfz) oqVar.a).b, (nfy) oqVar.b));
        }
        synchronized (this.b) {
            if (!this.a.isEmpty()) {
                oqVar2 = (oq) this.a.get(0);
            }
        }
        synchronized (this.b) {
            i2 = this.d;
        }
        if (oqVar2 != null && i2 == 0) {
            nfz nfz = (nfz) oqVar2.a;
            nfy nfy = (nfy) oqVar2.b;
            String a2 = ngm.a(nfz.b, nfy);
            if (this.h.a(nfz, nfy, true) == null) {
                ngm ngm = this.h;
                nfw nfw = nfy.a;
                if (nfw == null) {
                    nfw = nfw.e;
                }
                if (ngm.b(nfw.c)) {
                    aorr a3 = this.f.a(a2);
                    synchronized (this.b) {
                        this.j = a3;
                    }
                    aorl.a(a3, this, this.g);
                    ngz.c("FontsSharedState", String.format(Locale.ENGLISH, "Extraction queued for %s", new Object[]{a2}), new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        this.c.cancel(false);
        if (i2 == 0) {
            a(18);
        }
        Context context = this.e;
        amsn amsn = this.i;
        synchronized (this.b) {
            i3 = this.k;
        }
        nhz.a(context, amsn, i2, i3);
    }

    public final void a(int i2) {
        synchronized (this.b) {
            int i3 = this.d;
            if (i3 != 0) {
                ngz.c("FontsSharedState", "Attempted to set multiple end states for pre-extract; is %d, assigned %d", Integer.valueOf(i3), Integer.valueOf(i2));
                return;
            }
            this.d = i2;
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Status status = (Status) obj;
        synchronized (this.b) {
            this.k++;
        }
        a();
    }

    public final void a(Throwable th) {
        a();
    }
}
