package defpackage;

import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: vhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vhr implements acvs {
    private final ConsentsChimeraActivity a;

    public vhr(ConsentsChimeraActivity consentsChimeraActivity) {
        this.a = consentsChimeraActivity;
    }

    public final void a(Exception exc) {
        ConsentsChimeraActivity consentsChimeraActivity = this.a;
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        anih.a("Unable to enable device contacts.");
        consentsChimeraActivity.h();
    }
}
