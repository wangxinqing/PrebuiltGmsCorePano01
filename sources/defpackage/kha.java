package defpackage;

import android.os.RemoteException;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;

/* renamed from: kha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kha {
    public final kwg a;
    public final lfq b;

    public kha(kwg kwg, lfq lfq) {
        this.a = kwg;
        this.b = lfq;
    }

    public final void a(boolean z, int i) {
        boolean z2;
        lgc lgc = (lgc) this.b;
        lgc.k();
        if ((((ambk) lgc.e.b).b & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(!z2, (Object) "Can't call setSyncMoreDetails twice");
        aucd aucd = lgc.e;
        aucd o = ambf.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ambf ambf = (ambf) o.b;
        int i2 = ambf.a | 2;
        ambf.a = i2;
        ambf.c = z;
        ambf.a = 1 | i2;
        ambf.b = i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambf ambf2 = (ambf) o.i();
        ambk ambk2 = ambk.K;
        ambf2.getClass();
        ambk.J = ambf2;
        ambk.b |= 2;
        try {
            this.a.a(new OnSyncMoreResponse(z));
        } catch (RemoteException e) {
            khb.f.c("SyncMoreOperation", "Unable to report sync more result.", e);
            lfn g = this.b.g();
            g.b();
            g.a();
        }
        lfq lfq = this.b;
        lfq.h();
        lfq.a();
    }
}
