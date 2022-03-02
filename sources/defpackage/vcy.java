package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;

/* renamed from: vcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vcy implements vdh {
    private final PendingIntent a;
    private final vdj b;
    private final uyo c;

    public vcy(PendingIntent pendingIntent, vdj vdj, uyo uyo) {
        this.a = pendingIntent;
        this.b = vdj;
        this.c = uyo;
    }

    public final void a(vcv vcv, ige ige) {
        PendingIntent pendingIntent = this.a;
        vdj vdj = this.b;
        uyo uyo = this.c;
        ((vcl) vcv.x()).a(new SubscribeRequest((IBinder) null, uyo.a, new vch(ige), uyo.b, pendingIntent, (byte[]) null, vdj, uyo.d, uyo.e, vcv.u.e));
    }
}
