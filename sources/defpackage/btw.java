package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.contextmanager.acl.UserConsentManager$1;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: btw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btw extends cbe {
    public final Context a;
    public final BroadcastReceiver b = new UserConsentManager$1(this, "contextmanager");
    protected final Map c = new HashMap();
    private final iby d;

    public btw(Context context) {
        iby a2 = rmf.a(context);
        this.a = context;
        this.d = a2;
    }

    private final int e(bsz bsz) {
        try {
            return ((ReportingState) acws.a(this.d.a(bsz.a()), 30000, TimeUnit.MILLISECONDS)).c() ? 1 : 2;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) bxk.a.b();
            anih.a(e);
            ((anih) anih.a("btw", "e", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserConsentManager] Unable to retrieve ULR status.");
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.google.android.gms.udc.action.SETTING_CHANGED")) {
            if (TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.udc.extra.accountName"))) {
                ((anih) ((anih) bxk.a.b()).a("btw", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[UserConsentManager] Account name from UDC Api is empty or null.");
                return;
            }
            cbi.y();
            d(bsx.b(intent.getStringExtra("com.google.android.gms.udc.extra.accountName")));
        } else if (TextUtils.equals(intent.getAction(), "com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
            for (bsz c2 : cbi.y().a()) {
                c(c2);
            }
        }
    }

    @Deprecated
    public final boolean b(bsz bsz) {
        if (awuz.a.a().Q()) {
            return false;
        }
        if (this.c.get(bsz) == null || ((btv) this.c.get(bsz)).b == 0) {
            d(bsz);
            if (this.c.get(bsz) == null || ((btv) this.c.get(bsz)).b != 1) {
                return false;
            }
            return true;
        } else if (((btv) this.c.get(bsz)).b == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(bsz bsz) {
        int e = e(bsz);
        if (!this.c.containsKey(bsz)) {
            this.c.put(bsz, new btv());
        }
        ((btv) this.c.get(bsz)).a = e;
    }

    public final void d(bsz bsz) {
        if (!this.c.containsKey(bsz)) {
            this.c.put(bsz, new btv());
        }
        Context context = this.a;
        acyp acyp = new acyp();
        acyp.a(bsz.b);
        acyr.a(context, acyp.a()).m().a(cbi.k().a(bvq.a("UserConsentManager_retrieveUdcConsents")), (acvp) new btu(this, "[UserConsentManager] retrieve UDC consents", new Object[0], bsz));
    }

    public final boolean a(bsz bsz) {
        if (this.c.get(bsz) != null && ((btv) this.c.get(bsz)).a != 0) {
            return ((btv) this.c.get(bsz)).a == 1;
        }
        c(bsz);
        return this.c.get(bsz) != null && ((btv) this.c.get(bsz)).a == 1;
    }
}
