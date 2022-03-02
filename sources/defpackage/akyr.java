package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.gms.R;

/* renamed from: akyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyr {
    private static akyr h;
    public final ou a;
    public final ou b;
    public final Bitmap c;
    public final Bitmap d;
    public final Bitmap e;
    public final Bitmap f;
    public final Bitmap g;
    private final ou i;
    private final Drawable j;
    private final Bitmap k;

    private akyr(Context context) {
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(R.array.category_names);
        String[] stringArray2 = resources.getStringArray(R.array.category_descriptions);
        Bitmap a2 = a(resources.getDrawable(R.drawable.white_icons_foreground));
        Bitmap a3 = a(resources.getDrawable(R.drawable.red_icons_foreground));
        if (Build.VERSION.SDK_INT <= 21) {
            a2 = a(resources.getDrawable(R.drawable.white_icons_foreground), resources.getDrawable(R.drawable.white_icons_foreground_inset));
            a3 = a(resources.getDrawable(R.drawable.red_icons_foreground), resources.getDrawable(R.drawable.red_icons_foreground_inset));
        }
        int length = stringArray.length;
        this.a = new ou(length);
        this.i = new ou(length);
        this.b = new ou(length);
        float f2 = (float) length;
        float width = ((float) a2.getWidth()) / f2;
        float height = (float) a2.getHeight();
        float width2 = ((float) a3.getWidth()) / f2;
        float height2 = (float) a3.getHeight();
        this.j = resources.getDrawable(R.drawable.white_icon_background);
        this.k = BitmapFactory.decodeResource(resources, R.drawable.red_icon_background);
        int i2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i2 < stringArray.length) {
            this.b.put(stringArray[i2], stringArray2[i2]);
            String[] strArr = stringArray2;
            Bitmap createBitmap = Bitmap.createBitmap(a2, (int) f3, 0, (int) width, (int) height);
            Bitmap bitmap = a2;
            this.a.put(stringArray[i2], new LayerDrawable(new Drawable[]{this.j, new BitmapDrawable(resources, createBitmap)}));
            f3 += width;
            Bitmap createBitmap2 = Bitmap.createBitmap(a3, (int) f4, 0, (int) width2, (int) height2);
            ou ouVar = this.i;
            String str = stringArray[i2];
            String[] strArr2 = stringArray;
            Bitmap createBitmap3 = Bitmap.createBitmap(this.k.getWidth(), this.k.getHeight(), this.k.getConfig());
            Canvas canvas = new Canvas(createBitmap3);
            canvas.drawBitmap(this.k, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            ouVar.put(str, createBitmap3);
            f4 += width2;
            i2++;
            stringArray2 = strArr;
            a2 = bitmap;
            stringArray = strArr2;
            height2 = height2;
            width = width;
        }
        this.c = BitmapFactory.decodeResource(resources, R.drawable.ic_qu_home);
        this.d = BitmapFactory.decodeResource(resources, R.drawable.ic_qu_work);
        this.e = BitmapFactory.decodeResource(resources, R.drawable.ic_qu_search);
        this.f = BitmapFactory.decodeResource(resources, R.drawable.ic_qu_clock);
        this.g = BitmapFactory.decodeResource(resources, R.drawable.ic_qu_place);
    }

    public static akyr a(Context context) {
        if (h == null) {
            h = new akyr(context.getApplicationContext());
        }
        return h;
    }

    private static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static Bitmap a(Drawable drawable, Drawable drawable2) {
        Rect rect = new Rect();
        drawable.getPadding(rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.left + drawable2.getIntrinsicWidth() + rect.right, rect.top + drawable2.getIntrinsicHeight() + rect.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable2.setBounds(rect.left, rect.top, rect.left + drawable2.getIntrinsicWidth(), rect.top + drawable2.getIntrinsicHeight());
        drawable2.draw(canvas);
        return createBitmap;
    }

    public final Bitmap a(rhq rhq) {
        for (Integer intValue : rhq.b()) {
            Bitmap bitmap = (Bitmap) this.i.get(akic.a(intValue.intValue()));
            if (bitmap != null) {
                return bitmap;
            }
        }
        return (Bitmap) this.i.get("establishment");
    }
}
