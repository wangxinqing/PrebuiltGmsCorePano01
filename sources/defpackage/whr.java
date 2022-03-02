package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.io.IOException;

/* renamed from: whr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whr {
    public static Bitmap a(Context context, Uri uri) {
        if (uri.toString().startsWith("file")) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                return BitmapFactory.decodeFile(path);
            }
            return null;
        } else if (!uri.toString().startsWith("content")) {
            return null;
        } else {
            try {
                return MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            } catch (IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("whr", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get bitmap from %s", (Object) uri);
                return null;
            }
        }
    }

    public static Bitmap b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        int width = drawable.getBounds().width();
        int i = 1;
        if (width <= 0 && (width = drawable.getIntrinsicWidth()) <= 0) {
            width = 1;
        }
        int height = drawable.getBounds().height();
        if (height <= 0) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > 0) {
                i = intrinsicHeight;
            }
        } else {
            i = height;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap a(Activity activity) {
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
            rootView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    public static BitmapDrawable a(Context context, Bitmap bitmap) {
        Context context2 = context;
        Drawable drawable = context2.getDrawable(R.drawable.quantum_ic_settings_vd_theme_24);
        if (drawable != null) {
            drawable.setTint(wid.b(context));
            int a = wid.a(context2, 14);
            drawable.setBounds(0, 0, a, a);
            int width = drawable.getBounds().width();
            int a2 = wid.a(context2, 2);
            int a3 = wid.a(context2, 3);
            int a4 = wid.a(context2, 2);
            int i = width - (a2 + a2);
            int a5 = wid.a(context2, 2);
            int a6 = wid.a(context2, 1);
            Bitmap b = b(drawable);
            int width2 = b.getWidth();
            int height = b.getHeight();
            if (!(width2 == i && height == i)) {
                Matrix matrix = new Matrix();
                float f = (float) i;
                matrix.postScale(f / ((float) width2), f / ((float) height));
                b = Bitmap.createBitmap(b, 0, 0, width2, height, matrix, false);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + a3 + a5, bitmap.getHeight() + a4 + a5 + a6, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
            int width3 = (bitmap.getWidth() - width) + a3;
            int height2 = (bitmap.getHeight() - width) + a4;
            int i2 = width / 2;
            Paint paint = new Paint();
            paint.setColor(wid.b(context2, R.attr.colorPrimary));
            paint.setStyle(Paint.Style.FILL);
            paint.setShadowLayer((float) a5, 0.0f, (float) a6, Color.argb(230, Color.red(-16777216), Color.green(-16777216), Color.blue(-16777216)));
            canvas.drawCircle((float) (width3 + i2), (float) (height2 + i2), (float) i2, paint);
            int i3 = width3 + a2;
            int i4 = height2 + a2;
            canvas.drawBitmap(b, (Rect) null, new Rect(i3, i4, b.getWidth() + i3, b.getHeight() + i4), (Paint) null);
            return new BitmapDrawable(context.getResources(), createBitmap);
        }
        throw new IllegalArgumentException("Invalid badgeResId");
    }

    public static Icon a(Drawable drawable) {
        return Icon.createWithBitmap(b(drawable));
    }
}
