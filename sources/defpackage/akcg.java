package defpackage;

import android.view.View;

/* renamed from: akcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcg implements View.OnFocusChangeListener {
    final /* synthetic */ akck a;

    public akcg(akck akck) {
        this.a = akck;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.k.l.setActivated(z);
        if (!z) {
            this.a.b(false);
            this.a.c = false;
        }
    }
}
