package defpackage;

import android.view.View;
import android.widget.ImageView;

/* renamed from: ajsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajsy implements View.OnLayoutChangeListener {
    final /* synthetic */ ajsz a;

    public ajsy(ajsz ajsz) {
        this.a = ajsz;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.a.getVisibility() == 0) {
            ajsz ajsz = this.a;
            ImageView imageView = ajsz.a;
            if (ajsz.c()) {
                ajss ajss = ajsz.d;
                ajsz.a((View) imageView);
                ajst.b(ajss, imageView);
            }
        }
    }
}
