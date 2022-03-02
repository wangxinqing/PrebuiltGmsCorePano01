package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: ckb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckb implements bve {
    public final HashMap a = new HashMap();

    public final Future a() {
        Set set;
        ArrayList arrayList;
        if (!this.a.isEmpty()) {
            cjd p = cbi.p();
            for (bsz bsz : this.a.keySet()) {
                if (!bsz.b()) {
                    ckc ckc = (ckc) this.a.get(bsz);
                    clg<Integer> clg = ckc.a;
                    jtm jtm = new jtm();
                    for (Integer intValue : clg) {
                        int intValue2 = intValue.intValue();
                        juu juu = new juu();
                        juu.b();
                        jtm.a(intValue2, juu.a());
                    }
                    jtm.a(ContextData.a);
                    jtn a2 = jtm.a();
                    ContextManagerClientInfo a3 = cbi.a(bsz, "SyncOperation");
                    ArrayList b = p.a.b((ContextDataFilterImpl) a2, a3.a());
                    bte x = cbi.x();
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        ContextData contextData = (ContextData) it.next();
                        if (!x.a(a3, contextData.h())) {
                            new Object[1][0] = Integer.valueOf(contextData.g());
                            it.remove();
                        }
                    }
                    if (!b.isEmpty()) {
                        for (bvt bvt : ckc.c.m()) {
                            if (ckc.c.d(bvt)) {
                                set = ckc.c.c((Object) bvt);
                            } else {
                                set = null;
                            }
                            if (set != null) {
                                arrayList = new ArrayList();
                                int size = b.size();
                                for (int i = 0; i < size; i++) {
                                    ContextData contextData2 = (ContextData) b.get(i);
                                    if (ckt.a(contextData2, set)) {
                                        arrayList.add(contextData2);
                                    }
                                }
                            } else {
                                arrayList = b;
                            }
                            if (!arrayList.isEmpty()) {
                                new ckd(bvt, arrayList, bsz, new cka(bsz)).a(bvq.a("ConsumerSyncOperation"));
                            }
                        }
                    }
                }
            }
        }
        return buk.a;
    }

    public final void a(bsz bsz, cas cas) {
        ckc ckc = (ckc) this.a.get(bsz);
        if (ckc != null) {
            int i = cas.b().bA;
            int b = ckc.a.b(i, cas);
            if (b == 3) {
                long j = Long.MAX_VALUE;
                for (cas i2 : (Set) ckc.a.get(i)) {
                    j = Math.min(j, i2.i().c());
                }
                ckc.b.put(i, Long.valueOf(j));
            } else if (b == 4) {
                ckc.b.remove(i);
            }
            ckc.c.d();
            for (int i3 = 0; i3 < ckc.a.size(); i3++) {
                for (cas cas2 : (Set) ckc.a.valueAt(i3)) {
                    ckc.c.a((Object) cas2.c, (Object) cas2);
                }
            }
            if (ckc.a.a()) {
                this.a.remove(bsz);
            }
        }
    }
}
