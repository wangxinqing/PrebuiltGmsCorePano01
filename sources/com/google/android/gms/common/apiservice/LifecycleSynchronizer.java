package com.google.android.gms.common.apiservice;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.Service;
import java.util.Random;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LifecycleSynchronizer {
    private int a;
    private final Object b = new Object();
    private Intent c;
    private final Service d;
    private final amth e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Callback {
        void onServiceDestroy();
    }

    public LifecycleSynchronizer(Service service) {
        amtm a2 = amtm.a();
        a2.a(4);
        a2.e();
        this.e = a2.d();
        this.d = service;
    }

    public int getRefCount() {
        int i;
        synchronized (this.b) {
            i = this.a;
        }
        return i;
    }

    public void onAfterExecution() {
        synchronized (this.b) {
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                if (i2 == 0) {
                    for (Callback onServiceDestroy : ((amuo) this.e).a.keySet()) {
                        try {
                            onServiceDestroy.onServiceDestroy();
                        } catch (RuntimeException e2) {
                            Log.e("LifecycleSync", "Failed to execute a callback", e2);
                        }
                    }
                    this.d.stopSelf();
                }
            }
        }
    }

    public void onBeforeDispatching() {
        synchronized (this.b) {
            int i = this.a;
            this.a = i + 1;
            if (i == 0) {
                if (this.c == null) {
                    iva.a((Object) this.d.getContainerService());
                    this.c = jhg.h(this.d.getContainerService().getClass().getName());
                }
                Intent intent = this.c;
                try {
                    this.d.startService(intent);
                } catch (IllegalStateException e2) {
                    if (Build.VERSION.SDK_INT >= 26 && ((amrk.a(intent.getPackage()) || intent.getPackage().equals("com.google.android.gms")) && awxl.b() && ((double) new Random().nextFloat()) < awxl.c())) {
                        Log.e("LifecycleSync", "Google Play services is unable to start a service. Exiting.", e2);
                        jhg.e();
                    }
                    throw e2;
                }
            }
        }
    }

    public void onServiceStart() {
        synchronized (this.b) {
            if (this.a == 0) {
                this.d.stopSelf();
            }
        }
    }

    public LifecycleSynchronizer registerCallback(Callback callback) {
        this.e.a(callback, true);
        return this;
    }
}
