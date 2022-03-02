package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GcmServiceDiagnosticsIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        nsv nsv;
        IBinder a = fy.a(intent.getExtras(), "callback");
        if (a != null) {
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
            if (queryLocalInterface instanceof nsv) {
                nsv = (nsv) queryLocalInterface;
            } else {
                nsv = new nst(a);
            }
            if (nsv != null) {
                try {
                    nsv.a(new nsr(this));
                } catch (RemoteException e) {
                    Log.e("GCM", "Failed to return GcmServiceDiagnostics.", e);
                }
            }
        }
    }
}
