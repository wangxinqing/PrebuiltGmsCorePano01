package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vcx implements vdh {
    private final ige a;

    public vcx(ige ige) {
        this.a = ige;
    }

    public final void a(vcv vcv, ige ige) {
        ige ige2 = this.a;
        int i = vdk.b;
        igc igc = ige2.b;
        if (igc != null) {
            vch vch = new vch(ige);
            if (vcv.a.a(igc)) {
                ((vcl) vcv.x()).a(new UnsubscribeRequest((IBinder) vcv.a.b(igc), vch, (PendingIntent) null));
                vcv.a.a.remove(igc);
                return;
            }
            vch.a(new Status(0));
        }
    }
}
