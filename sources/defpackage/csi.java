package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: csi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class csi implements ax {
    private final csj a;

    public csi(csj csj) {
        this.a = csj;
    }

    public final void a(Object obj) {
        csj csj = this.a;
        csl csl = (csl) obj;
        ArrayList arrayList = new ArrayList();
        List list = csj.a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            as asVar = (as) list.get(i);
            if (asVar.b() != null) {
                arrayList.add(((csl) asVar.b()).a);
                i++;
            } else {
                return;
            }
        }
        if (!arrayList.equals(csj.b())) {
            csj.b(arrayList);
        }
    }
}
