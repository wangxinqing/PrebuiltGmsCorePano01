package defpackage;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* renamed from: aluj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aluj extends aluo {
    private final List f = new ArrayList(1);
    private final LinkedList g = new LinkedList();
    private Deque h;
    private final List i = new ArrayList();
    private boolean j = true;

    public aluj(alui alui, alsu alsu, alss alss, boolean z) {
        super(alui, alsu, alss);
        this.e = z;
    }

    private final alse f() {
        d();
        amiw a = aluv.a(this.f);
        alse a2 = this.b.a(this.c, aluv.a((List) this.g));
        this.i.add(a2.e);
        alsw alsw = alsw.a;
        List list = this.i;
        int size = list.size();
        alsw alsw2 = alsw;
        for (int i2 = 0; i2 < size; i2++) {
            alsw2 = alsw2.a((alsw) list.get(i2));
        }
        return new alse(this.d.a(), this.d.b(), e(), a, alsw2, (amiw) null, a2.h);
    }

    public final alse a() {
        alys.b(b(), "No compound operation to end.");
        this.d.c();
        amid amid = (amid) this.h.pop();
        if (!amid.c || this.a.c() != null) {
            c(aluv.a(amid));
            if (b()) {
                return alse.a;
            }
            return f();
        }
        throw new alte();
    }

    /* access modifiers changed from: protected */
    public final void b(amiw amiw) {
        if (!this.j) {
            this.i.add(this.b.a(amiw));
        } else {
            this.g.push(aluu.a(this.a, amiw));
        }
    }

    /* access modifiers changed from: protected */
    public final void c(amiw amiw) {
        if (b()) {
            ((amid) this.h.peek()).a(amiw);
        } else {
            this.f.add(amiw);
        }
    }

    /* access modifiers changed from: protected */
    public final void e(amiw amiw) {
        amik c = amiw.c();
        for (alsp alsp : this.a.b(amiw.c).values()) {
            int b = alsp.b();
            int i2 = c.b;
            int i3 = c.c;
            if (b >= i2 && b < i3) {
                f(aluv.a(alsp.d(), alsp.a(), alsq.a(b, c, alsp.n(), 1), alsp.n()));
            }
        }
        f(amiw);
    }

    public final boolean b() {
        Deque deque = this.h;
        return deque != null && !deque.isEmpty();
    }

    public final alse a(amiw amiw) {
        c();
        d(amiw);
        if (!b()) {
            return f();
        }
        return alse.a(e(), (amiw) null);
    }

    public final void a(String str, altz altz) {
        boolean z;
        c();
        this.d.a(str);
        boolean z2 = false;
        if (altz != altz.CREATION || !b()) {
            z = true;
        } else {
            z = false;
        }
        alys.b(z, "Creation compound operations cannot be nested inside another compound operation.");
        if (!b()) {
            this.j = altz.d;
        } else if (this.j) {
            alys.b(altz.d, "A non-undoable compound operation cannot be nested in an undoable compound operation");
        }
        if (this.h == null) {
            this.h = new LinkedList();
        }
        amid b = amie.b();
        alys.a((Object) str, "Compound operation name cannot be null.");
        b.b = str;
        if (altz == altz.CREATION) {
            z2 = true;
        }
        b.c = z2;
        this.h.push(b);
    }
}
