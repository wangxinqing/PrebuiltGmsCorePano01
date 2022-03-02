package defpackage;

import java.util.concurrent.ConcurrentMap;

/* renamed from: qvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qvd {
    public static ahbj a() {
        try {
            return new ahbj(ihs.b().getLockMap("mobstore-lockscope"));
        } catch (NoSuchMethodError e) {
            return new ahbj((ConcurrentMap) null);
        }
    }
}
