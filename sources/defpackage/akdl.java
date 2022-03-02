package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: akdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdl extends akfh {
    final /* synthetic */ ImageView a;
    final /* synthetic */ akdr b;

    public akdl(akdr akdr, ImageView imageView) {
        this.b = akdr;
        this.a = imageView;
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.a.setVisibility(0);
            this.a.setImageBitmap(bitmap);
            akdr akdr = this.b;
            ImageView imageView = this.a;
            imageView.setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f});
            ofFloat.setDuration((long) akdr.a.getResources().getInteger(17694721));
            ofFloat.start();
        }
    }
}
