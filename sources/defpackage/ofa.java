package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Log;
import com.google.android.gms.R;

/* renamed from: ofa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofa {
    private static int a(float f, Resources resources) {
        return Math.round(f * resources.getDisplayMetrics().density);
    }

    private static int b(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 == 0) {
            return a(5.0f, resources);
        }
        if (i2 != 1) {
            return a(4.0f, resources);
        }
        return a(4.5f, resources);
    }

    private static int c(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        if (i2 != 1) {
            return a(1.0f, resources);
        }
        return a(0.5f, resources);
    }

    private static int a(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 == 0) {
            return a(4.0f, resources);
        }
        if (i2 != 1) {
            return a(6.0f, resources);
        }
        return a(5.0f, resources);
    }

    public static AnimationDrawable a(Context context) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        int a = ofy.a(context, R.attr.gh_primaryBlueColor);
        try {
            LayerDrawable[] layerDrawableArr = {a(1, 1, 1, a, context), a(2, 1, 1, a, context), a(3, 1, 1, a, context), a(2, 1, 1, a, context), a(1, 1, 1, a, context), a(1, 2, 1, a, context), a(1, 3, 1, a, context), a(1, 2, 1, a, context), a(1, 1, 1, a, context), a(1, 1, 2, a, context), a(1, 1, 3, a, context), a(1, 1, 2, a, context), a(1, 1, 1, a, context)};
            int i = 0;
            while (i < 13) {
                animationDrawable.addFrame(layerDrawableArr[i], i == 12 ? 500 : 44);
                i++;
            }
            animationDrawable.setOneShot(false);
        } catch (OutOfMemoryError e) {
            Log.e("gH_ChatUiUtil", "OutOfMemory trying to create ellipsis animation.", e);
        }
        return animationDrawable;
    }

    public static LayerDrawable a(int i, int i2, int i3, int i4, Context context) {
        Resources resources = context.getResources();
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{a(a(i, resources), i4), a(a(i2, resources), i4), a(a(i3, resources), i4)});
        int b = b(i, resources);
        int c = c(i, resources);
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(0, a(4.0f, resources) - c, b, a(16.0f, resources) - c, b);
        int b2 = b(i2, resources);
        int c2 = c(i2, resources);
        layerDrawable2.setLayerInset(1, a(10.0f, resources) - c2, b2, a(10.0f, resources) - c2, b2);
        int b3 = b(i3, resources);
        int c3 = c(i3, resources);
        layerDrawable2.setLayerInset(2, a(16.0f, resources) - c3, b3, a(4.0f, resources) - c3, b3);
        return layerDrawable;
    }

    public static ShapeDrawable a(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        return shapeDrawable;
    }

    private static ShapeDrawable a(int i, int i2) {
        ShapeDrawable a = a(i2);
        a.setIntrinsicHeight(i);
        a.setIntrinsicWidth(i);
        return a;
    }
}
