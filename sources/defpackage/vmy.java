package defpackage;

import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;

/* renamed from: vmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vmy implements acvs {
    private final NotificationChimeraBroadcastReceiver a;
    private final int b;

    public vmy(NotificationChimeraBroadcastReceiver notificationChimeraBroadcastReceiver, int i) {
        this.a = notificationChimeraBroadcastReceiver;
        this.b = i;
    }

    public final void a(Exception exc) {
        NotificationChimeraBroadcastReceiver notificationChimeraBroadcastReceiver = this.a;
        notificationChimeraBroadcastReceiver.a.a("nearby_sharing", this.b);
    }
}
