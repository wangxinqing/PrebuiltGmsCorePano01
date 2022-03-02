package com.google.android.gms.plus.data.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlusImageView extends ImageView implements ica {
    public int a;
    public boolean b;
    public boolean c;
    public Bitmap d;
    private Uri e;
    private yuv f;

    public PlusImageView(Context context) {
        super(context);
    }

    private final void a() {
        boolean z;
        Uri uri = this.e;
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            z = false;
        } else {
            z = true;
        }
        if (this.c) {
            Uri uri2 = this.e;
            if (uri2 == null) {
                setImageBitmap((Bitmap) null);
                return;
            }
            if (!z) {
                yuv yuv = this.f;
                if (yuv != null && yuv.l()) {
                    this.f.a(this, this.e, this.a);
                } else {
                    return;
                }
            } else {
                setImageURI(uri2);
            }
            this.c = false;
        }
    }

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
        yuv yuv = this.f;
        if (yuv != null && !yuv.b(this)) {
            this.f.a((ica) this);
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        yuv yuv = this.f;
        if (yuv != null && yuv.b(this)) {
            this.f.c(this);
        }
    }

    public PlusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(Uri uri) {
        a(uri, 0);
    }

    public final void a(Uri uri, int i) {
        boolean z;
        Uri uri2 = this.e;
        if (uri2 != null) {
            z = uri2.equals(uri);
        } else {
            z = uri == null;
        }
        int i2 = this.a;
        if (!z || i2 != i) {
            this.e = uri;
            this.a = i;
            this.c = true;
            a();
        }
    }

    public final void a(yuv yuv) {
        yuv yuv2 = this.f;
        if (yuv != yuv2) {
            if (yuv2 != null && yuv2.b(this)) {
                this.f.c(this);
            }
            this.f = yuv;
            yuv.a((ica) this);
        }
    }
}
