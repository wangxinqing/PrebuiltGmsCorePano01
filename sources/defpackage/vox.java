package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import org.chromium.net.UrlRequest;

/* renamed from: vox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vox implements vtx {
    private final vna a;

    public vox(vna vna) {
        this.a = vna;
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        CharSequence charSequence;
        ShareTarget shareTarget2 = shareTarget;
        TransferMetadata transferMetadata2 = transferMetadata;
        switch (transferMetadata2.a) {
            case 2:
                this.a.a(shareTarget2, transferMetadata2, transferMetadata2.d);
                return;
            case 3:
                vna vna = this.a;
                if (TextUtils.isEmpty(transferMetadata2.c)) {
                    charSequence = wig.a(vna.a, shareTarget2);
                } else {
                    charSequence = wig.a(vna.a, shareTarget2, transferMetadata2.c);
                }
                int a2 = vna.a(1, shareTarget2);
                tgx tgx = new tgx(vna.a, "nearby_sharing_file");
                tgx.b((jh) new jd());
                tgx.j();
                tgx.b(whr.b(new vwp(vna.a, shareTarget2)));
                tgx.g(shareTarget2.b);
                tgx.f(charSequence);
                tgx.f = vna.b(shareTarget2, transferMetadata2);
                tgx.d(PendingIntent.getBroadcast(vna.a, vna.a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(vna.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a2), 134217728));
                tgx.h();
                tgx.j = 2;
                tgx.s = "msg";
                tgx.i();
                tgx.d(true);
                tgx.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, vna.a.getText(R.string.sharing_action_reject), PendingIntent.getBroadcast(vna.a, vna.a(1003, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_REJECT").setPackage(vna.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a2), 134217728));
                tgx.u = wid.a(vna.a);
                tgx.q = "nearby_sharing";
                tgx.a(vna.a.getString(R.string.sharing_product_name));
                vna.c(shareTarget2);
                tgx.f();
                vna.a(tgx);
                vna.a("nearby_sharing", a2, tgx.b());
                return;
            case 4:
            case 8:
            case 9:
            case Service.START_CONTINUATION_MASK:
                this.a.a(shareTarget2);
                return;
            case 5:
                vna vna2 = this.a;
                int a3 = vna.a(1, shareTarget2);
                tgx tgx2 = new tgx(vna2.a, "nearby_sharing_file");
                tgx2.j();
                tgx2.b(whr.b(new vwp(vna2.a, shareTarget2)));
                tgx2.g(shareTarget2.b);
                tgx2.f(wig.a(vna2.a, shareTarget2));
                tgx2.f = vna2.b(shareTarget2, transferMetadata2);
                tgx2.d(PendingIntent.getBroadcast(vna2.a, vna.a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(vna2.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
                tgx2.h();
                tgx2.j = 2;
                tgx2.s = "msg";
                tgx2.a(R.drawable.quantum_gm_ic_clear_vd_theme_24, vna2.a.getText(R.string.sharing_action_cancel), PendingIntent.getBroadcast(vna2.a, vna.a(1004, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_CANCEL").setPackage(vna2.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a3), 134217728));
                tgx2.u = wid.a(vna2.a);
                tgx2.c((int) (transferMetadata2.b * 100.0f));
                tgx2.i();
                tgx2.d(true);
                tgx2.q = "nearby_sharing";
                tgx2.a(vna2.a.getString(R.string.sharing_product_name));
                vna2.c(shareTarget2);
                tgx2.f();
                vna2.a(tgx2);
                vna2.a("nearby_sharing", a3, tgx2.b());
                return;
            case 6:
                vna vna3 = this.a;
                int a4 = vna.a(1, shareTarget2);
                tgx tgx3 = new tgx(vna3.a, "nearby_sharing_file");
                tgx3.j();
                tgx3.b(whr.b(new vwp(vna3.a, shareTarget2)));
                tgx3.g(shareTarget2.b);
                Context context = vna3.a;
                int a5 = wig.a(shareTarget);
                int size = shareTarget.b().size();
                vt vtVar = (vt) context;
                String quantityString = vtVar.a().getQuantityString(a5, size);
                tgx3.f(vtVar.a().getString(R.string.sharing_notification_incoming_complete_file, new Object[]{Integer.valueOf(size), quantityString}));
                tgx3.f = PendingIntent.getBroadcast(vna3.a, vna.a(1005, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_OPEN").setPackage(vna3.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a4), 134217728);
                tgx3.d(PendingIntent.getBroadcast(vna3.a, vna.a(1006, shareTarget2), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(vna3.a.getPackageName()).putExtra("share_target_bytes", ivy.a(shareTarget)).putExtra("notification_id", a4), 134217728));
                tgx3.h();
                tgx3.j = 2;
                tgx3.s = "msg";
                tgx3.u = wid.a(vna3.a);
                tgx3.d(false);
                tgx3.q = "nearby_sharing";
                tgx3.a(vna3.a.getString(R.string.sharing_product_name));
                vna3.c(shareTarget2);
                tgx3.f();
                vna3.a(tgx3);
                vna3.a("nearby_sharing", a4, tgx3.b());
                return;
            case 7:
            case 10:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                this.a.a(shareTarget2, transferMetadata2);
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
