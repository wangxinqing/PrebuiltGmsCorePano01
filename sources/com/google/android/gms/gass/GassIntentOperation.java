package com.google.android.gms.gass;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GassIntentOperation extends IntentOperation {
    protected static final String a = GassIntentOperation.class.getSimpleName();

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                nqf nqf = (nqf) aucj.a((aucj) nqf.d, intent.getExtras().getByteArray("IntentParameter"));
                npc a2 = npd.a(nqf);
                if (a2 == null) {
                    Log.w(a, "Failed to create task");
                } else {
                    a2.a(this, nqf);
                }
            } catch (IOException e) {
                Log.w(a, "Failed to parse task info");
            }
        } else {
            Log.w(a, "Intent cannot be null.");
        }
    }
}
