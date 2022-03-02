package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aeif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aeif extends BroadcastReceiver implements AutoCloseable {
    private final Context a;
    private final aosh b;
    public long c;

    public aeif(Context context, aeia aeia, Handler handler, String... strArr) {
        this.b = aosh.f();
        anil anil = aehd.a;
        Arrays.toString(strArr);
        this.a = context;
        IntentFilter intentFilter = new IntentFilter();
        if (aeia.T()) {
            intentFilter.setPriority(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        context.registerReceiver(this, intentFilter, (String) null, handler);
    }

    public static aeif a(Context context, aeia aeia, String... strArr) {
        return new aeie(context, aeia, strArr);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    public final void close() {
        a((Exception) null);
    }

    public final void onReceive(Context context, Intent intent) {
        anil anil = aehd.a;
        intent.getAction();
        try {
            a(intent);
        } catch (Exception e) {
            a(e);
        }
    }

    public final void a(long j, TimeUnit timeUnit) {
        anil anil = aehd.a;
        try {
            this.b.get(j, timeUnit);
        } catch (TimeoutException e) {
            if (this.c > 0) {
                ((anih) ((anih) aehd.a.d()).a("aeif", "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Extend timeout for %s seconds", this.c);
                this.b.get(this.c, TimeUnit.SECONDS);
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc) {
        try {
            this.a.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
        }
        if (exc != null) {
            this.b.a((Throwable) exc);
        } else {
            this.b.b((Object) null);
        }
    }

    public aeif(Context context, aeia aeia, String... strArr) {
        this(context, aeia, (Handler) null, strArr);
    }
}
