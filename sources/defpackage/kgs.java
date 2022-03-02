package defpackage;

import android.content.SyncResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: kgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kgs implements lev {
    final /* synthetic */ kgt a;

    public kgs(kgt kgt) {
        this.a = kgt;
    }

    public final void a(SyncResult syncResult) {
        lfn g = this.a.c.g();
        if (syncResult != null) {
            try {
                if (!syncResult.hasHardError()) {
                    if (!syncResult.hasSoftError()) {
                        this.a.b.b();
                    } else {
                        g.b(7);
                        this.a.b.a(new Status(7, "Network error occurred while syncing."));
                    }
                    g.a();
                    lfq lfq = this.a.c;
                    lfq.h();
                    lfq.a();
                }
            } catch (RemoteException e) {
                kgt.f.c("RequestSyncOperation", "Unable to report sync result.", e);
                g.b();
            }
        }
        g.b(8);
        this.a.b.a(Status.c);
        g.a();
        lfq lfq2 = this.a.c;
        lfq2.h();
        lfq2.a();
    }
}
