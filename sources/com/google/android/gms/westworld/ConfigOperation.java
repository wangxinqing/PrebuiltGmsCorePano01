package com.google.android.gms.westworld;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        iby iby;
        if (!aecm.a() && "com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && "com.google.android.westworld".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ihs b = ihs.b();
            aecq.g(b);
            aupy aupy = null;
            if (azvd.b()) {
                iby = adrz.a(ihs.b(), new adry());
            } else {
                aupy = aecq.a((Context) ihs.b());
                iby = null;
            }
            hph f = aecq.f(b);
            try {
                f.c("ConfigOperationAttempt").a();
                if (aecq.a(aupy, iby)) {
                    f.c("ConfigOperationCanRun").a();
                    aecg.a((Context) b);
                    aecq.a(azws.f(), (Context) b);
                }
            } finally {
                f.d();
            }
        }
    }
}
