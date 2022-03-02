package defpackage;

import java.net.URI;
import java.util.List;

/* renamed from: baav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baav extends baan {
    final /* synthetic */ baax a;

    public baav(baax baax) {
        this.a = baax;
    }

    public final baas a(URI uri, baal baal) {
        for (baat a2 : this.a.b()) {
            baas a3 = a2.a(uri, baal);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public final String a() {
        List b = this.a.b();
        return !b.isEmpty() ? ((baat) b.get(0)).a() : "unknown";
    }
}
