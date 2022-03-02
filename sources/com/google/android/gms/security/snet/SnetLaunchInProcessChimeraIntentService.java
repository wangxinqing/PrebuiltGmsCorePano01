package com.google.android.gms.security.snet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetLaunchInProcessChimeraIntentService extends IntentOperation {
    private String a;
    private String b;
    private aaww c;
    private ArrayList d;
    private String e;
    private byte[] f;
    private Bundle g;
    private ArrayList h;

    static {
        SnetLaunchInProcessChimeraIntentService.class.getSimpleName();
    }

    public static ComponentName a(Context context, int i, String str, String str2, String str3, aarw aarw, Bundle bundle) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetLaunchInProcessChimeraIntentService.class, str3);
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("snet.intent.extra.GMS_CORE_VERSION", i);
        startIntent.putExtra("snet.intent.extra.UUID", str);
        startIntent.putExtra("snet.intent.extra.SHARED_UUID", str2);
        startIntent.putStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES", (ArrayList) null);
        startIntent.putExtra("snet.intent.extra.CACHED_LOGS", aarw.k());
        startIntent.putExtra("snet.intent.extra.SNET_FLAGS", bundle);
        startIntent.putParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES", aasb.a(context).a());
        return context.startService(startIntent);
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            this.e = action;
            if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
                this.c = new aaww(this, intent.getIntExtra("snet.intent.extra.GMS_CORE_VERSION", -1));
                this.a = intent.getStringExtra("snet.intent.extra.UUID");
                this.b = intent.getStringExtra("snet.intent.extra.SHARED_UUID");
                this.d = intent.getStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES");
                this.f = intent.getByteArrayExtra("snet.intent.extra.CACHED_LOGS");
                this.g = intent.getBundleExtra("snet.intent.extra.SNET_FLAGS");
                if (!TextUtils.isEmpty(this.a)) {
                    this.c.m = this.a;
                }
                if (!TextUtils.isEmpty(this.b)) {
                    this.c.n = this.b;
                }
                if (!TextUtils.isEmpty(azfv.d())) {
                    this.c.o = azfv.d();
                }
                this.h = intent.getParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES");
                try {
                    Bundle a2 = aano.a(this);
                    if (!TextUtils.isEmpty(this.a)) {
                        a2.putString("snet_uuid", this.a);
                    }
                    if (!TextUtils.isEmpty(this.b)) {
                        a2.putString("snet_shared_uuid", this.b);
                    }
                    a2.putBoolean("snet_is_sidewinder_device", jix.a((Context) this));
                    a2.putStringArrayList("snet_verify_apps_api_usage", this.d);
                    a2.putByteArray("snet_cached_logs", this.f);
                    a2.putBundle("snet.intent.extra.SNET_FLAGS", this.g);
                    a2.putParcelableArrayList("snet.intent.extra.DEX_INFO_BUNDLES", this.h);
                    if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(this.e) && azfv.m()) {
                        if (azfv.g()) {
                            aayu.b(this, a2);
                        }
                    }
                    try {
                        SnetWatchdogChimeraIntentService.a((Context) this, this.e);
                    } catch (RuntimeException e2) {
                    }
                } catch (RuntimeException e3) {
                    aaww.a((Throwable) e3);
                    try {
                        this.c.a(3);
                    } catch (RuntimeException e4) {
                    }
                    try {
                        SnetWatchdogChimeraIntentService.a((Context) this, this.e);
                    } catch (RuntimeException e5) {
                    }
                } catch (Throwable th) {
                    try {
                        SnetWatchdogChimeraIntentService.a((Context) this, this.e);
                    } catch (RuntimeException e6) {
                    }
                    throw th;
                }
            }
        }
    }
}
