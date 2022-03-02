package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: alop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class alop {
    final LinkedList c;
    final String d;
    int e;
    protected alom f = new alon();

    public alop(alrt alrt) {
        this.d = alrt.c;
        this.c = new LinkedList(alrt.d);
        this.e = alrt.b;
    }

    private final synchronized int d() {
        return this.e;
    }

    public abstract alrr a(amiw amiw);

    public abstract void a();

    public final void a(alom alom) {
        alys.a((Object) alom, "operationReceivedHandler");
        this.f = alom;
    }

    public abstract alse b();

    public abstract boolean c();

    public final synchronized boolean f() {
        return !this.c.isEmpty();
    }

    public final alrt g() {
        return new alrt(d(), this.d, Collections.unmodifiableList(new ArrayList(this.c)));
    }
}
