package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: aryg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryg {
    public static Bitmap a(Context context, Bitmap bitmap) {
        if (!aymw.a.a().f()) {
            aryq aryq = aryq.a;
            return bitmap;
        } else if (bitmap == null) {
            ((anih) ((anih) aryq.a.c()).a("aryg", "a", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("IconUtils: Bitmap is null, not adding background.");
            return null;
        } else if (bitmap.getWidth() != bitmap.getHeight()) {
            ((anih) ((anih) aryq.a.c()).a("aryg", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("IconUtils: Bitmap dimentions not square, skipping background: %s x %s", bitmap.getWidth(), bitmap.getHeight());
            return bitmap;
        } else {
            double width = (double) bitmap.getWidth();
            double ay = aymt.a.a().ay();
            Double.isNaN(width);
            int i = (int) (width * ay);
            int i2 = i + i;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i2, bitmap.getHeight() + i2, bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColor(lk.b(-1, (int) (aymt.a.a().ax() * 255.0d)));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            canvas.drawCircle((float) (createBitmap.getWidth() / 2), (float) (createBitmap.getHeight() / 2), (float) (createBitmap.getWidth() / 2), paint);
            float f = (float) i;
            canvas.drawBitmap(bitmap, f, f, (Paint) null);
            return createBitmap;
        }
    }

    public static boolean a(Bitmap bitmap) {
        if (bitmap != null) {
            int M = (int) aymq.a.a().M();
            int d = (int) aymq.d();
            if (bitmap.getWidth() >= M && bitmap.getWidth() < d && bitmap.getHeight() >= M && bitmap.getHeight() < d) {
                return true;
            }
            int d2 = (int) aymq.d();
            if (bitmap.getWidth() < d2 || bitmap.getHeight() < d2) {
                return false;
            }
            return true;
        }
        return false;
    }
}
