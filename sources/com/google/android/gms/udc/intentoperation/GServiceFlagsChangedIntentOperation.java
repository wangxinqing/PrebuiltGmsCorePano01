package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.service.UdcContextInitChimeraService;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GServiceFlagsChangedIntentOperation extends IntentOperation {
    static final String a = jkq.a("com.google.android.gms.udc");
    private final amsv b;
    private final amsv c;

    public GServiceFlagsChangedIntentOperation() {
        this.b = new adbi(this);
        this.c = new adbj(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.udc".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (azrk.a.a().E()) {
                if (azrk.r()) {
                    ((afyy) this.c.a()).c().a((Enum) acyn.FLAG_CHANGE);
                }
                try {
                    ((aful) this.b.a()).e(aczd.SYNC_ID_CUSTOM_CACHE).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
            ((aful) this.b.a()).a().get();
        }
        if (!azrk.p() && intent != null) {
            String action = intent.getAction();
            if (!"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) && ((!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !a.equals(action)) || !"com.google.android.gms.udc".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                return;
            }
            if (azrk.b() == UdcContextInitChimeraService.b(getBaseContext())) {
                azrk.b();
                UdcContextInitChimeraService.b(getBaseContext());
                return;
            }
            UdcContextInitChimeraService.a(getBaseContext());
        }
    }

    GServiceFlagsChangedIntentOperation(amsv amsv) {
        this.b = amsv;
        this.c = new adbk(this);
    }
}
