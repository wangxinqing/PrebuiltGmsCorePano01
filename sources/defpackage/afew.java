package defpackage;

import java.util.HashMap;

/* renamed from: afew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afew implements aoqb {
    public final aorr a(Object obj) {
        Exception exc = (Exception) obj;
        HashMap hashMap = new HashMap();
        for (Throwable th : amtb.c(exc)) {
            hashMap.put(th.getClass(), th);
        }
        if (hashMap.containsKey(aern.class)) {
            aucd o = aokp.o.o();
            aomx aomx = aomx.CALL_CREDENTIALS_ERROR;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokp aokp = (aokp) o.b;
            aokp.c = aomx.a();
            aokp.a |= 2;
            return aorl.a((Object) (aokp) o.i());
        } else if (hashMap.containsKey(affu.class)) {
            aucd o2 = aokp.o.o();
            aomx a = affb.a((affu) hashMap.get(affu.class));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aokp aokp2 = (aokp) o2.b;
            aokp2.c = a.a();
            aokp2.a |= 2;
            return aorl.a((Object) (aokp) o2.i());
        } else {
            throw exc;
        }
    }
}
