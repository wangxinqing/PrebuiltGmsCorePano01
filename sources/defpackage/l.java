package defpackage;

import java.util.Iterator;

/* renamed from: l  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class l implements Iterator, m {
    j a;
    j b;

    public l(j jVar, j jVar2) {
        this.a = jVar2;
        this.b = jVar;
    }

    private final j a() {
        j jVar = this.b;
        j jVar2 = this.a;
        if (jVar == jVar2 || jVar2 == null) {
            return null;
        }
        return a(jVar);
    }

    public abstract j a(j jVar);

    public abstract j b(j jVar);

    public final void c(j jVar) {
        if (this.a == jVar && jVar == this.b) {
            this.b = null;
            this.a = null;
        }
        j jVar2 = this.a;
        if (jVar2 == jVar) {
            this.a = b(jVar2);
        }
        if (this.b == jVar) {
            this.b = a();
        }
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        j jVar = this.b;
        this.b = a();
        return jVar;
    }
}
