package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: rna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rna extends rmw {
    private final qvv d = new rmz(this, "location", "LocationModeContentObserver");
    private Handler e;
    private Runnable f;

    public rna(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        String str;
        if (!jkr.h()) {
            str = "location_providers_allowed";
        } else {
            str = "location_mode";
        }
        this.a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor(str), true, this.d);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.getContentResolver().unregisterContentObserver(this.d);
    }

    public final void c() {
        if (Build.VERSION.SDK_INT < 28 && !"robolectric".equals(Build.FINGERPRINT) && ayap.h() > 0) {
            if (this.e == null) {
                this.e = new qvr(Looper.getMainLooper());
            }
            if (Looper.myLooper() != this.e.getLooper()) {
                this.e.post(new rmx(this));
                return;
            }
            Runnable runnable = this.f;
            if (runnable == null) {
                rmy rmy = new rmy(this);
                this.f = rmy;
                this.e.postDelayed(rmy, ayap.h());
                return;
            }
            this.e.removeCallbacks(runnable);
            this.f = null;
        }
        a(rns.c(this.a));
    }
}
