package com.google.android.gms.framework.tracing.wrapper;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class TracingIntentService extends IntentService {
    private njy a = null;

    public TracingIntentService(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = new njy(context, (Class) getClass(), 11);
    }

    public final void onHandleIntent(Intent intent) {
        amky amky;
        njy njy = this.a;
        if (njy != null) {
            amky = njy.a("onHandleIntent", intent);
        } else {
            amky = null;
        }
        try {
            a(intent);
            if (amky != null) {
                amky.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
