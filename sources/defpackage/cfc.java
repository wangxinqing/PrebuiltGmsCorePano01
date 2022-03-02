package defpackage;

import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: cfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfc extends cbm {
    final /* synthetic */ cfd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfc(cfd cfd) {
        super(cfd.c, "produce server context for account %s", cfd.e);
        this.a = cfd;
    }

    public final void a(int i) {
        super.a(i);
        Object[] objArr = {this.a.e, Integer.valueOf(i)};
        this.a.p = false;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cfd cfd;
        String str;
        atqc atqc = (atqc) obj;
        try {
            new Object[1][0] = this.a.e;
            aucx<auay> aucx = atqc.c;
            if (!aucx.isEmpty()) {
                WriteBatchImpl b = juc.b();
                ContextData contextData = this.a.j;
                new Object[1][0] = contextData;
                ContextFenceStub contextFenceStub = null;
                if (contextData != null) {
                    str = contextData.d();
                } else {
                    str = null;
                }
                boolean z = false;
                for (auay k : aucx) {
                    ContextData contextData2 = new ContextData(k.k());
                    if (contextData2.e() != null) {
                        int g = contextData2.g();
                        cfd cfd2 = this.a;
                        int[] iArr = cfd2.f.c;
                        if (g == iArr[0]) {
                            cfd2.j = contextData2;
                            z = true;
                        } else if (!jhx.a(iArr, contextData2.g())) {
                            bxk.a(this.a.c, "Un-produced context type received, skipping", new Object[0]);
                        }
                        Object[] objArr = {contextData2.d(), contextData2};
                        b.a(contextData2);
                    }
                }
                if (z) {
                    cfd cfd3 = this.a;
                    new Object[1][0] = cfd3.j;
                    cfd3.a(b);
                    if ((atqc.a & 2) != 0) {
                        atjt atjt = atqc.d;
                        if (atjt == null) {
                            atjt = atjt.z;
                        }
                        contextFenceStub = new ContextFenceStub(atjt);
                        new Object[1][0] = contextFenceStub;
                    }
                    new Object[1][0] = contextFenceStub;
                    cfd cfd4 = this.a;
                    if (str != null && !str.isEmpty()) {
                        new Object[1][0] = str;
                        juk juk = new juk(cfd4.e);
                        juu juu = new juu();
                        juu.b();
                        TimeFilterImpl a2 = juu.a();
                        juo juo = new juo();
                        juo.a(str);
                        juk.a(13, a2, juo.a());
                        new Object[1][0] = Integer.valueOf(cbi.q().b(juk.a()));
                    }
                    if (contextFenceStub != null) {
                        cfd.a((AwarenessFence) contextFenceStub, this.a.j.d(), this.a.e);
                        this.a.a((AwarenessFence) contextFenceStub);
                    }
                    cfd cfd5 = this.a;
                    cfd5.k = false;
                    cfd5.i();
                }
                cfd = this.a;
            } else {
                cfd = this.a;
            }
            cfd.p = false;
        } catch (Throwable th) {
            this.a.p = false;
            throw th;
        }
    }
}
