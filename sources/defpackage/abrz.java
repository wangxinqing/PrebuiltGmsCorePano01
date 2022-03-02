package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrz implements Runnable {
    final /* synthetic */ absa a;

    public abrz(absa absa) {
        this.a = absa;
    }

    public final void run() {
        Status status;
        absa absa = this.a;
        absf absf = absa.b;
        abxe abxe = absa.a;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 3);
        abra abra = absf.d;
        abra.a.b("Stopping scan for target devices.", new Object[0]);
        if (abra.j == null) {
            abra.a.e("Source device is not scanning.", new Object[0]);
            abra.b(abxe, new Status(10559));
            return;
        }
        Status status2 = new Status(8);
        try {
            abqg abqg = abra.h;
            tda tda = ((abqo) ((abpx) abqg).a).b;
            abqw abqw = ((abpx) abqg).b;
            abqw.b.a("Stopping scan.", new Object[0]);
            abqw.b();
            abqw.j.clear();
            Status a2 = acqd.a(acws.a(((tev) tda).a.a((iby) tda, "scan"), acws.a((Object) null)));
            if (!a2.c()) {
                iwd iwd = abra.a;
                String valueOf = String.valueOf(tdg.g(a2.i));
                iwd.e(valueOf.length() == 0 ? new String("Error while stopping Nearby scan: ") : "Error while stopping Nearby scan: ".concat(valueOf), new Object[0]);
                status = new Status(10557);
            } else {
                status = new Status(0);
            }
        } finally {
            abra.b(abxe, status2);
            abra.c();
        }
    }
}
