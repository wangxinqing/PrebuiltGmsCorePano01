package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: aezf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezf extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aezf(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aezf.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        aeuy aeuy = (aeuy) list.get(0);
        amzy amzy = (amzy) list.get(1);
        aeyj aeyj = (aeyj) list.get(2);
        afdo a = aeuy.a().a();
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList(aeuy.h());
            Collections.sort(arrayList, aeyi.d);
            anhk i = amzy.a((Collection) arrayList).listIterator();
            while (i.hasNext()) {
                aeth aeth = (aeth) i.next();
                amrl.a((Object) aeth.c(), (Object) "Server state must have assigned timestamps!");
                auay a2 = aeyi.a(aeth.b());
                if (aeth.a() != null) {
                    hashMap.put(a2, aeth);
                } else {
                    hashMap.remove(a2);
                }
            }
            hashMap.getClass();
            aeyg aeyg = new aeyg(hashMap);
            a.close();
            aeyj.a(aeyg, 1);
            aeyj.a((pdh) aeyj.a.a(), 2);
            awdn awdn = (awdn) aeyj.b.a();
            aeyj.a(awdn, 3);
            awdn awdn2 = (awdn) aeyj.c.a();
            aeyj.a(awdn2, 4);
            aeyi aeyi = new aeyi(aeyg, awdn, awdn2);
            aeyi.getClass();
            return aorl.a((Object) amzy.a((Collection) anda.a((List) amzy, (amqy) new aeza(aeyi))));
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
