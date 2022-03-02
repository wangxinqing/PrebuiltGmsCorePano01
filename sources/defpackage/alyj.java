package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: alyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyj extends alyl {
    private final List a;
    private final ListIterator b;
    private alrr c;

    public alyj(List list) {
        this.a = list;
        this.b = list.listIterator();
        d();
    }

    public final void a(amiw amiw) {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        alys.b(z, "No current command.");
        alrr alrr = this.c;
        alrr alrr2 = new alrr(alrr.a, amiw, alrr.c);
        this.c = alrr2;
        this.b.set(alrr2);
    }

    public final amiw b() {
        alrr alrr = this.c;
        if (alrr != null) {
            return alrr.b;
        }
        return null;
    }

    public final void c() {
        a(aluv.a());
    }

    public final void d() {
        this.c = this.b.hasNext() ? (alrr) this.b.next() : null;
    }

    public final void e() {
        throw null;
    }
}
