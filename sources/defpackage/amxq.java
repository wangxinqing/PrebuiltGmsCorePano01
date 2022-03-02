package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxq extends AbstractCollection {
    final /* synthetic */ amxr a;

    public amxq(amxr amxr) {
        this.a = amxr;
    }

    public final void clear() {
        this.a.clear();
    }

    public final Iterator iterator() {
        amxr amxr = this.a;
        Map d = amxr.d();
        if (d != null) {
            return d.values().iterator();
        }
        return new amxl(amxr);
    }

    public final int size() {
        return this.a.size();
    }
}
