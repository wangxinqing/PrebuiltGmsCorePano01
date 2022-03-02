package com.google.android.gms.update.execution;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstallationEventIntentOperation extends IntentOperation {
    public static final iwd a = adnt.e("InstallationEventIntentOperation");

    /* JADX INFO: finally extract failed */
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.update.INSTALLATION_EVENT".equals(intent.getAction()) && adke.a(this)) {
            adkv adkv = (adkv) adkv.b.b();
            amqy amqy = adlr.a;
            synchronized (adkv.d) {
                while (!adkv.e.isEmpty()) {
                    try {
                        amqy.a(Integer.valueOf(((Integer) adkv.e.getFirst()).intValue()));
                        adkv.e.removeFirst();
                        adkv.c.a(adkv.a.b(amzy.a((Collection) adkv.e)));
                    } catch (Throwable th) {
                        adkv.e.removeFirst();
                        adkv.c.a(adkv.a.b(amzy.a((Collection) adkv.e)));
                        throw th;
                    }
                }
            }
        }
    }
}
