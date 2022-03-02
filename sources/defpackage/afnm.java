package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: afnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnm implements aoqb {
    private final afnt a;

    public afnm(afnt afnt) {
        this.a = afnt;
    }

    public final aorr a(Object obj) {
        Set set;
        aorr aorr;
        afnt afnt = this.a;
        Set set2 = (Set) obj;
        List a2 = afnt.d.a();
        ArrayList arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList2 = new ArrayList();
        int size = a2.size();
        int i = 0;
        while (i < size) {
            aflh aflh = (aflh) a2.get(i);
            if (set2.contains(aflh)) {
                try {
                    arrayList2.add(aopr.a(afnt.c.b(aflh), (amqy) new afnp(arrayList), afnt.i));
                    set = set2;
                } catch (afqs e) {
                    set = set2;
                }
            } else {
                afqr afqr = afnt.c;
                afli a3 = afqr.c.a(aflh);
                if (a3 == null) {
                    afsh.a("%s: No file entry with key %s", (Object) "SharedFileManager", (Object) aflh);
                    aorr = aorl.a((Object) false);
                    set = set2;
                } else {
                    Context context = afqr.a;
                    int a4 = afkq.a(aflh.e);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    set = set2;
                    Uri a5 = afsp.a(context, a4, a3.b, afqr.b, afqr.j);
                    if (a5 != null) {
                        afqr.d.a(a5);
                    }
                    afqu afqu = afqr.c;
                    if (!afst.a(afst.a(afqu.a, "gms_icing_mdd_shared_files", afqu.c), afqu.a(aflh, afqu.a, afqu.b))) {
                        afsh.a("%s: Unable to modify file subscription for key %s", (Object) "SharedFileManager", (Object) aflh);
                        aorr = aorl.a((Object) false);
                    } else {
                        aorr = aorl.a((Object) true);
                    }
                }
                arrayList2.add(aopr.a(aorr, (amqy) new afno(afnt, atomicInteger, aflh), afnt.i));
            }
            i++;
            set2 = set;
        }
        return aorl.b((Iterable) arrayList2).a((Callable) new afnq(afnt, atomicInteger, arrayList), afnt.i);
    }
}
