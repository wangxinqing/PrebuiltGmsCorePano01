package defpackage;

import android.util.Log;

/* renamed from: iob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iob extends imt {
    public iob() {
        super("LogOnlyFix", 0);
    }

    public final boolean a(inb inb) {
        return true;
    }

    public final inb b(inb inb) {
        Log.i("LogOnlyFix", "Applying LogOnlyFix. Not doing anything. Have a nice day!");
        ina d = inb.d();
        d.a(this, 3);
        return d.a();
    }
}
