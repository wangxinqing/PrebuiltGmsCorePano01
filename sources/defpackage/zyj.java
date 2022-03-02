package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: zyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyj extends Drawable {
    public static TypedArray a;
    public static int b;
    private static int f;
    private static float g;
    private static Drawable h;
    private static final Paint i = new Paint();
    private static final Rect j = new Rect();
    private static final char[] k = new char[1];
    public int c;
    public Character d;
    private final Paint e;

    static {
        zyj.class.getSimpleName();
    }

    zyj() {
        this.d = null;
        this.e = new Paint();
    }

    private static synchronized void a(Resources resources) {
        synchronized (zyj.class) {
            if (a == null) {
                a = resources.obtainTypedArray(R.array.letter_tile_colors);
                b = resources.getColor(R.color.letter_tile_default_color);
                f = resources.getColor(R.color.background_white);
                g = resources.getFraction(R.fraction.letter_to_tile_ratio, 1, 1);
                h = resources.getDrawable(R.drawable.product_logo_avatar_anonymous_white_color_48);
                i.setTypeface(Typeface.create("sans-serif", 0));
                i.setTextAlign(Paint.Align.CENTER);
                i.setAntiAlias(true);
            }
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (isVisible() && !bounds.isEmpty()) {
            i.setColor(this.c);
            i.setAlpha(this.e.getAlpha());
            Rect bounds2 = getBounds();
            int min = Math.min(bounds2.width(), bounds2.height());
            canvas.drawCircle((float) bounds2.centerX(), (float) bounds2.centerY(), (float) (min / 2), i);
            Character ch = this.d;
            if (ch != null) {
                k[0] = ch.charValue();
                i.setTextSize(g * ((float) min));
                i.getTextBounds(k, 0, 1, j);
                i.setTypeface(Typeface.create("sans-serif", 0));
                i.setColor(f);
                i.setAlpha(138);
                canvas.drawText(k, 0, 1, (float) bounds2.centerX(), (((float) bounds2.centerY()) + (((float) bounds2.height()) * 0.0f)) - j.exactCenterY(), i);
                return;
            }
            Drawable drawable = h;
            Rect copyBounds = copyBounds();
            int min2 = (int) (((float) Math.min(copyBounds.width(), copyBounds.height())) / 2.0f);
            copyBounds.set(copyBounds.centerX() - min2, (int) (((float) (copyBounds.centerY() - min2)) + (((float) copyBounds.height()) * 0.0f)), copyBounds.centerX() + min2, (int) (((float) (copyBounds.centerY() + min2)) + (((float) copyBounds.height()) * 0.0f)));
            drawable.setBounds(copyBounds);
            h.setAlpha(138);
            h.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i2) {
        this.e.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public zyj(Resources resources) {
        this.d = null;
        a(resources);
        Paint paint = new Paint();
        this.e = paint;
        paint.setFilterBitmap(true);
        this.e.setDither(true);
        this.c = b;
    }
}
