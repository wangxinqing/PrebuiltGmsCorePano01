package defpackage;

import android.view.MotionEvent;

/* renamed from: aley  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aley {
    public MotionEvent a;
    private final alff b;

    public aley(alff alff) {
        this.b = alff;
    }

    private final void a(MotionEvent motionEvent, int i) {
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        obtainNoHistory.setAction(i);
        this.b.a(obtainNoHistory);
        obtainNoHistory.recycle();
    }

    public final void b() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.a = null;
        }
    }

    public final void a() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.setAction(3);
            this.b.a(this.a);
            this.a.recycle();
            this.a = null;
        }
    }

    public final void a(MotionEvent motionEvent) {
        int i;
        int actionMasked;
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 3) {
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked2 == 5 || actionMasked2 == 0) {
                pointerCount--;
            }
            MotionEvent motionEvent2 = this.a;
            if (motionEvent2 == null || (actionMasked = motionEvent2.getActionMasked()) == 3) {
                i = 0;
            } else {
                i = this.a.getPointerCount();
                if (actionMasked == 6 || actionMasked == 1) {
                    i--;
                }
            }
            if (i < pointerCount) {
                if (i == 0) {
                    a(motionEvent, 0);
                    i = 1;
                }
                while (i < pointerCount) {
                    a(motionEvent, (i << 8) | 5);
                    i++;
                }
            } else if (i > pointerCount) {
                MotionEvent motionEvent3 = this.a;
                int max = Math.max(pointerCount, 1);
                while (i > max) {
                    i--;
                    a(motionEvent3, (i << 8) | 6);
                }
                if (pointerCount == 0) {
                    a(motionEvent3, 1);
                }
            }
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 3) {
            b();
        } else {
            this.a = MotionEvent.obtain(motionEvent);
        }
        this.b.a(motionEvent);
    }
}
