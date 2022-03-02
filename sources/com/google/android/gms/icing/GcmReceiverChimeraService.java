package com.google.android.gms.icing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Base64;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmReceiverChimeraService extends Service {
    public static byte[] a(Intent intent) {
        return a(intent, "icing-gcm-msg-base64");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        oso.a("Received gcm intent: %s extras: %s", (Object) intent, intent == null ? "" : intent.getExtras());
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        if (intent.hasExtra("mdh-pn-base64")) {
            if (pbq.a() && ((Boolean) pba.M.c()).booleanValue()) {
                String stringExtra = intent.getStringExtra("mdh-pn-base64");
                phw.a.a("Received MDH notification", new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putString("notifications", stringExtra);
                qwq a = qwq.a((Context) ihs.b());
                qxf qxf = new qxf();
                qxf.a(0, 1);
                qxf.k = "mdh-pn";
                qxf.n = true;
                qxf.i = "com.google.android.gms.icing.mdh.service.MobileDataHubGcmTaskService";
                qxf.a(2);
                qxf.a(0, axcc.b() ? 1 : 0);
                qxf.a(false);
                qxf.b(0);
                qxf.s = bundle;
                a.a((qxx) qxf.b());
            }
        } else if (intent.hasExtra("icing-gcm-msg-base64") || (axsp.e() && intent.hasExtra("icing-fpop-user-actions-base64"))) {
            intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
            startService(intent);
        }
        stopSelf(i2);
        return 2;
    }

    public static byte[] a(Intent intent, String str) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                oso.b("Gcm message has no extras");
                return null;
            }
            String string = extras.getString(str);
            if (string != null) {
                try {
                    return Base64.decode(string, 0);
                } catch (IllegalArgumentException e) {
                    oso.b("Gcm message payload decode failed: %s", (Object) e.getMessage());
                    return null;
                }
            } else {
                oso.b("Gcm message payload missing %s key", (Object) str);
            }
        }
        return null;
    }
}
