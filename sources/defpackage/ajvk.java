package defpackage;

import android.view.View;

/* renamed from: ajvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvk implements View.OnClickListener {
    final /* synthetic */ ajvl a;

    public ajvk(ajvl ajvl) {
        this.a = ajvl;
    }

    public void onClick(View view) {
        this.a.aj.toggle();
        ajvl ajvl = this.a;
        ajvl.a(ajvl.aj);
        this.a.k();
    }
}
