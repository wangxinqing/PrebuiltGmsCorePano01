package com.google.android.gms.auth.managed.intentoperations;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RevokePasswordRequirementsIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("AuthManaged", "RevokePasswordRequirementsIntentOperation");

    public static PendingIntent a(Context context) {
        Class<RevokePasswordRequirementsIntentOperation> cls = RevokePasswordRequirementsIntentOperation.class;
        Intent startIntent = IntentOperation.getStartIntent(context, (Class) cls, "com.google.android.gms.auth.managed.REVOKE_PASSWORD_REQUIREMENTS");
        if (startIntent == null) {
            a.e("Cannot create PendingIntent: getStartIntent returns null.", new Object[0]);
            return null;
        }
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, (Class) cls, startIntent, 0, 1342177280);
        if (pendingIntent == null) {
            a.e("Cannot create PendingIntent: getPendingIntent returns null.", new Object[0]);
        }
        return pendingIntent;
    }

    public final void onHandleIntent(Intent intent) {
        gji.a((Context) this).a(7);
        ghm.a().b(this);
    }
}
