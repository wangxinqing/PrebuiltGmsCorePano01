package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: akuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuc {
    public final Map a = new HashMap();
    private final Map b = new HashMap();

    public final void a(akue akue) {
        if (!this.b.containsKey(akue)) {
            allh allh = new allh(akue.a.b, akue.b, akue.c, akue.a().d, 2, -1, akue);
            allh.b();
            allh.f.a();
            this.b.put(akue, allh);
        }
    }

    public final void b(akue akue) {
        allh allh = (allh) this.b.remove(akue);
        if (allh != null) {
            allh.c();
            allh.f.a();
        }
    }
}
