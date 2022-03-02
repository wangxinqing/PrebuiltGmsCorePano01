package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: angv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angv extends angw {
    private static final long serialVersionUID = 0;

    public final Iterator iterator() {
        return new angu(this, super.iterator());
    }

    public angv(Collection collection, Object obj) {
        super(collection, obj);
    }
}
