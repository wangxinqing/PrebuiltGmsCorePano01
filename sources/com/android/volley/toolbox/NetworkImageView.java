package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageLoader;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkImageView extends ImageView {
    public int a;
    public Drawable b;
    public Bitmap c;
    public int d;
    public Drawable e;
    public Bitmap f;
    private String g;
    private ImageLoader h;
    private ImageLoader.ImageContainer i;

    public NetworkImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a() {
        int i2 = this.a;
        if (i2 == 0) {
            Drawable drawable = this.b;
            if (drawable == null) {
                Bitmap bitmap = this.c;
                if (bitmap != null) {
                    setImageBitmap(bitmap);
                } else {
                    setImageBitmap((Bitmap) null);
                }
            } else {
                setImageDrawable(drawable);
            }
        } else {
            setImageResource(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ImageLoader.ImageContainer imageContainer = this.i;
        if (imageContainer != null) {
            imageContainer.cancelRequest();
            setImageBitmap((Bitmap) null);
            this.i = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        a(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.a = 0;
        this.b = null;
        this.c = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.a = 0;
        this.c = null;
        this.b = drawable;
    }

    public void setDefaultImageResId(int i2) {
        this.c = null;
        this.b = null;
        this.a = i2;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.d = 0;
        this.e = null;
        this.f = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.d = 0;
        this.f = null;
        this.e = drawable;
    }

    public void setErrorImageResId(int i2) {
        this.f = null;
        this.e = null;
        this.d = i2;
    }

    public void setImageUrl(String str, ImageLoader imageLoader) {
        bfo.a();
        this.g = str;
        this.h = imageLoader;
        a(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = getLayoutParams().height == -2;
        } else {
            z3 = false;
            z2 = false;
        }
        if (!z3) {
            z4 = false;
        } else if (!z2) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.g)) {
                ImageLoader.ImageContainer imageContainer = this.i;
                if (imageContainer != null) {
                    imageContainer.cancelRequest();
                    this.i = null;
                }
                a();
                return;
            }
            ImageLoader.ImageContainer imageContainer2 = this.i;
            if (!(imageContainer2 == null || imageContainer2.getRequestUrl() == null)) {
                if (!this.i.getRequestUrl().equals(this.g)) {
                    this.i.cancelRequest();
                    a();
                } else {
                    return;
                }
            }
            if (z3) {
                width = 0;
            }
            if (!z2) {
                i2 = height;
            } else {
                i2 = 0;
            }
            this.i = this.h.get(this.g, new bfn(this, z), width, i2, scaleType);
        }
    }
}
