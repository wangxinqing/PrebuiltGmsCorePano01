package com.google.android.gms.nearby.messages.debug;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DebugPokeChimeraService extends Service {
    public CountDownLatch a;
    private final asnc b = new vaw(this);
    private final ServiceConnection c = new vax(this, "nearby");

    public final IBinder onBind(Intent intent) {
        return this.b;
    }

    public final void onCreate() {
        jjg jjg = tgc.a;
        this.a = new CountDownLatch(1);
        jca a2 = jca.a();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE");
        intent.setComponent(new ComponentName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        a2.a(this, intent, this.c, 1);
    }

    public final void onDestroy() {
        jjg jjg = tgc.a;
        jca.a().a((Context) this, this.c);
        super.onDestroy();
    }
}
