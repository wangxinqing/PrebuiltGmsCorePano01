package defpackage;

import java.util.Iterator;

/* renamed from: amyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyj extends amym {
    final /* synthetic */ Iterable a;

    public amyj(Iterable iterable) {
        this.a = iterable;
    }

    public final Iterator iterator() {
        return ance.c(ance.a(this.a.iterator(), anbs.a()));
    }
}
