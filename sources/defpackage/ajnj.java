package defpackage;

import android.util.Log;

/* renamed from: ajnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajnj implements acvp {
    public static final acvp a = new ajnj();

    private ajnj() {
    }

    public final void a(acwa acwa) {
        if (!acwa.b() && Log.isLoggable("GCoreUlr", 6)) {
            Log.e("GCoreUlr", "Exception writing audit record", acwa.e());
        }
    }
}
