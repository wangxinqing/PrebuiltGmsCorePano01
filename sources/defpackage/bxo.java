package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxo extends cbe implements cja, cao {
    public final HashMap a = new HashMap();

    public static long a(atjv atjv) {
        if (bta.d(atjv.bA)) {
            return awuz.a.a().aJ();
        }
        if (atjv == atjv.DAY_ATTRIBUTES || atjv == atjv.SUN_STATE) {
            return awuz.a.a().aG();
        }
        if (atjv == atjv.DND_MODE) {
            return awuz.a.a().z();
        }
        if (bta.a(atjv.bA)) {
            return awuz.u();
        }
        if (bta.b(atjv.bA)) {
            return awuz.b();
        }
        if (bta.e(atjv.bA)) {
            return awuz.a.a().j();
        }
        if (bta.c(atjv.bA)) {
            return awuz.a.a().w();
        }
        if (jhx.a(bta.e, atjv.bA)) {
            return awuz.a.a().aL();
        }
        return awuz.a.a().s();
    }

    public final void a(bsz bsz, atjv atjv) {
    }

    public final void b(bsz bsz, atjv atjv) {
    }

    public final void a(bsz bsz, cas cas) {
        new Object[1][0] = cas;
        bxm bxm = (bxm) this.a.get(bsz);
        if (bxm != null) {
            bxm.b(cas);
            if (bxm.a.a()) {
                this.a.remove(bsz);
            }
        }
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
        int i;
        ArrayList arrayList;
        Object[] objArr = {cas, cas2, bsz};
        bxm bxm = (bxm) this.a.get(bsz);
        if (bxm == null) {
            bxm = new bxm();
            this.a.put(bsz, bxm);
        }
        if (cas2 != null) {
            bxm.b(cas2);
        }
        if (bxm.a(cas)) {
            new Object[1][0] = Integer.valueOf(cas.b().bA);
            cjd p = cbi.p();
            jtm jtm = new jtm();
            jtm.a(cas.b().bA);
            cjb a2 = p.a((ContextDataFilterImpl) jtm.a(), cbi.a(bsz, cas.k()), a(cas.b()));
            new Object[1][0] = Integer.valueOf(a2.a);
            Object[] objArr2 = new Object[1];
            ArrayList arrayList2 = a2.b;
            if (arrayList2 != null) {
                i = arrayList2.size();
            } else {
                i = 0;
            }
            objArr2[0] = Integer.valueOf(i);
            if (ibt.c(a2.a) && (arrayList = a2.b) != null && !arrayList.isEmpty()) {
                new Object[1][0] = cas.c;
                ArrayList arrayList3 = a2.b;
                int size = arrayList3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    amzg q = amzg.q();
                    q.a((Object) cas.c, (Object) cas);
                    new bxn((ContextData) arrayList3.get(i2), bsz, q).a(bvq.a("DispatcherDeliver"));
                }
            }
        }
    }

    public final void a(ContextData contextData, ContextManagerClientInfo contextManagerClientInfo) {
        Object[] objArr = {contextData, contextManagerClientInfo};
        bxm bxm = (bxm) this.a.get(contextManagerClientInfo.a());
        if (bxm != null) {
            amxb amxb = (amxb) bxm.b.get(contextData.g());
            if (amxb != null) {
                bsz a2 = contextManagerClientInfo.a();
                amxg.a(8, "expectedKeys");
                amxg.a(2, "expectedValuesPerKey");
                anez anez = new anez(amxr.a(8), new anev());
                for (Map.Entry entry : amxb.l()) {
                    anez.a(entry.getKey(), entry.getValue());
                }
                new bxn(contextData, a2, anez).a(bvq.a("DispatcherDeliver"));
            }
        }
    }
}
