package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asee extends asgv {
    final /* synthetic */ asgs a;

    public asee(asgs asgs) {
        this.a = asgs;
    }

    public final void a(OperationStatus operationStatus) {
        asgs asgs = this.a;
        asem asem = operationStatus.b.g;
        if (asem == null) {
            asem = asem.e;
        }
        asgs.a(asem);
    }
}
