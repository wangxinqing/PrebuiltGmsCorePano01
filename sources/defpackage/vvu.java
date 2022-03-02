package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vvu implements acvv {
    private final vvx a;
    private final List b;
    private final cj c;
    private final int d;

    public vvu(vvx vvx, List list, cj cjVar, int i) {
        this.a = vvx;
        this.b = list;
        this.c = cjVar;
        this.d = i;
    }

    public final void a(Object obj) {
        vvx vvx = this.a;
        List list = this.b;
        cj cjVar = this.c;
        int i = this.d;
        List list2 = (List) obj;
        vvx.g.a(list2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        Integer valueOf = Integer.valueOf(i);
        if (!cjVar.a.a()) {
            cm cmVar = cjVar.b;
            synchronized (cmVar.b) {
                cmVar.d = null;
                cmVar.c = valueOf;
            }
            cjVar.a.a(new co(arrayList, (byte[]) null));
        }
    }
}
