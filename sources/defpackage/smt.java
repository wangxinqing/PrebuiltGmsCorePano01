package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: smt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class smt extends IntentOperation implements Response.ErrorListener, rei {
    public static final AtomicBoolean a = new AtomicBoolean();
    protected Semaphore b;
    public HandlerThread c;
    protected boolean d = false;
    protected iby e;

    /* access modifiers changed from: protected */
    public final void a() {
        this.e.b(igf.a(this, rei.class.getSimpleName())).a((acvv) new smr(this));
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* access modifiers changed from: protected */
    public abstract void a(avuj avuj, Location location, Response.Listener listener, Response.ErrorListener errorListener);

    /* access modifiers changed from: protected */
    public abstract void a(je jeVar);

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public abstract int c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract int g();

    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("LocateService callbacks");
        this.c = handlerThread;
        handlerThread.start();
        this.e = ren.c(this);
    }

    public final void onDestroy() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
        }
        iwq.a((Context) this).a("mdm.notification_persistent_location", 1);
        snl a2 = snl.a();
        a2.a.clear();
        a2.b.set((Object) null);
        a.set(false);
    }

    public final void onErrorResponse(VolleyError volleyError) {
        snn.a(volleyError, "Unable to send response", new Object[0]);
    }

    public final void onHandleIntent(Intent intent) {
        try {
            if (!jix.a((Context) this)) {
                if (intent != null) {
                    a(getString(d()), getString(e()), "mdm.notification_persistent_location", true);
                    a(intent);
                } else {
                    intent = null;
                }
            }
        } finally {
            acrm.b(this, intent);
            nsi.a(this, intent);
        }
    }

    public final void a(Location location) {
        this.d = true;
        snl.a().a(location);
        a(avuj.SUCCESS, location, (Response.Listener) null, (Response.ErrorListener) this);
        if (((double) location.getAccuracy()) < 25.0d) {
            int i = crc.a;
            a();
        }
    }

    public final void a(avuj avuj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            snn.d("Don't call on the main thread", new Object[0]);
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        a(avuj, (Location) null, (Response.Listener) newFuture, (Response.ErrorListener) newFuture);
        try {
            newFuture.get();
        } catch (InterruptedException e2) {
            snn.a(e2, "Unable to send response", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            snn.a(e3, "Unable to send response", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, String str3, boolean z) {
        je jeVar;
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=device_manager_location")), 134217728);
        int a2 = hdg.a(this, f());
        snh.b(this);
        if (jkr.e()) {
            jeVar = new je(this, "find_my_device");
        } else {
            jeVar = new je(this);
        }
        if (!z) {
            jeVar.a(true);
        } else {
            jeVar.b(true);
        }
        jeVar.b(a2);
        jeVar.e(str);
        jeVar.b((CharSequence) str2);
        jeVar.f = activity;
        jeVar.u = kf.b(this, g());
        jeVar.s = "recommendation";
        jeVar.e();
        jd jdVar = new jd();
        jdVar.b(str);
        jdVar.a((CharSequence) str2);
        jeVar.a((jh) jdVar);
        a(jeVar);
        iwq.a((Context) this).a(str3, 1, jeVar.b());
    }
}
