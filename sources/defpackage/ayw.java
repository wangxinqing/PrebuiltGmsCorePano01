package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* renamed from: ayw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayw extends ayu {
    private final Paint g = new avq(3);
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private awm j;

    public ayw(avc avc, ayx ayx) {
        super(avc, ayx);
    }

    private final Bitmap e() {
        axd axd;
        avd avd;
        Context context;
        String str = this.c.f;
        avc avc = this.b;
        if (avc.getCallback() != null) {
            axd axd2 = avc.g;
            if (axd2 != null) {
                Drawable.Callback callback = avc.getCallback();
                if (callback == null || !(callback instanceof View)) {
                    context = null;
                } else {
                    context = ((View) callback).getContext();
                }
                if (!(context == null && axd2.a == null) && !axd2.a.equals(context)) {
                    avc.g = null;
                }
            }
            if (avc.g == null) {
                avc.g = new axd(avc.getCallback(), avc.h, avc.a.b);
            }
            axd = avc.g;
        } else {
            axd = null;
        }
        if (axd == null || (avd = (avd) axd.c.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = avd.e;
        if (bitmap != null) {
            return bitmap;
        }
        String str2 = avd.d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(axd.b)) {
                    Bitmap a = bbb.a(BitmapFactory.decodeStream(axd.a.getAssets().open(axd.b + str2), (Rect) null, options), avd.a, avd.b);
                    axd.a(str, a);
                    return a;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e) {
                bay.a("Unable to open asset.", e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                axd.a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                bay.a("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        Bitmap e = e();
        if (e != null) {
            rectF.set(0.0f, 0.0f, ((float) e.getWidth()) * bbb.a(), ((float) e.getHeight()) * bbb.a());
            this.a.mapRect(rectF);
        }
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        Bitmap e = e();
        if (e != null && !e.isRecycled()) {
            float a = bbb.a();
            this.g.setAlpha(i2);
            awm awm = this.j;
            if (awm != null) {
                this.g.setColorFilter((ColorFilter) awm.f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.h.set(0, 0, e.getWidth(), e.getHeight());
            this.i.set(0, 0, (int) (((float) e.getWidth()) * a), (int) (((float) e.getHeight()) * a));
            canvas.drawBitmap(e, this.h, this.i, this.g);
            canvas.restore();
        }
    }

    public final void a(Object obj, bbe bbe) {
        super.a(obj, bbe);
        if (obj == avh.B) {
            this.j = new axb(bbe);
        }
    }
}
