package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdx {
    final Set a = new HashSet();
    public final kkf b;

    public kdx(kkf kkf) {
        this.b = kkf;
    }

    public final Collection a() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }
}
