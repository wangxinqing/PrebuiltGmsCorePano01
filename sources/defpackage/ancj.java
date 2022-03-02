package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: ancj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancj extends AbstractSequentialList {
    final /* synthetic */ ancp a;

    public ancj(ancp ancp) {
        this.a = ancp;
    }

    public final ListIterator listIterator(int i) {
        ancn ancn = new ancn(this.a, i);
        return new anci(ancn, ancn);
    }

    public final int size() {
        return this.a.d;
    }
}
