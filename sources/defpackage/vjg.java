package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ModuleInitializer;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vjg implements Runnable {
    private final NearbySharingChimeraService a;
    private final int b;
    private final int c;
    private final vwg d;

    public vjg(NearbySharingChimeraService nearbySharingChimeraService, int i, int i2, vwg vwg) {
        this.a = nearbySharingChimeraService;
        this.b = i;
        this.c = i2;
        this.d = vwg;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        int i = this.b;
        int i2 = this.c;
        vwg vwg = this.d;
        if (i == 0 && nearbySharingChimeraService.u()) {
            jjg jjg = vvj.a;
            boolean z = false;
            if (!vwg.CLOSE.equals(vwg) || i2 != 0) {
                nearbySharingChimeraService.p.a();
            } else if (!ayni.a.a().H() || !ModuleInitializer.b(nearbySharingChimeraService)) {
                vna vna = nearbySharingChimeraService.p;
                boolean j = nearbySharingChimeraService.j();
                boolean k = nearbySharingChimeraService.k();
                if (ayni.a.a().Y()) {
                    vwj vwj = vna.c;
                    if (vwj.a.a() - vwj.c().getLong("most_recent_notification_dismissed_timestamp", 0) < ayni.u()) {
                        ((anih) ((anih) vvj.a.d()).a("vwj", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Not showing fast init notifications: the user recently dismissed the notification.");
                    } else if (j ? k : !vwj.c().getBoolean("dont_show_notification_again", false)) {
                        tgx tgx = new tgx(vna.a, "nearby_sharing_alert");
                        tgx.j();
                        tgx.b(whr.b(kf.a(vna.a, (int) R.drawable.sharing_ic_launcher)));
                        tgx.g(vna.a.getString(R.string.sharing_notification_onboarding_title));
                        tgx.f(vna.a.getText(R.string.sharing_notification_onboarding_description));
                        Intent addFlags = new Intent().setClassName(vna.a, "com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity").addFlags(268435456).addFlags(32768);
                        addFlags.putExtra("is_from_fast_init", true);
                        tgx.f = PendingIntent.getActivity(vna.a, 1001, addFlags, 134217728);
                        tgx.h();
                        tgx.j = 2;
                        tgx.s = "msg";
                        tgx.d(PendingIntent.getBroadcast(vna.a, 1006, new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(vna.a.getPackageName()).putExtra("channel_id", "nearby_sharing_alert"), 134217728));
                        tgx.k = false;
                        tgx.g();
                        tgx.d(true);
                        tgx.u = wid.a(vna.a);
                        tgx.q = "nearby_sharing";
                        tgx.a(vna.a.getString(R.string.sharing_product_name));
                        vna.a(tgx);
                        vna.a("nearby_sharing", 3, tgx.b());
                    }
                    ((anih) vvj.a.d()).a("Not showing heads up notification: notifications are currently blacklisted by the user.");
                }
                vva vva = nearbySharingChimeraService.r;
                aucd d2 = vvb.d(11);
                asln asln = asln.a;
                if (d2.c) {
                    d2.c();
                    d2.c = false;
                }
                asmc asmc = (asmc) d2.b;
                asmc asmc2 = asmc.B;
                asln.getClass();
                asmc.l = asln;
                asmc.a |= 2048;
                vva.a(new vut((asmc) d2.i()));
            }
            if (vwg.CLOSE == vwg || vwg.FAR == vwg) {
                z = true;
            }
            nearbySharingChimeraService.n = z;
            nearbySharingChimeraService.i();
        }
    }
}
