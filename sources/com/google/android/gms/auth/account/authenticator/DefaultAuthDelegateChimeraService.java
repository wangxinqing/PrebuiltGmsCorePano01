package com.google.android.gms.auth.account.authenticator;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DefaultAuthDelegateChimeraService extends Service {
    public static final iwd a = ehv.a("DefaultAuthDelegateChimeraService");

    public final IBinder onBind(Intent intent) {
        return new gdm(this);
    }
}
