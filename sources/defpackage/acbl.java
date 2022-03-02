package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: acbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbl implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ PayloadTransferUpdate b;
    final /* synthetic */ acbm c;

    public acbl(acbm acbm, String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.c = acbm;
        this.a = str;
        this.b = payloadTransferUpdate;
    }

    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
