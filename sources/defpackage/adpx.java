package defpackage;

import com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity;

/* renamed from: adpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpx implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ ChimeraOtaPanoSetupActivity b;

    public adpx(ChimeraOtaPanoSetupActivity chimeraOtaPanoSetupActivity, long j) {
        this.b = chimeraOtaPanoSetupActivity;
        this.a = j;
    }

    public final void run() {
        this.b.a(this.a, true);
    }
}
