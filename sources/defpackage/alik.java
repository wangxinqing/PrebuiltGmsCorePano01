package defpackage;

import android.view.View;

/* renamed from: alik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alik implements View.OnClickListener {
    final /* synthetic */ alij a;
    final /* synthetic */ alin b;

    public alik(alin alin, alij alij) {
        this.b = alin;
        this.a = alij;
    }

    public void onClick(View view) {
        alid alid = this.a.t;
        if (this.b.f != null && alid != null && alid.d()) {
            alil alil = this.b.f;
            if (alid instanceof aclx) {
                acly acly = (acly) alil;
                acly.b.a(((aclx) alid).a, acly.f.a(), false);
                return;
            }
            acly.a.e("Unknown item in the target devices list, type: %s.", alid.getClass().getSimpleName());
        }
    }
}
