package defpackage;

import java.io.IOException;

/* renamed from: sgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgn implements amqy {
    private final sgp a;

    public sgn(sgp sgp) {
        this.a = sgp;
    }

    public final Object a(Object obj) {
        int i;
        Exception exc = (Exception) obj;
        afji afji = this.a.c;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        anie a2 = afji.a(i);
        a2.a((Throwable) exc);
        ((anih) ((anih) a2).a("sgp", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to notify account that profile push occurred!");
        return null;
    }
}
