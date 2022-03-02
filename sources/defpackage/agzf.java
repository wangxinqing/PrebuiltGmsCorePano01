package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: agzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzf {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static final int b = -1;

    static void a(agzd agzd) {
        if (agzj.a()) {
            a.add(agzd);
            if (b != -1) {
                agzd.b();
                return;
            }
            return;
        }
        agzj.a(new agze(agzd));
    }
}
