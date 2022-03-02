package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.nearby.sharing.experiments.Precondition$1;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReceiveSurfaceChimeraService extends Service {
    private vts a;
    private final Context b = new vt((Context) this, 2132017974);
    private vna c;
    private vwy[] d;
    private vox e;
    private voy f;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.d = new vwy[]{new vwv(getApplicationContext(), ayni.a.a().aR(), 2, 3), new vwv(getApplicationContext(), ayni.a.a().aP(), 1, 3), new vwv(getApplicationContext(), ayni.a.a().aT(), 0, 3), new vwv(getApplicationContext(), ayni.a.a().aS(), 2, 2), new vwv(getApplicationContext(), ayni.a.a().aQ(), 1, 2), new vwv(getApplicationContext(), ayni.a.a().aU(), 0, 2)};
        if (ModuleInitializer.a(this)) {
            this.c = vna.a(this.b);
            if (this.a == null) {
                this.a = tcn.c(this);
            }
            this.e = new vox(this.c);
            this.f = new voy(this.c);
            this.a.a(this.e, 0);
            vts vts = this.a;
            voy voy = this.f;
            vts.a((vtx) voy, (vsh) voy, 0);
        }
        ((anih) vvj.a.d()).a("ReceiveSurfaceService created");
    }

    public final void onDestroy() {
        vwy[] vwyArr = this.d;
        int length = vwyArr.length;
        for (int i = 0; i < 6; i++) {
            vwyArr[i].c();
        }
        if (ModuleInitializer.a(this)) {
            this.c.b();
            this.a.a((vtx) this.e);
            this.a.b((vtx) this.f);
        }
        ((anih) vvj.a.d()).a("ReceiveSurfaceService destroyed");
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        vwy[] vwyArr = this.d;
        int length = vwyArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < 6; i3++) {
            vwy vwy = vwyArr[i3];
            if (!vwy.b) {
                vwy.c();
            } else if (!vwy.d) {
                vwz[] vwzArr = vwy.c;
                for (int i4 = 0; i4 < 2; i4++) {
                    vwz vwz = vwzArr[i4];
                    vwz.b = new Precondition$1("nearby", new vwx(vwy));
                    vwz.a.registerReceiver(vwz.b, vwz.b());
                }
                vwy.d = true;
                jjg jjg = vvj.a;
                vwy.e();
                z = true;
            } else {
                jjg jjg2 = vvj.a;
                z = true;
            }
        }
        if (!z && !ModuleInitializer.a(this)) {
            stopSelf();
        }
        ((anih) vvj.a.d()).a("ReceiveSurfaceService started");
        return 1;
    }
}
