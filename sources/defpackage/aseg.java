package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: aseg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aseg extends asgv {
    final /* synthetic */ asgs a;

    public aseg(asgs asgs) {
        this.a = asgs;
    }

    public final void a(OperationStatus operationStatus) {
        asgs asgs = this.a;
        asfk asfk = operationStatus.b.c;
        if (asfk == null) {
            asfk = asfk.g;
        }
        asgs.a(asfk);
    }
}
