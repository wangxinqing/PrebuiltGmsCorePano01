package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: jrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrj implements jsw {
    private final jrk a;
    private final View b;

    public jrj(jrk jrk, View view) {
        this.a = jrk;
        this.b = view;
    }

    public final void a(amri amri) {
        jrk jrk = this.a;
        View view = this.b;
        if (amri.a()) {
            Bitmap a2 = jpr.a((Bitmap) amri.b(), (int) jrk.b.getResources().getDimension(R.dimen.gm_card_avatar_diameter));
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageDrawable(new BitmapDrawable(jrk.b.getResources(), a2));
            imageView.setVisibility(0);
        }
    }
}
