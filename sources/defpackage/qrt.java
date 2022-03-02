package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: qrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrt implements amqy {
    final /* synthetic */ qri a;

    public qrt(qri qri) {
        this.a = qri;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        int i;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        qri qri = this.a;
        qri.b();
        qri.e(i);
        return Boolean.valueOf(z);
    }
}
