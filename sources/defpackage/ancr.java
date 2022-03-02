package defpackage;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* renamed from: ancr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ancr extends AbstractList {
    final List a;
    final int b;

    public ancr(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final int size() {
        return aons.a(this.a.size(), this.b, RoundingMode.CEILING);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        amrl.a(i, size());
        int i2 = this.b;
        int i3 = i * i2;
        return this.a.subList(i3, Math.min(i2 + i3, this.a.size()));
    }
}
