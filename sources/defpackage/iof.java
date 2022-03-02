package defpackage;

import android.util.Log;

/* renamed from: iof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iof extends imt {
    private final Throwable d;

    public iof(Throwable th) {
        super("ReportCrashFix", awyw.a.a().A());
        iva.a((Object) th);
        this.d = th;
    }

    public final boolean a(inb inb) {
        return awyw.a.a().z();
    }

    public final inb b(inb inb) {
        Log.w("ReportCrashFix", "Applying ReportCrashFix", this.d);
        jis.a(inb.b, this.d, 134217728);
        ina d2 = inb.d();
        d2.a(this, 3);
        return d2.a();
    }
}
