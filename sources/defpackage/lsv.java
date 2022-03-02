package defpackage;

import android.util.Log;

/* renamed from: lsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lsv implements acvs {
    static final acvs a = new lsv();

    private lsv() {
    }

    public final void a(Exception exc) {
        String valueOf = String.valueOf(exc.getMessage());
        Log.i("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Failed to unregister transition listener: ") : "Failed to unregister transition listener: ".concat(valueOf));
    }
}
