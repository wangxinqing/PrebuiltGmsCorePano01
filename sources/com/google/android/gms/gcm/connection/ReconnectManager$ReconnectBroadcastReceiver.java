package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReconnectManager$ReconnectBroadcastReceiver extends nla {
    final /* synthetic */ nva a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReconnectManager$ReconnectBroadcastReceiver(nva nva) {
        super("gcm");
        this.a = nva;
    }

    public final void a(Context context, Intent intent) {
        String action;
        nut nut;
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                nva nva = this.a;
                if (!axlc.u() || !nva.s.b()) {
                    this.a.a((NetworkInfo) intent.getParcelableExtra("networkInfo"), !intent.getBooleanExtra("noConnectivity", false));
                    return;
                }
            }
            if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                this.a.b(intent.getBooleanExtra("state", false));
            } else if ("com.google.android.intent.action.GCM_RECONNECT".equals(action) && (nut = this.a.m) != null) {
                if (nut.b()) {
                    this.a.d();
                    return;
                }
                nva nva2 = this.a;
                nva2.f = false;
                nva2.a(false);
            }
        }
    }
}
