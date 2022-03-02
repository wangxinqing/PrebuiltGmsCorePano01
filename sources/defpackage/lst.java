package defpackage;

import android.util.Log;

/* renamed from: lst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lst implements acvs {
    static final acvs a = new lst();

    private lst() {
    }

    public final void a(Exception exc) {
        String valueOf = String.valueOf(exc.getMessage());
        Log.i("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Failed to register transition listener: ") : "Failed to register transition listener: ".concat(valueOf));
    }
}
