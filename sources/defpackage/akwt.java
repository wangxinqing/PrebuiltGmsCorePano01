package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: akwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akwt implements acvp {
    private final akwu a;

    public akwt(akwu akwu) {
        this.a = akwu;
    }

    public final void a(acwa acwa) {
        akwu akwu = this.a;
        if (acwa.b()) {
            akwu.b(Status.a);
        } else {
            akwu.b(Status.c);
        }
    }
}
