package defpackage;

import android.app.PendingIntent;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: abzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzf implements Callable {
    final /* synthetic */ BootstrapProgressResult a;
    final /* synthetic */ abxm b;

    public abzf(abxm abxm, BootstrapProgressResult bootstrapProgressResult) {
        this.b = abxm;
        this.a = bootstrapProgressResult;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        abtb abtb = this.b.a;
        BootstrapProgressResult bootstrapProgressResult = this.a;
        abtb abtb2 = ((abtx) abtb).a;
        acdr.a.a("TargetBootstrapListener.onProgress()", new Object[0]);
        acdo acdo = (acdo) abtb2;
        acdr acdr = acdo.a;
        acdr.e = bootstrapProgressResult.b;
        ArrayList parcelableArrayList = acdr.e.getParcelableArrayList("accounts");
        int i = bootstrapProgressResult.a;
        if (i == 1) {
            PendingIntent pendingIntent = (PendingIntent) acdo.a.e.getParcelable("pendingIntent");
            if (pendingIntent != null) {
                acdr acdr2 = acdo.a;
                acdr2.k.a((Fragment) acdr2, pendingIntent);
            } else {
                acdr acdr3 = acdo.a;
                acdr3.h = true;
                if (parcelableArrayList != null) {
                    acdr3.i.a(10, parcelableArrayList.size());
                }
            }
        } else if (i == 2) {
            acdr.a.a("Wifi setup", new Object[0]);
        } else if (i == 3) {
            acdo.a.j = true;
        } else if (i == 4) {
            acdr acdr4 = acdo.a;
            boolean z = acdr4.j;
            if (!z && parcelableArrayList != null) {
                acdr4.i.a(9, parcelableArrayList.size());
            } else if (z && parcelableArrayList != null) {
                acdr4.i.a(11, parcelableArrayList.size());
            }
        } else if (i == 5) {
            acdo.a.i.a(7);
        } else if (i != 7) {
            acdr.a.a("Unknown progress event", new Object[0]);
        } else {
            acdo.a.i.a(12);
        }
        return false;
    }
}
