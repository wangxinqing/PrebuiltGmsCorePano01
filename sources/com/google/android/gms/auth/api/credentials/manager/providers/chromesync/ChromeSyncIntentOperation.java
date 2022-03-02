package com.google.android.gms.auth.api.credentials.manager.providers.chromesync;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChromeSyncIntentOperation extends IntentOperation {
    private static final iwd a = ehv.b("ChromeSyncIntentOperation");

    public final void onHandleIntent(Intent intent) {
        fjw a2 = fjw.a((Context) this);
        try {
            anhk i = fcg.a().listIterator();
            while (i.hasNext()) {
                try {
                    a2.a((pyv) i.next()).get();
                } catch (InterruptedException | ExecutionException e) {
                    a.e("Failed to initialize sync.", e, new Object[0]);
                }
            }
        } catch (qbf e2) {
            a.e("Failed to get the accounts.", e2, new Object[0]);
        }
    }
}
