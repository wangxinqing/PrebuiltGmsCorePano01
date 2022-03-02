package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bakf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakf extends azzn {
    public final azzg c;
    private azzl d;

    public bakf(azzg azzg) {
        amrl.a((Object) azzg, (Object) "helper");
        this.c = azzg;
    }

    public final void a() {
        azzl azzl = this.d;
        if (azzl != null) {
            azzl.a();
        }
    }

    public final void a(azzk azzk) {
        List list = azzk.a;
        azzl azzl = this.d;
        if (azzl == null) {
            azzg azzg = this.c;
            azzd azzd = new azzd();
            amrl.a(!list.isEmpty(), (Object) "addrs is empty");
            azzd.a = Collections.unmodifiableList(new ArrayList(list));
            azze azze = new azze(azzd.a, azzd.b, azzd.c);
            baix baix = (baix) azzg;
            baix.b.l.b();
            amrl.b(!baix.b.B, (Object) "Channel is terminated");
            bajg bajg = new bajg(baix.b, azze, baix);
            bakb bakb = new bakb(this, bajg);
            bajg.i.l.b();
            amrl.b(!bajg.f, (Object) "already started");
            amrl.b(!bajg.g, (Object) "already shutdown");
            bajg.f = true;
            if (bajg.i.A) {
                bajg.i.l.execute(new bajc(bakb));
            } else {
                List list2 = bajg.a.a;
                String a = bajg.i.a();
                baji baji = bajg.i;
                String str = baji.p;
                baek baek = baji.h;
                ScheduledExecutorService a2 = baek.a();
                babq babq = bajg.i.l;
                baho baho = new baho(bajg, bakb);
                baji baji2 = bajg.i;
                bahv bahv = new bahv(list2, a, str, baek, a2, babq, baho, baji2.F, baji2.N.a(), bajg.d, bajg.b, bajg.c);
                badu badu = bajg.i.D;
                azyq azyq = new azyq();
                azyq.a = "Child Subchannel started";
                azyq.b = azyr.CT_INFO;
                azyq.a(bajg.i.k.a());
                azyq.c = bahv;
                badu.a(azyq.a());
                bajg.e = bahv;
                bajg.i.l.execute(new baje(bajg, bahv));
            }
            this.d = bajg;
            this.c.a(azxz.CONNECTING, new bakc(azzh.a((azzl) bajg)));
            bajg.b();
            return;
        }
        bajg bajg2 = (bajg) azzl;
        bajg2.i.l.b();
        bahv bahv2 = bajg2.e;
        amrl.a((Object) list, (Object) "newAddressGroups");
        bahv.a(list, "newAddressGroups contains null entry");
        amrl.a(true ^ list.isEmpty(), (Object) "newAddressGroups is empty");
        bahv2.e.execute(new bahg(bahv2, list));
    }

    public final void a(babj babj) {
        azzl azzl = this.d;
        if (azzl != null) {
            azzl.a();
            this.d = null;
        }
        this.c.a(azxz.TRANSIENT_FAILURE, new bakc(azzh.a(babj)));
    }
}
