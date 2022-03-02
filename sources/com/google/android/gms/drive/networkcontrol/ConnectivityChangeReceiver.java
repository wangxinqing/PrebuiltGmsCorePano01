package com.google.android.gms.drive.networkcontrol;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectivityChangeReceiver extends ChangeReceiver {
    private static final ith a = new ith("ConnectivityChangeRecei", "");
    private final lgy b;

    public ConnectivityChangeReceiver(Context context, lgy lgy) {
        super(context, "android.net.conn.CONNECTIVITY_CHANGE");
        iva.a((Object) lgy);
        this.b = lgy;
        a((lgv) new lgx(this.b));
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            lgy lgy = this.b;
            if (lgy == null) {
                a.c("ConnectivityChangeRecei", "Ignoring connectivity change");
            } else {
                a((lgv) new lgx(lgy));
            }
        } else {
            a.b("ConnectivityChangeRecei", "Received unexpected action %s", action);
        }
    }
}
