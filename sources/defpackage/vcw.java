package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import java.lang.ref.WeakReference;

/* renamed from: vcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vcw implements vdh {
    private final vdk a;
    private final ige b;
    private final vdj c;
    private final uyo d;

    public vcw(vdk vdk, ige ige, vdj vdj, uyo uyo) {
        this.a = vdk;
        this.b = ige;
        this.c = vdj;
        this.d = uyo;
    }

    public final void a(vcv vcv, ige ige) {
        vdk vdk = this.a;
        ige ige2 = this.b;
        vdj vdj = this.c;
        uyo uyo = this.d;
        int i = vdk.a;
        igc igc = ige2.b;
        if (igc != null) {
            if (!vcv.a.a(igc)) {
                vcv.a.a.put(igc, new WeakReference(new vce(ige2)));
            }
            ((vcl) vcv.x()).a(new SubscribeRequest((IBinder) vcv.a.b(igc), uyo.a, new vch(ige), uyo.b, (PendingIntent) null, vdj, uyo.d, i));
        }
    }
}
