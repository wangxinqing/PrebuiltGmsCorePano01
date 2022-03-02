package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: apxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apxy {
    public static apxx p() {
        amsv a = amta.a((Object) false);
        apxx apxx = new apxx();
        apxx.c = a;
        apxx.d = a;
        apxx.e = a;
        apxx.a(amta.a((Object) Long.valueOf(TimeUnit.MINUTES.toMillis(30))));
        return apxx;
    }

    public abstract Context a();

    public abstract aekn b();

    public abstract apyp c();

    public abstract Executor d();

    public abstract Executor e();

    public abstract Executor f();

    public abstract ScheduledExecutorService g();

    public abstract apyr h();

    public abstract apyf i();

    public abstract amsv j();

    public abstract amsv k();

    public abstract amsv l();

    public abstract amsv m();

    public abstract apyk n();

    public abstract apyc o();
}
