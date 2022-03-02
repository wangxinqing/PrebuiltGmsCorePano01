package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: alyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyk extends alyl {
    public amiw a;
    private final List b;
    private final ListIterator c;

    public alyk(List list) {
        this.b = list;
        this.c = list.listIterator();
        d();
    }

    public final void a(amiw amiw) {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        alys.b(z, "No current command.");
        this.a = amiw;
        this.c.set(amiw);
    }

    public final amiw b() {
        return this.a;
    }

    public final void c() {
        a(aluv.a());
    }

    public final void d() {
        this.a = this.c.hasNext() ? (amiw) this.c.next() : null;
    }

    public final void e() {
        throw null;
    }
}
