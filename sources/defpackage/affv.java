package defpackage;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: affv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class affv {
    public static Exception a(Exception exc, aeri aeri) {
        HashMap hashMap = new HashMap();
        for (Throwable th : amtb.c(exc)) {
            hashMap.put(th.getClass(), th);
        }
        if (aeri.E() && hashMap.containsKey(babl.class)) {
            babg babg = ((babl) hashMap.get(babl.class)).a.r;
            if (babg.equals(babj.j.r)) {
                return new affu((Throwable) exc, 5);
            }
            if (babg.equals(babj.o.r)) {
                return new affu((Throwable) exc, 6);
            }
            if (babg.equals(babj.f.r)) {
                return new affu((Throwable) exc, 7);
            }
        }
        if (hashMap.containsKey(UnknownHostException.class)) {
            return new affu((Throwable) exc, 2);
        }
        return hashMap.containsKey(ConnectException.class) ? new affu((Throwable) exc, 4) : exc;
    }
}
