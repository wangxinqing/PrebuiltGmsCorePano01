package defpackage;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asef extends asgv {
    final /* synthetic */ asgs a;

    public asef(asgs asgs) {
        this.a = asgs;
    }

    public final void a(OperationStatus operationStatus) {
        asgs asgs = this.a;
        asgl asgl = operationStatus.b.d;
        if (asgl == null) {
            asgl = asgl.c;
        }
        asgs.a(asgl);
    }
}
