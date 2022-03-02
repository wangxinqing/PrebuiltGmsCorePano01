package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GamesServiceFatalStub extends Service {
    public final IBinder onBind(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Trying to bind to unexpected stub ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
