package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: agag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agag implements agcm {
    private final agaz a;

    public agag(agaz agaz) {
        this.a = agaz;
    }

    public final void a(Object obj, int i, agcl agcl) {
        agaz agaz = this.a;
        amrl.a(true);
        if (i == 0) {
            i = 120;
        }
        CharSequence c = agaz.a.c(obj);
        CharSequence b = agaz.a.b(obj);
        ArrayList arrayList = new ArrayList();
        if (c != null) {
            arrayList.add(c.toString());
        }
        if (b != null) {
            arrayList.add(b.toString());
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        agan agan = agaz.b;
        ahie ahie = new ahie(new ahik(agan.a.getApplicationContext(), aosd.a(agan.b)));
        int[] iArr = ahif.a;
        ahid ahid = new ahid(new ahig(ahie));
        ahid.d = ahig.a(agaz.a.a(obj));
        ahid.c = ahid.e.a(new agay(strArr));
        Canvas canvas = new Canvas(createBitmap);
        int height = createBitmap.getHeight();
        int width = createBitmap.getWidth();
        float min = (float) Math.min(height, width);
        Paint paint = (Paint) ahid.a.a();
        synchronized (ahid.a) {
            paint.setColor(ahid.d);
            float f = (float) (width / 2);
            float f2 = (float) (height / 2);
            canvas.drawCircle(f, f2, min / 2.0f, paint);
            if (ahid.c != null) {
                paint.setColor(-1);
                paint.setTextSize(min * 0.47f);
                paint.getTextBounds(ahid.c.toString(), 0, ahid.c.length(), ahid.b);
                CharSequence charSequence = ahid.c;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f2 - ahid.b.exactCenterY(), paint);
            }
        }
        agcl.a(createBitmap);
    }
}
