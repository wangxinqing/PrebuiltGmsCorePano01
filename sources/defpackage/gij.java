package defpackage;

import android.content.Context;
import com.google.android.gms.auth.managed.DownloadStatusResponse;

/* renamed from: gij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gij implements Runnable {
    private final Context a;
    private final long b;
    private final gii c;
    private final gjh d;

    public gij(Context context, gii gii, long j) {
        gjh a2 = gjh.a();
        this.a = context;
        this.b = j;
        iva.a((Object) gii);
        this.c = gii;
        this.d = a2;
    }

    public final void run() {
        DownloadStatusResponse a2 = this.d.a(this.a, this.b);
        switch (a2.b) {
            case 21508:
                gii gii = this.c;
                if (!awot.b()) {
                    giq giq = (giq) gii;
                    if (!giq.c) {
                        giq.b();
                        return;
                    }
                }
                ((giq) gii).a(101);
                return;
            case 21509:
                this.c.a();
                return;
            case 21510:
                gii gii2 = this.c;
                int i = a2.c;
                giq giq2 = (giq) gii2;
                giq2.d = 0;
                giq2.a(Integer.valueOf(i));
                giq2.b();
                return;
            case 21511:
                gii gii3 = this.c;
                if (!awot.b()) {
                    giq giq3 = (giq) gii3;
                    if (!giq3.c) {
                        giq3.b();
                        return;
                    }
                }
                giq.a.e("Download failed.", new Object[0]);
                ((giq) gii3).a(-2);
                return;
            default:
                this.c.a();
                return;
        }
    }
}
