package defpackage;

import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwy extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final FenceQueryRequestImpl e;

    public bwy(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, FenceQueryRequestImpl fenceQueryRequestImpl) {
        super("QueryFencesOperation");
        this.c = jxf;
        this.d = contextManagerClientInfo;
        this.e = fenceQueryRequestImpl;
    }

    private final void a(int i, FenceStateMapImpl fenceStateMapImpl) {
        int i2;
        Map map;
        bwf.a(this.c, i, fenceStateMapImpl);
        if (fenceStateMapImpl == null || (map = fenceStateMapImpl.a) == null) {
            i2 = 0;
        } else {
            i2 = map.size();
        }
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        FenceQueryRequestImpl fenceQueryRequestImpl = this.e;
        aucd a = btx.a(contextManagerClientInfo, 9, i);
        atnv a2 = btx.a(fenceQueryRequestImpl);
        aucd o = atnw.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnw atnw = (atnw) o.b;
        atnw.a |= 2;
        atnw.c = i2;
        if (a2 != null) {
            atnv a3 = btx.a(fenceQueryRequestImpl);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atnw atnw2 = (atnw) o.b;
            a3.getClass();
            atnw2.b = a3;
            atnw2.a |= 1;
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atnw atnw3 = (atnw) o.i();
        atnj atnj2 = atnj.o;
        atnw3.getClass();
        atnj.l = atnw3;
        atnj.a |= 1024;
        G.a((atnj) a.i());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        HashMap hashMap = null;
        if (!this.d.b()) {
            a(7504, (FenceStateMapImpl) null);
            return;
        }
        byd E = cbi.E();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation = this.e.a;
        int i = queryFenceOperation.a;
        if (i == 1) {
            List a = E.b.a(contextManagerClientInfo);
            hashMap = new HashMap();
            if (a != null) {
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bzm bzm = (bzm) a.get(i2);
                    String str = bzm.a;
                    hashMap.put(str, byr.a(str, bzm));
                }
            }
        } else if (i == 2) {
            List list = queryFenceOperation.b;
            byg byg = E.b;
            HashMap hashMap2 = new HashMap();
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) list.get(i3);
                bzm b = byg.b(bzm.a(contextManagerClientInfo, str2));
                if (b != null) {
                    hashMap2.put(str2, byr.a(str2, b));
                }
            }
            hashMap = hashMap2;
        }
        a(0, new FenceStateMapImpl((Map) hashMap));
    }
}
