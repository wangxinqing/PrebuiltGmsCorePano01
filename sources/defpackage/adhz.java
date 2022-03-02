package defpackage;

import android.os.RecoverySystem;
import android.util.Log;
import com.google.android.gms.update.ChimeraUpdateFromSdCardService;
import java.io.File;
import java.io.IOException;

/* renamed from: adhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adhz extends Thread {
    final /* synthetic */ ChimeraUpdateFromSdCardService a;

    public adhz(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService) {
        this.a = chimeraUpdateFromSdCardService;
    }

    public final void run() {
        try {
            Log.i("CmaUpdateFromSdCardS", "calling install package on recovery.");
            ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.a;
            int i = ChimeraUpdateFromSdCardService.d;
            File file = chimeraUpdateFromSdCardService.c;
            RecoverySystem.installPackage(chimeraUpdateFromSdCardService, (File) null);
        } catch (IOException e) {
            Log.e("CmaUpdateFromSdCardS", "exception trying to install package", e);
        }
        Log.e("CmaUpdateFromSdCardS", "reboot to install failed");
    }
}
