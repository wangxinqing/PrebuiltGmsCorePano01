package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: arxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arxm implements amqy {
    public static final amqy a = new arxm();

    private arxm() {
    }

    public final Object a(Object obj) {
        tzj tzj;
        tzj tzj2;
        Collection<afhu> collection = (Collection) obj;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (afhu a2 : collection) {
                try {
                    tzk tzk = (tzk) a2.a();
                    if (tzk.a == 2) {
                        tzj tzj3 = (tzj) tzk.b;
                        if ((tzj3.a & 1) == 0 && (tzj3.a & 4) != 0) {
                            if (tzk.a == 2) {
                                tzj = (tzj) tzk.b;
                            } else {
                                tzj = tzj.e;
                            }
                            byte[] k = tzj.d.k();
                            if (k.length >= 4) {
                                int i = 0;
                                while (true) {
                                    if (i < 4) {
                                        if (k[i] != -16) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        if (tzk.a == 2) {
                                            tzj2 = (tzj) tzk.b;
                                        } else {
                                            tzj2 = tzj.e;
                                        }
                                        arrayList.add(tzj2);
                                    }
                                }
                            }
                        }
                    }
                } catch (auda e) {
                    anih anih = (anih) aryq.a.c();
                    anih.a((Throwable) e);
                    ((anih) anih.a("arxt", "b", 290, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }
}
