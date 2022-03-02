package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: aseh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aseh extends asgv {
    final /* synthetic */ asgs a;

    public aseh(asgs asgs) {
        this.a = asgs;
    }

    public final void a(OperationStatus operationStatus) {
        asgs asgs = this.a;
        aseq aseq = operationStatus.b.e;
        if (aseq == null) {
            aseq = aseq.c;
        }
        asgs.a(aseq);
    }
}
