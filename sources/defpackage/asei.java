package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asei extends asgv {
    final /* synthetic */ asgs a;

    public asei(asgs asgs) {
        this.a = asgs;
    }

    public final void a(OperationStatus operationStatus) {
        asgs asgs = this.a;
        asgh asgh = operationStatus.b.f;
        if (asgh == null) {
            asgh = asgh.d;
        }
        asgs.a(asgh);
    }
}
