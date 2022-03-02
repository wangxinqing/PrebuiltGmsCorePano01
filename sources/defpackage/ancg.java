package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: ancg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancg extends AbstractSequentialList {
    final /* synthetic */ ancp a;

    public ancg(ancp ancp) {
        this.a = ancp;
    }

    public final ListIterator listIterator(int i) {
        return new ancn(this.a, i);
    }

    public final int size() {
        return this.a.d;
    }
}
