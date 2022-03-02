package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: abjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjt implements jsw {
    private final abjy a;
    private final ImageView b;
    private final Context c;
    private final Intent d;

    public abjt(abjy abjy, ImageView imageView, Context context, Intent intent) {
        this.a = abjy;
        this.b = imageView;
        this.c = context;
        this.d = intent;
    }

    public final void a(amri amri) {
        abjy abjy = this.a;
        ImageView imageView = this.b;
        Context context = this.c;
        Intent intent = this.d;
        if (amri.a()) {
            imageView.setImageDrawable(new BitmapDrawable(context.getResources(), (Bitmap) amri.b()));
            imageView.setVisibility(0);
            imageView.setOnClickListener(new abjx(abjy, intent, context));
        }
    }
}
