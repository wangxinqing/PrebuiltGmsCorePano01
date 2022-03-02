package defpackage;

import java.util.Set;

/* renamed from: uli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uli {
    private final Set a = new ob();
    private final Set b = new ob();

    public final synchronized Set a() {
        ob obVar;
        this.b.removeAll(this.a);
        obVar = new ob();
        obVar.addAll(this.b);
        this.b.clear();
        this.b.addAll(this.a);
        this.a.clear();
        return obVar;
    }

    public final synchronized void a(Object obj) {
        this.a.add(obj);
    }
}
