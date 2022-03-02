package com.google.android.gms.security.verifier;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApkUploadChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
            abaa.a("Ignoring unrecognized intent: %s", intent.toString());
        } else {
            intent.setComponent(new ComponentName(this, aann.a(InternalApkUploadChimeraService.class)));
            startService(intent);
        }
        stopSelf(i2);
        return 3;
    }
}
