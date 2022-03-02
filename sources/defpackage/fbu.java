package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: fbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fbu extends fbt {
    final TextView s;

    public fbu(View view, Bitmap bitmap) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.subtitle);
        ((ImageView) view.findViewById(R.id.app_icon)).setImageBitmap(bitmap);
    }

    public final void a(pzh pzh, pzq pzq) {
        this.s.setText(pzh.c);
    }
}
