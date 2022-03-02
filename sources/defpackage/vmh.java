package defpackage;

import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: vmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmh implements Runnable {
    private final vmi a;
    private final OnShareTargetLostParams b;
    private final vsh c;

    public vmh(vmi vmi, OnShareTargetLostParams onShareTargetLostParams, vsh vsh) {
        this.a = vmi;
        this.b = onShareTargetLostParams;
        this.c = vsh;
    }

    public final void run() {
        vmi vmi = this.a;
        OnShareTargetLostParams onShareTargetLostParams = this.b;
        vsh vsh = this.c;
        vmi.b.b.c.w.c(onShareTargetLostParams.a);
        vsh.b(onShareTargetLostParams.a);
    }
}
