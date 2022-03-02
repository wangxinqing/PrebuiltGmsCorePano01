package defpackage;

import android.view.View;

/* renamed from: ajvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvc implements View.OnClickListener {
    final /* synthetic */ ajvf a;

    public ajvc(ajvf ajvf) {
        this.a = ajvf;
    }

    public void onClick(View view) {
        ajvf ajvf = this.a;
        int i = ajvf.h;
        if (i == 2) {
            ajvf.c(1);
        } else if (i == 1) {
            ajvf.c(2);
        }
    }
}
