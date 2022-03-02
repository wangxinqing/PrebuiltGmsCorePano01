package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: alul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alul extends alzg implements aluh {
    public boolean a = true;
    public final alui b;
    public final alsu c;
    public alsf d = new aluk();
    private alua e;
    private final int f;
    private final int g;
    private boolean h = true;
    private final alua i;

    public alul(int i2, alsx alsx, int i3) {
        this.f = i2;
        this.g = i3;
        this.b = new alui(new alun(this), (aluh) this);
        this.i = new alub(this.b);
        this.c = new alus(this, alsx, i3, this.b);
    }

    private final alse a(amiw amiw, boolean z, alua alua) {
        int i2;
        int i3;
        int i4;
        if (z) {
            i2 = this.b.f;
        } else {
            i2 = 0;
        }
        alse a2 = alua.a(amiw);
        if (!z || (i3 = this.b.f) <= (i4 = this.f) || i3 <= i2) {
            return a2;
        }
        throw new altc(i3, i4);
    }

    private final void d() {
        alua alua = this.e;
        if (alua == null || !alua.b()) {
            this.e = null;
        }
    }

    /* renamed from: b */
    public final altx a(String str) {
        return this.b.a(str);
    }

    public final alsj c() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alul)) {
            return false;
        }
        return alyr.a(c(), ((alul) obj).c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c()});
    }

    public final String toString() {
        String valueOf = String.valueOf(c());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("ModelImpl (root = ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final boolean b() {
        return c() != null;
    }

    public final alse a() {
        alys.b(this.e != null, "Not in a compound operation.");
        alse a2 = this.e.a();
        alsf alsf = this.d;
        alss alss = alss.c;
        alsf.a(a2);
        d();
        return a2;
    }

    public alul(alul alul) {
        this.a = alul.a;
        this.f = alul.f;
        this.g = alul.g;
        this.h = alul.h;
        alui alui = alul.b;
        alui.c = this;
        if (alui.d.size() > 100) {
            alui.d();
        }
        synchronized (alui.e) {
            if (alui.e.isEmpty()) {
                alui.e = alui.d;
                alui.d = new HashMap();
            }
        }
        this.b = new alui(alui, this);
        this.c = new alus(this, alsx.a, this.g, this.b);
        this.i = new alub(this.b);
    }

    public final alse a(amiw amiw, alss alss) {
        alse alse;
        if (alss.c()) {
            alse = a(amiw, alss.b(), this.i);
        } else {
            try {
                boolean a2 = alss.a();
                if (a2) {
                    alys.b(this.a, "Unable to apply local operation because document is in read-only mode.");
                }
                if (this.e != null) {
                    if ((alss.b & 12) != 0) {
                        throw new alsz("Undo and Redo calls are not permitted inside a compound operation.");
                    }
                } else if (!a2) {
                    this.e = new alup(this.b, this.c, alss, this.h);
                } else {
                    this.e = new aluj(this.b, this.c, alss, this.h);
                }
                alse = a(amiw, alss.b(), this.e);
            } finally {
                d();
            }
        }
        this.d.a(alse);
        return alse;
    }

    public final alsm a(amih amih, String str) {
        a(aluv.a(str, amih), alss.d);
        return new alsm(this.b.a(str));
    }

    public final void a(Iterable iterable, alss alss) {
        if (alss.c()) {
            boolean b2 = alss.b();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((amiw) it.next(), b2, this.i);
            }
            alse alse = alse.a;
            return;
        }
        amid b3 = amie.b();
        b3.a(iterable);
        a(aluv.a(b3.b()), alss);
    }

    public final void a(String str, altz altz) {
        if (this.e == null) {
            this.e = new aluj(this.b, this.c, alss.d, this.h);
        }
        this.e.a(str, altz);
    }
}
