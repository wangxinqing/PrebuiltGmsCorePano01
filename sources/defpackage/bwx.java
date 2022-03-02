package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;

/* renamed from: bwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwx extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final ContextDataFilterImpl e;

    public bwx(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, ContextDataFilterImpl contextDataFilterImpl) {
        super("WriteBatchOperation");
        this.c = jxf;
        this.d = contextManagerClientInfo;
        this.e = contextDataFilterImpl;
    }

    private final void a(int i, DataHolder dataHolder, int i2) {
        bwf.b(this.c, i, dataHolder);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        ContextDataFilterImpl contextDataFilterImpl = this.e;
        aucd a = btx.a(contextManagerClientInfo, 4, i);
        atnl a2 = btx.a(contextDataFilterImpl);
        aucd o = atnp.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnp atnp = (atnp) o.b;
        atnp.a |= 2;
        atnp.c = i2;
        if (a2 != null) {
            atnl a3 = btx.a(contextDataFilterImpl);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atnp atnp2 = (atnp) o.b;
            a3.getClass();
            atnp2.b = a3;
            atnp2.a |= 1;
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atnp atnp3 = (atnp) o.i();
        atnj atnj2 = atnj.o;
        atnp3.getClass();
        atnj.g = atnp3;
        atnj.a |= 32;
        G.a((atnj) a.i());
        if (dataHolder != null) {
            bwp.a(dataHolder, this.c, this.d);
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        cjd p = cbi.p();
        DataHolder dataHolder = null;
        if (!this.d.b()) {
            a(7504, (DataHolder) null, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ContextDataFilterImpl contextDataFilterImpl = this.e;
        if (contextDataFilterImpl != null) {
            cjb a = p.a(contextDataFilterImpl, this.d, Long.MAX_VALUE);
            if (!ibt.c(a.a)) {
                a(a.a, (DataHolder) null, 0);
                return;
            }
            arrayList.addAll(a.b);
        }
        if (!arrayList.isEmpty()) {
            ilm d2 = ilk.d();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ilk.a(d2, (ContextData) arrayList.get(i));
            }
            dataHolder = d2.a(0);
        }
        a(0, dataHolder, arrayList.size());
    }
}
