package defpackage;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

/* renamed from: bacm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bacm extends badc {
    private final CronetEngine o;
    private boolean p;
    private int q;
    private boolean r;
    private int s;

    private bacm(String str, int i, CronetEngine cronetEngine) {
        super(InetSocketAddress.createUnresolved(str, i), bagt.a(str, i));
        amrl.a((Object) cronetEngine, (Object) "cronetEngine");
        this.o = cronetEngine;
    }

    public static bacm a(String str, int i, CronetEngine cronetEngine) {
        amrl.a((Object) cronetEngine, (Object) "cronetEngine");
        return new bacm(str, i, cronetEngine);
    }

    public final void a(int i) {
        this.p = true;
        this.q = i;
    }

    public final void b(int i) {
        this.r = true;
        this.s = i;
    }

    /* access modifiers changed from: protected */
    public final baek a() {
        return new bacj(new bacl(this.o, this.p, this.q, this.r, this.s), aoqm.a, this.n.a());
    }
}
