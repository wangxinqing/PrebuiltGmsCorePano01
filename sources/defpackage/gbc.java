package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;

/* renamed from: gbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbc extends ModuleManager.FeatureRequestProgressListener implements acvv, acvs, acvm {
    private final gay a;
    private final mdl b;
    private final hol c;
    private final long d;
    private boolean e = false;
    private final gaw f;

    public gbc(mdl mdl, gay gay, gaw gaw, hol hol) {
        this.b = mdl;
        this.a = gay;
        this.f = gaw;
        this.c = hol;
        this.d = SystemClock.elapsedRealtime();
    }

    private final void a(int i) {
        if (this.c != null) {
            aucd o = baqi.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqi baqi = (baqi) o.b;
            baqi.b = 3;
            int i2 = baqi.a | 1;
            baqi.a = i2;
            baqi.c = 1;
            int i3 = i2 | 2;
            baqi.a = i3;
            baqi.d = 1;
            baqi.a = i3 | 4;
            aucd o2 = baqh.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            baqh baqh = (baqh) o2.b;
            baqh.b = i - 1;
            baqh.a |= 1;
            aubn a2 = augi.a(SystemClock.elapsedRealtime() - this.d);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            baqh baqh2 = (baqh) o2.b;
            a2.getClass();
            baqh2.c = a2;
            baqh2.a |= 4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqi baqi2 = (baqi) o.b;
            baqh baqh3 = (baqh) o2.i();
            baqh3.getClass();
            baqi2.f = baqh3;
            baqi2.a |= 64;
            this.c.a(((baqi) o.i()).k()).b();
        }
    }

    public final void b() {
        Log.e("AuthZeroTouch", "API call canceled.");
        this.a.a((Intent) null);
    }

    public final synchronized void onRequestComplete() {
        if (this.f.a()) {
            onRequestComplete(0);
        } else {
            onRequestComplete(2);
        }
    }

    public final synchronized void onRequestComplete(int i) {
        if (!this.e) {
            this.e = true;
            if (i == 0) {
                Log.i("AuthZeroTouch", "Module download success.");
                a(2);
                mdl mdl = this.b;
                iha b2 = ihb.b();
                b2.b = new Feature[]{mdh.a};
                b2.a = new mdm();
                acwa a2 = ((iby) mdl).a(b2.a());
                a2.a((acvv) this);
                a2.a((acvs) this);
                a2.a((acvm) this);
                return;
            }
            StringBuilder sb = new StringBuilder(51);
            sb.append("Module download/install failed. Result: ");
            sb.append(i);
            Log.e("AuthZeroTouch", sb.toString());
            if (i == -1) {
                a(3);
            } else {
                a(4);
            }
            this.a.a((Intent) null);
        }
    }

    public final void a(Exception exc) {
        String valueOf = String.valueOf(Log.getStackTraceString(exc));
        Log.e("AuthZeroTouch", valueOf.length() == 0 ? new String("API call failed with exception: ") : "API call failed with exception: ".concat(valueOf));
        this.a.a((Intent) null);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ZeroTouchFlowResult zeroTouchFlowResult = (ZeroTouchFlowResult) obj;
        Log.i("AuthZeroTouch", "API call succeeded.");
        this.a.a(zeroTouchFlowResult != null ? zeroTouchFlowResult.b : null);
    }
}
