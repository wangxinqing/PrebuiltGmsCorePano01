package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

@Deprecated
/* renamed from: tje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tje {
    public final PayloadTransferUpdate a;

    public tje() {
        this.a = new PayloadTransferUpdate();
    }

    public final void a(int i) {
        this.a.b = i;
    }

    public final void a(long j) {
        this.a.d = j;
    }

    public final void b(long j) {
        this.a.a = j;
    }

    public final void c(long j) {
        this.a.c = j;
    }

    public tje(PayloadTransferUpdate payloadTransferUpdate) {
        PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate();
        this.a = payloadTransferUpdate2;
        payloadTransferUpdate2.a = payloadTransferUpdate.a;
        payloadTransferUpdate2.b = payloadTransferUpdate.b;
        payloadTransferUpdate2.c = payloadTransferUpdate.c;
        payloadTransferUpdate2.d = payloadTransferUpdate.d;
    }
}
