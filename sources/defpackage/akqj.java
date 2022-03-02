package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: akqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akqj implements akql {
    public int a = 0;
    public final Executor b;
    public iso c;
    public iso d;
    private final Executor e;

    public akqj(Executor executor, Executor executor2) {
        this.e = executor;
        this.b = executor2;
    }

    public final void a() {
        this.e.execute(new akqb(this));
    }

    public final void b() {
        this.e.execute(new akqc(this));
    }

    public final void a(Collection collection, akpw akpw) {
        this.e.execute(new akqf(this, collection, akpw));
    }

    public final void b(Map map) {
        this.e.execute(new akqe(this, map));
    }

    public final void a(Collection collection, akqk akqk) {
        this.e.execute(new akqh(this, collection, akqk));
    }

    public final void a(Map map) {
        this.e.execute(new akqd(this, map));
    }
}
