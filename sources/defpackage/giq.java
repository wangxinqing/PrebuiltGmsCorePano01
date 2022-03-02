package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.managed.ui.ManagingAppDownloadBroadcastReceiver;
import java.util.Locale;

/* renamed from: giq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class giq extends Loader implements gii, gik {
    public static final iwd a = ehv.a("AuthManaged", "ManagingAppDownloadStatusLoader");
    public final long b;
    public boolean c;
    public long d;
    private final ManagingAppDownloadBroadcastReceiver e;
    private Handler f;
    private Handler g;
    private final HandlerThread h;
    private final gij i;
    private Integer j = null;
    private boolean k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public giq(Context context, long j2) {
        super(context);
        HandlerThread handlerThread = new HandlerThread("CheckDownloadProgressThread");
        this.b = j2;
        this.h = handlerThread;
        this.e = new ManagingAppDownloadBroadcastReceiver(ihs.b(), this);
        this.i = new gij(ihs.b(), this, this.b);
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.d;
        if (j2 == 0) {
            this.d = elapsedRealtime;
            j2 = elapsedRealtime;
        }
        if (elapsedRealtime - j2 < 30000) {
            a(-1);
            b();
            return;
        }
        a(-2);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!isReset()) {
            if (this.g == null) {
                this.h.start();
                this.g = new qvr(this.h.getLooper());
            }
            this.g.postDelayed(this.i, 250);
            a.b("run thread to check the download progress.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        a.b("onReset", new Object[0]);
        if (this.k) {
            this.k = false;
            this.h.quit();
            if (!awot.b()) {
                this.e.b();
            }
            this.g = null;
            this.f = null;
            this.d = 0;
            this.c = false;
            this.j = null;
        }
    }

    public final void onStartLoading() {
        a.b("onStartLoading", new Object[0]);
        Integer num = this.j;
        if (num != null) {
            deliverResult(num);
        }
        if (!this.k) {
            this.k = true;
            this.f = new qvr();
            this.c = false;
            if (!awot.b()) {
                this.e.a();
            }
            b();
            this.d = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Integer num) {
        a.b(String.format(Locale.US, "deliverProgress: %d", new Object[]{num}), new Object[0]);
        this.j = num;
        if (isStarted()) {
            this.f.post(new gip(this, num));
        }
    }
}
