package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageRemovedIntentOperation extends IntentOperation {
    private yjd a;
    private yjc b;

    public final void onCreate() {
        this.a = new yjd(this);
        this.b = new yjc(new jnh(this));
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            yja.b("Invalid package removed intent", new Object[0]);
        } else if (intent.getData().getSchemeSpecificPart().equals("com.android.vending")) {
            long b2 = yjb.b(this);
            yjb.c(this);
            if (b2 == -1 || System.currentTimeMillis() - b2 > azas.b()) {
                yja.a("No recent notifications shown - organic recovery", new Object[0]);
            } else if (this.b.a(azas.c())) {
                yja.b("Bad version still installed", new Object[0]);
                this.a.a(4, 3);
            } else {
                yja.a("Successful recovery", new Object[0]);
                this.a.a(4);
            }
        }
    }
}
