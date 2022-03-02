package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NotificationClickedIntentOperation extends IntentOperation {
    private yjc a;
    private yjd b;
    private yjf c;

    private final void a(int i) {
        yjd yjd = this.b;
        if (yjd != null) {
            yjd.a(3, i);
        }
    }

    public final void onCreate() {
        yjd yjd = new yjd(this);
        yjc yjc = new yjc(new jnh(this));
        yjf yjf = new yjf(this, yjd);
        this.a = yjc;
        this.b = yjd;
        this.c = yjf;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phonesky.recovery.CLICK".equals(intent.getAction())) {
            if (this.c == null || this.a == null) {
                yja.b("Invalid state", new Object[0]);
                a(3);
                return;
            }
            yja.a("Recovery notification clicked", new Object[0]);
            a(2);
            this.c.a();
            if (this.a.a(azas.c())) {
                Intent intent2 = new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:com.android.vending"));
                intent2.setFlags(268468224);
                startActivity(intent2);
            }
        }
    }
}
