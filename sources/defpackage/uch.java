package defpackage;

import android.content.Intent;
import com.google.android.gms.R;
import java.util.Iterator;

/* renamed from: uch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uch extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ udb e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uch(udb udb, String str, Intent intent, String str2, String str3, boolean z) {
        super(str);
        this.e = udb;
        this.a = intent;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final void run() {
        uaj uaj;
        byte[] byteArrayExtra = this.a.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY");
        udb udb = this.e;
        String str = this.b;
        ttg ttg = udb.s;
        if (ttg == null || !str.equals(ttg.m())) {
            Iterator it = udb.b.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    uaj = null;
                    break;
                }
                ttg ttg2 = (ttg) it.next();
                if (str.equals(ttg2.m())) {
                    uaj = udb.a(ttg2);
                    break;
                }
            }
        } else {
            uaj = udb.a(udb.s);
        }
        if (uaj != null) {
            aucd aucd = (aucd) uaj.c(5);
            aucd.a((aucj) uaj);
            if (aymw.r()) {
                if (arww.c(this.c) != null) {
                    jjg jjg = tsp.a;
                    String c2 = arww.c(this.c);
                    if (c2 != null) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        uaj uaj2 = (uaj) aucd.b;
                        c2.getClass();
                        uaj2.a |= 32;
                        uaj2.h = c2;
                    } else {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        uaj uaj3 = (uaj) aucd.b;
                        uaj3.a &= -33;
                        uaj3.h = uaj.K.h;
                    }
                } else {
                    String a2 = ((twg) thl.a(this.e.e, twg.class)).a();
                    if (a2 != null) {
                        String string = this.e.e.getString(R.string.fast_pair_device_name, new Object[]{a2, ((uaj) aucd.b).h});
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        uaj uaj4 = (uaj) aucd.b;
                        string.getClass();
                        uaj4.a |= 32;
                        uaj4.h = string;
                    }
                }
            }
            jjg jjg2 = tsp.a;
            uaj uaj5 = (uaj) aucd.b;
            byte[] b2 = anln.d().a(aooa.a(byteArrayExtra, aeez.a(this.c))).b();
            arxr e2 = arxs.e();
            e2.a((uaj) aucd.i());
            e2.a(auay.a(byteArrayExtra));
            e2.b(auay.a(b2));
            e2.a(this.b);
            arxs a3 = e2.a();
            if (aymw.x() && this.d) {
                arxt arxt = this.e.g;
                arxt.a(arxt.d(), a3, (aora) new ucg(this, byteArrayExtra, uaj));
            } else {
                arxt arxt2 = this.e.g;
                arxt2.a(arxt2.d(), a3, (aora) null);
            }
            aucd o = tzi.p.o();
            String str2 = this.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzi tzi = (tzi) o.b;
            str2.getClass();
            tzi.a |= 1;
            tzi.b = str2;
            auay a4 = auay.a(byteArrayExtra);
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzi tzi2 = (tzi) o.b;
            a4.getClass();
            int i = 2 | tzi2.a;
            tzi2.a = i;
            tzi2.c = a4;
            String str3 = uaj.y;
            str3.getClass();
            tzi2.a = i | 512;
            tzi2.k = str3;
            auzo auzo = uaj.I;
            if (auzo == null) {
                auzo = auzo.j;
            }
            o.aa(new aucu(auzo.f, auzo.g));
            uaj uaj6 = (uaj) aucd.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzi tzi3 = (tzi) o.b;
            uaj6.getClass();
            tzi3.n = uaj6;
            tzi3.a |= 1024;
            tzi tzi4 = (tzi) o.i();
            this.e.b.a(tzi4);
            if (aymw.a.a().aN()) {
                if (!aymw.aa()) {
                    ((tvs) thl.a(this.e.e, tvs.class)).a("android.bluetooth.device.action.ACL_CONNECTED", tzi4);
                } else if (((tvs) thl.a(this.e.e, tvs.class)).a("android.bluetooth.device.action.ACL_CONNECTED", tzi4)) {
                    this.e.b.a(tzi4, true);
                }
            }
        } else {
            ((anih) tsp.a.c()).a("FastPair: Could not find matching nearby item for %s.", (Object) this.b);
        }
        this.e.s = null;
    }
}
