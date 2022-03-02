package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import org.chromium.net.UrlRequest;

/* renamed from: voy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class voy implements vtx, vsh {
    private final vna a;

    public voy(vna vna) {
        this.a = vna;
    }

    public final void a(ShareTarget shareTarget) {
    }

    public final void a(ShareTarget shareTarget, int i) {
    }

    public final void b(ShareTarget shareTarget) {
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        ShareTarget shareTarget2 = shareTarget;
        TransferMetadata transferMetadata2 = transferMetadata;
        switch (transferMetadata2.a) {
            case 1:
                vna vna = this.a;
                int a2 = vna.a(2, shareTarget2);
                tgx tgx = new tgx(vna.a, "nearby_sharing_file");
                tgx.j();
                tgx.b(whr.b(new vwp(vna.a, shareTarget2)));
                tgx.g(shareTarget2.b);
                tgx.f(vna.a.getText(R.string.sharing_notification_outgoing_connecting_description));
                tgx.f = vna.c(shareTarget2, transferMetadata2);
                tgx.h();
                tgx.j = 2;
                tgx.s = "msg";
                tgx.i();
                tgx.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, vna.a.getText(R.string.sharing_action_cancel), PendingIntent.getBroadcast(vna.a, vna.a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(vna.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a2), 134217728));
                tgx.u = wid.a(vna.a);
                tgx.q = "nearby_sharing";
                tgx.a(vna.a.getString(R.string.sharing_product_name));
                vna.c(shareTarget2);
                tgx.f();
                vna.a(tgx);
                vna.a("nearby_sharing", a2, tgx.b());
                return;
            case 2:
                vna vna2 = this.a;
                int a3 = vna.a(2, shareTarget2);
                tgx tgx2 = new tgx(vna2.a, "nearby_sharing_file");
                tgx2.b((jh) new jd());
                tgx2.j();
                tgx2.b(whr.b(new vwp(vna2.a, shareTarget2)));
                tgx2.g(shareTarget2.b);
                tgx2.f = vna2.c(shareTarget2, transferMetadata2);
                tgx2.f(wig.a(vna2.a, (CharSequence) transferMetadata2.c));
                tgx2.h();
                tgx2.j = 2;
                tgx2.s = "msg";
                tgx2.i();
                tgx2.d(true);
                tgx2.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, vna2.a.getText(R.string.sharing_action_cancel), PendingIntent.getBroadcast(vna2.a, vna.a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(vna2.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
                if (!amrk.a(transferMetadata2.c)) {
                    tgx2.a(R.drawable.quantum_gm_ic_done_vd_theme_24, vna2.a.getText(R.string.sharing_action_send), PendingIntent.getBroadcast(vna2.a, vna.a(1002, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_ACCEPT").setPackage(vna2.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
                }
                tgx2.u = wid.a(vna2.a);
                tgx2.q = "nearby_sharing";
                tgx2.a(vna2.a.getString(R.string.sharing_product_name));
                vna2.c(shareTarget2);
                tgx2.f();
                vna2.a(tgx2);
                vna2.a("nearby_sharing", a3, tgx2.b());
                return;
            case 3:
                vna vna3 = this.a;
                int a4 = vna.a(2, shareTarget2);
                tgx tgx3 = new tgx(vna3.a, "nearby_sharing_file");
                tgx3.b((jh) new jd());
                tgx3.j();
                tgx3.b(whr.b(new vwp(vna3.a, shareTarget2)));
                tgx3.g(shareTarget2.b);
                tgx3.f = vna3.c(shareTarget2, transferMetadata2);
                tgx3.f(wig.a(vna3.a, (CharSequence) transferMetadata2.c));
                tgx3.h();
                tgx3.j = 2;
                tgx3.s = "msg";
                tgx3.i();
                tgx3.d(true);
                tgx3.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, vna3.a.getText(R.string.sharing_action_cancel), PendingIntent.getBroadcast(vna3.a, vna.a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(vna3.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a4), 134217728));
                tgx3.u = wid.a(vna3.a);
                tgx3.q = "nearby_sharing";
                tgx3.a(vna3.a.getString(R.string.sharing_product_name));
                vna3.c(shareTarget2);
                tgx3.f();
                vna3.a(tgx3);
                vna3.a("nearby_sharing", a4, tgx3.b());
                return;
            case 4:
            case 8:
            case 9:
            case Service.START_CONTINUATION_MASK:
                this.a.b(shareTarget2);
                return;
            case 5:
                vna vna4 = this.a;
                int a5 = vna.a(2, shareTarget2);
                tgx tgx4 = new tgx(vna4.a, "nearby_sharing_file");
                tgx4.j();
                tgx4.b(whr.b(new vwp(vna4.a, shareTarget2)));
                tgx4.g(shareTarget2.b);
                Context context = vna4.a;
                int a6 = wig.a(shareTarget);
                int size = shareTarget.b().size();
                vt vtVar = (vt) context;
                String quantityString = vtVar.a().getQuantityString(a6, size);
                tgx4.f(vtVar.a().getString(R.string.sharing_notification_outgoing_in_progress_file, new Object[]{Integer.valueOf(size), quantityString}));
                tgx4.f = vna4.c(shareTarget2, transferMetadata2);
                tgx4.d(PendingIntent.getBroadcast(vna4.a, vna.a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(vna4.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a5), 134217728));
                tgx4.h();
                tgx4.j = 2;
                tgx4.s = "msg";
                tgx4.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, vna4.a.getText(R.string.sharing_action_cancel), PendingIntent.getBroadcast(vna4.a, vna.a(1007, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(vna4.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a5), 134217728));
                tgx4.u = wid.a(vna4.a);
                tgx4.c((int) (transferMetadata2.b * 100.0f));
                tgx4.i();
                tgx4.d(true);
                tgx4.q = "nearby_sharing";
                tgx4.a(vna4.a.getString(R.string.sharing_product_name));
                vna4.c(shareTarget2);
                tgx4.f();
                vna4.a(tgx4);
                vna4.a("nearby_sharing", a5, tgx4.b());
                return;
            case 6:
                vna vna5 = this.a;
                int a7 = vna.a(2, shareTarget2);
                tgx tgx5 = new tgx(vna5.a, "nearby_sharing_file");
                tgx5.j();
                tgx5.b(whr.b(new vwp(vna5.a, shareTarget2)));
                tgx5.g(shareTarget2.b);
                Context context2 = vna5.a;
                int a8 = wig.a(shareTarget);
                int size2 = shareTarget.b().size();
                vt vtVar2 = (vt) context2;
                String quantityString2 = vtVar2.a().getQuantityString(a8, size2);
                tgx5.f(vtVar2.a().getString(R.string.sharing_notification_outgoing_complete_file, new Object[]{Integer.valueOf(size2), quantityString2}));
                tgx5.f = vna5.c(shareTarget2, transferMetadata2);
                tgx5.h();
                tgx5.j = 2;
                tgx5.s = "msg";
                tgx5.u = wid.a(vna5.a);
                tgx5.d(true);
                tgx5.q = "nearby_sharing";
                tgx5.a(vna5.a.getString(R.string.sharing_product_name));
                vna5.c(shareTarget2);
                tgx5.f();
                vna5.a(tgx5);
                vna5.a("nearby_sharing", a7, tgx5.b());
                vna5.b(a7, shareTarget2);
                return;
            case 7:
            case 10:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                vna vna6 = this.a;
                int a9 = vna.a(2, shareTarget2);
                tgx tgx6 = new tgx(vna6.a, "nearby_sharing_file");
                tgx6.j();
                tgx6.b(whr.b(new vwp(vna6.a, shareTarget2)));
                tgx6.g(shareTarget2.b);
                tgx6.f(vna6.a.getString(R.string.sharing_notification_outgoing_failed_description));
                tgx6.f = vna6.c(shareTarget2, transferMetadata2);
                tgx6.d(PendingIntent.getBroadcast(vna6.a, vna.a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(vna6.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a9), 134217728));
                tgx6.h();
                tgx6.j = 2;
                tgx6.s = "msg";
                tgx6.u = wid.a(vna6.a);
                tgx6.d(true);
                tgx6.q = "nearby_sharing";
                tgx6.a(vna6.a.getString(R.string.sharing_product_name));
                vna6.c(shareTarget2);
                tgx6.f();
                vna6.a(tgx6);
                vna6.a("nearby_sharing", a9, tgx6.b());
                vna6.b(a9, shareTarget2);
                return;
            default:
                if (ayni.g() && transferMetadata2.e) {
                    this.a.a(shareTarget2, transferMetadata2);
                    return;
                }
                return;
        }
    }
}
