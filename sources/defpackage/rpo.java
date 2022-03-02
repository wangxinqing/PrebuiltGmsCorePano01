package defpackage;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: rpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rpo implements rpe {
    final /* synthetic */ Iterator a;

    public rpo(Iterator it) {
        this.a = it;
    }

    public final void a() {
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (Pair) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
