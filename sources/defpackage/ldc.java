package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Date;

/* renamed from: ldc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldc implements lcx {
    final /* synthetic */ ldd a;
    private final lcl b;
    private final Date c;
    private final kha d;

    public ldc(ldd ldd, lcl lcl, Date date, kha kha) {
        this.a = ldd;
        this.b = lcl;
        this.c = date;
        this.d = kha;
    }

    public final void a(lcy lcy) {
        int i;
        if (lcy.a) {
            ldd ldd = this.a;
            this.d.a(!ldd.b.a(ldd.c, (lcp) lct.a(this.b), this.c.getTime()).c(), lcy.b);
            return;
        }
        kha kha = this.d;
        boolean z = lcy.c;
        lfn g = kha.b.g();
        if (!z) {
            i = 8;
        } else {
            i = 7;
        }
        g.b(i);
        try {
            kha.a.a(new Status(i, "Sync more failed.", (PendingIntent) null));
        } catch (RemoteException e) {
            khb.f.c("SyncMoreOperation", "Unable to report sync more result.", e);
            g.b();
        }
        g.a();
        lfq lfq = kha.b;
        lfq.h();
        lfq.a();
    }
}
