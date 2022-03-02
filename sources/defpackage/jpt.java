package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: jpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jpt implements jsw {
    private final jpz a;
    private final int b;
    private final TextView c;

    public jpt(jpz jpz, int i, TextView textView) {
        this.a = jpz;
        this.b = i;
        this.c = textView;
    }

    public final void a(amri amri) {
        jpz jpz = this.a;
        int i = this.b;
        TextView textView = this.c;
        if (amri.a()) {
            ry.a(textView, new BitmapDrawable(jpz.c.getContext().getResources(), Bitmap.createScaledBitmap((Bitmap) amri.b(), i, i, false)), (Drawable) null);
        }
    }
}
