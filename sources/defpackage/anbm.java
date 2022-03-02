package defpackage;

import java.util.Iterator;

/* renamed from: anbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbm extends amym {
    final /* synthetic */ Iterable a;
    final /* synthetic */ amrm b;

    public anbm(Iterable iterable, amrm amrm) {
        this.a = iterable;
        this.b = amrm;
    }

    public final Iterator iterator() {
        return ance.a(this.a.iterator(), this.b);
    }
}
