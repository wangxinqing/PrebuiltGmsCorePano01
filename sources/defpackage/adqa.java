package defpackage;

import com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity;

/* renamed from: adqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqa implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ ChimeraSystemUpdatePanoActivity b;

    public adqa(ChimeraSystemUpdatePanoActivity chimeraSystemUpdatePanoActivity, long j) {
        this.b = chimeraSystemUpdatePanoActivity;
        this.a = j;
    }

    public final void run() {
        this.b.a(this.a, true);
    }
}
