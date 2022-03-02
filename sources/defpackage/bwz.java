package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;

/* renamed from: bwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwz extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final ContextDataFilterImpl e;

    public bwz(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, ContextDataFilterImpl contextDataFilterImpl) {
        super("ReadOperation");
        this.c = jxf;
        this.d = contextManagerClientInfo;
        this.e = contextDataFilterImpl;
    }

    private final void a(int i, DataHolder dataHolder, int i2) {
        bwf.a(this.c, i, dataHolder);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        ContextDataFilterImpl contextDataFilterImpl = this.e;
        aucd a = btx.a(contextManagerClientInfo, 2, i);
        atnl a2 = btx.a(contextDataFilterImpl);
        aucd o = atnx.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnx atnx = (atnx) o.b;
        int i3 = 2 | atnx.a;
        atnx.a = i3;
        atnx.c = i2;
        if (a2 != null) {
            a2.getClass();
            atnx.b = a2;
            atnx.a = i3 | 1;
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atnx atnx2 = (atnx) o.i();
        atnj atnj2 = atnj.o;
        atnx2.getClass();
        atnj.e = atnx2;
        atnj.a |= 8;
        G.a((atnj) a.i());
        if (dataHolder != null) {
            bwp.a(dataHolder, this.c, this.d);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        DataHolder dataHolder = null;
        if (!ibt.c(i)) {
            a(i, (DataHolder) null, 0);
            return;
        }
        cjb a = cbi.p().a(this.e, this.d);
        if (!ibt.c(a.a)) {
            a(a.a, (DataHolder) null, 0);
            return;
        }
        ArrayList arrayList = new ArrayList(a.b);
        if (!arrayList.isEmpty()) {
            ilm d2 = ilk.d();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ilk.a(d2, (ContextData) arrayList.get(i2));
            }
            dataHolder = d2.a(0);
        }
        a(0, dataHolder, arrayList.size());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.d.b()) {
            a(7504, (DataHolder) null, 0);
        } else if (!this.e.b() || !this.e.d().contains(18) || this.d.a().b()) {
            b(0);
        } else {
            a(bwp.a(this.d));
        }
    }
}
