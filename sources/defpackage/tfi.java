package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;

/* renamed from: tfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfi implements Runnable {
    final /* synthetic */ StartScanRequest a;
    final /* synthetic */ tfq b;

    public tfi(tfq tfq, StartScanRequest startScanRequest) {
        this.b = tfq;
        this.a = startScanRequest;
    }

    public final void run() {
        tdh tdh;
        tdf a2 = this.b.a();
        if (a2 != null) {
            StartScanRequest startScanRequest = this.a;
            byte b2 = startScanRequest.d;
            teh teh = startScanRequest.b;
            teb teb = startScanRequest.c;
            if (a2.a()) {
                a2.a(teb, -1);
            } else if (!a2.b()) {
                int i = Build.VERSION.SDK_INT;
                Context context = a2.f;
                ased ased = a2.g;
                arwa arwa = a2.j;
                if (b2 != 2) {
                    tdh = new tcu(context, arwa);
                } else {
                    tdh = new tcp(ased, arwa);
                }
                a2.c = tdh;
                a2.j.a(4, a2.c);
                a2.c.a(teh);
                a2.b(teb);
            } else {
                a2.a(teb, 2982);
            }
        }
    }
}
