package defpackage;

import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;

/* renamed from: uer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uer implements ufq {
    private final long a;

    public uer(long j) {
        this.a = j;
    }

    public final void a(ueq ueq, idg idg) {
        long j = this.a;
        int i = ufu.b;
        udr udr = new udr();
        uen uen = new uen(idg);
        CancelPayloadParams cancelPayloadParams = udr.a;
        cancelPayloadParams.a = uen;
        cancelPayloadParams.b = j;
        ((ugu) ueq.x()).a(cancelPayloadParams);
    }
}
