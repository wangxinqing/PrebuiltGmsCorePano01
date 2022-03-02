package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: anex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anex extends anep {
    final /* synthetic */ aney a;

    public anex(aney aney) {
        this.a = aney;
    }

    public final Map a() {
        return this.a;
    }

    public final Iterator iterator() {
        Set m = this.a.a.m();
        return new anem(m.iterator(), new anew(this));
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        aney aney = this.a;
        aney.a.m().remove(((Map.Entry) obj).getKey());
        return true;
    }
}
