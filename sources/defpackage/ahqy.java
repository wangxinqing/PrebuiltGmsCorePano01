package defpackage;

import java.util.Iterator;

/* renamed from: ahqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqy implements Iterator {
    public final argy a;
    final /* synthetic */ ahqz b;

    public ahqy(ahqz ahqz) {
        argo a2 = ((argt) ahqz.a).entrySet().iterator();
        this.b = ahqz;
        this.a = a2;
    }

    public final int a() {
        return this.b.b[this.a.g()];
    }

    public final void b() {
        this.a.f();
    }

    /* renamed from: c */
    public final aibe next() {
        return (aibe) this.a.d();
    }

    public final String d() {
        return (String) this.a.e();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        this.a.remove();
    }
}
