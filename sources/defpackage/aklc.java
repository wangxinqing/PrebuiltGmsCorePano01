package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aklc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklc {
    public final ou a = new ou();
    public final ou b = new ou();

    public final void a(astz astz) {
        int i = astz.a;
        if ((i & 1) == 0 || (i & 4) == 0 || (i & 8) == 0) {
            akof a2 = aklz.a();
            String valueOf = String.valueOf(astz);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Invalid PlaceInfoMobile: ");
            sb.append(valueOf);
            a2.b(sb.toString());
            return;
        }
        long a3 = aema.a(astz.d, astz.e);
        ou ouVar = this.a;
        Long valueOf2 = Long.valueOf(aema.a(a3, 18));
        List list = (List) ouVar.get(valueOf2);
        if (list == null) {
            list = new ArrayList();
            this.a.put(valueOf2, list);
        }
        asth asth = astz.b;
        if (asth == null) {
            asth = asth.b;
        }
        Long valueOf3 = Long.valueOf(asth.a);
        if (!list.contains(valueOf3)) {
            list.add(valueOf3);
        }
    }
}
