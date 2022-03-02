package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;

/* renamed from: cbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbh {
    static void a() {
        jtm jtm = new jtm();
        jtm.a(10002);
        jtn a = jtm.a();
        for (bsz bsz : cbi.y().a()) {
            if (!bsz.b()) {
                WriteBatchImpl b = juc.b();
                cjb a2 = cbi.p().a((ContextDataFilterImpl) a, cbi.a(bsz, "ContextManagerInitializer"));
                if (a2.a != 0) {
                    ((anih) ((anih) bxk.a.c()).a("cbh", "a", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerInitializer] Unable to read from store for account %s, status code is %s", (Object) bsz, a2.a);
                } else {
                    ArrayList arrayList = a2.b;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ArrayList arrayList2 = a2.b;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            ContextData contextData = (ContextData) arrayList2.get(i);
                            jut a3 = bvl.a(contextData.j());
                            if (a3 != null) {
                                ((anih) ((anih) bxk.a.c()).a("cbh", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerInitializer] Fixing UDC Model timestamps");
                                jti jti = new jti(contextData);
                                jti.a(a3);
                                b.a(jti.a());
                            }
                        }
                    }
                    cbi.p().a(b, cbi.a(bsz, "ContextManagerInitializer"));
                }
            }
        }
    }
}
