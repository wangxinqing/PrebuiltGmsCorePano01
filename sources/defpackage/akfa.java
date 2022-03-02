package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: akfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfa extends View {
    public final RectF A = new RectF();
    public final RectF B = new RectF();
    public final Rect C = new Rect();
    public final RectF D = new RectF();
    public final Rect E = new Rect();
    public int F;
    public final ColorMatrix G = new ColorMatrix();
    public RectF H;
    public aker a;
    public aker b;
    public BitmapDrawable c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public float y;
    public final Rect z = new Rect();

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        BitmapDrawable bitmapDrawable = this.c;
        if (bitmapDrawable instanceof akgc) {
            akgc akgc = (akgc) bitmapDrawable;
            akgd.a();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != null) {
            int save = canvas.save();
            canvas.clipRect(this.D);
            RectF rectF = this.H;
            if (rectF != null) {
                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
            }
            this.c.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public akfa(Context context) {
        super(context, (AttributeSet) null, 0);
        setPivotX(0.0f);
        setPivotY(0.0f);
        setWillNotDraw(false);
    }
}
