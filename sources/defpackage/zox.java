package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zox {
    public final zqv a;
    private final ahfv b;

    protected zox(ahfv ahfv, zqv zqv) {
        this.b = ahfv;
        this.a = zqv;
    }

    public static zox a(Context context) {
        zpb zpb = new zpb(context);
        agzz a2 = ahaa.a(zpb.a);
        a2.a("recaptcha");
        a2.b("token.pb");
        Uri a3 = a2.a();
        ahee g = ahef.g();
        g.a(a3);
        g.a((audx) zqz.b);
        return new zox(zpb.b.a(g.a()), zqw.a());
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final aorr a(String str, String str2) {
        AtomicReference atomicReference = new AtomicReference((Object) null);
        return aopr.a(this.b.a(amll.a((aoqb) new zos(this, str, str2, atomicReference)), (Executor) aoqm.a), (amqy) new zot(atomicReference), (Executor) aoqm.a);
    }
}
