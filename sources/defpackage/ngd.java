package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ngd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngd implements nge {
    static final Status a = new Status(23509, ngf.g(23509));
    private final ExecutorService b;
    private final ScheduledExecutorService c;
    private final ngm d;
    private final ConcurrentHashMap e = new ConcurrentHashMap();
    private final AssetManager f;

    public ngd(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, ngm ngm, Context context) {
        amrl.a((Object) context, (Object) "context");
        Context applicationContext = context.getApplicationContext();
        amrl.a((Object) executorService, (Object) "executor");
        this.b = executorService;
        amrl.a((Object) scheduledExecutorService, (Object) "scheduler");
        this.c = scheduledExecutorService;
        amrl.a((Object) ngm, (Object) "disk");
        this.d = ngm;
        this.f = applicationContext.getResources().getAssets();
    }

    public final aorr a(String str) {
        amrl.a((Object) str, (Object) "fileName");
        ngb ngb = new ngb(str, this.d, this.f);
        this.e.putIfAbsent(str, ngb);
        ngb ngb2 = (ngb) this.e.get(str);
        if (ngb == ngb2) {
            ScheduledFuture<?> schedule = this.c.schedule(new ngc(ngb2), 60000, TimeUnit.MILLISECONDS);
            if (ngb2.b == null) {
                ngb2.b = schedule;
                this.b.execute(ngb2);
            } else {
                throw new IllegalStateException("Already have a timeoutFuture");
            }
        }
        return ngb2.a;
    }

    public final void b(String str) {
        amrl.a((Object) str, (Object) "fileName");
        ngz.c("FontsBundledExtractor", "forget(%s)", str);
        ngb ngb = (ngb) this.e.remove(str);
        if (ngb != null) {
            ngb.a(Status.d);
            return;
        }
        ngz.a("FontsBundledExtractor", "Asked to forget %s but we weren't tracking it", str);
    }
}
