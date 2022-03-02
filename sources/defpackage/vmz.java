package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmz implements Runnable {
    private final vna a;
    private final int b;
    private final ShareTarget c;

    public vmz(vna vna, int i, ShareTarget shareTarget) {
        this.a = vna;
        this.b = i;
        this.c = shareTarget;
    }

    public final void run() {
        vna vna = this.a;
        int i = this.b;
        ShareTarget shareTarget = this.c;
        vna.b.a("nearby_sharing", i);
        thp.a(vna.a, new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", i));
    }
}
