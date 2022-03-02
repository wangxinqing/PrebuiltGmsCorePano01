package defpackage;

import java.util.ArrayList;

/* renamed from: hma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hma extends hlv {
    public hma(String str) {
        super(str, amzy.h());
    }

    public final /* bridge */ /* synthetic */ amri a(Object obj) {
        amzy amzy = (amzy) obj;
        if (amzy.isEmpty()) {
            return ampu.a;
        }
        ArrayList arrayList = new ArrayList();
        anhk i = amzy.listIterator();
        while (i.hasNext()) {
            arrayList.add(anml.e.a(((String) i.next()).getBytes()));
        }
        return amri.b(amre.a(',').a((Iterable) arrayList).getBytes());
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        amzt j = amzy.j();
        for (String str : amsk.a(',').a((CharSequence) new String(bArr, amqn.c))) {
            if (!"!".equals(str)) {
                j.c(new String(anml.e.b((CharSequence) str), amqn.c));
            }
        }
        return j.a();
    }
}
