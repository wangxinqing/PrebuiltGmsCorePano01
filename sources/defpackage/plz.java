package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: plz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plz extends aplf {
    protected final aplf a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public int d;
    private final int e;
    private final int f;
    private acwd g = new acwd();
    private acwd h = new acwd();

    public plz(aplf aplf, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.b(i2 <= 0 ? false : z2);
        this.a = aplf;
        this.e = i;
        this.f = i2;
    }

    public final synchronized acwa a(aplu... apluArr) {
        acwi acwi;
        boolean z = true;
        if (apluArr.length != 1) {
            z = false;
        }
        iva.b(z);
        if (!this.c.isEmpty()) {
            b();
        }
        Collections.addAll(this.b, apluArr);
        acwi = this.g.a;
        if (this.d == 0 || this.b.size() >= this.e) {
            a();
        }
        return acwi;
    }

    public final acwa b(aplu... apluArr) {
        throw new UnsupportedOperationException();
    }

    public final acwa b(String... strArr) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        ply ply = new ply(this, this.h);
        this.c.clear();
        this.h = new acwd();
        this.a.a((String[]) this.c.toArray(new String[0])).a((acvp) ply);
    }

    public final synchronized acwa a(String... strArr) {
        acwi acwi;
        boolean z = true;
        if (strArr.length != 1) {
            z = false;
        }
        iva.b(z);
        if (!this.b.isEmpty()) {
            a();
        }
        Collections.addAll(this.c, strArr);
        acwi = this.h.a;
        if (this.d == 0 || this.c.size() >= this.f) {
            b();
        }
        return acwi;
    }

    public final void a() {
        ply ply = new ply(this, this.g);
        this.b.clear();
        this.g = new acwd();
        this.a.a((aplu[]) this.b.toArray(new aplu[0])).a((acvp) ply);
    }
}
