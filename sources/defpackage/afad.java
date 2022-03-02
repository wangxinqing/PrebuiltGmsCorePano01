package defpackage;

import android.accounts.Account;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: afad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afad implements Callable {
    private final afae a;
    private final amzy b;
    private final Set c;

    public afad(afae afae, amzy amzy, Set set) {
        this.a = afae;
        this.b = amzy;
        this.c = set;
    }

    public final Object call() {
        boolean z;
        afae afae = this.a;
        amzy amzy = this.b;
        Set set = this.c;
        amxc p = amxc.p();
        anhk i = amzy.listIterator();
        while (i.hasNext()) {
            aezx aezx = (aezx) ((aorr) i.next()).get();
            Account c2 = aezx.c();
            aukh b2 = aezx.b();
            if (c2 == null) {
                pia pia = (pia) afae.a.a();
                new Object[1][0] = b2;
                z = false;
            } else if (set.contains(aerd.a(c2, b2))) {
                pia pia2 = (pia) afae.a.a();
                Object[] objArr = {c2, b2};
                afae.c.a(b2, c2, aezx.d(), aezx.e());
                z = true;
            } else {
                pia pia3 = (pia) afae.a.a();
                Object[] objArr2 = {c2, b2};
                afae.d.b(c2);
                z = false;
            }
            aulm a2 = aezx.a();
            aucd o = aokj.d.o();
            aokg a3 = afgq.a(b2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokj aokj = (aokj) o.b;
            a3.getClass();
            aokj.b = a3;
            int i2 = aokj.a | 1;
            aokj.a = i2;
            aokj.a = i2 | 2;
            aokj.c = !z;
            p.a((Object) a2, (Object) (aokj) o.i());
        }
        aucd o2 = aokl.b.o();
        for (Collection collection : p.o().values()) {
            aucd o3 = aokk.b.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aokk aokk = (aokk) o3.b;
            if (!aokk.a.a()) {
                aokk.a = aucj.a(aokk.a);
            }
            auab.a((Iterable) collection, (List) aokk.a);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aokl aokl = (aokl) o2.b;
            aokk aokk2 = (aokk) o3.i();
            aokk2.getClass();
            if (!aokl.a.a()) {
                aokl.a = aucj.a(aokl.a);
            }
            aokl.a.add(aokk2);
        }
        ((aetj) afae.b.a()).a((aokl) o2.i());
        return null;
    }
}
