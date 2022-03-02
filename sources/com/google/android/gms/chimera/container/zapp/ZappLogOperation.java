package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ZappLogOperation extends IntentOperation {
    private static final Intent a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    public final void onHandleIntent(Intent intent) {
        cqn cqn;
        ArrayList<Bundle> parcelableArrayListExtra = intent.getParcelableArrayListExtra("events");
        if (parcelableArrayListExtra != null) {
            cqr cqr = new cqr();
            if (!bindService(a, cqr, 1)) {
                Log.e("ZappLogOperation", "Unable to bind to Phonesky");
                return;
            }
            try {
                IBinder a2 = cqr.a();
                if (a2 != null) {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                    cqn = !(queryLocalInterface instanceof cqn) ? new cqn(a2) : (cqn) queryLocalInterface;
                } else {
                    cqn = null;
                }
                if (cqn == null) {
                    Log.e("ZappLogOperation", "Unable to connect to Phonesky");
                    try {
                        unbindService(cqr);
                    } catch (IllegalStateException e) {
                    }
                } else {
                    try {
                        for (Bundle a3 : parcelableArrayListExtra) {
                            cqn.a(getPackageName(), a3);
                        }
                        try {
                            unbindService(cqr);
                        } catch (IllegalStateException e2) {
                        }
                    } catch (Exception e3) {
                        String valueOf = String.valueOf(e3.getMessage());
                        Log.e("ZappLogOperation", valueOf.length() == 0 ? new String("onModuleEvent() failed: ") : "onModuleEvent() failed: ".concat(valueOf));
                        try {
                            unbindService(cqr);
                        } catch (IllegalStateException e4) {
                        }
                    }
                }
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                try {
                    unbindService(cqr);
                } catch (IllegalStateException e6) {
                }
            } catch (Throwable th) {
                try {
                    unbindService(cqr);
                } catch (IllegalStateException e7) {
                }
                throw th;
            }
        }
    }
}
