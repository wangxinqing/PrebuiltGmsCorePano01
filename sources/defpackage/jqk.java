package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: jqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqk implements jsw {
    private final View a;
    private final int b;

    public jqk(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final void a(amri amri) {
        View view = this.a;
        int i = this.b;
        if (amri.a()) {
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageBitmap(Bitmap.createScaledBitmap((Bitmap) amri.b(), i, i, false));
            imageView.setVisibility(0);
        }
    }
}
