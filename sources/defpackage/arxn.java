package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: arxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arxn implements amqy {
    static final amqy a = new arxn();

    private arxn() {
    }

    public final Object a(Object obj) {
        Collection<afhu> collection = (Collection) obj;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (afhu a2 : collection) {
                try {
                    tzk tzk = (tzk) a2.a();
                    if (tzk.a == 2) {
                        tzj tzj = (tzj) tzk.b;
                        if ((tzj.a & 1) != 0) {
                            arrayList.add(tzj);
                        }
                    }
                } catch (auda e) {
                    anih anih = (anih) aryq.a.c();
                    anih.a((Throwable) e);
                    ((anih) anih.a("arxt", "a", 328, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }
}
