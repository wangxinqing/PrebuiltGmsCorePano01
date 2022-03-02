package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wn extends xd implements View.OnKeyListener, PopupWindow.OnDismissListener, xh {
    public final Handler a;
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new wi(this);
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private final List l = new ArrayList();
    private final View.OnAttachStateChangeListener m = new wj(this);
    private final abt n = new wl(this);
    private int o = 0;
    private int p = 0;
    private View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private xg y;
    private PopupWindow.OnDismissListener z;

    public wn(Context context, View view, int i2, boolean z2) {
        this.h = context;
        this.q = view;
        this.j = i2;
        this.k = z2;
        this.w = false;
        this.r = i();
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(defpackage.wt r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            android.content.Context r0 = r1.h
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            wq r0 = new wq
            boolean r4 = r1.k
            r5 = 2131623947(0x7f0e000b, float:1.887506E38)
            r0.<init>(r2, r3, r4, r5)
            boolean r4 = r16.e()
            r5 = 1
            if (r4 != 0) goto L_0x0023
            boolean r4 = r1.w
            if (r4 != 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r0.b = r5
            goto L_0x002f
        L_0x0023:
            boolean r4 = r16.e()
            if (r4 == 0) goto L_0x002f
            boolean r4 = defpackage.xd.b((defpackage.wt) r17)
            r0.b = r4
        L_0x002f:
            android.content.Context r4 = r1.h
            int r6 = r1.i
            int r4 = a(r0, r4, r6)
            abv r6 = new abv
            android.content.Context r7 = r1.h
            int r8 = r1.j
            r6.<init>(r7, r8)
            abt r7 = r1.n
            r6.b = r7
            r6.m = r1
            r6.a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r7 = r1.q
            r6.l = r7
            int r7 = r1.p
            r6.j = r7
            r6.l()
            r6.k()
            r6.a((android.widget.ListAdapter) r0)
            r6.d(r4)
            int r0 = r1.p
            r6.j = r0
            java.util.List r0 = r1.b
            int r0 = r0.size()
            r7 = -1
            r9 = 0
            if (r0 <= 0) goto L_0x00e1
            java.util.List r0 = r1.b
            int r10 = r0.size()
            int r10 = r10 + r7
            java.lang.Object r0 = r0.get(r10)
            wm r0 = (defpackage.wm) r0
            wt r10 = r0.b
            int r11 = r10.size()
            r12 = 0
        L_0x007f:
            if (r12 >= r11) goto L_0x0096
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 != 0) goto L_0x008c
        L_0x008b:
            goto L_0x0093
        L_0x008c:
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r2 != r14) goto L_0x008b
            goto L_0x0097
        L_0x0093:
            int r12 = r12 + 1
            goto L_0x007f
        L_0x0096:
            r13 = 0
        L_0x0097:
            if (r13 == 0) goto L_0x00dd
            android.widget.ListView r10 = r0.a()
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b2
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            wq r11 = (defpackage.wq) r11
            goto L_0x00b5
        L_0x00b2:
            wq r11 = (defpackage.wq) r11
            r12 = 0
        L_0x00b5:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00ba:
            if (r15 >= r14) goto L_0x00c5
            ww r8 = r11.getItem(r15)
            if (r13 == r8) goto L_0x00c6
            int r15 = r15 + 1
            goto L_0x00ba
        L_0x00c5:
            r15 = -1
        L_0x00c6:
            if (r15 == r7) goto L_0x00db
            int r15 = r15 + r12
            int r8 = r10.getFirstVisiblePosition()
            int r15 = r15 - r8
            if (r15 < 0) goto L_0x00db
            int r8 = r10.getChildCount()
            if (r15 >= r8) goto L_0x00db
            android.view.View r8 = r10.getChildAt(r15)
            goto L_0x00de
        L_0x00db:
            r8 = 0
            goto L_0x00de
        L_0x00dd:
            r8 = 0
        L_0x00de:
            r10 = r8
            r8 = r0
            goto L_0x00e3
        L_0x00e1:
            r8 = 0
            r10 = 0
        L_0x00e3:
            if (r10 == 0) goto L_0x01b8
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r0 <= r11) goto L_0x00f1
            android.widget.PopupWindow r0 = r6.q
            r0.setTouchModal(r9)
            goto L_0x010d
        L_0x00f1:
            java.lang.reflect.Method r0 = defpackage.abv.a
            if (r0 == 0) goto L_0x010d
            java.lang.reflect.Method r0 = defpackage.abv.a     // Catch:{ Exception -> 0x0105 }
            android.widget.PopupWindow r11 = r6.q     // Catch:{ Exception -> 0x0105 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0105 }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0105 }
            r12[r9] = r13     // Catch:{ Exception -> 0x0105 }
            r0.invoke(r11, r12)     // Catch:{ Exception -> 0x0105 }
            goto L_0x010d
        L_0x0105:
            r0 = move-exception
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r11 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r11)
        L_0x010d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r0 < r11) goto L_0x011c
            android.widget.PopupWindow r0 = r6.q
            r11 = 0
            r12 = r11
            android.transition.Transition r12 = (android.transition.Transition) r12
            r0.setEnterTransition(r12)
        L_0x011c:
            java.util.List r0 = r1.b
            int r11 = r0.size()
            int r11 = r11 + r7
            java.lang.Object r0 = r0.get(r11)
            wm r0 = (defpackage.wm) r0
            android.widget.ListView r0 = r0.a()
            r7 = 2
            int[] r11 = new int[r7]
            r0.getLocationOnScreen(r11)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            android.view.View r13 = r1.d
            r13.getWindowVisibleDisplayFrame(r12)
            int r13 = r1.r
            if (r13 != r5) goto L_0x014f
            r11 = r11[r9]
            int r0 = r0.getWidth()
            int r11 = r11 + r0
            int r11 = r11 + r4
            int r0 = r12.right
            if (r11 <= r0) goto L_0x0154
            r0 = 0
            goto L_0x0157
        L_0x014f:
            r0 = r11[r9]
            int r0 = r0 - r4
            if (r0 >= 0) goto L_0x0156
        L_0x0154:
            r0 = 1
            goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            r1.r = r0
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            r13 = 5
            if (r11 >= r12) goto L_0x0192
            int[] r11 = new int[r7]
            android.view.View r12 = r1.q
            r12.getLocationOnScreen(r11)
            int[] r7 = new int[r7]
            r10.getLocationOnScreen(r7)
            int r12 = r1.p
            r12 = r12 & 7
            if (r12 == r13) goto L_0x0173
            goto L_0x0187
        L_0x0173:
            r12 = r11[r9]
            android.view.View r14 = r1.q
            int r14 = r14.getWidth()
            int r12 = r12 + r14
            r11[r9] = r12
            r12 = r7[r9]
            int r14 = r10.getWidth()
            int r12 = r12 + r14
            r7[r9] = r12
        L_0x0187:
            r12 = r7[r9]
            r14 = r11[r9]
            int r12 = r12 - r14
            r7 = r7[r5]
            r11 = r11[r5]
            int r7 = r7 - r11
            goto L_0x0196
        L_0x0192:
            r6.l = r10
            r7 = 0
            r12 = 0
        L_0x0196:
            int r11 = r1.p
            r11 = r11 & r13
            if (r11 == r13) goto L_0x01a5
            if (r0 == 0) goto L_0x01a3
            int r0 = r10.getWidth()
            int r12 = r12 + r0
            goto L_0x01ae
        L_0x01a3:
            int r12 = r12 - r4
            goto L_0x01ae
        L_0x01a5:
            if (r0 != 0) goto L_0x01ad
            int r0 = r10.getWidth()
            int r12 = r12 - r0
            goto L_0x01ae
        L_0x01ad:
            int r12 = r12 + r4
        L_0x01ae:
            r6.g = r12
            r6.i = r5
            r6.h = r5
            r6.a((int) r7)
            goto L_0x01ce
        L_0x01b8:
            boolean r0 = r1.s
            if (r0 == 0) goto L_0x01c0
            int r0 = r1.u
            r6.g = r0
        L_0x01c0:
            boolean r0 = r1.t
            if (r0 == 0) goto L_0x01c9
            int r0 = r1.v
            r6.a((int) r0)
        L_0x01c9:
            android.graphics.Rect r0 = r1.g
            r6.a((android.graphics.Rect) r0)
        L_0x01ce:
            wm r0 = new wm
            int r4 = r1.r
            r0.<init>(r6, r2, r4)
            java.util.List r4 = r1.b
            r4.add(r0)
            r6.ar()
            aan r0 = r6.e
            r0.setOnKeyListener(r1)
            if (r8 != 0) goto L_0x020d
            boolean r4 = r1.x
            if (r4 == 0) goto L_0x020d
            java.lang.CharSequence r4 = r2.e
            if (r4 == 0) goto L_0x020d
            r4 = 2131623954(0x7f0e0012, float:1.8875074E38)
            android.view.View r3 = r3.inflate(r4, r0, r9)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r9)
            java.lang.CharSequence r2 = r2.e
            r4.setText(r2)
            r2 = 0
            r0.addHeaderView(r3, r2, r9)
            r6.ar()
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn.c(wt):void");
    }

    private final int i() {
        return qb.h(this.q) == 1 ? 0 : 1;
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            this.p = pd.a(i2, qb.h(this.q));
        }
    }

    public final void a(Parcelable parcelable) {
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    public final void a(xg xgVar) {
        this.y = xgVar;
    }

    public final boolean a() {
        return false;
    }

    public final void ar() {
        if (!e()) {
            List list = this.l;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c((wt) list.get(i2));
            }
            this.l.clear();
            View view = this.q;
            this.d = view;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.e;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                this.e = viewTreeObserver2;
                if (viewTreeObserver == null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    public final void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    public final void b(boolean z2) {
        this.w = z2;
    }

    public final void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    public final void c(boolean z2) {
        this.x = z2;
    }

    public final void d() {
        int size = this.b.size();
        if (size > 0) {
            wm[] wmVarArr = (wm[]) this.b.toArray(new wm[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                wm wmVar = wmVarArr[i2];
                if (wmVar.a.e()) {
                    wmVar.a.d();
                }
            }
        }
    }

    public final boolean e() {
        return this.b.size() > 0 && ((wm) this.b.get(0)).a.e();
    }

    public final Parcelable f() {
        return null;
    }

    public final ListView g() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((wm) list.get(list.size() - 1)).a();
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return false;
    }

    public final void onDismiss() {
        wm wmVar;
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                wmVar = null;
                break;
            }
            wmVar = (wm) this.b.get(i2);
            if (!wmVar.a.e()) {
                break;
            }
            i2++;
        }
        if (wmVar != null) {
            wmVar.b.a(false);
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    public final void a(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = pd.a(this.o, qb.h(view));
        }
    }

    public final void a(wt wtVar) {
        wtVar.a((xh) this, this.h);
        if (e()) {
            c(wtVar);
        } else {
            this.l.add(wtVar);
        }
    }

    public final void a(wt wtVar, boolean z2) {
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (wtVar == ((wm) this.b.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.b.size()) {
                ((wm) this.b.get(i3)).b.a(false);
            }
            wm wmVar = (wm) this.b.remove(i2);
            wmVar.b.b((xh) this);
            if (this.f) {
                abv abv = wmVar.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    abv.q.setExitTransition((Transition) null);
                }
                wmVar.a.q.setAnimationStyle(0);
            }
            wmVar.a.d();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.r = ((wm) this.b.get(size2 - 1)).c;
            } else {
                this.r = i();
            }
            if (size2 == 0) {
                d();
                xg xgVar = this.y;
                if (xgVar != null) {
                    xgVar.a(wtVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.m);
                this.z.onDismiss();
            } else if (z2) {
                ((wm) this.b.get(0)).b.a(false);
            }
        }
    }

    public final void a(boolean z2) {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(((wm) list.get(i2)).a().getAdapter()).notifyDataSetChanged();
        }
    }

    public final boolean a(xp xpVar) {
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            wm wmVar = (wm) list.get(i2);
            i2++;
            if (xpVar == wmVar.b) {
                wmVar.a().requestFocus();
                return true;
            }
        }
        if (!xpVar.hasVisibleItems()) {
            return false;
        }
        a((wt) xpVar);
        xg xgVar = this.y;
        if (xgVar != null) {
            xgVar.a(xpVar);
        }
        return true;
    }
}
