package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FusedLocationChimeraService extends Service {
    private aidm a;

    public final IBinder onBind(Intent intent) {
        if (this.a == null) {
            if (ayap.j()) {
                this.a = new aidm((Context) this);
            } else {
                this.a = new aidm(new rom(this));
            }
            rom rom = this.a.a;
            if (rom != null) {
                rom.a();
            }
        }
        return this.a.getBinder();
    }

    public final void onDestroy() {
        aidm aidm = this.a;
        if (aidm != null) {
            aidm.c.post(new aidi(aidm));
            this.a = null;
        }
        super.onDestroy();
    }
}
