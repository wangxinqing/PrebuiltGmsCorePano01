package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.R;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;
import com.google.android.libraries.material.internal.TouchObserverFrameLayout;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenSearchView extends FrameLayout implements ahi {
    public final View a;
    public final ClippableRoundedCornerLayout b;
    final View c;
    final View d;
    public final FrameLayout e;
    public final Toolbar f;
    public final Toolbar g;
    public final TextView h;
    public final EditText i;
    public final ImageButton j;
    public final View k;
    public final TouchObserverFrameLayout l;
    public final aeoe m;
    public aenj n;
    public boolean o;
    public boolean p;
    private final boolean q;
    private final ajwh r;
    private final Set s;
    private int t;
    private boolean u;
    private Map v;
    private int w;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Behavior extends ahj {
        public Behavior() {
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            OpenSearchView openSearchView = (OpenSearchView) view;
            if (openSearchView.n != null || !(view2 instanceof aenj)) {
                return false;
            }
            aenj aenj = (aenj) view2;
            openSearchView.n = aenj;
            openSearchView.m.k = aenj;
            aenj.setOnClickListener(new aenq(openSearchView));
            openSearchView.a(qb.h(openSearchView));
            openSearchView.b();
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new aent();
        String c;
        int d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readString();
            this.d = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public OpenSearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(float f2) {
        ajwh ajwh = this.r;
        if (ajwh != null && this.c != null) {
            this.c.setBackgroundColor(ajwh.a(ajwh.b, f2));
        }
    }

    private final void k() {
        int i2;
        ImageButton b2 = aenh.b(this.f);
        if (b2 != null) {
            if (this.b.getVisibility() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            Drawable drawable = b2.getDrawable();
            if (drawable instanceof uw) {
                ((uw) drawable).a((float) i2);
            }
            if (drawable instanceof aemw) {
                ((aemw) drawable).a((float) i2);
            }
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (this.q) {
            this.l.addView(view, i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }

    public final void b() {
        if (this.n == null) {
            a(getResources().getDimension(R.dimen.google_opensearchview_elevation));
            return;
        }
        throw null;
    }

    public final Editable c() {
        return this.i.getText();
    }

    public final boolean d() {
        int i2 = this.w;
        if (i2 != 0) {
            return i2 == 4 || i2 == 3;
        }
        throw null;
    }

    public final void e() {
        int i2 = this.w;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 4 && i2 != 3) {
            aeoe aeoe = this.m;
            if (aeoe.k == null) {
                if (aeoe.a.j()) {
                    OpenSearchView openSearchView = aeoe.a;
                    openSearchView.getClass();
                    openSearchView.postDelayed(new aenv(openSearchView), 150);
                }
                aeoe.c.setVisibility(4);
                aeoe.c.post(new aenw(aeoe));
                b(true);
                return;
            }
            if (aeoe.a.j()) {
                aeoe.a.g();
            }
            aeoe.a.b(3);
            Menu h2 = aeoe.e.h();
            if (h2 != null) {
                h2.clear();
            }
            throw null;
        }
    }

    public final void f() {
        int i2 = this.w;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 2 && i2 != 1) {
            aeoe aeoe = this.m;
            if (aeoe.k == null) {
                if (aeoe.a.j()) {
                    aeoe.a.h();
                }
                AnimatorSet a2 = aeoe.a(false);
                a2.addListener(new aeoc(aeoe));
                a2.start();
            } else {
                if (aeoe.a.j()) {
                    aeoe.a.h();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[9];
                TimeInterpolator timeInterpolator = ajrr.b;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(250);
                ofFloat.setInterpolator(aeng.a(false, timeInterpolator));
                ofFloat.addUpdateListener(aene.a(aeoe.b));
                animatorArr[0] = ofFloat;
                OpenSearchView openSearchView = aeoe.a;
                Rect rect = new Rect(openSearchView.getLeft(), openSearchView.getTop(), openSearchView.getRight(), openSearchView.getBottom());
                int[] iArr = new int[2];
                aeoe.k.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                aeoe.c.getLocationOnScreen(iArr2);
                int i5 = i3 - iArr2[0];
                int i6 = i4 - iArr2[1];
                Rect rect2 = new Rect(i5, i6, aeoe.k.getWidth() + i5, aeoe.k.getHeight() + i6);
                Rect rect3 = new Rect(rect2);
                float dimension = aeoe.a.getResources().getDimension(R.dimen.google_opensearchbar_radius);
                ValueAnimator ofObject = ValueAnimator.ofObject(new aenf(rect3), new Object[]{rect2, rect});
                ofObject.addUpdateListener(new aenx(aeoe, dimension, rect3));
                ofObject.setDuration(250);
                ofObject.setInterpolator(aeng.a(false, ajrr.b));
                animatorArr[1] = ofObject;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat2.setDuration(42);
                ofFloat2.setStartDelay(0);
                ofFloat2.setInterpolator(aeng.a(false, ajrr.a));
                ofFloat2.addUpdateListener(aene.a(aeoe.h));
                animatorArr[2] = ofFloat2;
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat3.setDuration(83);
                ofFloat3.setStartDelay(0);
                ofFloat3.setInterpolator(aeng.a(false, ajrr.a));
                ofFloat3.addUpdateListener(aene.a(aeoe.i, aeoe.j));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{(((float) aeoe.j.getHeight()) * 0.050000012f) / 2.0f, 0.0f});
                ofFloat4.setDuration(250);
                ofFloat4.setInterpolator(aeng.a(false, ajrr.b));
                ofFloat4.addUpdateListener(aene.c(aeoe.i));
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.95f, 1.0f});
                ofFloat5.setDuration(250);
                ofFloat5.setInterpolator(aeng.a(false, ajrr.b));
                ofFloat5.addUpdateListener(new aene(aena.a, aeoe.j));
                animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4, ofFloat5});
                animatorArr[3] = animatorSet2;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ImageButton b2 = aenh.b(aeoe.d);
                if (b2 != null) {
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{(float) aeoe.a((View) b2), 0.0f});
                    ofFloat6.addUpdateListener(aene.b(b2));
                    ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{(float) aeoe.a(), 0.0f});
                    ofFloat7.addUpdateListener(aene.c(b2));
                    animatorSet3.playTogether(new Animator[]{ofFloat6, ofFloat7});
                }
                aeoe.a(animatorSet3);
                ActionMenuView a3 = aenh.a(aeoe.d);
                if (a3 != null) {
                    ValueAnimator ofFloat8 = ValueAnimator.ofFloat(new float[]{(float) aeoe.b(a3), 0.0f});
                    ofFloat8.addUpdateListener(aene.b(a3));
                    ValueAnimator ofFloat9 = ValueAnimator.ofFloat(new float[]{(float) aeoe.a(), 0.0f});
                    ofFloat9.addUpdateListener(aene.c(a3));
                    animatorSet3.playTogether(new Animator[]{ofFloat8, ofFloat9});
                }
                animatorSet3.setDuration(250);
                animatorSet3.setInterpolator(aeng.a(false, ajrr.b));
                animatorArr[4] = animatorSet3;
                animatorArr[5] = aeoe.a(false, aeoe.e);
                ValueAnimator ofFloat10 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat10.setDuration(250);
                ofFloat10.setInterpolator(aeng.a(false, ajrr.b));
                if (aeoe.a.p) {
                    ofFloat10.addUpdateListener(new aemx(aenh.a(aeoe.e), aenh.a(aeoe.d)));
                }
                animatorArr[6] = ofFloat10;
                animatorArr[7] = aeoe.a(true, aeoe.g);
                animatorArr[8] = aeoe.a(true, aeoe.f);
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(new aeod(aeoe));
                animatorSet.addListener(new aeoa(aeoe));
                animatorSet.start();
            }
            b(false);
        }
    }

    public final void g() {
        if (this.u) {
            this.i.post(new aenr(this));
        }
    }

    public final void h() {
        this.i.clearFocus();
        i().hideSoftInputFromWindow(this.i.getWindowToken(), 0);
    }

    public final InputMethodManager i() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    public final boolean j() {
        return this.t == 48;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajzg.a((View) this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 == 768) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinishInflate() {
        /*
            r8 = this;
            super.onFinishInflate()
            android.content.Context r0 = r8.getContext()
        L_0x0007:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x0019
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0016
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0007
        L_0x0016:
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0060
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x002a
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            int r1 = r1.softInputMode
            r8.t = r1
        L_0x002a:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0054
            android.view.WindowManager$LayoutParams r3 = r0.getAttributes()
            int r4 = android.os.Build.VERSION.SDK_INT
            int r4 = r3.flags
            int r3 = r3.flags
            r5 = 512(0x200, float:7.175E-43)
            r3 = r3 & r5
            int r6 = android.os.Build.VERSION.SDK_INT
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r6 = 768(0x300, float:1.076E-42)
            r0 = r0 & r6
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r7
            if (r4 != r7) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            if (r3 != r5) goto L_0x0051
        L_0x0050:
            goto L_0x0055
        L_0x0051:
            if (r0 != r6) goto L_0x0054
            goto L_0x0050
        L_0x0054:
            r1 = 0
        L_0x0055:
            android.view.View r0 = r8.d
            if (r1 != 0) goto L_0x005c
            r2 = 8
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            r0.setVisibility(r2)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.opensearchbar.OpenSearchView.onFinishInflate():void");
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        a((CharSequence) savedState.c);
        a(savedState.d == 0);
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        a(i2);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable c2 = c();
        savedState.c = c2 != null ? c2.toString() : null;
        savedState.d = this.b.getVisibility();
        return savedState;
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        a(f2);
    }

    public OpenSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchViewStyle);
    }

    public OpenSearchView(Context context, AttributeSet attributeSet, int i2) {
        super(akdg.a(context, attributeSet, i2, 2132018889), attributeSet, i2);
        this.s = new LinkedHashSet();
        this.t = 16;
        this.w = 2;
        Context context2 = getContext();
        int i3 = 0;
        TypedArray a2 = ajya.a(context2, attributeSet, aeof.a, i2, 2132018889, new int[0]);
        int resourceId = a2.getResourceId(0, -1);
        String string = a2.getString(1);
        String string2 = a2.getString(2);
        String string3 = a2.getString(7);
        int i4 = 8;
        boolean z = a2.getBoolean(8, false);
        this.o = a2.getBoolean(4, true);
        this.p = a2.getBoolean(3, true);
        boolean z2 = a2.getBoolean(6, false);
        this.u = a2.getBoolean(5, true);
        a2.recycle();
        LayoutInflater.from(context2).inflate(R.layout.open_search_view, this);
        this.q = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        this.b = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.c = findViewById(R.id.open_search_view_background);
        this.d = findViewById(R.id.open_search_view_status_bar_spacer);
        this.e = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        this.f = (Toolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.h = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.i = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.j = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.k = findViewById(R.id.open_search_view_divider);
        this.l = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.m = new aeoe(this);
        this.r = new ajwh(context2);
        this.b.setOnTouchListener(aenk.a);
        b();
        this.h.setText(string3);
        this.h.setVisibility(!TextUtils.isEmpty(string3) ? 0 : i4);
        if (resourceId != -1) {
            ry.a((TextView) this.i, resourceId);
        }
        this.i.setText(string);
        this.i.setHint(string2);
        if (z2) {
            this.f.b((Drawable) null);
        } else {
            this.f.a((View.OnClickListener) new aenl(this));
            if (z) {
                this.f.b((Drawable) new uw(getContext()));
            }
        }
        this.j.setOnClickListener(new aenm(this));
        this.i.addTextChangedListener(new aens(this));
        this.k.setBackgroundColor(lk.b(ajyl.a((View) this, (int) R.attr.colorOnSurface), Math.round(30.599998f)));
        this.l.a = new aenn(this);
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        layoutParams.height = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : i3;
        ajyf.a((View) this.f, (ajyd) new aeno(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        qb.a(this.k, (pq) new aenp(marginLayoutParams, marginLayoutParams.leftMargin, marginLayoutParams.rightMargin));
    }

    private final void a(ViewGroup viewGroup, boolean z) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    a((ViewGroup) childAt, z);
                } else if (z) {
                    int i3 = Build.VERSION.SDK_INT;
                    this.v.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    qb.b(childAt, 4);
                } else {
                    Map map = this.v;
                    if (map != null && map.containsKey(childAt)) {
                        qb.b(childAt, ((Integer) this.v.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void b(int i2) {
        int i3 = this.w;
        if (i3 == 0) {
            throw null;
        } else if (i3 != i2) {
            this.w = i2;
            for (aenu a2 : new LinkedHashSet(this.s)) {
                a2.a();
            }
        }
    }

    public final void b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i2 = Build.VERSION.SDK_INT;
        if (z) {
            this.v = new HashMap(viewGroup.getChildCount());
        }
        a(viewGroup, z);
        if (!z) {
            this.v = null;
        }
    }

    public final ahj a() {
        return new Behavior();
    }

    public final void a(int i2) {
        int i3;
        Toolbar toolbar = this.f;
        if (toolbar != null && !(toolbar.g() instanceof uw)) {
            if (i2 != 1) {
                i3 = R.drawable.quantum_ic_arrow_back_vd_theme_24;
            } else {
                i3 = R.drawable.quantum_ic_arrow_forward_vd_theme_24;
            }
            aenj aenj = this.n;
            if (aenj != null) {
                this.f.b((Drawable) new aemw(aenj.g(), uj.b(getContext(), i3)));
                k();
                return;
            }
            this.f.d(i3);
        }
    }

    public final void a(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    public final void a(boolean z) {
        boolean z2;
        int i2;
        int i3 = 0;
        if (this.b.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        if (!z) {
            i3 = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i3);
        k();
        if (z2 != z) {
            b(z);
        }
        if (!z) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        b(i2);
    }
}
