package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.chimera.Loader;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManagingAppInstallBroadcastReceiver extends nla {
    static final IntentFilter a = new IntentFilter("com.google.android.gms.auth.DM_PACKAGE_INSTALLED");
    static final IntentFilter b;
    private final Context c;
    private final gir d;
    private final avwi e;
    private boolean f;
    private boolean g;
    private boolean h;

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        b = intentFilter;
        intentFilter.addDataScheme("package");
    }

    public ManagingAppInstallBroadcastReceiver(Context context, gir gir, avwi avwi) {
        super("auth_managed");
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) gir);
        this.d = gir;
        iva.a((Object) avwi);
        this.e = avwi;
    }

    public final synchronized void a() {
        if (!this.h) {
            this.c.registerReceiver(this, a);
            this.c.registerReceiver(this, b);
            this.h = true;
        }
    }

    public final synchronized void b() {
        if (this.h) {
            this.c.unregisterReceiver(this);
            this.h = false;
        }
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.android.gms.auth.DM_PACKAGE_INSTALLED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
            if (intExtra == 0) {
                this.f = true;
            } else if (intExtra == -1) {
                gir gir = this.d;
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                if (intent2 == null) {
                    gis.a.e("User action intent missing!", new Object[0]);
                    ((gis) gir).deliverResult((Integer) -1);
                } else if (((Loader) gir).isStarted()) {
                    ((gis) gir).a(intent2);
                } else {
                    ((gis) gir).b = intent2;
                }
            } else if (intExtra != 3) {
                gir gir2 = this.d;
                gis.a.e("Managing app installation failed.", new Object[0]);
                ((gis) gir2).deliverResult((Integer) -1);
            } else {
                ((gis) this.d).deliverResult((Integer) -2);
            }
        } else if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (this.e.b.equals(data != null ? data.getSchemeSpecificPart() : null)) {
                this.g = true;
            }
        } else {
            return;
        }
        if (this.g && this.f) {
            b();
            gir gir3 = this.d;
            gis.a.c("onInstallCompleted", new Object[0]);
            ((gis) gir3).deliverResult((Integer) 101);
        }
    }
}
