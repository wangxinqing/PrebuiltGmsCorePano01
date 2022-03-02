package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrn implements Runnable {
    final /* synthetic */ abro a;

    public abrn(abro abro) {
        this.a = abro;
    }

    public final void run() {
        Status status;
        abro abro = this.a;
        absf absf = abro.b;
        abxe abxe = abro.a;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 7);
        abra abra = absf.d;
        abra.a.b("Disconnecting", new Object[0]);
        if (abra.k == null) {
            abra.a.e("No connection in progress. BootstrapController is null", new Object[0]);
            abra.g(abxe, new Status(10567));
            return;
        }
        Status status2 = new Status(8);
        try {
            Status a2 = acqd.a(abra.h.a());
            if (a2.c()) {
                status = new Status(0);
            } else if (a2.i != 10567) {
                status = new Status(10557);
            } else {
                status = new Status(10567);
            }
        } finally {
            abra.a();
            abra.g(abxe, status2);
        }
    }
}
