package defpackage;

import java.util.Iterator;

/* renamed from: amyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyi extends amym {
    final /* synthetic */ Iterable a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amyi(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.a = iterable2;
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }
}
