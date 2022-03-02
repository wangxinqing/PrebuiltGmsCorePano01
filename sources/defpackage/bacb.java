package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bacb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacb {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final List e = new ArrayList();

    public bacb(Class cls, ClassLoader classLoader) {
        Class<? extends U> asSubclass = cls.asSubclass(ammq.class);
        this.a = asSubclass;
        this.d = asSubclass.getMethod("getScopes", new Class[0]);
        Method declaredMethod = Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(ammq.class).getDeclaredMethod("newBuilder", new Class[0]);
        this.b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", new Class[0]);
        Method method = this.a.getMethod("getClientId", new Class[0]);
        this.e.add(new bacc(method, returnType.getMethod("setClientId", new Class[]{method.getReturnType()})));
        Method method2 = this.a.getMethod("getClientEmail", new Class[0]);
        this.e.add(new bacc(method2, returnType.getMethod("setClientEmail", new Class[]{method2.getReturnType()})));
        Method method3 = this.a.getMethod("getPrivateKey", new Class[0]);
        this.e.add(new bacc(method3, returnType.getMethod("setPrivateKey", new Class[]{method3.getReturnType()})));
        Method method4 = this.a.getMethod("getPrivateKeyId", new Class[0]);
        this.e.add(new bacc(method4, returnType.getMethod("setPrivateKeyId", new Class[]{method4.getReturnType()})));
    }
}
