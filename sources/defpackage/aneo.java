package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: aneo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aneo extends anhj {
    final /* synthetic */ Iterator a;

    public aneo(Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return anet.a((Map.Entry) this.a.next());
    }
}
