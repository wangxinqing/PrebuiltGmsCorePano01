package defpackage;

import android.view.View;

/* renamed from: gos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gos implements View.OnClickListener {
    private final fzb a;

    public gos(fzb fzb) {
        this.a = fzb;
    }

    public void onClick(View view) {
        fzb fzb = this.a;
        gqa.d.b("onNativeSecondaryActionHit", new Object[0]);
        ((gqa) fzb).f("window.nativeSecondaryActionHit()");
    }
}
