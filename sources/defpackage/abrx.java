package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* renamed from: abrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrx implements Runnable {
    final /* synthetic */ abry a;

    public abrx(abry abry) {
        this.a = abry;
    }

    public final void run() {
        abry abry = this.a;
        absf absf = abry.c;
        abxe abxe = abry.a;
        abxk abxk = abry.b;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 2);
        abra abra = absf.d;
        iva.a((Object) abxk, (Object) "scanListener is null.");
        if (abra.j == null) {
            abra.j = new absu(abxk);
            Status a2 = abra.e.a();
            if (!a2.c()) {
                abra.a.b("Failed to initialize resources.", new Object[0]);
                abra.j.a(a2.i);
                abra.c();
                abra.b();
                abra.a(abxe, a2);
                return;
            }
            abra.a.b("Scanning for target devices.", new Object[0]);
            abqg abqg = abra.h;
            abst abst = abra.j;
            abpx abpx = (abpx) abqg;
            abpx.c = 1;
            acwa[] acwaArr = new acwa[2];
            abqg abqg2 = abpx.a;
            abqo.a.a("Starting scan through Nearby Bootstrap", new Object[0]);
            abqo abqo = (abqo) abqg2;
            abqo.d = abst;
            tda tda = abqo.b;
            abqn abqn = abqo.g;
            tew tew = tew.a;
            teg teg = (teg) tew.b.get(abqn);
            if (teg == null) {
                teg = new teg(abqn);
                tew.b.put(abqn, teg);
            }
            tev tev = (tev) tda;
            iby iby = (iby) tda;
            ige a3 = tev.a.a(iby, new Object(), "scan");
            igc igc = a3.b;
            iva.a((Object) igc, (Object) "Key must not be null");
            acwaArr[0] = tev.a.a(iby, (igi) new teq(a3, teg), (ihg) new ter(igc));
            abqw abqw = abpx.b;
            abqw.b.a("Starting scan via Nearby Connections.", new Object[0]);
            abqw.f = abst;
            tiw tiw = new tiw();
            tiw.a(abqw.a);
            DiscoveryOptions discoveryOptions = tiw.a;
            tiz tiz = abqw.l;
            acwaArr[1] = abqw.c.a(azlf.g(), tiz, discoveryOptions);
            Status a4 = acqd.a(acws.a(acwaArr));
            if (!a4.c()) {
                a4 = new Status(10557);
            }
            abra.a(abxe, a4);
            return;
        }
        abra.a.e("Source device is already scanning.", new Object[0]);
        abra.a(abxe, new Status(10558));
    }
}
