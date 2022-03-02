package com.google.android.gms.chimera.container.zapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WaitDownloadCompleteOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        boolean z;
        if (awxo.a.a().C()) {
            hhk.a((Context) this).b();
        }
        hhc b = hhc.b((Context) this);
        long J = awxo.a.a().J();
        try {
            z = b.d.b().await(J, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Interrupted while waiting for downloads: ");
            sb.append(valueOf);
            Log.e("ChimeraDLM", sb.toString());
            z = false;
        }
        if (!z) {
            hem.a().a(b.b, 60);
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("download completed. result = ");
        sb2.append(z);
        sb2.toString();
    }
}
