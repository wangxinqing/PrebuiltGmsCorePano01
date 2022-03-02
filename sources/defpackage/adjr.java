package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.update.ConfigUpdateOptions;
import java.util.concurrent.ExecutionException;

/* renamed from: adjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjr extends nis {
    private static final iwd a = adnt.b("CheckForConfigUpdateOperation");
    private final ifu b;
    private final ConfigUpdateOptions c;

    public adjr(ifu ifu, ConfigUpdateOptions configUpdateOptions) {
        super(157, "CheckForConfigUpdate");
        this.b = ifu;
        this.c = configUpdateOptions;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        babj babj;
        if (!ayor.b()) {
            gvl a2 = gvl.a(context);
            gvt gvt = new gvt(context, this);
            gvt.b();
            Bundle a3 = gvt.a();
            a3.putBoolean("com.google.android.gms.checkin.FETCH_SYSTEM_UPDATES", this.c.a);
            acwa a4 = a2.a(a3);
            try {
                acws.a(a4);
            } catch (InterruptedException | ExecutionException e) {
                a.e("Failed to checkin.", e, new Object[0]);
            }
            amri c2 = amri.c((Integer) a4.d());
            a.c("Checkin request finished with code %s.", c2);
            if (!c2.a() || ((Integer) c2.b()).intValue() != 21021) {
                this.b.a(Status.c);
            } else {
                this.b.a(Status.a);
            }
        } else {
            if (!this.c.a) {
                babj = ((adkr) adkr.b.b()).a();
            } else {
                adkr adkr = (adkr) adkr.b.b();
                babj = adkr.a(adkr.a(true));
            }
            if (babj.a()) {
                this.b.a(Status.a);
            } else {
                this.b.a(Status.c);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a(status);
    }
}
