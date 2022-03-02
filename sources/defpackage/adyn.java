package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: adyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adyn {
    public final HashMap a = new HashMap();

    public static adyn a(byte[] bArr) {
        try {
            aebx aebx = new aebx((aece) aucj.a((aucj) aece.b, bArr, aubs.c()), new ArrayList());
            adyn adyn = new adyn();
            for (aecd aecd : aebx.a.a) {
                List list = aebx.b;
                String str = aecd.b;
                aecc aecc = aecd.c;
                if (aecc == null) {
                    aecc = aecc.d;
                }
                aeby.a(list, adyn, str, aecc);
            }
            return adyn;
        } catch (auda e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final Set c() {
        return this.a.keySet();
    }

    public final int d(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            a(str, obj, "Integer", e);
            return 0;
        }
    }

    public final long e(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            a(str, obj, "long", e);
            return 0;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof adyn)) {
            return false;
        }
        adyn adyn = (adyn) obj;
        if (b() != adyn.b()) {
            return false;
        }
        for (String str : c()) {
            Object b = b(str);
            Object b2 = adyn.b(str);
            if (b instanceof Asset) {
                if (!(b2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) b;
                Asset asset2 = (Asset) b2;
                if (asset != null && asset2 != null) {
                    if (!TextUtils.isEmpty(asset.b)) {
                        z = asset.b.equals(asset2.b);
                    } else {
                        z = Arrays.equals(asset.a, asset2.a);
                    }
                    if (!z) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (b instanceof String[]) {
                if (!(b2 instanceof String[]) || !Arrays.equals((String[]) b, (String[]) b2)) {
                    return false;
                }
            } else if (b instanceof long[]) {
                if (!(b2 instanceof long[]) || !Arrays.equals((long[]) b, (long[]) b2)) {
                    return false;
                }
            } else if (b instanceof float[]) {
                if (!(b2 instanceof float[]) || !Arrays.equals((float[]) b, (float[]) b2)) {
                    return false;
                }
            } else if (b instanceof byte[]) {
                if (!(b2 instanceof byte[]) || !Arrays.equals((byte[]) b, (byte[]) b2)) {
                    return false;
                }
            } else if (b == null || b2 == null) {
                if (b != b2) {
                    return false;
                }
                return true;
            } else if (!b.equals(b2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 29;
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Object b(String str) {
        return this.a.get(str);
    }

    public final boolean c(String str) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            a(str, obj, "Boolean", false, e);
            return false;
        }
    }

    public final void b(String str, ArrayList arrayList) {
        this.a.put(str, arrayList);
    }

    public static final void a(String str, Object obj, String str2, ClassCastException classCastException) {
        a(str, obj, str2, "<null>", classCastException);
    }

    public static final void a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w("DataMap", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    public final void a(String str, double d) {
        this.a.put(str, Double.valueOf(d));
    }

    public final void a(String str, float f) {
        this.a.put(str, Float.valueOf(f));
    }

    public final void a(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void a(String str, long j) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void a(String str, adyn adyn) {
        this.a.put(str, adyn);
    }

    public final void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void a(String str, ArrayList arrayList) {
        this.a.put(str, arrayList);
    }

    public final void a(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public final byte[] a() {
        ArrayList arrayList = new ArrayList();
        aucd o = aece.b.o();
        TreeSet treeSet = new TreeSet(c());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b = b(str);
            aucd o2 = aecd.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aecd aecd = (aecd) o2.b;
            str.getClass();
            aecd.a |= 1;
            aecd.b = str;
            aecc a2 = aeby.a(arrayList, b);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aecd aecd2 = (aecd) o2.b;
            a2.getClass();
            aecd2.c = a2;
            aecd2.a |= 2;
            arrayList2.add((aecd) o2.i());
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aece aece = (aece) o.b;
        if (!aece.a.a()) {
            aece.a = aucj.a(aece.a);
        }
        auab.a((Iterable) arrayList2, (List) aece.a);
        return new aebx((aece) o.i(), arrayList).a.k();
    }
}
