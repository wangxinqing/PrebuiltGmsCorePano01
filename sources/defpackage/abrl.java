package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrl implements Runnable {
    final /* synthetic */ abrm a;

    public abrl(abrm abrm) {
        this.a = abrm;
    }

    public final void run() {
        acwa acwa;
        Status status;
        abrm abrm = this.a;
        absf absf = abrm.b;
        abxe abxe = abrm.a;
        String str = abrm.c;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 6);
        abra abra = absf.d;
        if (abra.k == null) {
            abra.a.e("No connection currently in progress.", new Object[0]);
            abra.f(abxe, new Status(10567));
            return;
        }
        Status status2 = new Status(8);
        try {
            abqg abqg = abra.h;
            int i = ((abpx) abqg).c;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 1) {
                    abqg abqg2 = ((abpx) abqg).a;
                    if (str != null) {
                        iva.a(str, (Object) "pin cannot be empty.");
                        String lowerCase = str.toLowerCase();
                        iwd iwd = abqo.a;
                        String valueOf = String.valueOf(lowerCase);
                        iwd.a(valueOf.length() == 0 ? new String("Attempting connection with PIN ") : "Attempting connection with PIN ".concat(valueOf), new Object[0]);
                        tda tda = ((abqo) abqg2).b;
                        iha b = ihb.b();
                        b.a = new tej(lowerCase);
                        acwa = ((iby) tda).b(b.a());
                    } else {
                        abqo.a.a("Attempting connection without PIN. Will use Nearby#Bootstrap#confirm.", new Object[0]);
                        tda tda2 = ((abqo) abqg2).b;
                        iha b2 = ihb.b();
                        b2.a = tek.a;
                        acwa = ((iby) tda2).b(b2.a());
                    }
                } else if (i2 != 2) {
                    acwa = acws.a((Exception) new ibr(new Status(13)));
                } else {
                    abqw abqw = ((abpx) abqg).b;
                    String str2 = abqw.g;
                    if (str2 != null) {
                        iwd iwd2 = abqw.b;
                        String valueOf2 = String.valueOf(abqw.g);
                        iwd2.a(valueOf2.length() == 0 ? new String("Automatically accepting connection to device endpoint ") : "Automatically accepting connection to device endpoint ".concat(valueOf2), new Object[0]);
                        acwa = abqw.c.a(str2, (tjd) new acbm(abqw.d, abqw.n));
                    } else {
                        abqw.b.e("No device to accept connection to.", new Object[0]);
                        acwa = acws.a((Exception) new ibr(new Status(10567)));
                    }
                }
                if (!acqd.a(acwa).c()) {
                    status = new Status(10557);
                } else {
                    status = new Status(0);
                }
                return;
            }
            throw null;
        } finally {
            abra.f(abxe, status2);
        }
    }
}
