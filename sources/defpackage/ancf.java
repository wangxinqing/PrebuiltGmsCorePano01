package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: ancf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancf extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ ancp b;

    public ancf(ancp ancp, Object obj) {
        this.b = ancp;
        this.a = obj;
    }

    public final ListIterator listIterator(int i) {
        return new anco(this.b, this.a, i);
    }

    public final int size() {
        ancl ancl = (ancl) this.b.c.get(this.a);
        if (ancl != null) {
            return ancl.c;
        }
        return 0;
    }
}
