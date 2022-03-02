package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: awm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class awm {
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    public bbe d;
    private final List e;
    private bbc f;
    private bbc g;
    private float h = -1.0f;
    private Object i = null;
    private float j = -1.0f;
    private float k = -1.0f;

    public awm(List list) {
        this.e = list;
    }

    private final float g() {
        float f2 = this.j;
        if (f2 == -1.0f) {
            f2 = !this.e.isEmpty() ? ((bbc) this.e.get(0)).b() : 0.0f;
            this.j = f2;
        }
        return f2;
    }

    public abstract Object a(bbc bbc, float f2);

    public void a() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((awl) this.a.get(i2)).a();
        }
    }

    public final bbc b() {
        bbc bbc = this.f;
        if (bbc != null && bbc.a(this.c)) {
            auf.a();
            return this.f;
        }
        List list = this.e;
        bbc bbc2 = (bbc) list.get(list.size() - 1);
        if (this.c < bbc2.b()) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                bbc2 = (bbc) this.e.get(size);
                if (bbc2.a(this.c)) {
                    break;
                }
            }
        }
        this.f = bbc2;
        auf.a();
        return bbc2;
    }

    /* access modifiers changed from: package-private */
    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        bbc b2 = b();
        if (!b2.d()) {
            return (this.c - b2.b()) / (b2.c() - b2.b());
        }
        return 0.0f;
    }

    public final float d() {
        bbc b2 = b();
        if (!b2.d()) {
            return b2.d.getInterpolation(c());
        }
        return 0.0f;
    }

    public float e() {
        float f2 = this.k;
        if (f2 == -1.0f) {
            if (!this.e.isEmpty()) {
                List list = this.e;
                f2 = ((bbc) list.get(list.size() - 1)).c();
            } else {
                f2 = 1.0f;
            }
            this.k = f2;
        }
        return f2;
    }

    public Object f() {
        bbc b2 = b();
        float d2 = d();
        if (this.d == null && b2 == this.g && this.h == d2) {
            return this.i;
        }
        this.g = b2;
        this.h = d2;
        Object a2 = a(b2, d2);
        this.i = a2;
        return a2;
    }

    public void a(float f2) {
        if (!this.e.isEmpty()) {
            bbc b2 = b();
            if (f2 < g()) {
                f2 = g();
            } else if (f2 > e()) {
                f2 = e();
            }
            if (f2 != this.c) {
                this.c = f2;
                bbc b3 = b();
                if (b2 != b3 || !b3.d()) {
                    a();
                }
            }
        }
    }

    public final void a(awl awl) {
        this.a.add(awl);
    }
}
