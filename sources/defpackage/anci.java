package defpackage;

import java.util.ListIterator;
import java.util.Map;

/* renamed from: anci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anci extends anhi {
    final /* synthetic */ ancn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anci(ListIterator listIterator, ancn ancn) {
        super(listIterator);
        this.a = ancn;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    public final void set(Object obj) {
        boolean z;
        ancn ancn = this.a;
        if (ancn.c != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z);
        ancn.c.b = obj;
    }
}
