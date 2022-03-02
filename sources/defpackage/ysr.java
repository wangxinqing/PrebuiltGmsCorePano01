package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ysr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysr implements wln {
    public boolean a;
    private final icc b;
    private final String c;
    private final String d;
    /* access modifiers changed from: private */
    public boolean e;
    private Map f;
    private final ysq g;

    public ysr(icc icc, String str, String str2, ysq ysq) {
        this.b = icc;
        this.c = str;
        this.d = str2;
        this.g = ysq;
    }

    public final void b() {
        if (!this.e) {
            this.e = true;
            wkx wkx = new wkx();
            wkx.a = -999;
            wkx.c = false;
            ibq ibq = wlt.a;
            xco.a(this.b, this.c, this.d, wkx).a((icm) new ysp(this));
        }
    }

    public final String a(String str) {
        Map map = this.f;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public final void a() {
        icc icc = this.b;
        if (icc != null && icc.i()) {
            if (!this.a && !this.e) {
                this.e = true;
                wkx wkx = new wkx();
                wkx.a = -999;
                wkx.c = false;
                ibq ibq = wlt.a;
                xco.a(this.b, this.c, this.d, wkx).a((icm) new yso(this));
            }
            ibq ibq2 = wlt.a;
            xdp.a(this.b, this, this.c, this.d, 6);
        }
    }

    public final void a(xfe xfe) {
        int a2 = xfe.a();
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.clear();
        for (int i = 0; i < a2; i++) {
            wzs b2 = xfe.a(i);
            this.f.put(b2.c(), b2.d());
        }
        this.a = true;
        xfe.c();
        ysq ysq = this.g;
        if (ysq != null) {
            ((ysm) ysq).d();
        }
    }
}
