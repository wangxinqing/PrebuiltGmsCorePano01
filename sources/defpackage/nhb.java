package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: nhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhb implements Runnable {
    final /* synthetic */ nhc a;
    private final nge b;
    private final ngm c;

    public nhb(nhc nhc, nge nge, ngm ngm) {
        this.a = nhc;
        this.b = nge;
        this.c = ngm;
    }

    public final void run() {
        Status status;
        Throwable e;
        FontFetchResult a2 = FontFetchResult.a(nhc.a);
        String a3 = ngm.a(this.a.c);
        try {
            status = (Status) this.b.a(a3).get(this.a.g, TimeUnit.MILLISECONDS);
            try {
                if (!status.c()) {
                    ngz.c("FontFetch", "Extracting asset failed with status: %s, for %s", Integer.valueOf(status.i), a3);
                } else {
                    ngm ngm = this.c;
                    nhl nhl = this.a.d;
                    File a4 = ngm.a(nhl.b, nhl.c, true);
                    if (a4 == null) {
                        ngz.c("FontFetch", "Extracting asset succeeded but file not found on disk", new Object[0]);
                    } else {
                        nhl nhl2 = this.a.d;
                        a2 = FontFetchResult.a(nhc.a(nhl2.b, nhl2.c), a4);
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
                ngz.a("FontFetch", e, "Error in extracting asset %s", a3);
                this.b.b(ngm.a(this.a.c));
                this.a.a(a2);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            e = e3;
            status = null;
            ngz.a("FontFetch", e, "Error in extracting asset %s", a3);
            this.b.b(ngm.a(this.a.c));
            this.a.a(a2);
        }
        if (status == null || status.i != 23509) {
            this.b.b(ngm.a(this.a.c));
        }
        this.a.a(a2);
    }
}
