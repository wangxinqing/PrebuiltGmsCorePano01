package defpackage;

import android.view.View;

/* renamed from: gfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gfx implements View.OnClickListener {
    final /* synthetic */ ggc a;

    public gfx(ggc ggc) {
        this.a = ggc;
    }

    public void onClick(View view) {
        this.a.setResult(0);
        this.a.finish();
    }
}
