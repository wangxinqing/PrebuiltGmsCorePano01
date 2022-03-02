package defpackage;

import android.util.Log;

/* renamed from: ioh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioh extends imt {
    public ioh() {
        super("TempPSFlagCommitFix", 7200);
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        return aogr.STARTUP.equals(inb.a);
    }

    /* access modifiers changed from: protected */
    public final inb b(inb inb) {
        if (awyw.d() && awyw.c() && azpy.a.a().a()) {
            Log.i("TempPSFlagCommitFix", "TempProcessStableFlagCommitFix applied.");
        }
        ina d = inb.d();
        d.a(this, 3);
        return d.a();
    }
}
