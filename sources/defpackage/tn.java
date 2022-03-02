package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* renamed from: tn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tn extends sv implements LayoutInflater.Factory2, wr {
    private static final ou D = new ou();
    private static final int[] E = {16842836};
    private static final boolean F = (!"robolectric".equals(Build.FINGERPRINT));
    private static final boolean G = true;
    int A;
    public Rect B;
    public Rect C;
    private tf H;
    private CharSequence I;
    private tc J;
    private tm K;
    private boolean L;
    private TextView M;
    private boolean N;
    private boolean O;
    private boolean P;
    private tl[] Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V = -100;
    private int W;
    private boolean X;
    private boolean Y;
    private ti Z;
    private ti aa;
    private final Runnable ab = new sw(this);
    private boolean ac;
    private tr ad;
    final Object d;
    final Context e;
    public Window f;
    final su g;
    sg h;
    MenuInflater i;
    public zw j;
    vr k;
    ActionBarContextView l;
    public PopupWindow m;
    public Runnable n;
    qg o = null;
    public boolean p = true;
    ViewGroup q;
    public View r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    public tl x;
    boolean y;
    boolean z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    public tn(Context context, Window window, su suVar, Object obj) {
        Integer num;
        st stVar = null;
        this.e = context;
        this.g = suVar;
        this.d = obj;
        if (this.V == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof st)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        stVar = (st) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (stVar != null) {
                this.V = stVar.f().i();
            }
        }
        if (this.V == -100 && (num = (Integer) D.get(this.d.getClass().getName())) != null) {
            this.V = num.intValue();
            D.remove(this.d.getClass().getName());
        }
        if (window != null) {
            a(window);
        }
        yu.a();
    }

    private static final Configuration a(Context context, int i2, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private final ti b(Context context) {
        if (this.Z == null) {
            if (ub.a == null) {
                Context applicationContext = context.getApplicationContext();
                ub.a = new ub(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Z = new tj(this, ub.a);
        }
        return this.Z;
    }

    private final ti c(Context context) {
        if (this.aa == null) {
            this.aa = new tg(this, context);
        }
        return this.aa;
    }

    private final void g(int i2) {
        this.A = (1 << i2) | this.A;
        if (!this.z) {
            qb.a(this.f.getDecorView(), this.ab);
            this.z = true;
        }
    }

    private final void v() {
        x();
        if (this.s && this.h == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                this.h = new ug((Activity) obj, this.t);
            } else if (obj instanceof Dialog) {
                this.h = new ug((Dialog) obj);
            }
            sg sgVar = this.h;
            if (sgVar != null) {
                sgVar.d(this.ac);
            }
        }
    }

    private final void w() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void x() {
        ViewGroup viewGroup;
        Context context;
        if (!this.L) {
            TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(uh.j);
            if (obtainStyledAttributes.hasValue(115)) {
                if (obtainStyledAttributes.getBoolean(124, false)) {
                    d(1);
                } else if (obtainStyledAttributes.getBoolean(115, false)) {
                    d(108);
                }
                if (obtainStyledAttributes.getBoolean(116, false)) {
                    d(109);
                }
                if (obtainStyledAttributes.getBoolean(117, false)) {
                    d(10);
                }
                this.v = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                w();
                this.f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.e);
                if (this.w) {
                    viewGroup = this.u ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.v) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.t = false;
                    this.s = false;
                } else if (this.s) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new vt(this.e, typedValue.resourceId);
                    } else {
                        context = this.e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    zw zwVar = (zw) viewGroup.findViewById(R.id.decor_content_parent);
                    this.j = zwVar;
                    zwVar.a(q());
                    if (this.t) {
                        this.j.b(109);
                    }
                    if (this.N) {
                        this.j.b(2);
                    }
                    if (this.O) {
                        this.j.b(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    qb.a((View) viewGroup, (pq) new sx(this));
                    if (this.j == null) {
                        this.M = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    afs.b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f.setContentView(viewGroup);
                    contentFrameLayout.i = new sy(this);
                    this.q = viewGroup;
                    CharSequence s2 = s();
                    if (!TextUtils.isEmpty(s2)) {
                        zw zwVar2 = this.j;
                        if (zwVar2 == null) {
                            sg sgVar = this.h;
                            if (sgVar == null) {
                                TextView textView = this.M;
                                if (textView != null) {
                                    textView.setText(s2);
                                }
                            } else {
                                sgVar.c(s2);
                            }
                        } else {
                            zwVar2.a(s2);
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.q.findViewById(16908290);
                    View decorView = this.f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (qb.A(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.e.obtainStyledAttributes(uh.j);
                    if (contentFrameLayout2.b == null) {
                        contentFrameLayout2.b = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.b);
                    if (contentFrameLayout2.c == null) {
                        contentFrameLayout2.c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.c);
                    if (obtainStyledAttributes2.hasValue(120)) {
                        if (contentFrameLayout2.d == null) {
                            contentFrameLayout2.d = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.d);
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        if (contentFrameLayout2.e == null) {
                            contentFrameLayout2.e = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.e);
                    }
                    if (obtainStyledAttributes2.hasValue(118)) {
                        if (contentFrameLayout2.f == null) {
                            contentFrameLayout2.f = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(118, contentFrameLayout2.f);
                    }
                    if (obtainStyledAttributes2.hasValue(119)) {
                        if (contentFrameLayout2.g == null) {
                            contentFrameLayout2.g = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(119, contentFrameLayout2.g);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.L = true;
                    tl f2 = f(0);
                    if (this.y) {
                        return;
                    }
                    if (f2 == null || f2.j == null) {
                        g(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.s + ", windowActionBarOverlay: " + this.t + ", android:windowIsFloating: " + this.v + ", windowActionModeOverlay: " + this.u + ", windowNoTitle: " + this.w + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    private final void y() {
        if (this.L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final int z() {
        int i2 = this.V;
        return i2 == -100 ? sv.a : i2;
    }

    public final void a(int i2) {
        this.W = i2;
    }

    public final void d() {
        this.U = false;
        sg a = a();
        if (a != null) {
            a.e(false);
        }
    }

    public final void e() {
        sg a = a();
        if (a != null) {
            a.e(true);
        }
    }

    public final tl f(int i2) {
        tl[] tlVarArr = this.Q;
        if (tlVarArr == null || tlVarArr.length <= i2) {
            tl[] tlVarArr2 = new tl[(i2 + 1)];
            if (tlVarArr != null) {
                System.arraycopy(tlVarArr, 0, tlVarArr2, 0, tlVarArr.length);
            }
            this.Q = tlVarArr2;
            tlVarArr = tlVarArr2;
        }
        tl tlVar = tlVarArr[i2];
        if (tlVar != null) {
            return tlVar;
        }
        tl tlVar2 = new tl(i2);
        tlVarArr[i2] = tlVar2;
        return tlVar2;
    }

    public final void h() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            pg.a(from, this);
        } else if (!(from.getFactory2() instanceof tn)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final int i() {
        return this.V;
    }

    public final void j() {
        a(true);
    }

    public final void k() {
        String str;
        this.S = true;
        a(false);
        w();
        Object obj = this.d;
        if (obj instanceof Activity) {
            try {
                str = iz.c((Activity) obj);
            } catch (IllegalArgumentException e2) {
                str = null;
            }
            if (str != null) {
                sg sgVar = this.h;
                if (sgVar == null) {
                    this.ac = true;
                } else {
                    sgVar.d(true);
                }
            }
        }
        synchronized (sv.c) {
            sv.a((sv) this);
            sv.b.add(new WeakReference(this));
        }
        this.T = true;
    }

    public final void l() {
        x();
    }

    public final void m() {
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(str, context, attributeSet);
    }

    public final void p() {
        sg a;
        if (this.s && this.L && (a = a()) != null) {
            a.m();
        }
        yu.b().a(this.e);
        a(false);
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback q() {
        return this.f.getCallback();
    }

    /* access modifiers changed from: package-private */
    public final Context r() {
        sg a = a();
        Context g2 = a != null ? a.g() : null;
        return g2 == null ? this.e : g2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence s() {
        Object obj = this.d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.I;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.q
            if (r0 == 0) goto L_0x0010
            boolean r0 = defpackage.qb.A(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.t():boolean");
    }

    public final void u() {
        qg qgVar = this.o;
        if (qgVar != null) {
            qgVar.a();
        }
    }

    public final void c() {
        this.U = true;
        j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = defpackage.sv.c
            monitor-enter(r0)
            defpackage.sv.a((defpackage.sv) r3)     // Catch:{ all -> 0x006f }
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            boolean r0 = r3.z
            if (r0 != 0) goto L_0x000c
            goto L_0x0017
        L_0x000c:
            android.view.Window r0 = r3.f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ab
            r0.removeCallbacks(r1)
        L_0x0017:
            r0 = 0
            r3.U = r0
            r0 = 1
            r3.y = r0
            int r0 = r3.V
            r1 = -100
            if (r0 != r1) goto L_0x0024
            goto L_0x0048
        L_0x0024:
            java.lang.Object r0 = r3.d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            ou r0 = D
            java.lang.Object r1 = r3.d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.V
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            ou r0 = D
            java.lang.Object r1 = r3.d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            sg r0 = r3.h
            if (r0 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r0.l()
        L_0x005f:
            ti r0 = r3.Z
            if (r0 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r0.e()
        L_0x0067:
            ti r0 = r3.aa
            if (r0 == 0) goto L_0x006e
            r0.e()
        L_0x006e:
            return
        L_0x006f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.g():void");
    }

    public final void c(int i2) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.q.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.H.b.onContentChanged();
    }

    public final void d(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (!this.w || i2 != 108) {
            if (this.s && i2 == 1) {
                this.s = false;
            }
            if (i2 == 1) {
                y();
                this.w = true;
            } else if (i2 == 2) {
                y();
                this.N = true;
            } else if (i2 == 5) {
                y();
                this.O = true;
            } else if (i2 == 10) {
                y();
                this.u = true;
            } else if (i2 == 108) {
                y();
                this.s = true;
            } else if (i2 != 109) {
                this.f.requestFeature(i2);
            } else {
                y();
                this.t = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2) {
        tl f2;
        tl f3 = f(i2);
        if (f3.j != null) {
            Bundle bundle = new Bundle();
            f3.j.a(bundle);
            if (bundle.size() > 0) {
                f3.s = bundle;
            }
            f3.j.e();
            f3.j.clear();
        }
        f3.r = true;
        f3.q = true;
        if ((i2 == 108 || i2 == 0) && this.j != null && (f2 = f(0)) != null) {
            f2.m = false;
            a(f2, (KeyEvent) null);
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return a(str, context, attributeSet);
    }

    public final void f() {
        sg a = a();
        if (a == null || !a.j()) {
            g(0);
        }
    }

    private final void a(Window window) {
        if (this.f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof tf)) {
                tf tfVar = new tf(this, callback);
                this.H = tfVar;
                window.setCallback(tfVar);
                aev a = aev.a(this.e, (AttributeSet) null, E);
                Drawable b = a.b(0);
                if (b != null) {
                    window.setBackgroundDrawable(b);
                }
                a.a();
                this.f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r14.h != null) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.tl r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.o
            if (r0 != 0) goto L_0x01ce
            boolean r0 = r13.y
            if (r0 != 0) goto L_0x01ce
            int r0 = r14.a
            if (r0 != 0) goto L_0x001f
            android.content.Context r0 = r13.e
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 == r1) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return
        L_0x001f:
            android.view.Window$Callback r0 = r13.q()
            r1 = 1
            if (r0 == 0) goto L_0x0036
            int r2 = r14.a
            wt r3 = r14.j
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 == 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            r13.a((defpackage.tl) r14, (boolean) r1)
            return
        L_0x0036:
            android.content.Context r0 = r13.e
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L_0x01cd
            boolean r15 = r13.a((defpackage.tl) r14, (android.view.KeyEvent) r15)
            if (r15 == 0) goto L_0x01cd
            android.view.ViewGroup r15 = r14.g
            r2 = -1
            r3 = 0
            r4 = -2
            if (r15 == 0) goto L_0x0067
            boolean r5 = r14.q
            if (r5 != 0) goto L_0x0067
            android.view.View r15 = r14.i
            if (r15 == 0) goto L_0x0064
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x0064
            int r15 = r15.width
            if (r15 != r2) goto L_0x0064
            r6 = -1
            goto L_0x01a6
        L_0x0064:
            r6 = -2
            goto L_0x01a6
        L_0x0067:
            if (r15 != 0) goto L_0x00de
            android.content.Context r15 = r13.r()
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            r6 = 2130968579(0x7f040003, float:1.7545816E38)
            r5.resolveAttribute(r6, r2, r1)
            int r6 = r2.resourceId
            if (r6 == 0) goto L_0x0090
            int r6 = r2.resourceId
            r5.applyStyle(r6, r1)
        L_0x0090:
            r6 = 2130969687(0x7f040457, float:1.7548063E38)
            r5.resolveAttribute(r6, r2, r1)
            int r6 = r2.resourceId
            if (r6 == 0) goto L_0x00a0
            int r2 = r2.resourceId
            r5.applyStyle(r2, r1)
            goto L_0x00a6
        L_0x00a0:
            r2 = 2132018372(0x7f1404c4, float:1.9675049E38)
            r5.applyStyle(r2, r1)
        L_0x00a6:
            vt r2 = new vt
            r2.<init>((android.content.Context) r15, (int) r3)
            android.content.res.Resources$Theme r15 = r2.getTheme()
            r15.setTo(r5)
            r14.l = r2
            int[] r15 = defpackage.uh.j
            android.content.res.TypedArray r15 = r2.obtainStyledAttributes(r15)
            r2 = 84
            int r2 = r15.getResourceId(r2, r3)
            r14.b = r2
            int r2 = r15.getResourceId(r1, r3)
            r14.f = r2
            r15.recycle()
            tk r15 = new tk
            android.content.Context r2 = r14.l
            r15.<init>(r13, r2)
            r14.g = r15
            r15 = 81
            r14.c = r15
            android.view.ViewGroup r15 = r14.g
            if (r15 == 0) goto L_0x00dd
            goto L_0x00ed
        L_0x00dd:
            return
        L_0x00de:
            boolean r2 = r14.q
            if (r2 == 0) goto L_0x00ed
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00ed
            android.view.ViewGroup r15 = r14.g
            r15.removeAllViews()
        L_0x00ed:
            android.view.View r15 = r14.i
            if (r15 != 0) goto L_0x0154
            wt r15 = r14.j
            if (r15 == 0) goto L_0x01ca
            tm r15 = r13.K
            if (r15 != 0) goto L_0x0100
            tm r15 = new tm
            r15.<init>(r13)
            r13.K = r15
        L_0x0100:
            tm r15 = r13.K
            wt r2 = r14.j
            if (r2 == 0) goto L_0x014c
            wp r2 = r14.k
            if (r2 != 0) goto L_0x011c
            wp r2 = new wp
            android.content.Context r5 = r14.l
            r2.<init>(r5)
            r14.k = r2
            wp r2 = r14.k
            r2.g = r15
            wt r15 = r14.j
            r15.a((defpackage.xh) r2)
        L_0x011c:
            wp r15 = r14.k
            android.view.ViewGroup r2 = r14.g
            android.support.v7.view.menu.ExpandedMenuView r5 = r15.d
            if (r5 != 0) goto L_0x0149
            android.view.LayoutInflater r5 = r15.b
            r6 = 2131623949(0x7f0e000d, float:1.8875064E38)
            android.view.View r2 = r5.inflate(r6, r2, r3)
            android.support.v7.view.menu.ExpandedMenuView r2 = (android.support.v7.view.menu.ExpandedMenuView) r2
            r15.d = r2
            wo r2 = r15.h
            if (r2 == 0) goto L_0x0136
            goto L_0x013d
        L_0x0136:
            wo r2 = new wo
            r2.<init>(r15)
            r15.h = r2
        L_0x013d:
            android.support.v7.view.menu.ExpandedMenuView r2 = r15.d
            wo r5 = r15.h
            r2.setAdapter(r5)
            android.support.v7.view.menu.ExpandedMenuView r2 = r15.d
            r2.setOnItemClickListener(r15)
        L_0x0149:
            android.support.v7.view.menu.ExpandedMenuView r15 = r15.d
            goto L_0x014d
        L_0x014c:
            r15 = 0
        L_0x014d:
            r14.h = r15
            android.view.View r15 = r14.h
            if (r15 == 0) goto L_0x01ca
            goto L_0x0156
        L_0x0154:
            r14.h = r15
        L_0x0156:
            android.view.View r15 = r14.h
            if (r15 == 0) goto L_0x01ca
            android.view.View r15 = r14.i
            if (r15 != 0) goto L_0x016a
            wp r15 = r14.k
            android.widget.ListAdapter r15 = r15.c()
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x01ca
        L_0x016a:
            android.view.View r15 = r14.h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0177
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0177:
            int r2 = r14.b
            android.view.ViewGroup r5 = r14.g
            r5.setBackgroundResource(r2)
            android.view.View r2 = r14.h
            android.view.ViewParent r2 = r2.getParent()
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x018f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r14.h
            r2.removeView(r5)
        L_0x018f:
            android.view.ViewGroup r2 = r14.g
            android.view.View r5 = r14.h
            r2.addView(r5, r15)
            android.view.View r15 = r14.h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01a4
            android.view.View r15 = r14.h
            r15.requestFocus()
            goto L_0x01a5
        L_0x01a4:
        L_0x01a5:
            r6 = -2
        L_0x01a6:
            r14.n = r3
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            int r2 = r14.d
            int r2 = r14.e
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r2 = r14.c
            r15.gravity = r2
            int r2 = r14.f
            r15.windowAnimations = r2
            android.view.ViewGroup r2 = r14.g
            r0.addView(r2, r15)
            r14.o = r1
            return
        L_0x01ca:
            r14.q = r1
            return
        L_0x01cd:
            return
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.b(tl, android.view.KeyEvent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.y
            if (r0 != 0) goto L_0x0169
            int r0 = r11.z()
            android.content.Context r1 = r11.e
            int r1 = r11.a((android.content.Context) r1, (int) r0)
            android.content.Context r2 = r11.e
            r3 = 0
            android.content.res.Configuration r1 = a((android.content.Context) r2, (int) r1, (android.content.res.Configuration) r3)
            boolean r2 = r11.Y
            r4 = 24
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x001e
            goto L_0x0061
        L_0x001e:
            java.lang.Object r2 = r11.d
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0061
            android.content.Context r2 = r11.e
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 == 0) goto L_0x0060
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005c }
            r8 = 29
            if (r7 >= r8) goto L_0x003b
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005c }
            if (r7 < r4) goto L_0x0039
            r7 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x003d
        L_0x0039:
            r7 = 0
            goto L_0x003d
        L_0x003b:
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
        L_0x003d:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005c }
            android.content.Context r9 = r11.e     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.Object r10 = r11.d     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x005c }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x005c }
            android.content.pm.ActivityInfo r2 = r2.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x005c }
            if (r2 == 0) goto L_0x0058
            int r2 = r2.configChanges     // Catch:{ NameNotFoundException -> 0x005c }
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r11.X = r2     // Catch:{ NameNotFoundException -> 0x005c }
            goto L_0x0061
        L_0x005c:
            r2 = move-exception
            r11.X = r6
            goto L_0x0061
        L_0x0060:
            goto L_0x0065
        L_0x0061:
            r11.Y = r5
            boolean r6 = r11.X
        L_0x0065:
            android.content.Context r2 = r11.e
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            int r1 = r1.uiMode
            r1 = r1 & 48
            r7 = 28
            if (r2 == r1) goto L_0x00b3
            if (r12 == 0) goto L_0x00b3
            if (r6 != 0) goto L_0x00b3
            boolean r12 = r11.S
            if (r12 == 0) goto L_0x00b3
            boolean r12 = F
            if (r12 == 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            boolean r12 = r11.T
            if (r12 != 0) goto L_0x008d
            goto L_0x00b3
        L_0x008d:
            java.lang.Object r12 = r11.d
            boolean r8 = r12 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00b3
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x00b3
            java.lang.Object r12 = r11.d
            android.app.Activity r12 = (android.app.Activity) r12
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r7) goto L_0x00a8
            r12.recreate()
            goto L_0x0138
        L_0x00a8:
            boolean r1 = defpackage.fv.a(r12)
            if (r1 != 0) goto L_0x0138
            r12.recreate()
            goto L_0x0138
        L_0x00b3:
            if (r2 == r1) goto L_0x0140
            android.content.Context r12 = r11.e
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Configuration r8 = r12.getConfiguration()
            r2.<init>(r8)
            android.content.res.Configuration r8 = r12.getConfiguration()
            int r8 = r8.uiMode
            r8 = r8 & -49
            r1 = r1 | r8
            r2.uiMode = r1
            r12.updateConfiguration(r2, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r8 = 23
            if (r1 < r3) goto L_0x00db
            goto L_0x00f4
        L_0x00db:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r7) goto L_0x00f4
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x00e7
            defpackage.ts.c(r12)
            goto L_0x00f4
        L_0x00e7:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r8) goto L_0x00ef
            defpackage.ts.b(r12)
            goto L_0x00f4
        L_0x00ef:
            int r1 = android.os.Build.VERSION.SDK_INT
            defpackage.ts.a((android.content.res.Resources) r12)
        L_0x00f4:
            int r12 = r11.W
            if (r12 == 0) goto L_0x010c
            android.content.Context r1 = r11.e
            r1.setTheme(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r8) goto L_0x010c
            android.content.Context r12 = r11.e
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r1 = r11.W
            r12.applyStyle(r1, r5)
        L_0x010c:
            if (r6 == 0) goto L_0x0138
            java.lang.Object r12 = r11.d
            boolean r1 = r12 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0138
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r1 = r12 instanceof defpackage.aj
            if (r1 == 0) goto L_0x0131
            r1 = r12
            aj r1 = (defpackage.aj) r1
            ae r1 = r1.getLifecycle()
            ad r1 = r1.a()
            ad r3 = defpackage.ad.STARTED
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x0138
            r12.onConfigurationChanged(r2)
            goto L_0x0138
        L_0x0131:
            boolean r1 = r11.U
            if (r1 == 0) goto L_0x0138
            r12.onConfigurationChanged(r2)
        L_0x0138:
            java.lang.Object r12 = r11.d
            boolean r1 = r12 instanceof defpackage.st
            if (r1 == 0) goto L_0x0140
            st r12 = (defpackage.st) r12
        L_0x0140:
            if (r0 != 0) goto L_0x014c
            android.content.Context r12 = r11.e
            ti r12 = r11.b((android.content.Context) r12)
            r12.d()
            goto L_0x0161
        L_0x014c:
            ti r12 = r11.Z
            if (r12 != 0) goto L_0x0151
            goto L_0x0154
        L_0x0151:
            r12.e()
        L_0x0154:
            r12 = 3
            if (r0 != r12) goto L_0x0161
            android.content.Context r12 = r11.e
            ti r12 = r11.c((android.content.Context) r12)
            r12.d()
            return
        L_0x0161:
            ti r12 = r11.aa
            if (r12 == 0) goto L_0x0168
            r12.e()
        L_0x0168:
            return
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final int a(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        return c(context).a();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return b(context).a();
            } else {
                return -1;
            }
        }
        return i2;
    }

    public final MenuInflater b() {
        if (this.i == null) {
            v();
            sg sgVar = this.h;
            this.i = new vz(sgVar != null ? sgVar.g() : this.e);
        }
        return this.i;
    }

    public final View b(int i2) {
        x();
        return this.f.findViewById(i2);
    }

    public final void b(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.q.findViewById(16908290)).addView(view, layoutParams);
        this.H.b.onContentChanged();
    }

    public final Context a(Context context) {
        Configuration configuration;
        this.S = true;
        int a = a(context, z());
        if (G && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException e2) {
            }
        }
        if (context instanceof vt) {
            try {
                ((vt) context).a(a(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException e3) {
            }
        }
        if (!F) {
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (!(configuration3 == null || configuration2.diff(configuration3) == 0)) {
                    if (configuration2.fontScale != configuration3.fontScale) {
                        configuration.fontScale = configuration3.fontScale;
                    }
                    if (configuration2.mcc != configuration3.mcc) {
                        configuration.mcc = configuration3.mcc;
                    }
                    if (configuration2.mnc != configuration3.mnc) {
                        configuration.mnc = configuration3.mnc;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        LocaleList locales = configuration2.getLocales();
                        LocaleList locales2 = configuration3.getLocales();
                        if (!locales.equals(locales2)) {
                            configuration.setLocales(locales2);
                            configuration.locale = configuration3.locale;
                        }
                    } else if (!op.a(configuration2.locale, configuration3.locale)) {
                        configuration.locale = configuration3.locale;
                    }
                    if (configuration2.touchscreen != configuration3.touchscreen) {
                        configuration.touchscreen = configuration3.touchscreen;
                    }
                    if (configuration2.keyboard != configuration3.keyboard) {
                        configuration.keyboard = configuration3.keyboard;
                    }
                    if (configuration2.keyboardHidden != configuration3.keyboardHidden) {
                        configuration.keyboardHidden = configuration3.keyboardHidden;
                    }
                    if (configuration2.navigation != configuration3.navigation) {
                        configuration.navigation = configuration3.navigation;
                    }
                    if (configuration2.navigationHidden != configuration3.navigationHidden) {
                        configuration.navigationHidden = configuration3.navigationHidden;
                    }
                    if (configuration2.orientation != configuration3.orientation) {
                        configuration.orientation = configuration3.orientation;
                    }
                    if ((configuration2.screenLayout & 15) != (configuration3.screenLayout & 15)) {
                        configuration.screenLayout |= configuration3.screenLayout & 15;
                    }
                    if ((configuration2.screenLayout & 192) != (configuration3.screenLayout & 192)) {
                        configuration.screenLayout |= configuration3.screenLayout & 192;
                    }
                    if ((configuration2.screenLayout & 48) != (configuration3.screenLayout & 48)) {
                        configuration.screenLayout |= configuration3.screenLayout & 48;
                    }
                    if ((configuration2.screenLayout & 768) != (configuration3.screenLayout & 768)) {
                        configuration.screenLayout |= configuration3.screenLayout & 768;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if ((configuration2.colorMode & 3) != (configuration3.colorMode & 3)) {
                            configuration.colorMode |= configuration3.colorMode & 3;
                        }
                        if ((configuration2.colorMode & 12) != (configuration3.colorMode & 12)) {
                            configuration.colorMode |= configuration3.colorMode & 12;
                        }
                    }
                    if ((configuration2.uiMode & 15) != (configuration3.uiMode & 15)) {
                        configuration.uiMode |= configuration3.uiMode & 15;
                    }
                    if ((configuration2.uiMode & 48) != (configuration3.uiMode & 48)) {
                        configuration.uiMode |= configuration3.uiMode & 48;
                    }
                    if (configuration2.screenWidthDp != configuration3.screenWidthDp) {
                        configuration.screenWidthDp = configuration3.screenWidthDp;
                    }
                    if (configuration2.screenHeightDp != configuration3.screenHeightDp) {
                        configuration.screenHeightDp = configuration3.screenHeightDp;
                    }
                    if (configuration2.smallestScreenWidthDp != configuration3.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration3.smallestScreenWidthDp;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (configuration2.densityDpi != configuration3.densityDpi) {
                        configuration.densityDpi = configuration3.densityDpi;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration a2 = a(context, a, configuration);
            vt vtVar = new vt(context, 2132018384);
            vtVar.a(a2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = vtVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        theme.rebase();
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        synchronized (lh.a) {
                            if (!lh.c) {
                                try {
                                    lh.b = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    lh.b.setAccessible(true);
                                } catch (NoSuchMethodException e4) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                                }
                                lh.c = true;
                            }
                            if (lh.b != null) {
                                try {
                                    lh.b.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e5) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                                    lh.b = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException e6) {
            }
            return vtVar;
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("Application failed to obtain resources from itself", e7);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(wt wtVar) {
        if (!this.P) {
            this.P = true;
            this.j.j();
            Window.Callback q2 = q();
            if (q2 != null && !this.y) {
                q2.onPanelClosed(108, wtVar);
            }
            this.P = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e4, code lost:
        if (r8.equals("Spinner") != false) goto L_0x0128;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r7 = this;
            tr r0 = r7.ad
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0056
        L_0x0006:
            android.content.Context r0 = r7.e
            int[] r2 = defpackage.uh.j
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001e
            tr r0 = new tr
            r0.<init>()
            r7.ad = r0
            goto L_0x0056
        L_0x001e:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0033 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0033 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0033 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0033 }
            tr r2 = (defpackage.tr) r2     // Catch:{ all -> 0x0033 }
            r7.ad = r2     // Catch:{ all -> 0x0033 }
            goto L_0x0056
        L_0x0033:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            tr r0 = new tr
            r0.<init>()
            r7.ad = r0
        L_0x0056:
            tr r0 = r7.ad
            defpackage.afl.a()
            int[] r2 = defpackage.uh.A
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r2, r1, r1)
            r3 = 4
            int r4 = r2.getResourceId(r3, r1)
            if (r4 == 0) goto L_0x006f
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r6 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r6)
        L_0x006f:
            r2.recycle()
            if (r4 == 0) goto L_0x0085
            boolean r2 = r9 instanceof defpackage.vt
            if (r2 == 0) goto L_0x007f
            r2 = r9
            vt r2 = (defpackage.vt) r2
            int r2 = r2.a
            if (r2 == r4) goto L_0x0085
        L_0x007f:
            vt r2 = new vt
            r2.<init>((android.content.Context) r9, (int) r4)
            goto L_0x0087
        L_0x0085:
            r2 = r9
        L_0x0087:
            int r4 = r8.hashCode()
            r5 = -1
            r6 = 1
            switch(r4) {
                case -1946472170: goto L_0x011c;
                case -1455429095: goto L_0x0111;
                case -1346021293: goto L_0x0106;
                case -938935918: goto L_0x00fc;
                case -937446323: goto L_0x00f2;
                case -658531749: goto L_0x00e7;
                case -339785223: goto L_0x00de;
                case 776382189: goto L_0x00d4;
                case 799298502: goto L_0x00c9;
                case 1125864064: goto L_0x00bf;
                case 1413872058: goto L_0x00b3;
                case 1601505219: goto L_0x00a8;
                case 1666676343: goto L_0x009d;
                case 2001146706: goto L_0x0092;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0127
        L_0x0092:
            java.lang.String r3 = "Button"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 2
            goto L_0x0128
        L_0x009d:
            java.lang.String r3 = "EditText"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 3
            goto L_0x0128
        L_0x00a8:
            java.lang.String r3 = "CheckBox"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 6
            goto L_0x0128
        L_0x00b3:
            java.lang.String r3 = "AutoCompleteTextView"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 9
            goto L_0x0128
        L_0x00bf:
            java.lang.String r3 = "ImageView"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 1
            goto L_0x0128
        L_0x00c9:
            java.lang.String r3 = "ToggleButton"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 13
            goto L_0x0128
        L_0x00d4:
            java.lang.String r3 = "RadioButton"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 7
            goto L_0x0128
        L_0x00de:
            java.lang.String r4 = "Spinner"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0127
            goto L_0x0128
        L_0x00e7:
            java.lang.String r3 = "SeekBar"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 12
            goto L_0x0128
        L_0x00f2:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 5
            goto L_0x0128
        L_0x00fc:
            java.lang.String r3 = "TextView"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 0
            goto L_0x0128
        L_0x0106:
            java.lang.String r3 = "MultiAutoCompleteTextView"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 10
            goto L_0x0128
        L_0x0111:
            java.lang.String r3 = "CheckedTextView"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 8
            goto L_0x0128
        L_0x011c:
            java.lang.String r3 = "RatingBar"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0127
            r3 = 11
            goto L_0x0128
        L_0x0127:
            r3 = -1
        L_0x0128:
            r4 = 0
            switch(r3) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x0198;
                case 2: goto L_0x0190;
                case 3: goto L_0x0187;
                case 4: goto L_0x017e;
                case 5: goto L_0x0175;
                case 6: goto L_0x016d;
                case 7: goto L_0x0165;
                case 8: goto L_0x015c;
                case 9: goto L_0x0154;
                case 10: goto L_0x014b;
                case 11: goto L_0x0142;
                case 12: goto L_0x0139;
                case 13: goto L_0x012f;
                default: goto L_0x012c;
            }
        L_0x012c:
            r3 = r4
            goto L_0x01a8
        L_0x012f:
            zt r3 = new zt
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0139:
            zd r3 = new zd
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0142:
            zc r3 = new zc
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x014b:
            yy r3 = new yy
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0154:
            yo r3 = r0.e(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x015c:
            yr r3 = new yr
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0165:
            zb r3 = r0.d(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x016d:
            yq r3 = r0.c(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0175:
            yw r3 = new yw
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x017e:
            android.support.v7.widget.AppCompatSpinner r3 = new android.support.v7.widget.AppCompatSpinner
            r3.<init>((android.content.Context) r2, (android.util.AttributeSet) r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0187:
            android.support.v7.widget.AppCompatEditText r3 = new android.support.v7.widget.AppCompatEditText
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0190:
            android.support.v7.widget.AppCompatButton r3 = r0.b(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x0198:
            android.support.v7.widget.AppCompatImageView r3 = new android.support.v7.widget.AppCompatImageView
            r3.<init>(r2, r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
            goto L_0x01a8
        L_0x01a1:
            android.support.v7.widget.AppCompatTextView r3 = r0.a((android.content.Context) r2, (android.util.AttributeSet) r10)
            r0.a((android.view.View) r3, (java.lang.String) r8)
        L_0x01a8:
            if (r3 == 0) goto L_0x01ab
            goto L_0x0208
        L_0x01ab:
            if (r9 == r2) goto L_0x0207
            java.lang.String r9 = "view"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01bb
            java.lang.String r8 = "class"
            java.lang.String r8 = r10.getAttributeValue(r4, r8)
        L_0x01bb:
            java.lang.Object[] r9 = r0.c     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            r9[r1] = r2     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            r9[r6] = r10     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            r9 = 46
            int r9 = r8.indexOf(r9)     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            if (r9 == r5) goto L_0x01d5
            android.view.View r8 = r0.a(r2, r8, r4)     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            java.lang.Object[] r9 = r0.c
            r9[r1] = r4
            r9[r6] = r4
            r4 = r8
            goto L_0x0209
        L_0x01d5:
            r9 = 0
        L_0x01d6:
            java.lang.String[] r3 = defpackage.tr.b     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            int r3 = r3.length     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            if (r9 < r3) goto L_0x01e2
            java.lang.Object[] r8 = r0.c
            r8[r1] = r4
            r8[r6] = r4
            goto L_0x0209
        L_0x01e2:
            java.lang.String[] r3 = defpackage.tr.b     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            r3 = r3[r9]     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            android.view.View r3 = r0.a(r2, r8, r3)     // Catch:{ Exception -> 0x01ff, all -> 0x01f7 }
            if (r3 == 0) goto L_0x01f4
            java.lang.Object[] r8 = r0.c
            r8[r1] = r4
            r8[r6] = r4
            r4 = r3
            goto L_0x0209
        L_0x01f4:
            int r9 = r9 + 1
            goto L_0x01d6
        L_0x01f7:
            r8 = move-exception
            java.lang.Object[] r9 = r0.c
            r9[r1] = r4
            r9[r6] = r4
            throw r8
        L_0x01ff:
            r8 = move-exception
            java.lang.Object[] r8 = r0.c
            r8[r1] = r4
            r8[r6] = r4
            goto L_0x0209
        L_0x0207:
        L_0x0208:
            r4 = r3
        L_0x0209:
            if (r4 == 0) goto L_0x0232
            android.content.Context r8 = r4.getContext()
            boolean r9 = r8 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L_0x0232
            int r9 = android.os.Build.VERSION.SDK_INT
            boolean r9 = defpackage.qb.E(r4)
            if (r9 == 0) goto L_0x0232
            int[] r9 = defpackage.tr.a
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r10, r9)
            java.lang.String r9 = r8.getString(r1)
            if (r9 == 0) goto L_0x022f
            tq r10 = new tq
            r10.<init>(r4, r9)
            r4.setOnClickListener(r10)
        L_0x022f:
            r8.recycle()
        L_0x0232:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.a(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final sg a() {
        v();
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final tl a(Menu menu) {
        tl[] tlVarArr = this.Q;
        int length = tlVarArr != null ? tlVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            tl tlVar = tlVarArr[i2];
            if (tlVar != null && tlVar.j == menu) {
                return tlVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final vr a(vq vqVar) {
        vr vrVar;
        Context context;
        u();
        vr vrVar2 = this.k;
        if (vrVar2 != null) {
            vrVar2.c();
        }
        su suVar = this.g;
        if (suVar == null || this.y) {
            vrVar = null;
        } else {
            try {
                vrVar = suVar.aV();
            } catch (AbstractMethodError e2) {
                vrVar = null;
            }
        }
        if (vrVar == null) {
            if (this.l == null) {
                if (this.v) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.e.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.e.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new vt(this.e, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.e;
                    }
                    this.l = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    this.m = popupWindow;
                    rw.a(popupWindow, 2);
                    this.m.setContentView(this.l);
                    this.m.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    this.l.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    this.m.setHeight(-2);
                    this.n = new ta(this);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.q.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(r());
                        this.l = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.l != null) {
                u();
                this.l.a();
                vu vuVar = new vu(this.l.getContext(), this.l, vqVar);
                if (vqVar.a((vr) vuVar, (Menu) vuVar.a)) {
                    vuVar.d();
                    this.l.a((vr) vuVar);
                    this.k = vuVar;
                    if (t()) {
                        this.l.setAlpha(0.0f);
                        qg m2 = qb.m(this.l);
                        m2.a(1.0f);
                        this.o = m2;
                        m2.a((qh) new tb(this));
                    } else {
                        this.l.setAlpha(1.0f);
                        this.l.setVisibility(0);
                        this.l.sendAccessibilityEvent(32);
                        if (this.l.getParent() instanceof View) {
                            qb.r((View) this.l.getParent());
                        }
                    }
                    if (this.m != null) {
                        this.f.getDecorView().post(this.n);
                    }
                } else {
                    this.k = null;
                }
            }
        } else {
            this.k = vrVar;
        }
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, tl tlVar, Menu menu) {
        if (menu == null) {
            if (tlVar == null) {
                tl[] tlVarArr = this.Q;
                if (i2 < tlVarArr.length) {
                    tlVar = tlVarArr[i2];
                }
            }
            if (tlVar != null) {
                menu = tlVar.j;
            }
        }
        if ((tlVar == null || tlVar.o) && !this.y) {
            this.H.b.onPanelClosed(i2, menu);
        }
    }

    public final void a(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            sg a = a();
            if (!(a instanceof ug)) {
                this.i = null;
                if (a != null) {
                    a.l();
                }
                if (toolbar != null) {
                    ty tyVar = new ty(toolbar, s(), this.H);
                    this.h = tyVar;
                    this.f.setCallback(tyVar.c);
                } else {
                    this.h = null;
                    this.f.setCallback(this.H);
                }
                f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void a(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.q.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.H.b.onContentChanged();
    }

    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.q.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.H.b.onContentChanged();
    }

    public final void a(CharSequence charSequence) {
        this.I = charSequence;
        zw zwVar = this.j;
        if (zwVar == null) {
            sg sgVar = this.h;
            if (sgVar == null) {
                TextView textView = this.M;
                if (textView != null) {
                    textView.setText(charSequence);
                    return;
                }
                return;
            }
            sgVar.c(charSequence);
            return;
        }
        zwVar.a(charSequence);
    }

    /* access modifiers changed from: package-private */
    public final void a(tl tlVar, boolean z2) {
        ViewGroup viewGroup;
        zw zwVar;
        if (z2 && tlVar.a == 0 && (zwVar = this.j) != null && zwVar.e()) {
            b(tlVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (!(windowManager == null || !tlVar.o || (viewGroup = tlVar.g) == null)) {
            windowManager.removeView(viewGroup);
            if (z2) {
                a(tlVar.a, tlVar, (Menu) null);
            }
        }
        tlVar.m = false;
        tlVar.n = false;
        tlVar.o = false;
        tlVar.h = null;
        tlVar.q = true;
        if (this.x == tlVar) {
            this.x = null;
        }
    }

    public final void a(wt wtVar) {
        zw zwVar = this.j;
        if (zwVar != null && zwVar.d() && (!ViewConfiguration.get(this.e).hasPermanentMenuKey() || this.j.f())) {
            Window.Callback q2 = q();
            if (this.j.e()) {
                this.j.h();
                if (!this.y) {
                    q2.onPanelClosed(108, f(0).j);
                }
            } else if (q2 != null && !this.y) {
                if (this.z && (1 & this.A) != 0) {
                    this.f.getDecorView().removeCallbacks(this.ab);
                    this.ab.run();
                }
                tl f2 = f(0);
                wt wtVar2 = f2.j;
                if (wtVar2 != null && !f2.r && q2.onPreparePanel(0, f2.i, wtVar2)) {
                    q2.onMenuOpened(108, f2.j);
                    this.j.g();
                }
            }
        } else {
            tl f3 = f(0);
            f3.q = true;
            a(f3, false);
            b(f3, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            boolean r1 = r0 instanceof defpackage.pe
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof defpackage.tp
            if (r0 == 0) goto L_0x001b
        L_0x000b:
            android.view.Window r0 = r6.f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001b
            boolean r0 = defpackage.qb.a((android.view.View) r0, (android.view.KeyEvent) r7)
            if (r0 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            return r2
        L_0x001b:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002f
            tf r0 = r6.H
            android.view.Window$Callback r0 = r0.b
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            return r2
        L_0x002f:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 4
            r5 = 0
            if (r3 == 0) goto L_0x00f3
            if (r0 == r4) goto L_0x00c5
            if (r0 == r1) goto L_0x0042
            r2 = 0
            goto L_0x010d
        L_0x0042:
            vr r0 = r6.k
            if (r0 != 0) goto L_0x00c4
            tl r0 = r6.f(r5)
            zw r1 = r6.j
            if (r1 == 0) goto L_0x0081
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0081
            android.content.Context r1 = r6.e
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 == 0) goto L_0x0061
            goto L_0x0081
        L_0x0061:
            zw r1 = r6.j
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0070
            zw r7 = r6.j
            boolean r7 = r7.h()
            goto L_0x00a4
        L_0x0070:
            boolean r1 = r6.y
            if (r1 != 0) goto L_0x00c4
            boolean r7 = r6.a((defpackage.tl) r0, (android.view.KeyEvent) r7)
            if (r7 == 0) goto L_0x00c4
            zw r7 = r6.j
            boolean r7 = r7.g()
            goto L_0x00a4
        L_0x0081:
            boolean r1 = r0.o
            if (r1 != 0) goto L_0x00a0
            boolean r3 = r0.n
            if (r3 == 0) goto L_0x008a
            goto L_0x00a0
        L_0x008a:
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x009e
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x009a
            r0.m = r5
            boolean r1 = r6.a((defpackage.tl) r0, (android.view.KeyEvent) r7)
            if (r1 == 0) goto L_0x009e
        L_0x009a:
            r6.b((defpackage.tl) r0, (android.view.KeyEvent) r7)
            goto L_0x00a6
        L_0x009e:
            goto L_0x010d
        L_0x00a0:
            r6.a((defpackage.tl) r0, (boolean) r2)
            r7 = r1
        L_0x00a4:
            if (r7 == 0) goto L_0x00c3
        L_0x00a6:
            android.content.Context r7 = r6.e
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00ba
            r7.playSoundEffect(r5)
            goto L_0x010d
        L_0x00ba:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x010d
        L_0x00c3:
            goto L_0x010d
        L_0x00c4:
            goto L_0x010d
        L_0x00c5:
            boolean r7 = r6.R
            r6.R = r5
            tl r0 = r6.f(r5)
            if (r0 != 0) goto L_0x00d0
            goto L_0x00db
        L_0x00d0:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x00db
            if (r7 == 0) goto L_0x00d7
            goto L_0x010d
        L_0x00d7:
            r6.a((defpackage.tl) r0, (boolean) r2)
            return r2
        L_0x00db:
            vr r7 = r6.k
            if (r7 != 0) goto L_0x00ef
            sg r7 = r6.a()
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r7.k()
            if (r7 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            return r2
        L_0x00ed:
            r2 = 0
            goto L_0x010d
        L_0x00ef:
            r7.c()
            goto L_0x010d
        L_0x00f3:
            if (r0 == r4) goto L_0x010e
            if (r0 == r1) goto L_0x00f9
            r2 = 0
            goto L_0x010d
        L_0x00f9:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x010c
            tl r0 = r6.f(r5)
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x0108
            goto L_0x010d
        L_0x0108:
            r6.a((defpackage.tl) r0, (android.view.KeyEvent) r7)
            return r2
        L_0x010c:
        L_0x010d:
            return r2
        L_0x010e:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r2 = 0
        L_0x0118:
            r6.R = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn.a(android.view.KeyEvent):boolean");
    }

    public final boolean a(tl tlVar, int i2, KeyEvent keyEvent) {
        wt wtVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!tlVar.m && !a(tlVar, keyEvent)) || (wtVar = tlVar.j) == null) {
            return false;
        }
        return wtVar.performShortcut(i2, keyEvent, 1);
    }

    public final boolean a(tl tlVar, KeyEvent keyEvent) {
        boolean z2;
        zw zwVar;
        int i2;
        zw zwVar2;
        Resources.Theme theme;
        zw zwVar3;
        if (this.y) {
            return false;
        }
        if (tlVar.m) {
            return true;
        }
        tl tlVar2 = this.x;
        if (!(tlVar2 == null || tlVar2 == tlVar)) {
            a(tlVar2, false);
        }
        Window.Callback q2 = q();
        if (q2 != null) {
            tlVar.i = q2.onCreatePanelView(tlVar.a);
        }
        int i3 = tlVar.a;
        if (i3 == 0) {
            z2 = true;
        } else {
            z2 = i3 == 108;
        }
        if (z2 && (zwVar3 = this.j) != null) {
            zwVar3.i();
        }
        if (tlVar.i == null && (!z2 || !(this.h instanceof ty))) {
            wt wtVar = tlVar.j;
            if (wtVar == null || tlVar.r) {
                if (wtVar == null) {
                    Context context = this.e;
                    int i4 = tlVar.a;
                    if ((i4 == 0 || i4 == 108) && this.j != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            vt vtVar = new vt(context, 0);
                            vtVar.getTheme().setTo(theme);
                            context = vtVar;
                        }
                    }
                    wt wtVar2 = new wt(context);
                    wtVar2.b = this;
                    tlVar.a(wtVar2);
                    if (tlVar.j == null) {
                        return false;
                    }
                }
                if (z2 && this.j != null) {
                    if (this.J == null) {
                        this.J = new tc(this);
                    }
                    this.j.a(tlVar.j, this.J);
                }
                tlVar.j.e();
                if (!q2.onCreatePanelMenu(tlVar.a, tlVar.j)) {
                    tlVar.a((wt) null);
                    if (z2 && (zwVar2 = this.j) != null) {
                        zwVar2.a((Menu) null, this.J);
                    }
                    return false;
                }
                tlVar.r = false;
            }
            tlVar.j.e();
            Bundle bundle = tlVar.s;
            if (bundle != null) {
                tlVar.j.b(bundle);
                tlVar.s = null;
            }
            if (q2.onPreparePanel(0, tlVar.i, tlVar.j)) {
                if (keyEvent != null) {
                    i2 = keyEvent.getDeviceId();
                } else {
                    i2 = -1;
                }
                boolean z3 = KeyCharacterMap.load(i2).getKeyboardType() != 1;
                tlVar.p = z3;
                tlVar.j.setQwertyMode(z3);
                tlVar.j.f();
            } else {
                if (z2 && (zwVar = this.j) != null) {
                    zwVar.a((Menu) null, this.J);
                }
                tlVar.j.f();
                return false;
            }
        }
        tlVar.m = true;
        tlVar.n = false;
        this.x = tlVar;
        return true;
    }

    public final boolean a(wt wtVar, MenuItem menuItem) {
        tl a;
        Window.Callback q2 = q();
        if (q2 == null || this.y || (a = a((Menu) wtVar.j())) == null) {
            return false;
        }
        return q2.onMenuItemSelected(a.a, menuItem);
    }
}
