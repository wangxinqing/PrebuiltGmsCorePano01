package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: jrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrb implements jsw {
    private final jrd a;

    public jrb(jrd jrd) {
        this.a = jrd;
    }

    public final void a(amri amri) {
        jrd jrd = this.a;
        if (amri.a()) {
            ry.a(jrd.a, (Drawable) null, new BitmapDrawable(jrd.c.f.getResources(), jpr.a((Bitmap) amri.b(), (int) jrd.c.f.getResources().getDimension(R.dimen.gm_card_avatar_diameter))));
        }
    }
}
