package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckinReceiver extends nla {
    public glo a;
    public final Context b;
    public final Object c = new Object();
    public boolean d;

    public CheckinReceiver(Context context) {
        super("auth_account");
        this.b = context;
    }

    public final void a() {
        synchronized (this.c) {
            if (this.d) {
                this.b.unregisterReceiver(this);
                this.a = null;
                this.d = false;
            }
        }
    }

    public final void a(Context context, Intent intent) {
        if (!"com.google.android.checkin.CHECKIN_COMPLETE".equals(intent.getAction())) {
            return;
        }
        if (jhg.a(context) != 0) {
            ((gln) this.a).a(true);
        } else {
            ((gln) this.a).a(false);
        }
    }
}
