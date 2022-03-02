package com.google.android.gms.auth.appcert.be;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppCertChimeraService extends Service {
    public static final iwd a = new iwd("GLSUser", "AppCertChimeraService");

    public final IBinder onBind(Intent intent) {
        return new fxw(new fyq(new fyk(this)), fxy.a(this));
    }
}
