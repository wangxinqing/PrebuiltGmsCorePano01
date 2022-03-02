package defpackage;

import android.util.Log;

/* renamed from: ydc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ydc implements acvp {
    static final acvp a = new ydc();

    private ydc() {
    }

    public final void a(acwa acwa) {
        int i = ydd.a;
        if (!acwa.b()) {
            Log.w("SilentFeedback", "Failed to send silent feedback");
        }
    }
}
