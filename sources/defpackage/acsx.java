package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsx {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    boolean c = false;
    boolean d = false;
    Pair e;
    List f;

    public acsx() {
        new ArrayList();
        this.e = null;
        this.f = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.e = null;
        this.f = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.e == null || this.f.size() == 0) {
            a();
            return;
        }
        aucd o = anuq.d.o();
        anup anup = (anup) this.e.second;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anuq anuq = (anuq) o.b;
        anup.getClass();
        anuq.b = anup;
        anuq.a |= 1;
        List list = this.f;
        if (!anuq.c.a()) {
            anuq.c = aucj.a(anuq.c);
        }
        auab.a((Iterable) list, (List) anuq.c);
        anuq anuq2 = (anuq) o.i();
        if (this.c) {
            this.a.add(Pair.create((Integer) this.e.first, anuq2));
        } else if (this.d) {
            this.b.add(Pair.create((Integer) this.e.first, anuq2));
        }
        a();
    }
}
