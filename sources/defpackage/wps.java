package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: wps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wps {
    public SparseArray a;
    public SparseArray b;

    private static String a(String str, boolean z) {
        amri amri;
        if (!z) {
            return ycn.a(str);
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            xip.a();
            int intValue = Integer.valueOf((int) aywy.a.a().cA()).intValue();
            int i = 0;
            for (int length = str.length() - 1; length >= 0 && i != intValue; length--) {
                Character valueOf = Character.valueOf(str.charAt(length));
                if (valueOf.charValue() >= '0' && valueOf.charValue() <= '9') {
                    sb.append(valueOf);
                    i++;
                }
            }
            String sb2 = sb.toString();
            if (sb2.isEmpty()) {
                amri = ampu.a;
            } else {
                amri = amri.b(sb2);
            }
        } else {
            amri = ampu.a;
        }
        if (amri.a()) {
            return (String) amri.b();
        }
        return ycn.a(str);
    }

    static final Set a(aqxx aqxx) {
        HashSet hashSet = new HashSet();
        if (aqxx != null) {
            if (!aqxx.a.isEmpty()) {
                hashSet.add(aqxx.a);
            }
            xip.a();
            boolean booleanValue = ((Boolean) xhe.a.a()).booleanValue();
            aucx aucx = aqxx.e;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                aqxu aqxu = (aqxu) aucx.get(i);
                hashSet.add(a(aqxu.a, booleanValue));
                hashSet.add(aqxu.b);
            }
            aucx aucx2 = aqxx.d;
            int size2 = aucx2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                aqxs aqxs = (aqxs) aucx2.get(i2);
                hashSet.add(aqxs.a);
                hashSet.add(aqxs.b);
            }
            aucx aucx3 = aqxx.f;
            int size3 = aucx3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                aqxv aqxv = (aqxv) aucx3.get(i3);
                hashSet.add(aqxv.a);
                hashSet.add(aqxv.b);
            }
        }
        return hashSet;
    }

    public static final Set a(aqxs[] aqxsArr) {
        HashSet hashSet = new HashSet();
        for (aqxs aqxs : aqxsArr) {
            hashSet.add(aqxs.a);
        }
        return hashSet;
    }

    public static final Set a(aqxu[] aqxuArr) {
        xip.a();
        boolean booleanValue = ((Boolean) xhe.a.a()).booleanValue();
        HashSet hashSet = new HashSet();
        for (aqxu aqxu : aqxuArr) {
            hashSet.add(a(aqxu.a, booleanValue));
        }
        return hashSet;
    }

    public static final Set a(aqxv[] aqxvArr) {
        HashSet hashSet = new HashSet();
        for (aqxv aqxv : aqxvArr) {
            hashSet.add(aqxv.a);
        }
        return hashSet;
    }

    public static final boolean a(aqxx aqxx, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aqxx aqxx2 = (aqxx) it.next();
            if (ius.a(a((aqxs[]) aqxx.d.toArray(new aqxs[0])), a((aqxs[]) aqxx2.d.toArray(new aqxs[0]))) && ius.a(a((aqxu[]) aqxx.e.toArray(new aqxu[0])), a((aqxu[]) aqxx2.e.toArray(new aqxu[0]))) && ius.a(a((aqxv[]) aqxx.f.toArray(new aqxv[0])), a((aqxv[]) aqxx2.f.toArray(new aqxv[0]))) && ius.a(aqxx.a, aqxx2.a)) {
                return true;
            }
        }
        return false;
    }

    public final void a(aqxb aqxb) {
        if (aqxb != null) {
            this.b = new SparseArray();
            aucx aucx = aqxb.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                aqxx aqxx = (aqxx) aucx.get(i);
                int hashCode = Arrays.hashCode(new Object[]{aqxx.a});
                Set set = (Set) this.b.get(hashCode);
                if (set == null) {
                    set = new HashSet();
                    this.b.put(hashCode, set);
                }
                set.add(aqxx);
            }
        }
    }
}
