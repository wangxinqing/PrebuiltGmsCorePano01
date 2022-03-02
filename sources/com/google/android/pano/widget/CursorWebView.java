package com.google.android.pano.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CursorWebView extends WebView {
    public static final /* synthetic */ int s = 0;
    BroadcastReceiver a;
    public akeq b;
    public MotionEvent c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public int o;
    public int p;
    public float q;
    public boolean r;
    private akfp t;
    private Rect u;
    private Paint v;
    private int w;

    public CursorWebView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r5, float r6) {
        /*
            r4 = this;
            int r0 = r4.o
            float r1 = (float) r0
            r2 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x000f
            float r2 = r5 - r1
            int r5 = r4.i
            int r5 = -r5
        L_0x000d:
            float r5 = (float) r5
            goto L_0x001a
        L_0x000f:
            float r6 = r6 - r1
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0019
            float r2 = r5 - r6
            int r5 = r4.i
            goto L_0x000d
        L_0x0019:
            r5 = 0
        L_0x001a:
            int r6 = r4.w
            int r1 = r4.j
            int r0 = r0 - r6
            float r6 = (float) r0
            float r2 = r2 / r6
            int r6 = r4.i
            int r6 = r1 - r6
            float r6 = (float) r6
            float r2 = r2 * r6
            float r2 = r2 + r5
            int r5 = -r1
            float r5 = (float) r5
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0036
            float r5 = (float) r1
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            return r5
        L_0x0036:
            r2 = r5
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.pano.widget.CursorWebView.a(float, float):float");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (keyEvent.getAction() == 1) {
            akeq akeq = this.b;
            int keyCode = keyEvent.getKeyCode();
            if (!(keyEvent2 == null || keyEvent.getDevice() == null || (keyEvent.getDevice().getSources() & 2097152) != 2097152)) {
                if (keyCode == 23) {
                    akeq.f.removeMessages(0);
                }
                akfp akfp = akeq.g;
                if (akfp != null && keyCode == 23) {
                    PointF a2 = akfp.a.a();
                    MotionEvent obtain = MotionEvent.obtain(keyEvent.getDownTime(), keyEvent.getEventTime(), 1, a2.x, a2.y, 1.0f, 0.5f, 0, 0.5f, 0.5f, keyEvent.getDeviceId(), 0);
                    super.onTouchEvent(obtain);
                    MotionEvent motionEvent = akfp.a.c;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                        akfp.a.c = null;
                    }
                    obtain.recycle();
                    return true;
                }
            }
        }
        if (keyEvent.getAction() == 0) {
            akeq akeq2 = this.b;
            int keyCode2 = keyEvent.getKeyCode();
            if (!(keyEvent2 == null || keyEvent.getDevice() == null || (keyEvent.getDevice().getSources() & 2097152) != 2097152)) {
                if (keyEvent.getRepeatCount() == 0 && keyCode2 == 23) {
                    Message obtainMessage = akeq2.f.obtainMessage(0);
                    obtainMessage.arg1 = 23;
                    obtainMessage.obj = keyEvent2;
                    if (!akeq2.f.hasMessages(0)) {
                        akeq2.f.sendMessageDelayed(obtainMessage, (long) ViewConfiguration.getLongPressTimeout());
                    }
                }
                akfp akfp2 = akeq2.g;
                if (akfp2 != null && keyCode2 == 23) {
                    PointF a3 = akfp2.a.a();
                    MotionEvent motionEvent2 = akfp2.a.c;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                        akfp2.a.c = null;
                    }
                    akfp2.a.c = MotionEvent.obtain(keyEvent.getDownTime(), keyEvent.getEventTime(), 0, a3.x, a3.y, 1.0f, 0.5f, 0, 0.5f, 0.5f, keyEvent.getDeviceId(), 0);
                    CursorWebView cursorWebView = akfp2.a;
                    super.onTouchEvent(cursorWebView.c);
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.u);
        Rect rect = this.u;
        int i2 = -this.p;
        rect.inset(i2, i2);
        canvas.clipRect(this.u, Region.Op.REPLACE);
    }

    public final void onPause() {
        getContext().unregisterReceiver(this.a);
    }

    public final void onResume() {
        Context context = getContext();
        IntentFilter intentFilter = new IntentFilter("scroll");
        intentFilter.addAction("size");
        intentFilter.addAction("cursor");
        context.registerReceiver(this.a, intentFilter);
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = this.p - this.f;
        int i7 = i6 + i6;
        float f2 = (float) (i2 + i7);
        this.m = f2;
        float f3 = (float) (i3 + i7);
        this.n = f3;
        akeq akeq = this.b;
        akeq.d = f3;
        akeq.c = f2;
        akeq.b();
    }

    public CursorWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new akfn(this);
        this.a = new akfo(this);
        this.t = new akfp(this);
        new Rect();
        this.u = new Rect();
        this.v = new Paint();
        this.g = 50.0f;
        this.h = 50.0f;
        this.i = 3;
        this.j = 48;
        this.k = 512;
        this.l = 10000.0f;
        this.r = false;
        setWillNotDraw(false);
        akeq akeq = new akeq(this.t);
        this.b = akeq;
        akeq.b(this.g, this.h);
        Resources resources = context.getResources();
        this.o = (int) resources.getDimension(R.dimen.cursor_web_view_scroll_margin);
        this.p = (int) resources.getDimension(R.dimen.cursor_web_view_draw_margin);
        this.w = (int) resources.getDimension(R.dimen.cursor_web_view_accel_padding);
        this.q = resources.getDimension(R.dimen.cursor_web_view_bounce_rate);
        this.d = resources.getColor(R.color.touch_indicator_active);
        this.e = resources.getColor(R.color.touch_indicator_inactive);
        this.f = (int) resources.getDimension(R.dimen.cursor_touch_size);
        this.v.setStyle(Paint.Style.FILL);
        float dimension = resources.getDimension(R.dimen.pixels_per_mm);
        akeq akeq2 = this.b;
        akeq2.e = dimension;
        if (dimension > 0.0f) {
            akeq2.b();
        }
    }

    public final PointF a() {
        PointF a2 = this.b.a();
        getLocationOnScreen(new int[2]);
        a2.x += (float) ((-this.p) + this.f);
        a2.y += (float) ((-this.p) + this.f);
        return a2;
    }
}
