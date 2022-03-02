package defpackage;

import java.util.AbstractMap;

/* renamed from: anfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfq extends amzy {
    final /* synthetic */ anfr a;

    public anfq(anfr anfr) {
        this.a = anfr;
    }

    public final boolean f() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        amrl.a(i, this.a.c);
        anfr anfr = this.a;
        Object[] objArr = anfr.a;
        int i2 = anfr.b;
        int i3 = i + i;
        return new AbstractMap.SimpleImmutableEntry(objArr[i3 + i2], objArr[i3 + (i2 ^ 1)]);
    }

    public final int size() {
        return this.a.c;
    }
}
