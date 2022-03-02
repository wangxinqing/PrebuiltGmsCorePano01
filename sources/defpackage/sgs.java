package defpackage;

import java.io.IOException;

/* renamed from: sgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgs implements amqy {
    private final sgv a;

    public sgs(sgv sgv) {
        this.a = sgv;
    }

    public final Object a(Object obj) {
        int i;
        Exception exc = (Exception) obj;
        afji afji = this.a.b;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        anie a2 = afji.a(i);
        a2.a((Throwable) exc);
        ((anih) ((anih) a2).a("sgv", "a", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to check if account should be synced in one-off profile sync task!");
        return true;
    }
}
