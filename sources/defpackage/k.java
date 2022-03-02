package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: k  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class k implements Iterator, m {
    final /* synthetic */ n a;
    private j b;
    private boolean c = true;

    public k(n nVar) {
        this.a = nVar;
    }

    /* renamed from: a */
    public final Map.Entry next() {
        j jVar;
        if (this.c) {
            this.c = false;
            jVar = this.a.b;
        } else {
            j jVar2 = this.b;
            jVar = jVar2 != null ? jVar2.c : null;
        }
        this.b = jVar;
        return this.b;
    }

    public final void c(j jVar) {
        j jVar2 = this.b;
        if (jVar == jVar2) {
            j jVar3 = jVar2.d;
            this.b = jVar3;
            this.c = jVar3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        j jVar = this.b;
        return (jVar == null || jVar.c == null) ? false : true;
    }
}
