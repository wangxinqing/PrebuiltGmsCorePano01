package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* renamed from: cnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cnt implements Runnable {
    private final cny a;
    private final cmm b;
    private final int c;
    private final Runnable d;

    public cnt(cny cny, cmm cmm, int i, Runnable runnable) {
        this.a = cny;
        this.b = cmm;
        this.c = i;
        this.d = runnable;
    }

    public final void run() {
        cmw cmw;
        cny cny = this.a;
        cmm cmm = this.b;
        int i = this.c;
        Runnable runnable = this.d;
        try {
            cpo cpo = cny.d;
            coh coh = cny.b;
            coh.getClass();
            cpo.a(new cnw(coh));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) cny.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    cnd a2 = cny.e.a(((cme) cmm).a);
                    Iterable<cok> iterable = (Iterable) cny.d.a(new cnu(cny, cmm));
                    if (iterable.iterator().hasNext()) {
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (cok c2 : iterable) {
                                arrayList.add(c2.c());
                            }
                            cmu cmu = new cmu();
                            cmu.a = arrayList;
                            cmu.b = ((cme) cmm).b;
                            String str = "";
                            if (cmu.a == null) {
                                str = " events";
                            }
                            if (str.isEmpty()) {
                                cmw = a2.a(new cmq(cmu.a, cmu.b));
                            } else {
                                throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
                            }
                        } else {
                            cne.a("Uploader", (Object) cmm);
                            cmw = cmw.d();
                        }
                        cny.d.a(new cnv(cny, cmw, iterable, cmm, i));
                    }
                    runnable.run();
                }
            }
            cny.d.a(new cnx(cny, cmm, i));
        } catch (cpm e) {
            cny.c.a(cmm, i + 1);
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
        runnable.run();
    }
}
