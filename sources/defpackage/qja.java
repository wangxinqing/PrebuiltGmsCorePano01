package defpackage;

import android.content.ComponentName;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qja {
    public final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();

    private final synchronized void b(String str) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (((ComponentName) ((Map.Entry) it.next()).getValue()).getPackageName().equals(str)) {
                it.remove();
            }
        }
    }

    public final Integer a(String str) {
        return (Integer) this.c.get(str);
    }

    public final synchronized void a() {
        this.b.clear();
        this.c.clear();
        this.a.clear();
    }

    public final String b(int i) {
        return (String) this.b.get(Integer.valueOf(i));
    }

    public final synchronized void a(int i) {
        String str = (String) this.b.remove(Integer.valueOf(i));
        if (str != null) {
            this.c.remove(str);
            b(str);
        }
    }

    public final synchronized void b(String str, ComponentName componentName) {
        ComponentName componentName2 = (ComponentName) this.a.get(str);
        if (componentName2 != null && componentName2.equals(componentName)) {
            this.a.remove(str);
        }
    }

    public final synchronized void a(int i, String str) {
        iva.a((Object) str);
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        String str2 = (String) hashMap.put(valueOf, str);
        Integer num = (Integer) this.c.put(str, valueOf);
        if (str2 != null && !str2.equals(str)) {
            this.c.remove(str2);
            b(str2);
        }
        if (num != null && !num.equals(valueOf)) {
            this.b.remove(num);
        }
    }

    public final synchronized void a(String str, ComponentName componentName) {
        this.a.put(str, componentName);
    }
}
