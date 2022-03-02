package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: cxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cxw implements djj {
    private final FadeInImageView a;

    public cxw(FadeInImageView fadeInImageView) {
        this.a = fadeInImageView;
    }

    public final void a(Bitmap bitmap, boolean z) {
        FadeInImageView fadeInImageView = this.a;
        if (!z) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(kf.b(fadeInImageView.getContext(), 17170445)), new BitmapDrawable(fadeInImageView.getContext().getResources(), bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            fadeInImageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(500);
            return;
        }
        fadeInImageView.setImageBitmap(bitmap);
    }
}
