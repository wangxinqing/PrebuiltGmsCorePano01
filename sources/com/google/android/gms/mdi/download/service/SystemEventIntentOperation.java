package com.google.android.gms.mdi.download.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemEventIntentOperation extends IntentOperation {
    private static final String a = jkq.a("com.google.android.gms.icing.mdd");

    public final void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                extras.get(str);
            }
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.icing.mdd".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            MddGcmTaskChimeraService.b();
            if (axsv.f()) {
                try {
                    acws.a(rxu.b(this).a((ihb) new rxs()));
                } catch (InterruptedException | ExecutionException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    afsh.a(message);
                }
            }
        }
    }
}
