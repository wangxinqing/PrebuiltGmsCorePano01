package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahde implements ahel {
    public static final TimeUnit a = TimeUnit.SECONDS;
    public final Context b;
    public final String c;
    public final String d;
    public final Handler e;
    public final aorv f;

    public ahde(Context context, Handler handler, aorv aorv, String str) {
        this.b = context;
        this.c = context.getPackageName();
        this.d = str;
        this.e = handler;
        this.f = aorv;
    }

    public final aorr a(aorr aorr) {
        return aopr.a(aorr, (aoqb) new ahda(this), (Executor) aoqm.a);
    }

    public final aorr a(aorr aorr, Runnable runnable) {
        return aopr.a(aorr, (amqy) new ahdb(this, runnable), (Executor) aoqm.a);
    }
}
