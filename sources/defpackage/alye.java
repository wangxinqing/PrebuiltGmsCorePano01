package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: alye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alye extends alyl {
    public boolean a;
    private final amie b;
    private int c;
    private List d;
    private final int e;

    public alye(amie amie) {
        this.b = amie;
        List a2 = amie.a();
        this.d = a2;
        this.e = a2.size();
        e();
    }

    public final amie a() {
        if (!this.a) {
            return this.b;
        }
        amid b2 = amie.b();
        amie amie = this.b;
        b2.c = amie.c;
        b2.b = amie.b;
        b2.a((Iterable) this.d);
        return b2.b();
    }

    public final amiw b() {
        int i = this.c;
        if (i < this.e) {
            return (amiw) this.d.get(i);
        }
        return null;
    }

    public final void c() {
        a(aluv.a());
    }

    public final void d() {
        this.c++;
    }

    public final void e() {
        this.c = 0;
    }

    public final void a(amiw amiw) {
        if (!this.a) {
            this.d = new ArrayList(this.d);
            this.a = true;
        }
        this.d.set(this.c, amiw);
    }
}
