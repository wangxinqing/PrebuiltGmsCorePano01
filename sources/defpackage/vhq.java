package defpackage;

import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: vhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vhq implements acvv {
    private final ConsentsChimeraActivity a;

    public vhq(ConsentsChimeraActivity consentsChimeraActivity) {
        this.a = consentsChimeraActivity;
    }

    public final void a(Object obj) {
        ConsentsChimeraActivity consentsChimeraActivity = this.a;
        if (((Boolean) obj).booleanValue()) {
            ((anih) vvj.a.d()).a("Successfully enabled device contacts.");
            consentsChimeraActivity.setResult(-1);
            consentsChimeraActivity.finishAfterTransition();
            return;
        }
        ((anih) vvj.a.c()).a("Unable to enable device contacts.");
        consentsChimeraActivity.h();
    }
}
