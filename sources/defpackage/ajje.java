package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: ajje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajje extends jfx {
    final /* synthetic */ Throwable a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajje(Throwable th) {
        super(10);
        this.a = th;
    }

    public final void run() {
        try {
            mwd mwd = new mwd(this.a);
            mwd.i = "com.google.android.gms";
            mwd.c = "com.google.android.gms.location.reporting.SILENT_FEEDBACK";
            mwd.b();
            acws.a(new iby((Context) ihs.b(), (byte[]) null).b(mwd.a()), 500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ajix.a("GCoreUlr", "Error sending feedback", (Throwable) e);
        }
    }
}
