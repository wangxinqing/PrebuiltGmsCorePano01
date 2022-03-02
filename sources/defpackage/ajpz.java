package defpackage;

import android.content.Context;
import android.location.GpsStatus;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ajpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajpz {
    private static ajpz e = null;
    public final LocationManager a;
    public final Map b = new HashMap();
    public final ajpy c = new ajpy(this);
    public GpsStatus d;

    protected ajpz(Context context) {
        this.a = (LocationManager) context.getSystemService("location");
    }

    public static synchronized ajpz a(Context context) {
        ajpz ajpz;
        synchronized (ajpz.class) {
            if (e == null) {
                Context applicationContext = context.getApplicationContext();
                if (jkr.i()) {
                    e = new ajqe(applicationContext);
                } else if (jkr.h()) {
                    e = new ajqd(applicationContext);
                } else if (jkr.e()) {
                    e = new ajqc(applicationContext);
                } else {
                    int i = Build.VERSION.SDK_INT;
                    e = new ajqa(applicationContext);
                }
            }
            ajpz = e;
        }
        return ajpz;
    }

    public String a() {
        return "";
    }

    public void a(String str) {
    }

    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.a.removeGpsStatusListener(this.c);
    }

    /* access modifiers changed from: package-private */
    public final void a(ahyn ahyn) {
        synchronized (this.b) {
            for (Map.Entry entry : this.b.entrySet()) {
                Executor executor = (Executor) entry.getValue();
                executor.execute(new ajpw(this, (ajpx) entry.getKey(), executor, ahyn));
            }
        }
    }

    public final void a(ajpx ajpx) {
        synchronized (this.b) {
            if (this.b.remove(ajpx) != null && this.b.isEmpty()) {
                b();
            }
        }
    }

    public final void a(ajpx ajpx, Executor executor) {
        synchronized (this.b) {
            boolean isEmpty = this.b.isEmpty();
            if (this.b.put(ajpx, executor) == null) {
                if (isEmpty) {
                    a(executor);
                }
            }
        }
    }

    public final void a(LocationListener locationListener) {
        try {
            this.a.removeUpdates(locationListener);
        } catch (NullPointerException e2) {
            Log.e("LocationManagerCompat", "unable to remove location updates", e2);
        }
    }

    public void a(String str, long j, LocationListener locationListener, Looper looper, Collection collection, boolean z) {
        if (ayap.c()) {
            try {
                this.a.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            } catch (NullPointerException | SecurityException e2) {
                Log.wtf("LocationManagerCompat", "Unable to request location updates.", e2);
            }
        } else {
            try {
                this.a.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            } catch (NullPointerException e3) {
                Log.wtf("LocationManagerCompat", "Unable to request location updates.", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Executor executor) {
        FutureTask futureTask = new FutureTask(new ajpv(this));
        if (Looper.myLooper() != null) {
            futureTask.run();
        } else {
            new qvr(Looper.getMainLooper()).post(futureTask);
        }
        try {
            futureTask.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        } catch (TimeoutException e3) {
            throw new IllegalStateException("The Looper appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread.", e3);
        }
    }
}
