package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.io.File;
import java.io.IOException;

/* renamed from: vwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwp extends Drawable {
    private static final int[][] a = {new int[]{-20054, -2407369}, new int[]{-17711, -1499549}, new int[]{-671745, -6543440}, new int[]{-2044161, -10011977}, new int[]{-5063169, -12627531}, new int[]{-4199937, -16540699}, new int[]{-4730113, -12417548}, new int[]{-3868161, -16738393}, new int[]{-2883590, -16738680}, new int[]{-3342362, -15753896}, new int[]{-2424902, -9920712}, new int[]{-9798, -1086464}, new int[]{-12609, -43230}};
    private final Context b;
    private final Paint c;
    private final int d;
    private final int e;
    private final int f;
    private final vwo g;
    private Bitmap h;
    private final int i;
    private final int j;

    public vwp(Context context, ShareTarget shareTarget) {
        this(context, new vwo(shareTarget.b, shareTarget.c, shareTarget.k), 64);
    }

    private static int a(vwo vwo, int i2) {
        return Math.abs(vwo.a.hashCode()) % i2;
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        String lastPathSegment;
        if (this.h == null) {
            vwo vwo = this.g;
            int i2 = this.d;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Uri uri = vwo.b;
            Bitmap bitmap2 = null;
            if (uri != null) {
                Context context = this.b;
                if (uri.toString().startsWith("file")) {
                    String path = uri.getPath();
                    bitmap = !TextUtils.isEmpty(path) ? BitmapFactory.decodeFile(path) : null;
                } else if (uri.toString().startsWith("content")) {
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    } catch (IOException e2) {
                        anih anih = (anih) vvj.a.c();
                        anih.a((Throwable) e2);
                        ((anih) anih.a("whr", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get bitmap from %s", (Object) uri);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int i3 = this.d;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i3, false);
                    bitmap2 = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(bitmap2);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    canvas3.drawARGB(0, 0, 0, 0);
                    canvas3.drawCircle((float) (createScaledBitmap.getWidth() / 2), (float) (createScaledBitmap.getHeight() / 2), (float) (createScaledBitmap.getWidth() / 2), paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas3.drawBitmap(createScaledBitmap, rect, rect, paint);
                } else {
                    Context context2 = this.b;
                    if (whw.c(uri.toString()) && "com.google.android.gms.fileprovider".equals(uri.getAuthority()) && (lastPathSegment = uri.getLastPathSegment()) != null) {
                        File file = new File(wij.a(context2), lastPathSegment);
                        if (file.exists() && file.delete()) {
                            jjg jjg = vvj.a;
                        }
                    }
                    jjg jjg2 = vvj.a;
                }
            }
            if (!vwo.c) {
                a(canvas2);
                atg a2 = atg.a(this.b.getResources(), R.drawable.quantum_ic_phone_android_vd_theme_24, this.b.getTheme());
                if (a2 != null) {
                    int i4 = this.e;
                    a2.setBounds(0, 0, i4, i4);
                    a2.setTint(this.j);
                    float f2 = (float) ((this.d / 2) - (this.e / 2));
                    canvas2.drawBitmap(whr.b(a2), f2, f2, this.c);
                }
            } else if (bitmap2 == null) {
                a(canvas2);
                String str = vwo.a;
                StringBuilder sb = new StringBuilder();
                sb.appendCodePoint(str.codePointAt(str.offsetByCodePoints(0, 0)));
                String sb2 = sb.toString();
                this.c.setColor(this.j);
                this.c.setTextSize((float) this.f);
                this.c.setTextAlign(Paint.Align.CENTER);
                int i5 = this.d;
                canvas2.drawText(sb2, (float) (i5 / 2), (float) ((int) (((((float) i5) - this.c.descent()) - this.c.ascent()) / 2.0f)), this.c);
            } else {
                this.c.setColor(-1);
                canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, this.c);
            }
            this.h = createBitmap;
        }
        canvas.drawBitmap(this.h, 0.0f, 0.0f, this.c);
    }

    public final int getAlpha() {
        return this.c.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.c.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.d;
    }

    public final int getIntrinsicWidth() {
        return this.d;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
        this.c.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    private final void a(Canvas canvas) {
        this.c.setColor(this.i);
        float f2 = (float) (this.d / 2);
        canvas.drawCircle(f2, f2, f2, this.c);
    }

    public vwp(Context context, vwo vwo, int i2) {
        this.b = context;
        this.g = vwo;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c.setFilterBitmap(true);
        this.d = wid.a(context, i2);
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.e = wid.a(context, (int) (d2 / 1.5d));
        Double.isNaN(d2);
        this.f = wid.a(context, (int) (d2 / 2.6d));
        if (!vwo.c) {
            this.i = context.getColor(R.color.sharing_drawable_unknown);
            this.j = context.getColor(R.color.sharing_drawable_unknown_dark);
            return;
        }
        int[][] iArr = a;
        this.i = iArr[a(vwo, iArr.length)][0];
        int[][] iArr2 = a;
        this.j = iArr2[a(vwo, iArr2.length)][1];
    }
}
