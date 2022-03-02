package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: babf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class babf {
    public static List a(Class cls, Iterable iterable, ClassLoader classLoader, babe babe) {
        Iterable iterable2;
        if (!a(classLoader)) {
            iterable2 = ServiceLoader.load(cls, classLoader);
            if (!iterable2.iterator().hasNext()) {
                iterable2 = ServiceLoader.load(cls);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    arrayList.add(cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
                }
            }
            iterable2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable2) {
            if (babe.b(next)) {
                arrayList2.add(next);
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new babd(babe)));
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean a(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
