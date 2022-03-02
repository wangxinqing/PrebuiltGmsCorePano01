package com.google.android.gms.auth;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraGetToken extends Service {
    public static final iwd a = ehv.a("GetToken");
    public static final List b = Arrays.asList(new String[]{"authAccount", "booleanResult", "accountType", "authtoken", "retry"});
    private biv c;

    public final IBinder onBind(Intent intent) {
        biv biv = this.c;
        biv.asBinder();
        return biv;
    }

    public final void onCreate() {
        this.c = new biv(this);
    }
}
