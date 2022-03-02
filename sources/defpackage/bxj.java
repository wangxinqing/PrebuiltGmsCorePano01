package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;

/* renamed from: bxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxj extends bwp {
    private final jxf c;
    private final ContextManagerClientInfo d;
    private final WriteBatchImpl e;

    public bxj(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, WriteBatchImpl writeBatchImpl) {
        super("WriteBatchOperation");
        this.c = jxf;
        this.d = contextManagerClientInfo;
        this.e = writeBatchImpl;
    }

    private final void a(int i, WriteBatchImpl writeBatchImpl) {
        atoi atoi;
        bwf.a(this.c, i, writeBatchImpl);
        btx G = cbi.G();
        ContextManagerClientInfo contextManagerClientInfo = this.d;
        WriteBatchImpl writeBatchImpl2 = this.e;
        aucd a = btx.a(contextManagerClientInfo, 3, i);
        if (btx.a(writeBatchImpl2) != null) {
            aucd o = atoi.c.o();
            atnl a2 = btx.a(writeBatchImpl2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atoi atoi2 = (atoi) o.b;
            a2.getClass();
            atoi2.b = a2;
            atoi2.a |= 1;
            atoi = (atoi) o.i();
        } else {
            atoi = atoi.c;
        }
        if (a.c) {
            a.c();
            a.c = false;
        }
        atnj atnj = (atnj) a.b;
        atnj atnj2 = atnj.o;
        atoi.getClass();
        atnj.f = atoi;
        atnj.a |= 16;
        G.a((atnj) a.i());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        chn v = cbi.v();
        WriteBatchImpl writeBatchImpl = null;
        if (this.d.b()) {
            WriteBatchImpl writeBatchImpl2 = this.e;
            ContextManagerClientInfo contextManagerClientInfo = this.d;
            ArrayList arrayList = writeBatchImpl2.a;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ContextData) arrayList.get(i)).a(contextManagerClientInfo.d, v.a(contextManagerClientInfo.a(), true).a.b);
                }
            }
            int a = cbi.p().a(this.e, this.d);
            if (ibt.c(a)) {
                writeBatchImpl = this.e;
            }
            a(a, writeBatchImpl);
            return;
        }
        a(7504, (WriteBatchImpl) null);
    }
}
