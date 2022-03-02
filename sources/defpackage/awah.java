package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: awah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awah {
    private final Set a = new LinkedHashSet();

    public final synchronized void a(avzo avzo) {
        this.a.add(avzo);
    }

    public final synchronized void b(avzo avzo) {
        this.a.remove(avzo);
    }

    public final synchronized boolean c(avzo avzo) {
        return this.a.contains(avzo);
    }
}
