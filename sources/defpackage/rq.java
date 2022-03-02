package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rq extends oz {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager b;
    public final View c;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private rp k;
    private int l = Integer.MIN_VALUE;

    public rq(View view) {
        this.c = view;
        this.b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (qb.f(view) == 0) {
            qb.b(view, 1);
        }
    }

    private final void e(int i2) {
        int i3 = this.l;
        if (i3 != i2) {
            this.l = i2;
            b(i2, 128);
            b(i3, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    private final qs f(int i2) {
        boolean z;
        qs a = qs.a();
        a.d(true);
        a.k();
        a.a((CharSequence) "android.view.View");
        a.b(f);
        a.d(f);
        View view = this.c;
        a.b = -1;
        a.a.setParent(view);
        a(i2, a);
        if (a.h() == null && a.i() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a.a(this.h);
        if (!this.h.equals(f)) {
            int actions = a.a.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                a.a.setPackageName(this.c.getContext().getPackageName());
                View view2 = this.c;
                a.c = i2;
                int i3 = Build.VERSION.SDK_INT;
                a.a.setSource(view2, i2);
                if (this.d != i2) {
                    a.b(false);
                    a.a(64);
                } else {
                    a.b(true);
                    a.a(128);
                }
                if (this.e == i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a.a(2);
                } else if (a.c()) {
                    a.a(1);
                }
                a.a.setFocused(z);
                this.c.getLocationOnScreen(this.j);
                a.c(this.g);
                if (this.g.equals(f)) {
                    a.a(this.g);
                    if (a.b != -1) {
                        qs a2 = qs.a();
                        for (int i4 = a.b; i4 != -1; i4 = a2.b) {
                            View view3 = this.c;
                            a2.b = -1;
                            int i5 = Build.VERSION.SDK_INT;
                            a2.a.setParent(view3, -1);
                            a2.b(f);
                            a(0, a2);
                            a2.a(this.h);
                            this.g.offset(this.h.left, this.h.top);
                        }
                        a2.a.recycle();
                    }
                    this.g.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                }
                if (this.c.getLocalVisibleRect(this.i)) {
                    this.i.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                    if (this.g.intersect(this.i)) {
                        a.d(this.g);
                        Rect rect = this.g;
                        if (rect != null && !rect.isEmpty() && this.c.getWindowVisibility() == 0) {
                            ViewParent parent = this.c.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    int i6 = Build.VERSION.SDK_INT;
                                    a.a.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return a;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(float f2, float f3);

    /* access modifiers changed from: package-private */
    public final qs a(int i2) {
        if (i2 != -1) {
            return f(i2);
        }
        qs a = qs.a(AccessibilityNodeInfo.obtain(this.c));
        qb.a(this.c, a);
        ArrayList arrayList = new ArrayList();
        a((List) arrayList);
        if (a.a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = this.c;
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int i4 = Build.VERSION.SDK_INT;
                a.a.addChild(view, intValue);
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* access modifiers changed from: protected */
    public void a(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, qs qsVar);

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(List list);

    /* access modifiers changed from: protected */
    public void a(qs qsVar) {
    }

    public abstract boolean a(int i2, int i3);

    public final void b(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i2 != Integer.MIN_VALUE && this.b.isEnabled() && (parent = this.c.getParent()) != null) {
            if (i2 != -1) {
                accessibilityEvent = AccessibilityEvent.obtain(i3);
                qs a = a(i2);
                accessibilityEvent.getText().add(a.h());
                accessibilityEvent.setContentDescription(a.i());
                accessibilityEvent.setScrollable(a.f());
                accessibilityEvent.setPassword(a.e());
                accessibilityEvent.setEnabled(a.d());
                accessibilityEvent.setChecked(a.b());
                a(i2, accessibilityEvent);
                if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                    accessibilityEvent.setClassName(a.g());
                    View view = this.c;
                    int i4 = Build.VERSION.SDK_INT;
                    accessibilityEvent.setSource(view, i2);
                    accessibilityEvent.setPackageName(this.c.getContext().getPackageName());
                } else {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
            } else {
                accessibilityEvent = AccessibilityEvent.obtain(i3);
                this.c.onInitializeAccessibilityEvent(accessibilityEvent);
            }
            parent.requestSendAccessibilityEvent(this.c, accessibilityEvent);
        }
    }

    public final boolean c(int i2) {
        int i3;
        if ((this.c.isFocused() || this.c.requestFocus()) && (i3 = this.e) != i2) {
            if (i3 != Integer.MIN_VALUE) {
                d(i3);
            }
            if (i2 != Integer.MIN_VALUE) {
                this.e = i2;
                a(i2, true);
                b(i2, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i2) {
        if (this.e != i2) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        a(i2, false);
        b(i2, 8);
        return true;
    }

    public final qv a(View view) {
        if (this.k == null) {
            this.k = new rp(this);
        }
        return this.k;
    }

    public final boolean b(int i2) {
        if (this.d != i2) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        this.c.invalidate();
        b(i2, 65536);
        return true;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        a(qsVar);
    }

    public final boolean a(int i2, Rect rect) {
        qs qsVar;
        qs qsVar2;
        boolean z;
        Object obj;
        int i3;
        int i4 = i2;
        Rect rect2 = rect;
        ArrayList arrayList = new ArrayList();
        a((List) arrayList);
        ov ovVar = new ov();
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ovVar.b(((Integer) arrayList.get(i6)).intValue(), f(((Integer) arrayList.get(i6)).intValue()));
        }
        int i7 = this.e;
        int i8 = Integer.MIN_VALUE;
        if (i7 != Integer.MIN_VALUE) {
            qsVar = (qs) ovVar.a(i7);
        } else {
            qsVar = null;
        }
        int i9 = -1;
        if (i4 == 1 || i4 == 2) {
            if (qb.h(this.c) == 1) {
                z = true;
            } else {
                z = false;
            }
            int c2 = ovVar.c();
            ArrayList arrayList2 = new ArrayList(c2);
            for (int i10 = 0; i10 < c2; i10++) {
                arrayList2.add(ro.a(ovVar, i10));
            }
            Collections.sort(arrayList2, new rr(z));
            if (i4 == 1) {
                int size = arrayList2.size();
                if (qsVar != null) {
                    size = arrayList2.indexOf(qsVar);
                }
                int i11 = size - 1;
                obj = i11 >= 0 ? arrayList2.get(i11) : null;
            } else if (i4 == 2) {
                int size2 = arrayList2.size();
                if (qsVar != null) {
                    i3 = arrayList2.lastIndexOf(qsVar);
                } else {
                    i3 = -1;
                }
                int i12 = i3 + 1;
                obj = i12 < size2 ? arrayList2.get(i12) : null;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            qsVar2 = (qs) obj;
        } else if (i4 == 17 || i4 == 33 || i4 == 66 || i4 == 130) {
            Rect rect3 = new Rect();
            int i13 = this.e;
            if (i13 != Integer.MIN_VALUE) {
                a(i13).a(rect3);
            } else if (rect2 == null) {
                View view = this.c;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i4 == 17) {
                    rect3.set(width, 0, width, height);
                } else if (i4 == 33) {
                    rect3.set(0, height, width, height);
                } else if (i4 == 66) {
                    rect3.set(-1, 0, -1, height);
                } else if (i4 == 130) {
                    rect3.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            } else {
                rect3.set(rect2);
            }
            Rect rect4 = new Rect(rect3);
            if (i4 == 17) {
                rect4.offset(rect3.width() + 1, 0);
            } else if (i4 == 33) {
                rect4.offset(0, rect3.height() + 1);
            } else if (i4 == 66) {
                rect4.offset(-(rect3.width() + 1), 0);
            } else if (i4 == 130) {
                rect4.offset(0, -(rect3.height() + 1));
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            int c3 = ovVar.c();
            Rect rect5 = new Rect();
            qs qsVar3 = null;
            for (int i14 = 0; i14 < c3; i14++) {
                qs a = ro.a(ovVar, i14);
                if (a != qsVar) {
                    ((qs) a).a(rect5);
                    if (rs.a(rect3, rect5, i4) && (!rs.a(rect3, rect4, i4) || rs.a(i4, rect3, rect5, rect4) || (!rs.a(i4, rect3, rect4, rect5) && rs.a(rs.a(i4, rect3, rect5), rs.b(i4, rect3, rect5)) < rs.a(rs.a(i4, rect3, rect4), rs.b(i4, rect3, rect4))))) {
                        rect4.set(rect5);
                        qsVar3 = a;
                    }
                }
            }
            qsVar2 = qsVar3;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (qsVar2 != null) {
            if (ovVar.a) {
                ovVar.b();
            }
            while (true) {
                if (i5 < ovVar.c) {
                    if (ovVar.b[i5] == qsVar2) {
                        i9 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            i8 = ovVar.c(i9);
        }
        return c(i8);
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!this.b.isEnabled() || !this.b.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a = a(motionEvent.getX(), motionEvent.getY());
            e(a);
            if (a != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.l == Integer.MIN_VALUE) {
            return false;
        } else {
            e(Integer.MIN_VALUE);
            return true;
        }
    }
}
