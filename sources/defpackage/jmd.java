package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jmd {
    private static final Paint a = new Paint(2);
    private static final Paint b;
    private static Bitmap c;
    private static final Map d = new HashMap();

    static {
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        b = paint;
    }

    private static Bitmap a(Context context, int i) {
        if (c == null) {
            c = ((BitmapDrawable) context.getApplicationContext().getResources().getDrawable(R.drawable.common_round_mask)).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int width = c.getWidth();
            a(canvas, c, new Rect(0, 0, width, width), new Rect(0, 0, i, i));
            return createBitmap;
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("getRoundMask OutOfMemoryError for image size: ");
            sb.append(i);
            Log.w("AvatarImageUtils", sb.toString());
            return null;
        }
    }

    public static Bitmap a(Context context, Bitmap bitmap, Paint paint) {
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(width, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Map map = d;
        Integer valueOf = Integer.valueOf(width);
        if (map.containsKey(valueOf)) {
            bitmap2 = (Bitmap) d.get(valueOf);
        } else {
            bitmap2 = a(context, width);
            d.put(valueOf, bitmap2);
        }
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, b);
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            if (createBitmap == null) {
                return null;
            }
            Canvas canvas = new Canvas(createBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == i && height == i) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                int min = Math.min(width, height);
                int i2 = (width - min) / 2;
                int i3 = (height - min) / 2;
                a(canvas, bitmap, new Rect(i2, i3, i2 + min, min + i3), new Rect(0, 0, i, i));
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("resizeToSquareBitmap OutOfMemoryError for image size: ");
            sb.append(i);
            Log.w("AvatarImageUtils", sb.toString(), e);
            return null;
        }
    }

    private static void a(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2) {
        canvas.drawBitmap(bitmap, rect, rect2, a);
    }
}
