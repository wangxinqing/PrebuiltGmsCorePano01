package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: ug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ug extends sg implements xy {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean A = true;
    private boolean B;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    zx d;
    ActionBarContextView e;
    View f;
    uf g;
    vr h;
    vq i;
    public int j = 0;
    public boolean k = true;
    boolean l;
    public boolean m;
    public wb n;
    boolean o;
    final qh p = new uc(this);
    final qh q = new ud(this);
    final ue r = new ue(this);
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x = new ArrayList();
    private boolean y;
    private boolean z;

    public ug(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f = decorView.findViewById(16908290);
        }
    }

    private final void a(View view) {
        zx zxVar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((ug) actionBarOverlayLayout.g).j = actionBarOverlayLayout.a;
                int i2 = actionBarOverlayLayout.f;
                if (i2 != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i2);
                    qb.r(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof zx) {
            zxVar = (zx) findViewById;
        } else if (findViewById instanceof Toolbar) {
            zxVar = ((Toolbar) findViewById).o();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.d = zxVar;
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.c = actionBarContainer;
        zx zxVar2 = this.d;
        if (zxVar2 == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = zxVar2.b();
        if ((this.d.o() & 4) != 0) {
            this.v = true;
        }
        vp a2 = vp.a(this.a);
        int i3 = a2.a.getApplicationInfo().targetSdkVersion;
        p();
        i(a2.b());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, uh.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2.c) {
                this.o = true;
                actionBarOverlayLayout2.a(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            qb.a((View) this.c, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (!z4) {
            return !z2 && !z3;
        }
        return true;
    }

    private final void i(boolean z2) {
        boolean z3;
        this.y = z2;
        if (z2) {
            this.d.r();
        } else {
            this.d.r();
        }
        int p2 = this.d.p();
        zx zxVar = this.d;
        boolean z4 = true;
        if (this.y) {
            z3 = false;
        } else {
            z3 = p2 == 2;
        }
        zxVar.a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (this.y || p2 != 2) {
            z4 = false;
        }
        actionBarOverlayLayout.d = z4;
    }

    public final CharSequence b() {
        return this.d.e();
    }

    public final int c() {
        return this.d.o();
    }

    public final void d() {
        if (this.l) {
            this.l = false;
            g(false);
        }
    }

    public final void e() {
        if (!this.l) {
            this.l = true;
            g(false);
        }
    }

    public final void f(boolean z2) {
        if (z2 != this.w) {
            this.w = z2;
            int size = this.x.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((sf) this.x.get(i2)).a();
            }
        }
    }

    public final Context g() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.u = new ContextThemeWrapper(this.a, i2);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    public final void h(boolean z2) {
        qg qgVar;
        qg qgVar2;
        long j2;
        if (!z2) {
            if (this.z) {
                this.z = false;
                g(false);
            }
        } else if (!this.z) {
            this.z = true;
            g(false);
        }
        if (qb.A(this.c)) {
            if (!z2) {
                qgVar = this.d.a(0, 200);
                qgVar2 = this.e.a(8, 100);
            } else {
                qg a2 = this.d.a(4, 100);
                qgVar2 = a2;
                qgVar = this.e.a(0, 200);
            }
            wb wbVar = new wb();
            wbVar.a.add(qgVar2);
            View view = (View) qgVar2.a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            View view2 = (View) qgVar.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            wbVar.a.add(qgVar);
            wbVar.a();
        } else if (!z2) {
            this.d.d(0);
            this.e.setVisibility(8);
        } else {
            this.d.d(4);
            this.e.setVisibility(0);
        }
    }

    public final boolean k() {
        zx zxVar = this.d;
        if (zxVar == null || !zxVar.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    public final void m() {
        i(vp.a(this.a).b());
    }

    public final void n() {
        a(16, 16);
    }

    public final void o() {
        this.d.t();
    }

    public final void p() {
        this.d.s();
    }

    public final void b(int i2) {
        this.d.a(i2);
    }

    public final void c(int i2) {
        a((CharSequence) this.a.getString(i2));
    }

    public final void d(int i2) {
        if ((i2 & 4) != 0) {
            this.v = true;
        }
        this.d.b(i2);
    }

    public final void e(int i2) {
        this.d.c(i2);
    }

    public final void b(Drawable drawable) {
        ActionBarContainer actionBarContainer = this.c;
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.b);
        }
        actionBarContainer.b = drawable;
        drawable.setCallback(actionBarContainer);
        View view = actionBarContainer.a;
        if (view != null) {
            actionBarContainer.b.setBounds(view.getLeft(), actionBarContainer.a.getTop(), actionBarContainer.a.getRight(), actionBarContainer.a.getBottom());
        }
        boolean z2 = true;
        if (!actionBarContainer.e ? !(actionBarContainer.b == null && actionBarContainer.c == null) : actionBarContainer.d != null) {
            z2 = false;
        }
        actionBarContainer.setWillNotDraw(z2);
        actionBarContainer.invalidate();
        int i2 = Build.VERSION.SDK_INT;
        actionBarContainer.invalidateOutline();
    }

    public final void c(Drawable drawable) {
        this.d.b(drawable);
    }

    public final void d(boolean z2) {
        if (!this.v) {
            b(z2);
        }
    }

    public final void e(boolean z2) {
        wb wbVar;
        this.B = z2;
        if (!z2 && (wbVar = this.n) != null) {
            wbVar.b();
        }
    }

    public final boolean f() {
        int height = this.c.getHeight();
        if (!this.A || (height != 0 && this.b.b() >= height)) {
            return false;
        }
        return true;
    }

    public final void g(boolean z2) {
        View view;
        View view2;
        View view3;
        if (a(this.l, this.m, this.z)) {
            if (!this.A) {
                this.A = true;
                wb wbVar = this.n;
                if (wbVar != null) {
                    wbVar.b();
                }
                this.c.setVisibility(0);
                if (this.j == 0 && (this.B || z2)) {
                    this.c.setTranslationY(0.0f);
                    float f2 = (float) (-this.c.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.c.setTranslationY(f2);
                    wb wbVar2 = new wb();
                    qg m2 = qb.m(this.c);
                    m2.b(0.0f);
                    m2.a(this.r);
                    wbVar2.a(m2);
                    if (this.k && (view3 = this.f) != null) {
                        view3.setTranslationY(f2);
                        qg m3 = qb.m(this.f);
                        m3.b(0.0f);
                        wbVar2.a(m3);
                    }
                    wbVar2.a(t);
                    wbVar2.c();
                    wbVar2.a(this.q);
                    this.n = wbVar2;
                    wbVar2.a();
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.k && (view2 = this.f) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.q.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                if (actionBarOverlayLayout != null) {
                    qb.r(actionBarOverlayLayout);
                }
            }
        } else if (this.A) {
            this.A = false;
            wb wbVar3 = this.n;
            if (wbVar3 != null) {
                wbVar3.b();
            }
            if (this.j == 0 && (this.B || z2)) {
                this.c.setAlpha(1.0f);
                this.c.a(true);
                wb wbVar4 = new wb();
                float f3 = (float) (-this.c.getHeight());
                if (z2) {
                    int[] iArr2 = {0, 0};
                    this.c.getLocationInWindow(iArr2);
                    f3 -= (float) iArr2[1];
                }
                qg m4 = qb.m(this.c);
                m4.b(f3);
                m4.a(this.r);
                wbVar4.a(m4);
                if (this.k && (view = this.f) != null) {
                    qg m5 = qb.m(view);
                    m5.b(f3);
                    wbVar4.a(m5);
                }
                wbVar4.a(s);
                wbVar4.c();
                wbVar4.a(this.p);
                this.n = wbVar4;
                wbVar4.a();
                return;
            }
            this.p.b();
        }
    }

    public final void c(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public final void c(boolean z2) {
        a(!z2 ? 0 : 8, 8);
    }

    public ug(Dialog dialog) {
        new ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    public final void b(CharSequence charSequence) {
        this.d.c(charSequence);
    }

    public final void b(boolean z2) {
        a(!z2 ? 0 : 4, 4);
    }

    public final View a() {
        return this.d.q();
    }

    public final vr a(vq vqVar) {
        uf ufVar = this.g;
        if (ufVar != null) {
            ufVar.c();
        }
        this.b.a(false);
        this.e.a();
        uf ufVar2 = new uf(this, this.e.getContext(), vqVar);
        ufVar2.a.e();
        try {
            if (!ufVar2.b.a((vr) ufVar2, (Menu) ufVar2.a)) {
                return null;
            }
            this.g = ufVar2;
            ufVar2.d();
            this.e.a((vr) ufVar2);
            h(true);
            this.e.sendAccessibilityEvent(32);
            return ufVar2;
        } finally {
            ufVar2.a.f();
        }
    }

    public final void a(int i2) {
        this.d.a(LayoutInflater.from(g()).inflate(i2, this.d.a(), false));
    }

    public final void a(int i2, int i3) {
        int o2 = this.d.o();
        if ((i3 & 4) != 0) {
            this.v = true;
        }
        this.d.b((i2 & i3) | ((i3 ^ -1) & o2));
    }

    public final void a(Drawable drawable) {
        this.d.a(drawable);
    }

    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void a(boolean z2) {
        a(!z2 ? 0 : 2, 2);
    }

    public final boolean a(int i2, KeyEvent keyEvent) {
        wt wtVar;
        int i3;
        uf ufVar = this.g;
        if (ufVar == null || (wtVar = ufVar.a) == null) {
            return false;
        }
        if (keyEvent != null) {
            i3 = keyEvent.getDeviceId();
        } else {
            i3 = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(i3).getKeyboardType() == 1) {
            z2 = false;
        }
        wtVar.setQwertyMode(z2);
        return wtVar.performShortcut(i2, keyEvent, 0);
    }
}
