package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: akwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akwp implements acvp {
    private final akwq a;

    public akwp(akwq akwq) {
        this.a = akwq;
    }

    public final void a(acwa acwa) {
        akwq akwq = this.a;
        if (acwa.b()) {
            akwq.b(Status.a);
        } else {
            akwq.b(Status.c);
        }
    }
}
