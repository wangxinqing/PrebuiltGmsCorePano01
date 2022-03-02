package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: opk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opk {
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    public volatile opo a;
    public final CountDownLatch b = new CountDownLatch(1);
    private final itc d = itc.a(this.g);
    private final ServiceConnection e = new opj(this);
    private int f = 0;
    private final Context g;
    private boolean h = false;

    public opk(Context context) {
        this.g = context;
    }

    private final synchronized boolean a() {
        int i = this.f;
        this.f = i + 1;
        if (i == 0) {
            this.h = this.d.a(c, this.e, "GoogleHttpServiceClient");
        }
        return this.h;
    }

    private final synchronized void b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            this.d.a(c, this.e);
        }
    }

    public final Bundle a(String str) {
        Bundle bundle = null;
        if (a()) {
            try {
                if (this.a == null && Looper.getMainLooper().getThread() != Thread.currentThread() && !this.b.await(500, TimeUnit.MILLISECONDS)) {
                    Log.w("GoogleHttpServiceClient", "Timeout on service connection", new Throwable());
                    this.b.countDown();
                }
                if (this.a != null) {
                    bundle = this.a.a(str);
                }
            } catch (RemoteException e2) {
                Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", e2);
            } catch (InterruptedException e3) {
                String valueOf = String.valueOf(e3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Interrupted waiting for binder: ");
                sb.append(valueOf);
                Log.w("GoogleHttpServiceClient", sb.toString());
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
            return bundle;
        }
        b();
        return null;
    }

    public final void a(String str, int i) {
        if (a()) {
            try {
                if (this.a != null) {
                    if (i > 0) {
                        this.a.a(str, i);
                    }
                }
            } catch (RemoteException e2) {
                Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", e2);
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
            return;
        }
        b();
    }
}
