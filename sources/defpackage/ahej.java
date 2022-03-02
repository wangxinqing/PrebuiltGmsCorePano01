package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: ahej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahej {
    public Executor a;
    public agzs b;
    private ahdg c = ahgh.a;
    private final HashMap d = new HashMap();
    private ahgm e;

    public final ahei a() {
        return new ahei(this.a, this.b, this.c, this.d, this.e);
    }

    public final void a(ahdg ahdg, ahgm ahgm) {
        this.c = ahdg;
        this.e = ahgm;
    }

    public final void a(ahfx ahfx) {
        String a2 = ahfx.a(ahdf.a);
        amrl.a(!this.d.containsKey(a2), "There is already a factory registered for the ID %s", (Object) a2);
        this.d.put(a2, ahfx);
    }
}
