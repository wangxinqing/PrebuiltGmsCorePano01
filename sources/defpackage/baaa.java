package defpackage;

import java.util.Iterator;

/* renamed from: baaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baaa implements Iterable {
    public final baab a;
    public final int b;
    final /* synthetic */ baaf c;

    public baaa(baaf baaf, baab baab, int i) {
        this.c = baaf;
        this.a = baab;
        this.b = i;
    }

    public final Iterator iterator() {
        return new azzz(this);
    }
}
