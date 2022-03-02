package com.google.android.gms.auth.account.be.legacy;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleAccountDataChimeraService extends Service {
    public static final iwd a = ehv.a("GoogleAccountDataChimeraService", "GLSUser");

    public final IBinder onBind(Intent intent) {
        fyk fyk = new fyk(this);
        return new gcp(new fyq(fyk), new elt(fyk));
    }
}
