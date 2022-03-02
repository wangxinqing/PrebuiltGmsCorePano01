package com.google.android.pano.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaybackControlsView extends akfd implements View.OnClickListener {
    private static final akgz[] B;
    protected boolean A;
    private float C;
    private Runnable D;
    private Runnable E;
    protected ImageButton b;
    protected ImageButton c;
    protected ImageButton d;
    protected SeekButton e;
    protected SeekButton f;
    protected SeekBar g;
    protected TextView h;
    protected TextView i;
    protected int j;
    protected akha k;
    protected akha l;
    protected float m;
    protected int n;
    protected int o;
    protected int p;
    protected akga q;
    protected akga r;
    protected akga s;
    protected boolean t;
    protected Resources u;
    protected Handler v;
    protected boolean w;
    protected boolean x;
    protected boolean y;
    protected boolean z;

    static {
        akgz[] akgzArr = new akgz[2];
        B = akgzArr;
        akgzArr[0] = new akgz();
        B[0].c = 255;
        B[0].b = 1.0f;
        B[0].a = (int[]) ENABLED_FOCUSED_STATE_SET.clone();
        B[1] = new akgz();
        B[1].c = 100;
        B[1].b = 0.73f;
        B[1].a = (int[]) EMPTY_STATE_SET.clone();
    }

    public PlaybackControlsView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.u = getContext().getResources();
        this.j = 0;
        this.l = new akha(this.u.getDrawable(R.drawable.ic_playback_rwd), B);
        this.k = new akha(this.u.getDrawable(R.drawable.ic_playback_fwd), B);
        new akha(this.u.getDrawable(R.drawable.ic_playback_pause), B);
        new akha(this.u.getDrawable(R.drawable.ic_playback_play), B);
        new akha(this.u.getDrawable(R.drawable.ic_playback_replay), B);
    }

    public final boolean c() {
        return this.w || this.x;
    }

    public final boolean d() {
        boolean z2;
        boolean z3 = true;
        if (this.r.a) {
            a(0, 0.0f);
            this.r.a = false;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.q.a) {
            a(0, 0.0f);
            this.q.a = false;
        } else {
            z3 = false;
        }
        return z2 | z3;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((keyEvent.getSource() & 2097152) == 2097152) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean z2 = false;
        if (keyEvent.getAction() == 1 && this.y) {
            this.y = false;
            return true;
        } else if (keyEvent.getAction() != 0 || ((!this.d.hasFocus() && !this.z) || !c())) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            int keyCode = keyEvent.getKeyCode();
            float f2 = keyCode != 21 ? keyCode == 22 ? 0.2f : 0.0f : -0.2f;
            if (f2 != 0.0f) {
                akga akga = this.s;
                float f3 = akga.b + f2;
                akga.b = f3;
                if (f3 < 0.0f && !this.w) {
                    boolean z3 = akga.a;
                    a(0, 0.0f);
                    a(0.0f);
                    this.y = z3;
                    return z3;
                } else if (f3 > 0.0f && !this.x) {
                    boolean z4 = akga.a;
                    a(0, 0.0f);
                    a(0.0f);
                    this.y = z4;
                    return z4;
                } else {
                    if (f3 > 1.0f) {
                        akga.b = 1.0f;
                        f3 = 1.0f;
                    } else if (f3 < -1.0f) {
                        akga.b = -1.0f;
                        f3 = -1.0f;
                    }
                    if (f3 != 0.0f) {
                        z2 = true;
                    }
                    akga.a = z2;
                    a((int) Math.signum(f3), Math.abs(this.s.b));
                    a(this.s.b);
                    this.y = true;
                    return true;
                }
            } else {
                this.y = false;
                return super.dispatchKeyEvent(keyEvent);
            }
        }
    }

    public final void e() {
        float f2;
        if (this.t) {
            int i2 = 4;
            this.i.setVisibility(this.o >= 0 ? 0 : 4);
            this.g.setVisibility((this.o < 0 || this.n < 0) ? 4 : 0);
            TextView textView = this.h;
            if (this.n >= 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            if (this.o >= 0 && this.g.getMax() != 0) {
                this.i.setText(String.format("%d:%02d", new Object[]{0, 0}));
                this.g.setMax(this.o);
            }
            this.v.removeCallbacks(this.D);
            if (this.n >= 0 && this.g.getProgress() != 0) {
                this.g.setProgress(0);
                this.A = true;
                if (this.p != 0) {
                    this.p = 0;
                    this.h.setText(String.format("%d:%02d", new Object[]{0, 0}));
                    int width = getWidth();
                    int paddingLeft = getPaddingLeft();
                    this.h.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) ((width - paddingLeft) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((getHeight() - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE));
                    int left = this.h.getLeft();
                    int bottom = this.h.getBottom();
                    this.h.layout(left, bottom - this.h.getMeasuredHeight(), this.h.getMeasuredWidth() + left, bottom);
                }
                float width2 = (float) ((this.g.getWidth() - this.g.getPaddingLeft()) - this.g.getPaddingRight());
                float paddingLeft2 = (float) (this.g.getPaddingLeft() + this.g.getLeft());
                float width3 = (float) ((this.h.getWidth() - this.h.getPaddingLeft()) - this.h.getPaddingRight());
                if (this.o >= 0) {
                    f2 = (((width2 * 0.0f) / 0.0f) - (width3 / 2.0f)) + paddingLeft2;
                } else {
                    f2 = ((width2 - width3) / 2.0f) + paddingLeft2;
                }
                int width4 = ((getWidth() - this.h.getWidth()) - getPaddingLeft()) - getPaddingRight();
                if (f2 >= paddingLeft2) {
                    paddingLeft2 = (float) width4;
                    if (f2 <= paddingLeft2) {
                        paddingLeft2 = f2;
                    }
                }
                this.h.setTranslationX(paddingLeft2);
                this.A = false;
            }
        }
    }

    public final void f() {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i4;
        if (this.t) {
            int i5 = this.j;
            boolean z5 = true;
            int i6 = 0;
            if ((i5 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.w = z2;
            if ((i5 & 1) == 0) {
                z3 = false;
            } else {
                z3 = !z2;
            }
            ImageButton imageButton = this.b;
            if (!z3) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageButton.setVisibility(i2);
            this.b.setEnabled(z3);
            this.b.setFocusable(z3);
            this.b.setImageDrawable(this.l);
            int i7 = this.j;
            if ((i7 & 64) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.x = z4;
            if ((i7 & 128) == 0) {
                z5 = false;
            } else if (z4) {
                z5 = false;
            }
            ImageButton imageButton2 = this.c;
            if (!z5) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageButton2.setVisibility(i3);
            this.c.setEnabled(z5);
            this.c.setFocusable(z5);
            this.c.setImageDrawable(this.k);
            SeekButton seekButton = this.e;
            if (!this.w) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            seekButton.setVisibility(i4);
            SeekButton seekButton2 = this.f;
            if (!this.x) {
                i6 = 8;
            }
            seekButton2.setVisibility(i6);
        }
    }

    public void onClick(View view) {
        view.getId();
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((akfc) arrayList.get(i2)).b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (d() == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0044
            int r0 = r5.getSource()
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0044
            r0 = 0
            float r0 = r5.getAxisValue(r0)
            akga r1 = r4.q
            float r2 = r1.b
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0044
            r1.b = r0
            float r1 = java.lang.Math.abs(r0)
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r3 = 1
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0034
            r0 = 0
            r4.a(r0)
            boolean r0 = r4.d()
            if (r0 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0034:
            float r5 = java.lang.Math.signum(r0)
            int r5 = (int) r5
            r4.a((int) r5, (float) r1)
            akga r5 = r4.q
            r5.a = r3
            r4.a(r0)
        L_0x0043:
            return r3
        L_0x0044:
            boolean r5 = super.onGenericMotionEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.pano.widget.PlaybackControlsView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i2) {
        if (this == view && i2 != 0) {
            d();
        }
        super.onVisibilityChanged(view, i2);
    }

    public final boolean requestFocus(int i2, Rect rect) {
        if (!this.z) {
            this.d.requestFocus();
            return true;
        } else if (this.w && this.C < 0.0f) {
            this.e.requestFocus();
            return true;
        } else if (!this.x || this.C <= 0.0f) {
            return true;
        } else {
            this.f.requestFocus();
            return true;
        }
    }

    public final void requestLayout() {
        if (!this.A) {
            super.requestLayout();
        }
    }

    public PlaybackControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new akfx(this);
        this.E = new akfy(this);
        this.m = 0.0f;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = new akga();
        this.r = new akga();
        this.s = new akga();
        this.v = new qvr();
        this.y = false;
        this.z = false;
        this.A = false;
        LayoutInflater.from(getContext()).inflate(R.layout.default_controller_view, this, true);
        ImageButton imageButton = (ImageButton) findViewById(R.id.controller_prev);
        this.b = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.controller_playpause);
        this.d = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.controller_next);
        this.c = imageButton3;
        imageButton3.setOnClickListener(this);
        SeekButton seekButton = (SeekButton) findViewById(R.id.controller_rw);
        this.e = seekButton;
        seekButton.setOnClickListener(this);
        SeekButton seekButton2 = (SeekButton) findViewById(R.id.controller_ffw);
        this.f = seekButton2;
        seekButton2.setOnClickListener(this);
        SeekBar seekBar = (SeekBar) findViewById(R.id.controller_seekBar);
        this.g = seekBar;
        seekBar.setFocusable(false);
        this.h = (TextView) findViewById(R.id.controller_time);
        this.i = (TextView) findViewById(R.id.controller_duration);
        this.t = true;
        f();
        e();
    }

    public final void a(float f2) {
        if (f2 > 0.15f && this.x) {
            this.f.setFocusable(true);
            this.f.requestFocus();
            this.z = true;
        } else if (f2 < -0.15f && this.w) {
            this.e.setFocusable(true);
            this.e.requestFocus();
            this.z = true;
        } else if (this.z) {
            this.f.setFocusable(false);
            this.e.setFocusable(false);
            this.d.requestFocus();
            this.z = false;
        }
        this.C = f2;
        if (Math.abs(f2) < 0.08f) {
            this.f.a(0.0f);
            this.e.a(0.0f);
            return;
        }
        float f3 = this.C;
        if (f3 <= 0.0f) {
            this.f.a(0.0f);
            this.e.a(-this.C);
            return;
        }
        this.f.a(f3);
        this.e.a(0.0f);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, float f2) {
        float f3 = ((float) i2) * f2;
        if (((double) Math.abs(f3 - this.m)) > 0.02d || i2 == 0) {
            float f4 = this.m;
            if (f4 == 0.0f && f3 != 0.0f) {
                b();
            } else if (f4 != 0.0f && f3 == 0.0f) {
                b();
            }
            this.m = f3;
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                akfc akfc = (akfc) arrayList.get(i3);
                if (akfc instanceof akfz) {
                    ((akfz) akfc).c();
                }
            }
            akga akga = this.s;
            if (i2 != 0) {
                z2 = true;
            }
            akga.a = z2;
            double d2 = (double) i2;
            Double.isNaN(d2);
            akga.b = (float) ((Math.floor((double) (f2 * 5.0f)) / 5.0d) * d2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, AttributeSet attributeSet) {
        context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akdi.b);
        int i2 = !obtainStyledAttributes.getBoolean(0, false) ? 0 : 64;
        if (obtainStyledAttributes.getBoolean(1, false)) {
            i2 |= 128;
        }
        if (obtainStyledAttributes.getBoolean(3, false)) {
            i2 |= 4;
        }
        if (obtainStyledAttributes.getBoolean(2, false)) {
            i2 |= 16;
        }
        if (obtainStyledAttributes.getBoolean(4, false)) {
            i2 |= 1;
        }
        if (obtainStyledAttributes.getBoolean(5, false)) {
            i2 |= 2;
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.k = new akha(this.u.getDrawable(obtainStyledAttributes.getResourceId(11, R.drawable.ic_playback_fwd)), B);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.l = new akha(this.u.getDrawable(obtainStyledAttributes.getResourceId(14, R.drawable.ic_playback_rwd)), B);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f.a(0, obtainStyledAttributes.getResourceId(6, R.drawable.ic_playback_scrub_fwd));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.e.a(0, obtainStyledAttributes.getResourceId(16, R.drawable.ic_playback_scrub_rwd));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            new akha(this.u.getDrawable(obtainStyledAttributes.getResourceId(13, R.drawable.ic_playback_play)), B);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            new akha(this.u.getDrawable(obtainStyledAttributes.getResourceId(12, R.drawable.ic_playback_pause)), B);
        }
        if (obtainStyledAttributes.hasValue(9)) {
            int integer = obtainStyledAttributes.getInteger(9, 102);
            this.f.a(integer);
            this.e.a(integer);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            int integer2 = obtainStyledAttributes.getInteger(8, 255);
            this.f.b(integer2);
            this.e.b(integer2);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f.a(1, obtainStyledAttributes.getResourceId(7, R.drawable.ic_playback_scrubber_line));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            this.e.a(1, obtainStyledAttributes.getResourceId(17, R.drawable.ic_playback_scrubber_line_reverse));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            new akha(this.u.getDrawable(obtainStyledAttributes.getResourceId(15, R.drawable.ic_playback_replay)), B);
        }
        if (i2 != 0) {
            this.j = i2;
            this.v.post(this.E);
        }
        obtainStyledAttributes.recycle();
    }
}
