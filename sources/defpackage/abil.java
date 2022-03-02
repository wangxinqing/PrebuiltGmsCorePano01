package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: abil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abil implements jsw {
    private final abiq a;
    private final int b;
    private final TextView c;

    public abil(abiq abiq, int i, TextView textView) {
        this.a = abiq;
        this.b = i;
        this.c = textView;
    }

    public final void a(amri amri) {
        abiq abiq = this.a;
        int i = this.b;
        TextView textView = this.c;
        if (amri.a()) {
            ry.a(textView, new BitmapDrawable(abiq.a.getResources(), Bitmap.createScaledBitmap((Bitmap) amri.b(), i, i, false)), (Drawable) null);
        }
    }
}
