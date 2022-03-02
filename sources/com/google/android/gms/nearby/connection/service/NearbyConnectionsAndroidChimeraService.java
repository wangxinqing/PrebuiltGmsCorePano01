package com.google.android.gms.nearby.connection.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyConnectionsAndroidChimeraService extends Service {
    private tkd a;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        tkd tkd = this.a;
        if (tkd != null) {
            tkd.dump(fileDescriptor, printWriter, strArr);
        }
        printWriter.flush();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.nearby.connection.service.START".equals(intent.getAction())) {
            return null;
        }
        jjg jjg = tky.a;
        if (this.a == null) {
            this.a = new tkd(this);
        }
        return this.a;
    }

    public final boolean onUnbind(Intent intent) {
        tkd tkd = this.a;
        if (tkd == null) {
            return false;
        }
        tkd.b.a.a();
        tku tku = tkd.a;
        ((anih) ((anih) tky.a.d()).a("tku", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of ServiceControllerRouter %s.", (Object) tku);
        tku.a((Runnable) new tke(tku));
        tid.a(tku.b, "ServiceControllerRouter.offBinderSerializer");
        this.a = null;
        return false;
    }
}
