package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: apyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apyo {
    public abstract Context a();

    public abstract URI b();

    public abstract Executor c();

    public abstract Executor d();

    public abstract ScheduledExecutorService e();

    public abstract amsv f();

    public abstract apyc g();

    public abstract Integer h();

    public abstract Integer i();

    public abstract long j();

    public final String k() {
        return b().getHost();
    }

    public final int l() {
        return b().getPort();
    }
}
