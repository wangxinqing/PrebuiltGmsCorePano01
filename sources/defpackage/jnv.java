package defpackage;

import com.google.android.gms.config.ConfigChimeraService;

/* renamed from: jnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jnv implements Runnable {
    final /* synthetic */ ConfigChimeraService a;

    public jnv(ConfigChimeraService configChimeraService) {
        this.a = configChimeraService;
    }

    public final void run() {
        this.a.a();
        synchronized (this.a.j) {
            ConfigChimeraService configChimeraService = this.a;
            configChimeraService.i = false;
            configChimeraService.j.notifyAll();
        }
    }
}
