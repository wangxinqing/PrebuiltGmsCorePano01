package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* renamed from: akhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhg {
    private static final Rect R = new Rect();
    public static final long[] a = {400, 200, 100};
    public int A;
    public int B;
    public int C;
    public int D;
    public final View E;
    public final akhb F = new akhb();
    public akhb G;
    public boolean H = true;
    public boolean I = true;
    public int J;
    private float K;
    private float L;
    private final float M;
    private int N;
    private long O;
    private float P;
    private final akhf Q = new akhf();
    private final akhc S = new akhc(this);
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public long n;
    public boolean o;
    public long p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public int z;

    public akhg(View view) {
        new RectF();
        this.E = view;
        ViewConfiguration.get(view.getContext());
        a(100.0f);
        this.g = 1.0f;
        this.h = 1.0f;
        this.M = 1.0f;
        b();
        c();
        this.b = 0;
        this.o = false;
    }

    public static void a(View view, akhd akhd) {
        while (view != null) {
            if ((!(view instanceof akhe) || !((akhe) view).a(akhd)) && (view instanceof ViewGroup)) {
                view = ((ViewGroup) view).getFocusedChild();
            } else {
                return;
            }
        }
    }

    private final void b() {
        this.m = false;
        this.N = -1;
        this.j = 1.0f;
    }

    private final void c() {
        int i2 = this.N;
        this.k = i2 == 1 ? this.j * this.g : this.g;
        this.l = i2 == 0 ? this.j * this.h : this.h;
    }

    public final void a(float f2) {
        this.K = f2;
        this.L = f2 * f2;
        float f3 = 0.2f * f2;
        this.P = f3 * f3;
        this.y = f2 * 1.8f * this.M;
    }

    public final void a() {
        this.z = 0;
        this.A = 0;
        this.D = 0;
        this.o = false;
        c();
        akhc akhc = this.S;
        if (akhc.b != -1) {
            akhc.removeMessages(0);
            akhc.a = 0;
            akhc.b = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r21, float r23, float r24, android.view.MotionEvent r25) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r0 = r23
            r1 = r24
            r7.w = r0
            r7.x = r1
            boolean r2 = r7.m
            r10 = 0
            if (r2 == 0) goto L_0x002e
            long r2 = r7.n
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            long r2 = r8 - r2
            r4 = 300(0x12c, double:1.48E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0025
            r7.m = r10
            goto L_0x002e
        L_0x0025:
            r7.q = r0
            r7.r = r1
            r7.s = r0
            r7.t = r1
            return
        L_0x002e:
            boolean r0 = r7.i
            r11 = -1
            if (r0 != 0) goto L_0x0034
            goto L_0x0048
        L_0x0034:
            int r0 = r7.N
            if (r0 == r11) goto L_0x0048
            long r0 = r7.O
            long r0 = r8 - r0
            r2 = 800(0x320, double:3.953E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0048
            r20.b()
            r20.c()
        L_0x0048:
            float r0 = r7.w
            float r1 = r7.q
            float r2 = r7.k
            float r1 = r0 - r1
            float r12 = r1 * r2
            float r1 = r7.x
            float r3 = r7.r
            float r4 = r7.l
            float r3 = r1 - r3
            float r13 = r3 * r4
            float r3 = r12 * r12
            float r5 = r13 * r13
            float r14 = r3 + r5
            float r3 = r7.s
            float r0 = r0 - r3
            float r0 = r0 * r2
            float r2 = r7.t
            float r1 = r1 - r2
            float r1 = r1 * r4
            float r2 = r0 * r0
            float r3 = r1 * r1
            float r2 = r2 + r3
            r20.c()
            boolean r3 = r7.I
            if (r3 != 0) goto L_0x0079
            goto L_0x0081
        L_0x0079:
            float r3 = r7.P
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            r7.I = r10
        L_0x0081:
            akhf r2 = r7.Q
            float r3 = r7.K
            r2.e = r8
            float r0 = r0 / r3
            r2.a = r0
            float r1 = r1 / r3
            r2.b = r1
            android.view.View r0 = r7.E
            a(r0, r2)
        L_0x0092:
            boolean r0 = r7.H
            if (r0 == 0) goto L_0x009f
            float r0 = r7.P
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r7.H = r10
        L_0x009f:
            float r0 = r7.L
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0196
            float r0 = java.lang.Math.abs(r12)
            float r1 = java.lang.Math.abs(r13)
            r15 = 19
            r6 = 20
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00c0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
            r5 = 19
            goto L_0x00cd
        L_0x00bd:
            r5 = 20
            goto L_0x00cd
        L_0x00c0:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00c9
            r0 = 21
            r5 = 21
            goto L_0x00cd
        L_0x00c9:
            r0 = 22
            r5 = 22
        L_0x00cd:
            r4 = 1
            switch(r5) {
                case 19: goto L_0x00fb;
                case 20: goto L_0x00eb;
                case 21: goto L_0x00d9;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            int r0 = r7.B
            if (r0 < 0) goto L_0x010d
            int r0 = r0 + r4
            r7.B = r0
            goto L_0x010f
        L_0x00d9:
            int r0 = r7.B
            if (r0 > 0) goto L_0x00e1
            int r0 = r0 + r11
            r7.B = r0
            goto L_0x00e3
        L_0x00e1:
            r7.B = r11
        L_0x00e3:
            r7.C = r10
            int r0 = r7.z
            int r0 = r0 + r11
            r7.z = r0
            goto L_0x0116
        L_0x00eb:
            int r0 = r7.C
            if (r0 < 0) goto L_0x00f3
            int r0 = r0 + r4
            r7.C = r0
            goto L_0x00f5
        L_0x00f3:
            r7.C = r4
        L_0x00f5:
            r7.B = r10
            int r0 = r7.A
            int r0 = r0 + r4
            goto L_0x010a
        L_0x00fb:
            int r0 = r7.C
            if (r0 > 0) goto L_0x0103
            int r0 = r0 + r11
            r7.C = r0
            goto L_0x0105
        L_0x0103:
            r7.C = r11
        L_0x0105:
            r7.B = r10
            int r0 = r7.A
            int r0 = r0 + r11
        L_0x010a:
            r7.A = r0
            goto L_0x0116
        L_0x010d:
            r7.B = r4
        L_0x010f:
            r7.C = r10
            int r0 = r7.z
            int r0 = r0 + r4
            r7.z = r0
        L_0x0116:
            r7.H = r4
            r7.I = r4
            int r0 = r7.D
            int r0 = r0 + r4
            r7.D = r0
            int r16 = r25.getMetaState()
            int r17 = r25.getSource()
            int r18 = r25.getDeviceId()
            r0 = r20
            r1 = r21
            r3 = r5
            r19 = 1
            r4 = r16
            r10 = r5
            r5 = r17
            r11 = 20
            r6 = r18
            r0.a(r1, r3, r4, r5, r6)
            double r0 = (double) r14
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            float r1 = r7.w
            r7.s = r1
            float r2 = r7.x
            r7.t = r2
            float r3 = r7.K
            float r4 = r7.f
            float r12 = r12 * r3
            float r12 = r12 / r0
            float r12 = r12 * r4
            float r5 = r7.k
            float r12 = r12 / r5
            float r1 = r1 + r12
            r7.q = r1
            float r3 = r3 * r13
            float r3 = r3 / r0
            float r3 = r3 * r4
            float r0 = r7.l
            float r3 = r3 / r0
            float r2 = r2 + r3
            r7.r = r2
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x0196
            if (r10 == r15) goto L_0x0170
            if (r10 == r11) goto L_0x0170
            r10 = 0
            goto L_0x0171
        L_0x0170:
            r10 = 1
        L_0x0171:
            int r0 = r7.N
            r1 = -1
            if (r0 != r1) goto L_0x0177
        L_0x0176:
            goto L_0x018c
        L_0x0177:
            if (r0 != r10) goto L_0x0176
            float r0 = r7.j
            r1 = -1102263091(0xffffffffbe4ccccd, float:-0.2)
            float r0 = r0 + r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0193
            r7.j = r0
            r20.c()
            goto L_0x0193
        L_0x018c:
            r7.N = r10
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r7.j = r0
        L_0x0193:
            r7.O = r8
            return
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhg.a(long, float, float, android.view.MotionEvent):void");
    }

    public final void a(long j2, int i2, int i3, int i4, int i5) {
        int i6;
        View findFocus;
        KeyEvent keyEvent = new KeyEvent(j2, j2, 0, i2, 0, i3, i5, 0, 1024, i4);
        View rootView = this.E.getRootView();
        if (!rootView.dispatchKeyEvent(keyEvent)) {
            switch (i2) {
                case 19:
                    i6 = 33;
                    break;
                case 20:
                    i6 = 130;
                    break;
                case 21:
                    i6 = 17;
                    break;
                case 22:
                    i6 = 66;
                    break;
                default:
                    i6 = 0;
                    break;
            }
            if (!(rootView == null || (findFocus = rootView.findFocus()) == null)) {
                View focusSearch = findFocus.focusSearch(i6);
                if (focusSearch == null || focusSearch == findFocus) {
                    rootView.dispatchUnhandledMove(findFocus, i6);
                } else {
                    findFocus.getFocusedRect(R);
                    if (rootView instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) rootView;
                        viewGroup.offsetDescendantRectToMyCoords(findFocus, R);
                        viewGroup.offsetRectIntoDescendantCoords(focusSearch, R);
                    }
                    focusSearch.requestFocus(i6, R);
                }
            }
        }
        rootView.dispatchKeyEvent(new KeyEvent(j2, j2, 1, i2, 0, i3, i5, 0, 1024, i4));
    }
}
