package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: agcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agcd {
    public final WeakReference a;
    public final agcj b;
    public final agcg c;
    public boolean d;
    final /* synthetic */ agcf e;
    private final amzy f;

    public agcd(agcf agcf, agcg agcg, amzy amzy, ImageView imageView) {
        this.e = agcf;
        amrl.a((Object) imageView);
        this.a = new WeakReference(imageView);
        this.b = agcf.b.a(((agbq) agcg).a);
        this.c = agcg;
        this.f = amzy;
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            List<agci> c2 = this.b.c();
            if (c2 != null && !c2.isEmpty()) {
                for (agci ordinal : c2) {
                    agci agci = agci.a;
                    if (ordinal.ordinal() == 0) {
                        ou ouVar = agcf.a;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int min = Math.min(width, height);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        float f2 = (float) (min / 2);
                        canvas.drawCircle(f2, f2, f2, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, (float) ((min - width) / 2), (float) ((min - height) / 2), paint);
                        bitmap = createBitmap;
                    }
                }
            }
            ImageView imageView = (ImageView) this.a.get();
            if (imageView != null) {
                agbu.a(imageView);
                ou ouVar2 = agcf.a;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null || layoutParams.height <= 0) {
                    imageView.getHeight();
                } else {
                    int i = layoutParams.height;
                }
                imageView.getPaddingTop();
                imageView.getPaddingBottom();
                anhk i2 = this.f.listIterator();
                while (i2.hasNext()) {
                    bitmap = ((agcn) i2.next()).a();
                }
            }
        } else {
            bitmap = null;
        }
        a((Drawable) new BitmapDrawable(bitmap));
    }

    public final void b(Drawable drawable) {
        agzj.b();
        ImageView imageView = (ImageView) this.a.get();
        if (!this.d && imageView != null) {
            imageView.setImageDrawable(drawable);
            agcf.a(imageView, (agcd) null);
        }
    }

    public final void a(Drawable drawable) {
        ImageView imageView = (ImageView) this.a.get();
        if (!this.d && imageView != null) {
            agcc agcc = new agcc(this, drawable);
            imageView.addOnAttachStateChangeListener(agcc);
            if (qb.D(imageView)) {
                imageView.removeOnAttachStateChangeListener(agcc);
                imageView.post(new agby(this, drawable));
            }
        }
    }

    public final void a(Runnable runnable) {
        if (agzj.a()) {
            this.e.c.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
