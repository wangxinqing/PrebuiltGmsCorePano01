package com.google.android.gms.gcm.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.gcm.GcmProxyIntentOperation;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PushMessagingRegistrarChimeraProxy extends TracingIntentService {
    public PushMessagingRegistrarChimeraProxy() {
        super(PushMessagingRegistrarChimeraProxy.class.getSimpleName());
    }

    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTER".equals(action)) {
            ntj ntj = nrr.a().c;
            Messenger messenger = ntj.a;
            if (messenger != null) {
                return messenger.getBinder();
            }
            MessengerCompat messengerCompat = ntj.b;
            throw new IllegalStateException("Both messengers are null");
        }
        boolean equals = "com.google.android.gms.gcm.WEARABLE".equals(action);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        nqw.a((Context) this);
    }

    public static void a(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("GOOG.")) {
                    intent.removeExtra(str);
                }
            }
        }
        nrr a = nrr.a();
        if (intent.getStringExtra("cliv") != null) {
            ntj ntj = a.c;
            Messenger b = nyq.b(intent);
            if (b != null) {
                try {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTRATION");
                    int i = Build.VERSION.SDK_INT;
                    intent2.putExtra("google.messenger", ntj.a);
                    intent2.putExtra("registration_id", String.valueOf(intent.getStringExtra("kid")).concat(":MESSENGER"));
                    Message obtain = Message.obtain();
                    obtain.obj = intent2;
                    b.send(obtain);
                } catch (RemoteException e) {
                    Log.w("GCM", "Application making request no longer running");
                }
            } else {
                Log.w("GCM", "Request missing reply messenger, dropping");
            }
        } else {
            if (nqw.d() != 0) {
                nsm nsm = a.b;
                String b2 = nsm.b();
                String c = nsm.c();
                if (b2 != null) {
                    intent.putExtra("GOOG.USER_AID", b2);
                }
                if (c != null) {
                    intent.putExtra("GOOG.USER_TOKEN", c);
                }
            }
            GcmProxyIntentOperation.a(context, intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        if (intent != null) {
            a(this, intent);
        }
    }
}
