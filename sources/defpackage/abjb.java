package defpackage;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: abjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjb implements jsw {
    private final ViewGroup a;

    public abjb(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(amri amri) {
        ViewGroup viewGroup = this.a;
        if (amri.a()) {
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.image);
            imageView.setVisibility(0);
            imageView.setImageBitmap((Bitmap) amri.b());
        }
    }
}
