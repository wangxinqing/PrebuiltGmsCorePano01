package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* renamed from: akdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdu extends akfh {
    final /* synthetic */ ImageView a;
    final /* synthetic */ View b;
    final /* synthetic */ akdv c;

    public akdu(akdv akdv, ImageView imageView, View view) {
        this.c = akdv;
        this.a = imageView;
        this.b = view;
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.c.i = bitmap;
            this.a.setVisibility(0);
            this.a.setImageBitmap(bitmap);
            akdv.a(this.a, this.b);
            akdv.a(this.a);
        }
    }
}
