package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: acdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acdq implements Runnable {
    final /* synthetic */ Activity a;
    final /* synthetic */ acdr b;

    public acdq(acdr acdr, Activity activity) {
        this.b = acdr;
        this.a = activity;
    }

    public final void run() {
        jje jje = this.b.l;
        if (jje != null) {
            jje.a((TargetChimeraActivity) this.a);
        }
    }
}
