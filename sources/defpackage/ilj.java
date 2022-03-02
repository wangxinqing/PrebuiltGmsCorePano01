package defpackage;

import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ilj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ilj implements rhi {
    public final DataHolder a;
    protected int b;
    private int c;

    public ilj(DataHolder dataHolder, int i) {
        iva.a((Object) dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        iva.a(z);
        this.b = i;
        this.c = this.a.a(i);
    }

    public static byte[] a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        aucd o = aizj.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aizj aizj = (aizj) o.b;
        if (!aizj.b.a()) {
            aizj.b = aucj.a(aizj.b);
        }
        auab.a((Iterable) list, (List) aizj.b);
        return ((aizj) o.i()).k();
    }

    public static byte[] b(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        aucd o = aizj.d.o();
        for (int i = 0; i < list.size(); i++) {
            auay a2 = auay.a(ivy.a((SafeParcelable) list.get(i)));
            if (o.c) {
                o.c();
                o.c = false;
            }
            aizj aizj = (aizj) o.b;
            a2.getClass();
            if (!aizj.c.a()) {
                aizj.c = aucj.a(aizj.c);
            }
            aizj.c.add(a2);
        }
        return ((aizj) o.i()).k();
    }

    public static byte[] c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        aucd o = aizj.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aizj aizj = (aizj) o.b;
        if (!aizj.a.a()) {
            aizj.a = aucj.a(aizj.a);
        }
        auab.a((Iterable) list, (List) aizj.a);
        return ((aizj) o.i()).k();
    }

    public float ba() {
        return a("place_likelihood", -1.0f);
    }

    public rhq bb() {
        return new rkr(this.a, this.b);
    }

    public String d(String str) {
        return this.a.c(str, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final byte[] e(String str) {
        return this.a.e(str, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ilj) {
            ilj ilj = (ilj) obj;
            return ius.a(Integer.valueOf(ilj.b), Integer.valueOf(this.b)) && ius.a(Integer.valueOf(ilj.c), Integer.valueOf(this.c)) && ilj.a == this.a;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(String str) {
        return this.a.f(str, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final byte[] g(String str) {
        if (!a(str) || f(str)) {
            return null;
        }
        return e(str);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }

    public final int s() {
        return a("place_hierarchy_level", 0);
    }

    public final List t() {
        return b("place_contained_place_ids", HierarchicalPlaceLikelihoodEntity.a);
    }

    public /* bridge */ /* synthetic */ Object r() {
        return HierarchicalPlaceLikelihoodEntity.a(((rkr) bb()).r(), ba(), a("place_hierarchy_likelihood", -1.0f), s(), t());
    }

    /* access modifiers changed from: protected */
    public final float a(String str, float f) {
        if (!a(str) || f(str)) {
            return f;
        }
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getFloat(i, dataHolder.c.getInt(str));
    }

    /* access modifiers changed from: protected */
    public final boolean c(String str) {
        return this.a.d(str, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final int a(String str, int i) {
        return (!a(str) || f(str)) ? i : b(str);
    }

    /* access modifiers changed from: protected */
    public final int b(String str) {
        return this.a.b(str, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public final SafeParcelable a(String str, Parcelable.Creator creator) {
        byte[] g = g(str);
        if (g != null) {
            return ivy.a(g, creator);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final List b(String str, List list) {
        byte[] g = g(str);
        if (g == null) {
            return list;
        }
        try {
            aizj aizj = (aizj) aucj.a((aucj) aizj.d, g);
            return aizj.a.size() != 0 ? aizj.a : list;
        } catch (auda e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    /* access modifiers changed from: protected */
    public final String a(String str, String str2) {
        return (!a(str) || f(str)) ? str2 : d(str);
    }

    /* access modifiers changed from: protected */
    public final List a(String str, Parcelable.Creator creator, List list) {
        byte[] g = g(str);
        if (g == null) {
            return list;
        }
        try {
            aizj aizj = (aizj) aucj.a((aucj) aizj.d, g);
            if (aizj.c.size() == 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList(aizj.c.size());
            for (auay k : aizj.c) {
                arrayList.add(ivy.a(k.k(), creator));
            }
            return arrayList;
        } catch (auda e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    /* access modifiers changed from: protected */
    public final List a(String str, List list) {
        byte[] g = g(str);
        if (g == null) {
            return list;
        }
        try {
            aizj aizj = (aizj) aucj.a((aucj) aizj.d, g);
            return aizj.b.size() != 0 ? aizj.b : list;
        } catch (auda e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    public final boolean a(String str) {
        return this.a.a(str);
    }
}
