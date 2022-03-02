package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: mrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mrw extends adl {
    private final TextView s;
    private ImageView t;

    public mrw(View view) {
        super(view);
        if (aymw.U()) {
            this.s = (TextView) view.findViewById(R.id.title);
            this.t = (ImageView) view.findViewById(16908294);
            view.findViewById(R.id.description).setVisibility(8);
            return;
        }
        this.s = (TextView) view.findViewById(R.id.name);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bitmap bitmap) {
        if (aymw.U()) {
            this.t.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.s.setText(str);
    }
}
