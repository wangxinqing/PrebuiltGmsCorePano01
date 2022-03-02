package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bame  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bame {
    public static final baob a = new baob(baob.d, "https");
    public static final baob b = new baob(baob.d, "http");
    public static final baob c = new baob(baob.b, "POST");
    public static final baob d = new baob(baob.b, "GET");
    public static final baob e = new baob(bagt.f.a, "application/grpc");
    public static final baob f = new baob("te", "trailers");

    public static List a(baaf baaf, String str, String str2, String str3, boolean z, boolean z2) {
        amrl.a((Object) baaf, (Object) "headers");
        amrl.a((Object) str, (Object) "defaultPath");
        amrl.a((Object) str2, (Object) "authority");
        baaf.c(bagt.f);
        baaf.c(bagt.g);
        baaf.c(bagt.h);
        ArrayList arrayList = new ArrayList(azyz.b(baaf) + 7);
        if (z2) {
            arrayList.add(b);
        } else {
            arrayList.add(a);
        }
        arrayList.add(c);
        arrayList.add(new baob(baob.e, str2));
        arrayList.add(new baob(baob.c, str));
        arrayList.add(new baob(bagt.h.a, str3));
        arrayList.add(e);
        arrayList.add(f);
        byte[][] a2 = balr.a(baaf);
        for (int i = 0; i < a2.length; i += 2) {
            batg a3 = batg.a(a2[i]);
            String a4 = a3.a();
            if (!a4.startsWith(":") && !bagt.f.a.equalsIgnoreCase(a4) && !bagt.h.a.equalsIgnoreCase(a4)) {
                arrayList.add(new baob(a3, batg.a(a2[i + 1])));
            }
        }
        return arrayList;
    }
}
