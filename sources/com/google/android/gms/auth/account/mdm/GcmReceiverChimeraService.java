package com.google.android.gms.auth.account.mdm;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.entity.ByteArrayEntity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmReceiverChimeraService extends TracingIntentService {
    public static final iwd a = ehv.a("account_mdm", "GcmReceiverChimeraService");
    Handler b;
    private HandlerThread c;

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
        setIntentRedelivery(true);
    }

    public static final Map a(String str) {
        HashMap hashMap = new HashMap();
        String valueOf = String.valueOf(str);
        hashMap.put("Authorization", valueOf.length() == 0 ? new String("GoogleDMToken token=") : "GoogleDMToken token=".concat(valueOf));
        hashMap.put("Content-type", "application/x-protobuffer");
        hashMap.put("Accept-Encoding", "gzip");
        return hashMap;
    }

    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("dm-account-wipe", 10);
        this.c = handlerThread;
        handlerThread.start();
        this.b = new qvr(this.c.getLooper());
        super.onCreate();
    }

    public final void onDestroy() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        String stringExtra;
        if (intent != null && ent.G() && (stringExtra = intent.getStringExtra("action")) != null && stringExtra.equals("account_wipe")) {
            String stringExtra2 = intent.getStringExtra("action_token");
            String stringExtra3 = intent.getStringExtra("email");
            if (amrk.a(stringExtra2) || amrk.a(stringExtra3)) {
                a.b("Received account wipe intent with invalid token or email", new Object[0]);
                return;
            }
            long a2 = jhg.a(getApplicationContext());
            String l = Long.toString(a2);
            aucd o = avpv.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avpv avpv = (avpv) o.b;
            l.getClass();
            int i = avpv.a | 1;
            avpv.a = i;
            avpv.b = l;
            stringExtra3.getClass();
            avpv.a = i | 2;
            avpv.c = stringExtra3;
            avpv avpv2 = (avpv) o.i();
            aucd o2 = avpw.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avpw avpw = (avpw) o2.b;
            stringExtra2.getClass();
            avpw.a |= 1;
            avpw.b = stringExtra2;
            aucd o3 = avpu.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            avpu avpu = (avpu) o3.b;
            avpu.b = 1;
            avpu.a |= 1;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avpw avpw2 = (avpw) o2.b;
            avpu avpu2 = (avpu) o3.i();
            avpu2.getClass();
            avpw2.c = avpu2;
            avpw2.a |= 2;
            avpw avpw3 = (avpw) o2.i();
            aucd o4 = avpy.e.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            avpy avpy = (avpy) o4.b;
            avpv2.getClass();
            avpy.b = avpv2;
            int i2 = avpy.a | 1;
            avpy.a = i2;
            avpw3.getClass();
            avpy.c = avpw3;
            avpy.a = i2 | 2;
            this.b.post(new erj(this, new ByteArrayEntity(((avpy) o4.i()).k()), stringExtra2, stringExtra3, a2));
        }
    }
}
