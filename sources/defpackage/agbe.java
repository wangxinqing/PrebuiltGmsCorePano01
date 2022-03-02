package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.Property;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* renamed from: agbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agbe extends AnimatorListenerAdapter {
    final /* synthetic */ amri a;
    final /* synthetic */ agbh b;

    public agbe(agbh agbh, amri amri) {
        this.b = agbh;
        this.a = amri;
    }

    public final void onAnimationStart(Animator animator) {
        agbh agbh = this.b;
        Property property = agbh.f;
        RingView ringView = agbh.a;
        ((agbb) this.a.b()).a();
        agbh agbh2 = this.b;
        int i = agbh2.b;
        int i2 = agbh2.c;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int i3 = (i2 + 1) / 2;
        int i4 = i - i3;
        RectF rectF = new RectF(new Rect(i3, i3, i4, i4));
        paint.setStrokeWidth((float) i2);
        for (int[] iArr : agav.a) {
            paint.setColor(iArr[0]);
            canvas.drawArc(rectF, (float) iArr[1], (float) iArr[2], false, paint);
        }
        ringView.setImageDrawable(new BitmapDrawable(createBitmap));
    }
}
