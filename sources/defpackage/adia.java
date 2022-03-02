package defpackage;

import com.google.android.gms.update.ChimeraUpdateFromSdCardService;

/* renamed from: adia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adia implements Runnable {
    final /* synthetic */ ChimeraUpdateFromSdCardService a;

    public adia(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService) {
        this.a = chimeraUpdateFromSdCardService;
    }

    public final void run() {
        ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.a;
        int i = chimeraUpdateFromSdCardService.a.b;
        int i2 = chimeraUpdateFromSdCardService.b;
        if (this.a.b == 4 || this.a.b == 1040) {
            if (i == 0) {
                this.a.b = 4;
            } else if (i == 2 || i == 1) {
                this.a.b = 1040;
            }
        }
        if (i2 != this.a.b) {
            this.a.a();
        }
    }
}
