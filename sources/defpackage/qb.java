package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qb {
    private static WeakHashMap a = null;
    private static Field b;
    private static boolean c = false;
    private static ThreadLocal d;

    static {
        new AtomicInteger(1);
        new px();
    }

    public static boolean A(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    public static float B(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getZ();
    }

    public static Rect C(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getClipBounds();
    }

    public static boolean D(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    public static boolean E(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOnClickListeners();
    }

    public static Display F(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getDisplay();
    }

    public static boolean G(View view) {
        Boolean bool = (Boolean) new pu(Boolean.class).b(view);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static CharSequence H(View view) {
        return (CharSequence) new pv(CharSequence.class).b(view);
    }

    public static void I(View view) {
        oz c2 = c(view);
        if (c2 == null) {
            c2 = new oz();
        }
        a(view, c2);
    }

    @Deprecated
    public static void J(View view) {
        view.setAlpha(0.0f);
    }

    public static void K(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    public static void L(View view) {
        int i = Build.VERSION.SDK_INT;
        view.setTranslationZ(-1.0f);
    }

    private static View.AccessibilityDelegate M(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                c = true;
                return null;
            }
        }
        Object obj = b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    private static List N(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    private static void O(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Deprecated
    public static int a(View view) {
        return view.getOverScrollMode();
    }

    public static int b(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static oz c(View view) {
        View.AccessibilityDelegate M = M(view);
        if (M == null) {
            return null;
        }
        if (M instanceof oy) {
            return ((oy) M).a;
        }
        return new oz(M);
    }

    public static void d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setLayoutDirection(i);
    }

    public static View e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return view.requireViewById(i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static int f(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static float g(View view) {
        return view.getAlpha();
    }

    public static int h(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    public static int i(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingStart();
    }

    public static int j(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingEnd();
    }

    public static int k(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    public static int l(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    public static qg m(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        qg qgVar = (qg) a.get(view);
        if (qgVar != null) {
            return qgVar;
        }
        qg qgVar2 = new qg(view);
        a.put(view, qgVar2);
        return qgVar2;
    }

    @Deprecated
    public static float n(View view) {
        return view.getY();
    }

    public static float o(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getElevation();
    }

    public static String p(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getTransitionName();
    }

    public static int q(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    public static void r(View view) {
        int i = Build.VERSION.SDK_INT;
        view.requestApplyInsets();
    }

    public static boolean s(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getFitsSystemWindows();
    }

    public static qn t(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return qn.a(view.getRootWindowInsets());
        }
        return null;
    }

    public static boolean u(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOverlappingRendering();
    }

    public static boolean v(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isPaddingRelative();
    }

    public static ColorStateList w(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode x(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintMode();
    }

    public static boolean y(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isNestedScrollingEnabled();
    }

    public static void z(View view) {
        int i = Build.VERSION.SDK_INT;
        view.stopNestedScroll();
    }

    public static py a() {
        return new pw(Boolean.class);
    }

    private static Rect b() {
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect = (Rect) d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean d(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    public static void f(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setAccessibilityLiveRegion(i);
    }

    public static void g(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Rect b2 = b();
        ViewParent parent = view.getParent();
        boolean z = false;
        if (parent instanceof View) {
            View view2 = (View) parent;
            b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            if (!b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                z = true;
            }
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            O(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                O((View) parent2);
            }
        }
        if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(b2);
        }
    }

    public static void h(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Rect b2 = b();
        ViewParent parent = view.getParent();
        boolean z = false;
        if (parent instanceof View) {
            View view2 = (View) parent;
            b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            if (!b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                z = true;
            }
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            O(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                O((View) parent2);
            }
        }
        if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(b2);
        }
    }

    public static void i(View view, int i) {
        int i2;
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            CharSequence H = H(view);
            int i3 = Build.VERSION.SDK_INT;
            if (view.getAccessibilityLiveRegion() != 0 || (H != null && view.getVisibility() == 0)) {
                if (H == null) {
                    i2 = 2048;
                } else {
                    i2 = 32;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void j(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    public static qn a(View view, qn qnVar) {
        int i = Build.VERSION.SDK_INT;
        Object obj = qnVar.a;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets((WindowInsets) obj);
        boolean equals = onApplyWindowInsets.equals(obj);
        WindowInsets windowInsets = obj;
        if (!equals) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return qn.a((WindowInsets) windowInsets);
    }

    public static void c(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        a(i, view);
        i(view, 0);
    }

    public static void e(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    private static void a(int i, View view) {
        List N = N(view);
        int i2 = 0;
        while (i2 < N.size()) {
            if (((qp) N.get(i2)).a() != i) {
                i2++;
            } else {
                N.remove(i2);
                return;
            }
        }
    }

    public static qn b(View view, qn qnVar) {
        int i = Build.VERSION.SDK_INT;
        Object obj = qnVar.a;
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets((WindowInsets) obj);
        boolean equals = dispatchApplyWindowInsets.equals(obj);
        WindowInsets windowInsets = obj;
        if (!equals) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return qn.a((WindowInsets) windowInsets);
    }

    public static void a(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setElevation(f);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void b(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setZ(f);
    }

    public static void b(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    @Deprecated
    public static void b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        qa a2 = qa.a(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = a2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!qa.a.isEmpty()) {
                synchronized (qa.a) {
                    if (a2.b == null) {
                        a2.b = new WeakHashMap();
                    }
                    for (int size = qa.a.size() - 1; size >= 0; size--) {
                        View view2 = (View) ((WeakReference) qa.a.get(size)).get();
                        if (view2 != null) {
                            a2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                a2.b.put((View) parent, Boolean.TRUE);
                            }
                        } else {
                            qa.a.remove(size);
                        }
                    }
                }
            }
        }
        View a3 = a2.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                a2.a().put(keyCode, new WeakReference(a3));
            }
        }
        if (a3 != null) {
            return true;
        }
        return false;
    }

    public static void a(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void a(View view, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        view.setClipBounds(rect);
    }

    public static void a(View view, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    public static void a(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void a(View view, String str) {
        int i = Build.VERSION.SDK_INT;
        view.setTransitionName(str);
    }

    public static void a(View view, oz ozVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (ozVar == null && (M(view) instanceof oy)) {
            ozVar = new oz();
        }
        if (ozVar != null) {
            accessibilityDelegate = ozVar.a;
        } else {
            accessibilityDelegate = null;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void a(View view, pq pqVar) {
        int i = Build.VERSION.SDK_INT;
        if (pqVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new pt(pqVar));
        }
    }

    public static void a(View view, ps psVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (psVar != null ? psVar.a : null));
        }
    }

    public static void a(View view, qp qpVar, rf rfVar) {
        if (rfVar != null) {
            qp qpVar2 = new qp((Object) null, qpVar.l, (CharSequence) null, rfVar, qpVar.m);
            int i = Build.VERSION.SDK_INT;
            I(view);
            a(qpVar2.a(), view);
            N(view).add(qpVar2);
            i(view, 0);
            return;
        }
        c(view, qpVar.a());
    }

    public static void a(View view, qs qsVar) {
        view.onInitializeAccessibilityNodeInfo(qsVar.a);
    }

    public static void a(View view, boolean z) {
        int i = Build.VERSION.SDK_INT;
        view.setHasTransientState(z);
    }

    @Deprecated
    public static boolean a(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static boolean a(View view, int i, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.view.View r4, android.view.KeyEvent r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 28
            if (r0 >= r2) goto L_0x0064
            qa r4 = defpackage.qa.a(r4)
            java.lang.ref.WeakReference r0 = r4.c
            r2 = 1
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.get()
            if (r0 == r5) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            goto L_0x0063
        L_0x0018:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.c = r0
            android.util.SparseArray r4 = r4.a()
            int r0 = r5.getAction()
            r3 = 0
            if (r0 != r2) goto L_0x003e
            int r0 = r5.getKeyCode()
            int r0 = r4.indexOfKey(r0)
            if (r0 < 0) goto L_0x003e
            java.lang.Object r3 = r4.valueAt(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r4.removeAt(r0)
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r3 != 0) goto L_0x004c
            int r5 = r5.getKeyCode()
            java.lang.Object r4 = r4.get(r5)
            r3 = r4
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
        L_0x004c:
            if (r3 == 0) goto L_0x0017
            java.lang.Object r4 = r3.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0062
            boolean r5 = D(r4)
            if (r5 != 0) goto L_0x005e
            r1 = 1
            goto L_0x0063
        L_0x005e:
            defpackage.qa.b(r4)
            return r2
        L_0x0062:
            r1 = 1
        L_0x0063:
            return r1
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.a(android.view.View, android.view.KeyEvent):boolean");
    }
}
