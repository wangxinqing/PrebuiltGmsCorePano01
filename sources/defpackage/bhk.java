package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.android.volley.toolbox.ImageRequest;
import com.google.ads.afma.proto2api.c;
import com.google.ads.afma.proto2api.g;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: bhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bhk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bhm b;

    public bhk(bhm bhm, int i) {
        this.b = bhm;
        this.a = i;
    }

    public final void run() {
        c cVar;
        bhm bhm = this.b;
        int i = this.a;
        if (i > 0) {
            try {
                Thread.sleep((long) (i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
            } catch (InterruptedException e) {
            }
        }
        try {
            PackageInfo packageInfo = bhm.a.getPackageManager().getPackageInfo(bhm.a.getPackageName(), 0);
            Context context = bhm.a;
            cVar = nod.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable th) {
            cVar = null;
        }
        this.b.j = cVar;
        if (this.a < 4) {
            if (!(cVar == null || (cVar.a & 4194304) == 0 || cVar.o.equals("0000000000000000000000000000000000000000000000000000000000000000") || (cVar.c & FragmentTransaction.TRANSIT_ENTER_MASK) == 0)) {
                g gVar = cVar.P;
                if (gVar == null) {
                    gVar = g.e;
                }
                if ((gVar.a & 1) != 0) {
                    g gVar2 = cVar.P;
                    if (gVar2 == null) {
                        gVar2 = g.e;
                    }
                    if (gVar2.b != -2) {
                        return;
                    }
                }
            }
            this.b.a(this.a + 1);
        }
    }
}
