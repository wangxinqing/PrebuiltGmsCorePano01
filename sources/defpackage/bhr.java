package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: bhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bhr implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int a = 0;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private final Context c;
    private Application d;
    private final PowerManager e;
    private final KeyguardManager f;
    private BroadcastReceiver g;
    private final bhf h;
    private WeakReference i;
    private final WeakReference j;
    private bhd k;
    private byte l = -1;
    private int m = -1;

    public bhr(Context context, bhf bhf) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.h = bhf;
        this.e = (PowerManager) applicationContext.getSystemService("power");
        this.f = (KeyguardManager) this.c.getSystemService("keyguard");
        Context context2 = this.c;
        if (context2 instanceof Application) {
            Application application = (Application) context2;
            this.d = application;
            this.k = new bhd(application, this);
        }
        View a2 = a();
        if (a2 != null) {
            a2.removeOnAttachStateChangeListener(this);
            a(a2);
        }
        this.j = new WeakReference((Object) null);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.j != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View a2 = a();
            if (a2 != null && peekDecorView != null && a2.getRootView() == peekDecorView.getRootView()) {
                this.m = i2;
            }
        }
    }

    private final void c() {
        b.post(new bhp(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if ((r3.flags & 524288) != 0) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.j
            if (r0 == 0) goto L_0x0092
            android.view.View r0 = r5.a()
            r1 = -1
            if (r0 == 0) goto L_0x0090
            int r2 = r0.getVisibility()
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            boolean r3 = r0.isShown()
            if (r3 != 0) goto L_0x001c
            r2 = r2 | 2
        L_0x001c:
            android.os.PowerManager r3 = r5.e
            if (r3 != 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            boolean r3 = r3.isScreenOn()
            if (r3 != 0) goto L_0x0029
            r2 = r2 | 4
        L_0x0029:
            bhf r3 = r5.h
            boolean r3 = r3.a
            if (r3 == 0) goto L_0x0030
            goto L_0x0059
        L_0x0030:
            android.app.KeyguardManager r3 = r5.f
            if (r3 != 0) goto L_0x0035
            goto L_0x0057
        L_0x0035:
            boolean r3 = r3.inKeyguardRestrictedInputMode()
            if (r3 == 0) goto L_0x0057
            android.app.Activity r3 = defpackage.bho.a((android.view.View) r0)
            if (r3 == 0) goto L_0x0057
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x004c
            android.view.WindowManager$LayoutParams r3 = r3.getAttributes()
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            if (r3 == 0) goto L_0x0057
            int r3 = r3.flags
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = r2 | 8
        L_0x0059:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getGlobalVisibleRect(r3)
            if (r3 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r2 = r2 | 16
        L_0x0067:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            if (r3 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r2 = r2 | 32
        L_0x0075:
            int r0 = r0.getWindowVisibility()
            int r3 = r5.m
            if (r3 != r1) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r0 = r3
        L_0x007f:
            if (r0 == 0) goto L_0x0083
            r2 = r2 | 64
        L_0x0083:
            byte r0 = r5.l
            if (r0 == r2) goto L_0x008f
            byte r0 = (byte) r2
            r5.l = r0
            if (r2 != 0) goto L_0x008f
            android.os.SystemClock.elapsedRealtime()
        L_0x008f:
            return
        L_0x0090:
            r5.l = r1
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhr.b():void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        b();
    }

    public final void onActivityDestroyed(Activity activity) {
        b();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        b();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        b();
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        b();
    }

    public final void onActivityStopped(Activity activity) {
        b();
    }

    public final void onGlobalLayout() {
        b();
    }

    public final void onScrollChanged() {
        b();
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            bhq bhq = new bhq(this);
            this.g = bhq;
            this.c.registerReceiver(bhq, intentFilter);
        }
        Application application = this.d;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.k);
            } catch (Exception e2) {
            }
        }
        b();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        b();
        c();
        a(view);
    }

    private final void a(View view) {
        try {
            WeakReference weakReference = this.i;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.i = null;
            }
        } catch (Exception e2) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
        }
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver != null) {
            try {
                this.c.unregisterReceiver(broadcastReceiver);
            } catch (Exception e4) {
            }
            this.g = null;
        }
        Application application = this.d;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.k);
            } catch (Exception e5) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final View a() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
