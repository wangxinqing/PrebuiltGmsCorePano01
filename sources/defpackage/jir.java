package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: jir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jir {
    public static List a() {
        return new ArrayList();
    }

    public static Map b(int i, boolean z) {
        return i > (!z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) ? new HashMap(i, !z ? 1.0f : 0.75f) : new nz(i);
    }

    private static Set c(int i, boolean z) {
        return i > (!z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) ? new HashSet(i, !z ? 1.0f : 0.75f) : new ob(i);
    }

    public static List a(int i) {
        if (i != 0) {
            return new ArrayList(i);
        }
        return a();
    }

    public static Map b(Object obj, Object obj2, Object obj3, Object obj4) {
        Map b = b(2, false);
        b.put(obj, obj2);
        b.put(obj3, obj4);
        return Collections.unmodifiableMap(b);
    }

    public static Set b() {
        return new ob();
    }

    public static Set b(int i) {
        return i != 0 ? c(i, true) : b();
    }

    public static Map a(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length == length2) {
            if (length == 1) {
                return Collections.singletonMap(objArr[0], objArr2[0]);
            }
            Map b = b(length, false);
            for (int i = 0; i < objArr.length; i++) {
                b.put(objArr[i], objArr2[i]);
            }
            return Collections.unmodifiableMap(b);
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("Key and values array lengths not equal: ");
        sb.append(length);
        sb.append(" != ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Set a(int i, boolean z) {
        return new LinkedHashSet(i, !z ? 1.0f : 0.75f);
    }

    public static Set a(int i, boolean z, Object[] objArr) {
        Set c = c(i, z);
        Collections.addAll(c, objArr);
        return c;
    }

    @Deprecated
    public static Set a(Object obj, Object obj2) {
        Set c = c(2, false);
        c.add(obj);
        c.add(obj2);
        return Collections.unmodifiableSet(c);
    }

    @Deprecated
    public static Set a(Object obj, Object obj2, Object obj3) {
        Set c = c(3, false);
        c.add(obj);
        c.add(obj2);
        c.add(obj3);
        return Collections.unmodifiableSet(c);
    }

    @Deprecated
    public static Set a(Object obj, Object obj2, Object obj3, Object obj4) {
        Set c = c(4, false);
        c.add(obj);
        c.add(obj2);
        c.add(obj3);
        c.add(obj4);
        return Collections.unmodifiableSet(c);
    }

    @Deprecated
    public static Set a(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            return a(objArr[0], objArr[1]);
        }
        if (length != 3) {
            return length != 4 ? Collections.unmodifiableSet(a(length, false, objArr)) : a(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
        return a(objArr[0], objArr[1], objArr[2]);
    }

    public static boolean a(Collection collection) {
        if (collection != null) {
            return collection.isEmpty();
        }
        return true;
    }

    public static boolean a(Map map) {
        if (map != null) {
            return map.isEmpty();
        }
        return true;
    }
}
