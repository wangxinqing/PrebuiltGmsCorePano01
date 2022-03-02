package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fes implements aora {
    final /* synthetic */ fez a;

    public fes(fez fez) {
        this.a = fez;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        if (amri.a()) {
            this.a.o = (qcu) amri.b();
            this.a.a();
            return;
        }
        this.a.l.c(Status.a);
    }

    public final void a(Throwable th) {
        this.a.l.c(Status.e);
    }
}
