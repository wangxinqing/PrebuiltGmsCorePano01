package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: airf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airf extends jfx {
    final /* synthetic */ Throwable a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public airf(Throwable th) {
        super(10);
        this.a = th;
    }

    public final void run() {
        mwd mwd = new mwd(this.a);
        mwd.i = "com.google.android.location";
        mwd.c = "com.google.android.location.nlp.smc.SILENT_FEEDBACK";
        mwd.b();
        try {
            acws.a(new iby((Context) ihs.b(), (byte[]) null).b(mwd.a()), 500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
        }
    }
}
