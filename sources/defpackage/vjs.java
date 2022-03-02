package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;

/* renamed from: vjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vjs implements vsh {
    final /* synthetic */ vsh a;
    final /* synthetic */ NearbySharingChimeraService b;

    public vjs(NearbySharingChimeraService nearbySharingChimeraService, vsh vsh) {
        this.b = nearbySharingChimeraService;
        this.a = vsh;
    }

    public final void a(ShareTarget shareTarget) {
        vsh vsh = this.a;
        NearbySharingChimeraService nearbySharingChimeraService = this.b;
        vsf vsf = new vsf();
        vsf.a = shareTarget.a;
        vsf.b = shareTarget.b;
        vsf.c = shareTarget.c;
        vsf.d = shareTarget.d;
        vsf.e = shareTarget.e;
        vsf.f = new ArrayList(shareTarget.f);
        vsf.g = new ArrayList(shareTarget.g);
        vsf.h = new ArrayList(shareTarget.h);
        vsf.i = shareTarget.i;
        vsf.j = shareTarget.j;
        vsf.k = shareTarget.k;
        vsf.l = shareTarget.l;
        vsf.m = shareTarget.m;
        vsf.n = shareTarget.n;
        vsf.m = PendingIntent.getActivity(nearbySharingChimeraService.q, 1007, new Intent().setClassName(nearbySharingChimeraService.q, "com.google.android.gms.nearby.sharing.InternalShareSheetActivity").addFlags(268435456).addFlags(32768).putExtra("direct_share_target_bytes", ivy.a(shareTarget)), 134217728);
        vsh.a(vsf.a());
    }

    public final void b(ShareTarget shareTarget) {
        this.a.b(shareTarget);
    }

    public final void a(ShareTarget shareTarget, int i) {
        this.a.a(shareTarget, i);
    }
}
