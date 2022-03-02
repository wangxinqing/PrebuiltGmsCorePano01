package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* renamed from: bans  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bans extends banu {
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class g;
    private final Class h;

    public bans(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    public final int a() {
        return 1;
    }

    public final void b(SSLSocket sSLSocket) {
        try {
            this.f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError();
        } catch (InvocationTargetException e3) {
        }
    }

    public final String a(SSLSocket sSLSocket) {
        try {
            bant bant = (bant) Proxy.getInvocationHandler(this.e.invoke((Object) null, new Object[]{sSLSocket}));
            int i = bant.c;
            if (bant.a) {
                return null;
            }
            String str = bant.b;
            if (str != null) {
                return str;
            }
            banu.a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (InvocationTargetException e2) {
            throw new AssertionError();
        } catch (IllegalAccessException e3) {
            throw new AssertionError();
        }
    }

    public final void a(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            banv banv = (banv) list.get(i);
            if (banv != banv.HTTP_1_0) {
                arrayList.add(banv.e);
            }
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(banu.class.getClassLoader(), new Class[]{this.g, this.h}, new bant(arrayList));
            this.d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
