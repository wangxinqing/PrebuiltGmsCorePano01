package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: akqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akqr implements akql {
    public final Executor a;
    private final Executor b;

    public akqr(Executor executor, Executor executor2) {
        this.b = executor;
        this.a = executor2;
    }

    public final void a() {
    }

    public final void a(Map map) {
    }

    public final void b() {
    }

    public final void b(Map map) {
    }

    public final void a(Collection collection, akpw akpw) {
        this.b.execute(new akqn(this, collection, akpw));
    }

    public final void a(Collection collection, akqk akqk) {
        this.b.execute(new akqo(this, collection, akqk));
    }
}
