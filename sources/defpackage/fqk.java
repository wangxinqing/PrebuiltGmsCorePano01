package defpackage;

import com.google.android.gms.auth.api.credentials.yolo.ui.AutoSignInWarmWelcomeChimeraService;

/* renamed from: fqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fqk implements Runnable {
    private final AutoSignInWarmWelcomeChimeraService a;

    public fqk(AutoSignInWarmWelcomeChimeraService autoSignInWarmWelcomeChimeraService) {
        this.a = autoSignInWarmWelcomeChimeraService;
    }

    public final void run() {
        jml jml = this.a.a;
        synchronized (jml) {
            jml.c();
        }
        jml.d();
    }
}
