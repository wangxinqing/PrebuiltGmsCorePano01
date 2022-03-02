package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aryz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryz {
    private final Context a;

    public aryz(Context context) {
        this.a = context;
    }

    public final void a(Intent intent, tsn tsn, long j) {
        boolean z;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Don't call bindOneShot on main thread!");
        aosh f = aosh.f();
        aryy aryy = new aryy(f);
        this.a.bindService(intent, aryy, 1);
        try {
            tsn.a((IBinder) f.get(j, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) aryq.a.c();
            anih.a(e);
            ((anih) anih.a("aryz", "a", 59, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("OneShotServiceBinder: bindOneShot fail for intent action:%s", (Object) intent.getAction());
            tsn.a((IBinder) null);
        }
        this.a.unbindService(aryy);
    }
}
