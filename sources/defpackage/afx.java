package defpackage;

/* renamed from: afx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afx implements ah {
    final /* synthetic */ afz a;

    public afx(afz afz) {
        this.a = afz;
    }

    public final void a(aj ajVar, ac acVar) {
        if (acVar == ac.ON_DESTROY && !this.a.isChangingConfigurations()) {
            this.a.getViewModelStore().a();
        }
    }
}
