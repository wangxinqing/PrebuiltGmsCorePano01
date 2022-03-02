package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: pzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzs {
    private static final iwd a = ehv.b("PackageUtils");

    public static amri a(Context context, String str) {
        try {
            oq c = jni.b(context).c(str);
            Drawable drawable = (Drawable) c.b;
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return amri.b(new oq((CharSequence) c.a, createBitmap));
        } catch (PackageManager.NameNotFoundException e) {
            a.e("Package not found!", e, new Object[0]);
            return ampu.a;
        }
    }
}
