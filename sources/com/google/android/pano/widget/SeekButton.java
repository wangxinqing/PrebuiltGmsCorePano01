package com.google.android.pano.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import java.text.DecimalFormat;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SeekButton extends View {
    protected float a = 0.0f;
    protected float b = 0.0f;
    protected long c = 0;
    protected Resources d;
    protected Drawable e;
    protected ClipDrawable f;
    protected Drawable g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected float n;
    protected float o;
    protected Paint p;
    protected Rect q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;

    public SeekButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        new DecimalFormat("#.#");
        this.p = new Paint();
        this.q = new Rect();
        Resources resources = context.getResources();
        this.d = resources;
        this.n = resources.getDimension(R.dimen.playback_rate_text_size);
        this.m = this.d.getColor(R.color.text_primary_color_half_alpha);
        this.d.getDimension(R.dimen.playback_rate_text_padding);
        this.p.setColor(this.m);
        this.p.setTextSize(this.n);
        this.p.setTypeface(Typeface.DEFAULT_BOLD);
        boolean z2 = true;
        this.p.setAntiAlias(true);
        this.h = R.drawable.ic_playback_scrub_fwd;
        this.i = R.drawable.ic_playback_scrubber_line;
        this.j = 102;
        this.k = 255;
        this.l = 1;
        this.o = 0.73f;
        a();
        if (attributeSet != null) {
            context.getResources();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akdi.d);
            this.j = obtainStyledAttributes.getInt(2, 102);
            this.k = obtainStyledAttributes.getInt(1, 255);
            this.l = obtainStyledAttributes.getInt(3, 1);
            if (obtainStyledAttributes.hasValue(4)) {
                this.h = obtainStyledAttributes.getResourceId(4, R.drawable.ic_playback_scrub_fwd);
                z = true;
            } else {
                z = false;
            }
            if (obtainStyledAttributes.hasValue(5)) {
                this.i = obtainStyledAttributes.getResourceId(5, R.drawable.ic_playback_scrubber_line);
            } else {
                z2 = z;
            }
            if (obtainStyledAttributes.hasValue(6)) {
                int color = obtainStyledAttributes.getColor(6, this.m);
                this.m = color;
                this.p.setColor(color);
            }
            if (obtainStyledAttributes.hasValue(7)) {
                float dimension = obtainStyledAttributes.getDimension(7, this.n);
                this.n = dimension;
                this.p.setTextSize(dimension);
            }
            if (obtainStyledAttributes.hasValue(0)) {
                float f2 = obtainStyledAttributes.getFloat(0, this.o);
                this.o = f2;
                this.u = (int) (((float) this.t) * f2);
                this.v = (int) (((float) this.s) * f2);
            } else if (!z2) {
                return;
            }
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int i2;
        this.p.setTextAlign(this.l != 2 ? Paint.Align.LEFT : Paint.Align.RIGHT);
        this.e = this.d.getDrawable(this.h);
        Drawable drawable = this.e;
        if (this.l == 1) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        ClipDrawable clipDrawable = new ClipDrawable(drawable, i2, 1);
        this.f = clipDrawable;
        clipDrawable.mutate();
        this.e = this.d.getDrawable(this.h);
        this.f.setLevel(8000);
        this.g = this.d.getDrawable(this.i);
    }

    public final void b(int i2) {
        if (this.k != i2) {
            this.k = i2 & 255;
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        boolean hasFocus = hasFocus();
        if (!hasFocus) {
            i2 = this.v;
        } else {
            i2 = this.s;
        }
        int i7 = i2 / 2;
        int i8 = 1;
        if (this.l != 1) {
            i3 = getWidth() - (getPaddingRight() + i7);
        } else {
            i3 = i7 + getPaddingLeft();
        }
        float f2 = (float) i2;
        int paddingLeft = (int) ((((float) ((width - getPaddingLeft()) - getPaddingRight())) - this.r) - f2);
        if (this.l == 2) {
            i8 = -1;
        }
        if (this.a != this.b) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.c)) / 150.0f;
            if (elapsedRealtime < 1.0f) {
                float f3 = this.a;
                this.a = f3 + ((this.b - f3) * elapsedRealtime);
                postInvalidateOnAnimation();
            } else {
                this.a = this.b;
            }
        }
        float f4 = this.a;
        int i9 = i3 + ((int) (((float) (i8 * paddingLeft)) * f4));
        int i10 = (int) ((f2 * 0.1f) / 2.0f);
        int i11 = i7 - i10;
        if (hasFocus) {
            i4 = this.k;
        } else {
            i4 = this.j;
        }
        if (f4 > 0.0f) {
            int i12 = height / 2;
            int intrinsicHeight = this.g.getIntrinsicHeight() / 2;
            this.q.top = i12 - intrinsicHeight;
            this.q.bottom = i12 + intrinsicHeight;
            if (this.l == 2) {
                this.q.left = i9 + i11;
                this.q.right = width - getPaddingRight();
            } else {
                this.q.left = getPaddingLeft();
                this.q.right = i9 - i11;
            }
            this.g.setAlpha(i4);
            this.g.setBounds(this.q);
            this.g.draw(canvas);
        }
        this.e.setAlpha(i4);
        this.f.setAlpha(i4);
        boolean hasFocus2 = hasFocus();
        if (!hasFocus2) {
            i5 = this.u;
        } else {
            i5 = this.t;
        }
        if (!hasFocus2) {
            i6 = (this.t - this.u) / 2;
        } else {
            i6 = 0;
        }
        if (this.l == 2) {
            this.q.left = i9 - i10;
            this.q.right = i9 + i11;
        } else {
            this.q.left = i9 - i11;
            this.q.right = i9 + i10;
        }
        this.q.top = getPaddingTop() + i6;
        Rect rect = this.q;
        rect.bottom = rect.top + i5;
        this.f.setBounds(this.q);
        this.f.draw(canvas);
        if (this.l == 2) {
            this.q.left = i9 - i11;
            this.q.right = i9 + i10;
        } else {
            this.q.left = i9 - i10;
            this.q.right = i9 + i11;
        }
        this.e.setBounds(this.q);
        this.e.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int intrinsicWidth = this.e.getIntrinsicWidth();
        this.s = intrinsicWidth + intrinsicWidth;
        this.t = this.e.getIntrinsicHeight();
        this.r = this.p.measureText("125.5x");
        float f2 = this.p.getFontMetrics().top;
        float f3 = this.p.getFontMetrics().bottom;
        int paddingLeft = (int) (((float) ((this.s * 4) + getPaddingLeft() + getPaddingRight())) + this.r);
        int max = (int) Math.max((float) (this.t + getPaddingTop() + getPaddingBottom()), f2 + f3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            max = Math.min(max, size2);
        } else if (mode2 == 1073741824) {
            max = size2;
        }
        int i4 = this.t;
        if (i4 != max) {
            float f4 = (float) i4;
            float f5 = ((float) max) / f4;
            i4 = (int) (f4 * f5);
            this.t = i4;
            this.s = (int) (((float) this.s) * f5);
        }
        float f6 = this.o;
        this.u = (int) (((float) i4) * f6);
        this.v = (int) (((float) this.s) * f6);
        setMeasuredDimension(paddingLeft, max);
    }

    public final void a(float f2) {
        float abs = Math.abs(f2 - this.a);
        if (this.b == this.a && abs > 0.05f) {
            this.c = SystemClock.elapsedRealtime();
        }
        this.b = f2;
        if (abs < 0.05f) {
            this.a = f2;
        }
        postInvalidateOnAnimation();
    }

    public final void a(int i2) {
        if (this.j != i2) {
            this.j = i2 & 255;
            postInvalidate();
        }
    }

    public final void a(int i2, int i3) {
        if (i2 != 0) {
            if (this.i != i3) {
                this.i = i3;
                a();
                postInvalidate();
            }
        } else if (this.h != i3) {
            this.h = i3;
            a();
            postInvalidate();
        }
    }
}
