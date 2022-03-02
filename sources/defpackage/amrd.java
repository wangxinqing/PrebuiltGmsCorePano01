package defpackage;

import java.util.AbstractList;

/* renamed from: amrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amrd extends AbstractList {
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public amrd(Object[] objArr, Object obj, Object obj2) {
        this.a = objArr;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get(int i) {
        return i != 0 ? i != 1 ? this.a[i - 2] : this.c : this.b;
    }

    public final int size() {
        return this.a.length + 2;
    }
}
