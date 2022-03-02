package defpackage;

import android.app.PendingIntent;
import android.content.Intent;

/* renamed from: uci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uci extends arwm {
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ String c;
    final /* synthetic */ PendingIntent d;
    final /* synthetic */ udb e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uci(udb udb, String str, boolean z, Intent intent, String str2, PendingIntent pendingIntent) {
        super(str);
        this.e = udb;
        this.a = z;
        this.b = intent;
        this.c = str2;
        this.d = pendingIntent;
    }

    public final void run() {
        if (aymw.a.a().aA()) {
            if (this.a || this.b.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT")) {
                this.e.h.a(this.b);
            }
        } else if (this.a) {
            this.e.h.a(this.b);
        }
        boolean z = false;
        ((thb) thl.a(this.e.e, thb.class)).a(this.b.getIntExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", 0));
        if (!aymw.S()) {
            boolean booleanExtra = this.b.getBooleanExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", true);
            udb udb = this.e;
            String str = this.c;
            if (this.d != null) {
                z = true;
            }
            udb.a(booleanExtra, str, z, (String) null);
        }
    }
}
