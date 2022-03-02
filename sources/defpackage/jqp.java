package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: jqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqp implements jsw {
    private final View a;

    public jqp(View view) {
        this.a = view;
    }

    public final void a(amri amri) {
        View view = this.a;
        if (amri.a()) {
            ((ImageView) view.findViewById(R.id.image)).setImageBitmap((Bitmap) amri.b());
            view.setVisibility(0);
        }
    }
}
