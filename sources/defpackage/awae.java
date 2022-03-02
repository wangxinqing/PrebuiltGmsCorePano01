package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: awae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awae extends awag {
    private final Method b;
    private final Method c;
    private final Method d;
    private final Class e;
    private final Class f;

    public awae(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.b = method;
        this.c = method2;
        this.d = method3;
        this.e = cls;
        this.f = cls2;
    }

    public final String a(SSLSocket sSLSocket) {
        try {
            awaf awaf = (awaf) Proxy.getInvocationHandler(this.c.invoke((Object) null, new Object[]{sSLSocket}));
            int i = awaf.c;
            if (awaf.a) {
                return null;
            }
            String str = awaf.b;
            if (str != null) {
                return str;
            }
            awaa.a.logp(Level.INFO, "com.squareup.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError();
        }
    }

    public final void b(SSLSocket sSLSocket) {
        try {
            this.d.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError();
        }
    }

    public final void a(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            avzh avzh = (avzh) list.get(i);
            if (avzh != avzh.HTTP_1_0) {
                arrayList.add(avzh.e);
            }
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(awag.class.getClassLoader(), new Class[]{this.e, this.f}, new awaf(arrayList));
            this.b.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }
}
