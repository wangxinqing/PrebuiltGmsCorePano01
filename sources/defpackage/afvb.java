package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: afvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afvb implements aoqb {
    private final afvg a;
    private final String b;

    public afvb(afvg afvg, String str) {
        this.a = afvg;
        this.b = str;
    }

    public final aorr a(Object obj) {
        aorr a2;
        afvg afvg = this.a;
        String str = this.b;
        if (!((Boolean) obj).booleanValue()) {
            return aorl.a((Throwable) new Exception("Failed to add file group!"));
        }
        afvf afvf = new afvf();
        aflk aflk = afvg.b;
        afkg afkg = new afkg((byte[]) null);
        afkg.e = 0;
        afkg.b = amri.b(afvg.a);
        String a3 = afvg.a(str);
        if (a3 != null) {
            afkg.a = a3;
            aucd o = afka.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afka afka = (afka) o.b;
            afka.c = 1;
            int i = afka.a | 2;
            afka.a = i;
            afka.b = 2;
            afka.a = i | 1;
            afkg.c = amri.b((afka) o.i());
            afkg.d = amri.b(new afvd(afvf));
            String str2 = afkg.a == null ? " groupName" : "";
            if (afkg.e == null) {
                str2 = str2.concat(" groupSizeBytes");
            }
            if (!str2.isEmpty()) {
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            aorr a4 = aflk.a((afkh) new afjs(afkg.a, afkg.b, afkg.c, afkg.d, afkg.e.intValue()));
            synchronized (afvf.a) {
                afvf.c = a4;
                if (afvf.b) {
                    a4.cancel(true);
                }
            }
            synchronized (afvf.a) {
                amrl.a((Object) afvf.c);
                a2 = aooz.a(afvf.c, CancellationException.class, (aoqb) new afve(afvf), (Executor) aoqm.a);
            }
            return a2;
        }
        throw new NullPointerException("Null groupName");
    }
}
