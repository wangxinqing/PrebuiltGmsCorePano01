package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.common.widget.phone.SnackbarLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jml implements jmm, jmn {
    private static final Handler f = new qvr(Looper.getMainLooper());
    private static final Object g = new Object();
    private static jml h;
    public final AtomicBoolean a;
    public Context b;
    public SnackbarLayout c;
    public WindowManager.LayoutParams d;
    public WindowManager.LayoutParams e;
    private jml i;
    private final long j;
    private Runnable k;

    public jml(Context context, SnackbarLayout snackbarLayout, long j2) {
        this(context, snackbarLayout, j2, (byte[]) null);
    }

    private final void e() {
        int i2;
        if (!jkr.b() || Settings.canDrawOverlays(this.b)) {
            WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
            this.c.setOnTouchListener(new jmj(this));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.d = layoutParams;
            WindowManager.LayoutParams layoutParams2 = this.e;
            if (layoutParams2 != null) {
                layoutParams.copyFrom(layoutParams2);
            }
            this.d.format = -3;
            this.d.verticalWeight = 0.0f;
            this.d.windowAnimations = 16973828;
            WindowManager.LayoutParams layoutParams3 = this.d;
            if (!jkr.e()) {
                i2 = 2003;
            } else {
                i2 = 2038;
            }
            layoutParams3.type = i2;
            SnackbarLayout snackbarLayout = this.c;
            WindowManager.LayoutParams layoutParams4 = this.d;
            int i3 = snackbarLayout.a;
            if (i3 != 0) {
                layoutParams4.gravity = i3;
            }
            int i4 = snackbarLayout.b;
            if (i4 != 0) {
                layoutParams4.width = i4;
            }
            int i5 = snackbarLayout.c;
            if (i5 != 0) {
                layoutParams4.height = i5;
            }
            int i6 = snackbarLayout.d;
            if (i6 != 0) {
                layoutParams4.x = i6;
            }
            int i7 = snackbarLayout.e;
            if (i7 != 0) {
                layoutParams4.y = i7;
            }
            layoutParams4.flags |= 160;
            this.c.setLayoutParams(this.d);
            windowManager.addView(this.c, this.d);
            if (this.j > 0) {
                b();
                return;
            }
            return;
        }
        this.c = null;
        d();
    }

    public final void a() {
        synchronized (g) {
            if (h == null) {
                e();
                h = this;
            } else {
                jml jml = h;
                while (true) {
                    jml jml2 = jml.i;
                    if (jml2 == null) {
                        break;
                    }
                    jml = jml2;
                }
                jml.i = this;
            }
        }
    }

    public final void b() {
        jmk jmk = new jmk(this);
        this.k = jmk;
        f.postDelayed(jmk, this.j);
    }

    public final void c() {
        Runnable runnable = this.k;
        if (runnable != null) {
            f.removeCallbacks(runnable);
            this.k = null;
        }
    }

    public final void d() {
        if (!this.a.getAndSet(true)) {
            if (this.c != null) {
                try {
                    ((WindowManager) this.b.getSystemService("window")).removeView(this.c);
                    this.c = null;
                } catch (Exception e2) {
                    Log.w("Snackbar", "Snackbar window could not be removed");
                }
            }
            this.b = null;
            synchronized (g) {
                if (h == this) {
                    h = null;
                }
                jml jml = this.i;
                if (jml != null) {
                    jml.e();
                    this.i = null;
                }
            }
        }
    }

    public jml(Context context, SnackbarLayout snackbarLayout, long j2, byte[] bArr) {
        this.a = new AtomicBoolean(false);
        this.b = context;
        this.c = snackbarLayout;
        this.j = j2;
        snackbarLayout.f = this;
        snackbarLayout.g = this;
    }
}
