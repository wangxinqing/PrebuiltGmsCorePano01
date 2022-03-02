package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlobalSearchQuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dta();
    final CorpusId[] a;
    public final int b;
    final CorpusScoringInfo[] c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final byte[] i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int[] m;
    public final byte[] n;
    public final STSortSpec o;
    public final String p;
    public final int q;
    public final transient Map r;
    public final transient Map s;

    public GlobalSearchQuerySpecification(CorpusId[] corpusIdArr, int i2, CorpusScoringInfo[] corpusScoringInfoArr, int i3, int i4, int i5, String str, boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int[] iArr, byte[] bArr2, STSortSpec sTSortSpec, String str2, int i6) {
        int length;
        CorpusId[] corpusIdArr2 = corpusIdArr;
        CorpusScoringInfo[] corpusScoringInfoArr2 = corpusScoringInfoArr;
        this.a = corpusIdArr2;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = str;
        this.h = z;
        this.i = bArr;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = iArr;
        this.n = bArr2;
        this.o = sTSortSpec;
        this.p = str2;
        this.q = i6;
        this.c = corpusScoringInfoArr2;
        if (corpusIdArr2 == null || corpusIdArr2.length == 0) {
            this.r = null;
        } else {
            this.r = new HashMap();
            for (int i7 = 0; i7 < corpusIdArr2.length; i7++) {
                Set set = (Set) this.r.get(corpusIdArr2[i7].a);
                if (set == null) {
                    set = new HashSet();
                    this.r.put(corpusIdArr2[i7].a, set);
                }
                String str3 = corpusIdArr2[i7].b;
                if (str3 != null) {
                    set.add(str3);
                }
            }
        }
        if (corpusScoringInfoArr2 == null || (length = corpusScoringInfoArr2.length) == 0) {
            this.s = null;
            return;
        }
        this.s = new HashMap(length);
        for (CorpusScoringInfo corpusScoringInfo : corpusScoringInfoArr2) {
            this.s.put(corpusScoringInfo.a, corpusScoringInfo);
        }
    }

    public final int a() {
        Map map = this.r;
        if (map != null) {
            int i2 = 0;
            for (Set size : map.values()) {
                i2 += size.size();
            }
            if (i2 != 0) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchQuerySpecification) {
            GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) obj;
            return ius.a(Integer.valueOf(this.b), Integer.valueOf(globalSearchQuerySpecification.b)) && ius.a(Integer.valueOf(this.d), Integer.valueOf(globalSearchQuerySpecification.d)) && ius.a(Integer.valueOf(this.e), Integer.valueOf(globalSearchQuerySpecification.e)) && ius.a(Integer.valueOf(this.f), Integer.valueOf(globalSearchQuerySpecification.f)) && ius.a(this.g, globalSearchQuerySpecification.g) && ius.a(Boolean.valueOf(this.h), Boolean.valueOf(globalSearchQuerySpecification.h)) && ius.a(Boolean.valueOf(this.j), Boolean.valueOf(globalSearchQuerySpecification.j)) && ius.a(Boolean.valueOf(this.k), Boolean.valueOf(globalSearchQuerySpecification.k)) && ius.a(Boolean.valueOf(this.l), Boolean.valueOf(globalSearchQuerySpecification.l)) && ius.a(this.s, globalSearchQuerySpecification.s) && ius.a(this.o, globalSearchQuerySpecification.o) && ius.a(this.p, globalSearchQuerySpecification.p) && Arrays.equals(this.a, globalSearchQuerySpecification.a) && Arrays.equals(this.i, globalSearchQuerySpecification.i) && Arrays.equals(this.c, globalSearchQuerySpecification.c) && Arrays.equals(this.m, globalSearchQuerySpecification.m) && Arrays.equals(this.n, globalSearchQuerySpecification.n) && ius.a(Integer.valueOf(this.q), Integer.valueOf(globalSearchQuerySpecification.q));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.s, this.o, this.p, Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.n)), Integer.valueOf(this.q)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.r != null) {
            sb.append("mFilter\n");
            for (String str : this.r.keySet()) {
                String str2 = "";
                for (String str3 : (Set) this.r.get(str)) {
                    String valueOf = String.valueOf(str2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str3).length());
                    sb2.append(valueOf);
                    sb2.append(str3);
                    sb2.append(",");
                    str2 = sb2.toString();
                }
                sb.append("key:");
                sb.append(str);
                sb.append(", values:");
                sb.append(str2);
                sb.append("\n");
            }
        }
        if (this.s != null) {
            sb.append("mCorpusScoringInfoMap\n");
            for (CorpusId corpusId : this.s.keySet()) {
                sb.append(String.valueOf(corpusId.toString()).concat("\n"));
            }
        }
        if (this.o != null) {
            sb.append("STSortSpec: ");
            sb.append(this.o.toString());
            sb.append("\n");
        }
        if (this.p != null) {
            sb.append("Origin: ");
            sb.append(this.p);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final CorpusScoringInfo a(String str, String str2) {
        Map map = this.s;
        if (map == null) {
            return null;
        }
        CorpusScoringInfo corpusScoringInfo = (CorpusScoringInfo) map.get(new CorpusId(str, str2));
        return corpusScoringInfo == null ? (CorpusScoringInfo) this.s.get(new CorpusId(str, (String) null)) : corpusScoringInfo;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, (Parcelable[]) this.a, i2);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, (Parcelable[]) this.c, i2);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.b(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l);
        ivx.a(parcel, 13, this.m, false);
        ivx.a(parcel, 14, this.n, false);
        ivx.a(parcel, 15, this.o, i2, false);
        ivx.a(parcel, 16, this.p, false);
        ivx.b(parcel, 17, this.q);
        ivx.b(parcel, a2);
    }
}
