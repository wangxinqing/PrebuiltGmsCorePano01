package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.contextmanager.acl.UserConsentManager$1;

/* renamed from: bts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bts implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ UserConsentManager$1 b;

    public bts(UserConsentManager$1 userConsentManager$1, Intent intent) {
        this.b = userConsentManager$1;
        this.a = intent;
    }

    public final void run() {
        btw btw = this.b.a;
        Intent intent = this.a;
        if (TextUtils.equals(intent.getAction(), "com.google.android.gms.udc.action.SETTING_CHANGED")) {
            if (TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.udc.extra.accountName"))) {
                ((anih) ((anih) bxk.a.b()).a("btw", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserConsentManager] Account name from UDC Api is empty or null.");
                return;
            }
            cbi.y();
            btw.d(bsx.b(intent.getStringExtra("com.google.android.gms.udc.extra.accountName")));
        } else if (TextUtils.equals(intent.getAction(), "com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
            for (bsz c : cbi.y().a()) {
                btw.c(c);
            }
        }
    }
}
