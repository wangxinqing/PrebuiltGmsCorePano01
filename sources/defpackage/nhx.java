package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: nhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nhx implements Runnable {
    final /* synthetic */ aorr a;
    final /* synthetic */ String b;
    final /* synthetic */ nfw c;
    final /* synthetic */ nhy d;

    public nhx(nhy nhy, aorr aorr, String str, nfw nfw) {
        this.d = nhy;
        this.a = aorr;
        this.b = str;
        this.c = nfw;
    }

    public final void run() {
        Status status;
        int i;
        nhy nhy;
        String str;
        nfw nfw;
        try {
            status = (Status) this.a.get(0, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ngz.a("FontsSharedState", e, "Failed to get status of %s in download listener", this.b);
            status = Status.c;
        } catch (Throwable th) {
            this.d.a(this.b, this.c);
            throw th;
        }
        ngz.c("FontsSharedState", "Status %s for %s", status, this.b);
        if (!status.c()) {
            nhy = this.d;
            str = this.b;
            nfw = this.c;
        } else {
            synchronized (this.d.c.b) {
                i = this.d.c.q.a.b;
            }
            try {
                nfv a2 = nhg.a(this.d.b.b(this.c.b));
                int i2 = a2.b;
                if (i >= i2) {
                    ngz.c("FontsSharedState", "Directory download complete for %d but already at %d; nop", Integer.valueOf(i2), Integer.valueOf(i));
                }
                nhy nhy2 = this.d;
                nhy2.c.c(nhy2.a).a(a2);
                nhy nhy3 = this.d;
                ngz.c("FontsSharedState", "After download %s and update using directory v%d", this.b, Integer.valueOf(nhy3.c.e(nhy3.a.getApplicationContext()).a.b));
            } catch (Exception e2) {
                ngz.a("FontsSharedState", (Throwable) e2, "Failed to load and update directory from %s after download %s", this.c.b, this.b);
            }
            nhy = this.d;
            str = this.b;
            nfw = this.c;
        }
        nhy.a(str, nfw);
    }
}
