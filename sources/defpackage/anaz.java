package defpackage;

import java.util.AbstractMap;

/* renamed from: anaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anaz extends amzy {
    final /* synthetic */ anba a;

    public anaz(anba anba) {
        this.a = anba;
    }

    public final boolean f() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        anbd anbd = this.a.a;
        int i2 = anbd.d;
        return new AbstractMap.SimpleImmutableEntry(anbd.b.d.get(i), this.a.a.c.get(i));
    }

    public final int size() {
        return this.a.a.size();
    }
}
