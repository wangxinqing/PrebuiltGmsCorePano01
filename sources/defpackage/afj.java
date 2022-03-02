package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;

/* renamed from: afj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afj implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static afj b;
    public static afj c;
    public final View a;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new afh(this);
    private final Runnable g = new afi(this);
    private int h;
    private int i;
    private afk j;
    private boolean k;

    public afj(View view, CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.e = qc.a(ViewConfiguration.get(view.getContext()));
        b();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public static void a(afj afj) {
        afj afj2 = b;
        if (afj2 != null) {
            afj2.a.removeCallbacks(afj2.f);
        }
        b = afj;
        if (afj != null) {
            afj.a.postDelayed(afj.f, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void b() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                a();
            }
        } else if (this.a.isEnabled() && this.j == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                this.h = x;
                this.i = y;
                a(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (c == this) {
            c = null;
            afk afk = this.j;
            if (afk != null) {
                afk.a();
                this.j = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (b == this) {
            a((afj) null);
        }
        this.a.removeCallbacks(this.g);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i2;
        int i3;
        long j2;
        int i4;
        if (qb.D(this.a)) {
            a((afj) null);
            afj afj = c;
            if (afj != null) {
                afj.a();
            }
            c = this;
            this.k = z;
            afk afk = new afk(this.a.getContext());
            this.j = afk;
            View view = this.a;
            int i5 = this.h;
            int i6 = this.i;
            boolean z2 = this.k;
            CharSequence charSequence = this.d;
            if (afk.b()) {
                afk.a();
            }
            afk.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = afk.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = afk.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = afk.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i2 = i6 + dimensionPixelOffset2;
                i3 = i6 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = afk.a.getResources().getDimensionPixelOffset(!z2 ? R.dimen.tooltip_y_offset_non_touch : R.dimen.tooltip_y_offset_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            rootView = ((Activity) context).getWindow().getDecorView();
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        break;
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(afk.e);
                if (afk.e.left < 0 && afk.e.top < 0) {
                    Resources resources = afk.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i4 = resources.getDimensionPixelSize(identifier);
                    } else {
                        i4 = 0;
                    }
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    afk.e.set(0, i4, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(afk.g);
                view.getLocationOnScreen(afk.f);
                int[] iArr = afk.f;
                int i7 = iArr[0];
                int[] iArr2 = afk.g;
                iArr[0] = i7 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i5) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                afk.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = afk.b.getMeasuredHeight();
                int i8 = afk.f[1];
                int i9 = ((i3 + i8) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + i2 + dimensionPixelOffset3;
                if (!z2) {
                    if (measuredHeight + i10 <= afk.e.height()) {
                        layoutParams.y = i10;
                    }
                } else if (i9 < 0) {
                    layoutParams.y = i10;
                }
                layoutParams.y = i9;
            } else {
                Log.e("TooltipPopup", "Cannot find app view");
            }
            ((WindowManager) afk.a.getSystemService("window")).addView(afk.b, afk.d);
            this.a.addOnAttachStateChangeListener(this);
            if (!this.k) {
                j2 = (qb.q(this.a) & 1) == 1 ? 3000 - ((long) ViewConfiguration.getLongPressTimeout()) : 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j2 = 2500;
            }
            this.a.removeCallbacks(this.g);
            this.a.postDelayed(this.g, j2);
        }
    }
}
