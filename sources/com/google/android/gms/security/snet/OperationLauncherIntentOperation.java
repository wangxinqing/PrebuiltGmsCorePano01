package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OperationLauncherIntentOperation extends IntentOperation {
    private static final String a = OperationLauncherIntentOperation.class.getSimpleName();

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.google.android.gms.security.apis.verifyapps.CONSENT_RESULT".equals(intent.getAction())) {
                    new aani(this, intent).a(this);
                } else if ("com.google.android.gms.security.apis.verifyapps.PACKAGE_WARNING_RESULT".equals(intent.getAction())) {
                    new aaul(this, intent).a(this);
                } else if ("com.google.android.gms.security.snet.XLB_UPDATE".equals(intent.getAction())) {
                    new aave((zzw) null, "com.google.android.gms").a((Context) this);
                }
            } catch (RemoteException | nja e) {
                Log.e(a, "Exception while starting operation");
            }
        }
    }
}
