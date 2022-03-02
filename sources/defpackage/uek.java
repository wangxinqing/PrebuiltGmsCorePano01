package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: uek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uek extends ueh {
    final /* synthetic */ String a;
    final /* synthetic */ PayloadTransferUpdate b;

    public uek(String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.a = str;
        this.b = payloadTransferUpdate;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.a;
        tje tje = new tje(this.b);
        tje.a(2);
        ((tjd) obj).a(str, tje.a);
    }
}
