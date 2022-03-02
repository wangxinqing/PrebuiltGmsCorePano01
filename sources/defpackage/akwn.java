package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: akwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akwn implements acvp {
    private final akwo a;

    public akwn(akwo akwo) {
        this.a = akwo;
    }

    public final void a(acwa acwa) {
        akwo akwo = this.a;
        if (acwa.b()) {
            akwo.b(Status.a);
        } else {
            akwo.b(Status.c);
        }
    }
}
