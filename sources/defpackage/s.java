package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: s  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class s {
    static final s a = new s();
    public final Map b = new HashMap();
    private final Map c = new HashMap();

    private static final void a(Map map, r rVar, ac acVar, Class cls) {
        ac acVar2 = (ac) map.get(rVar);
        if (acVar2 != null && acVar != acVar2) {
            Method method = rVar.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + acVar2 + ", new value " + acVar);
        } else if (acVar2 == null) {
            map.put(rVar, acVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final q b(Class cls) {
        q qVar = (q) this.c.get(cls);
        return qVar == null ? a(cls, (Method[]) null) : qVar;
    }

    public final q a(Class cls, Method[] methodArr) {
        int i;
        q b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.b);
        }
        for (Class b3 : cls.getInterfaces()) {
            for (Map.Entry entry : b(b3).b.entrySet()) {
                a(hashMap, (r) entry.getKey(), (ac) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(aj.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                ac a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(ac.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a2 == ac.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length <= 2) {
                    a(hashMap, new r(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        q qVar = new q(hashMap);
        this.c.put(cls, qVar);
        this.b.put(cls, Boolean.valueOf(z));
        return qVar;
    }

    public final Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
