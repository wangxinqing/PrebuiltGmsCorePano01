package com.google.android.gms.plus.audience;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceAvatarImageView extends FrameLayout {
    private ImageView a;

    public AudienceAvatarImageView(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        addView(imageView);
    }

    public AudienceAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Bitmap bitmap) {
        this.a.setImageBitmap(jju.a(bitmap));
    }

    public AudienceAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
