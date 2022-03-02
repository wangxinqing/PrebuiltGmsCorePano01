package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: aglf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class aglf implements Window.OnFrameMetricsAvailableListener, agcr, agcq {
    private final aglg a;
    private final boolean b;
    private Activity c;
    private boolean d;
    private HandlerThread e;
    private Handler f;

    public aglf(aglg aglg, boolean z) {
        this.a = aglg;
        this.b = z;
        if (z) {
            this.d = true;
        }
    }

    private static String c(Activity activity) {
        if (activity instanceof agis) {
            return agfe.a(((agis) activity).a());
        }
        return activity.getClass().getName();
    }

    private Handler d() {
        if (this.f == null) {
            HandlerThread handlerThread = new HandlerThread("Primes-Jank");
            this.e = handlerThread;
            handlerThread.start();
            this.f = new Handler(this.e.getLooper());
        }
        return this.f;
    }

    private void e() {
        Activity activity = this.c;
        if (activity != null) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this, d());
        }
    }

    private void f() {
        Activity activity = this.c;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this);
            } catch (RuntimeException e2) {
                int i = aglh.a;
            }
        }
    }

    public void a() {
        synchronized (this) {
            this.d = true;
            if (this.c == null) {
                int i = aglh.a;
            } else {
                e();
            }
        }
    }

    public void b() {
        synchronized (this) {
            this.d = false;
            f();
        }
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(8);
        aglh aglh = ((agle) this.a).a;
        double d2 = (double) metric;
        Double.isNaN(d2);
        aglh.a((int) (d2 / 1000000.0d));
    }

    public void b(Activity activity) {
        if (this.b) {
            aglg aglg = this.a;
            ((agle) aglg).a.a(c(activity));
        }
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                e();
            }
        }
    }

    public void c() {
        synchronized (this) {
            b();
            if (this.f != null) {
                this.e.quitSafely();
                this.e = null;
                this.f = null;
            }
        }
    }

    public void a(Activity activity) {
        synchronized (this) {
            if (this.d) {
                f();
            }
            this.c = null;
        }
        if (this.b) {
            aglg aglg = this.a;
            ((agle) aglg).a.a(c(activity), true, (barb) null);
        }
    }
}
