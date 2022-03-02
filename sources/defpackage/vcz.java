package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vcz implements vdh {
    private final PendingIntent a;

    public vcz(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final void a(vcv vcv, ige ige) {
        PendingIntent pendingIntent = this.a;
        int i = vdk.b;
        ((vcl) vcv.x()).a(new UnsubscribeRequest((IBinder) null, new vch(ige), pendingIntent));
    }
}
