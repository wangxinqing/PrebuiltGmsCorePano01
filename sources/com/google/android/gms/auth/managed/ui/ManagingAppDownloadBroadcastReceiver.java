package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManagingAppDownloadBroadcastReceiver extends nla {
    private final gik a;
    private final Context b;
    private boolean c;

    public ManagingAppDownloadBroadcastReceiver(Context context, gik gik) {
        super("auth_managed");
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) gik);
        this.a = gik;
    }

    public final synchronized void a() {
        if (!this.c) {
            this.b.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            this.c = true;
        }
    }

    public final synchronized void b() {
        if (this.c) {
            this.b.unregisterReceiver(this);
            this.c = false;
        }
    }

    public final void a(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            giq giq = (giq) this.a;
            if (Long.valueOf(intent.getLongExtra("extra_download_id", -1)).equals(Long.valueOf(giq.b))) {
                giq.c = true;
            }
        }
    }
}
