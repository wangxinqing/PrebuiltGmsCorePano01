package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: szg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szg extends syx {
    public szg(sze sze) {
        super(sze);
    }

    static int a(aucd aucd, String str) {
        for (int i = 0; i < ((tad) aucd.b).e.size(); i++) {
            if (str.equals(aucd.y(i).c)) {
                return i;
            }
        }
        return -1;
    }

    static final tab b(szz szz, String str) {
        aucx aucx = szz.b;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            tab tab = (tab) aucx.get(i);
            i++;
            if (tab.b.equals(str)) {
                return tab;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void b(aucd aucd, Object obj) {
        iva.a(obj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tab tab = (tab) aucd.b;
        tab tab2 = tab.g;
        tab.a &= -3;
        tab.c = tab.g.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tab tab3 = (tab) aucd.b;
        int i = tab3.a & -5;
        tab3.a = i;
        tab3.d = 0;
        tab3.a = i & -17;
        tab3.e = 0.0d;
        tab3.f = aucj.s();
        if (obj instanceof String) {
            String str = (String) obj;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tab tab4 = (tab) aucd.b;
            str.getClass();
            tab4.a |= 2;
            tab4.c = str;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tab tab5 = (tab) aucd.b;
            tab5.a |= 4;
            tab5.d = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tab tab6 = (tab) aucd.b;
            tab6.a |= 16;
            tab6.e = doubleValue;
        } else if (!ayij.b() || !v().a(sud.aM) || !(obj instanceof Bundle[])) {
            E().c.a("Ignoring invalid (type) event param value", obj);
        } else {
            aucd.U(a((Bundle[]) obj));
        }
    }

    static audw a(audw audw, byte[] bArr) {
        aubs c = aubs.c();
        if (c != null) {
            return audw.a(bArr, c);
        }
        return audw.a(bArr);
    }

    public static final String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    static List a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                aucd o = tab.g.o();
                for (String str : bundle.keySet()) {
                    aucd o2 = tab.g.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    tab tab = (tab) o2.b;
                    str.getClass();
                    tab.a |= 1;
                    tab.b = str;
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        long longValue = ((Long) obj).longValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        tab tab2 = (tab) o2.b;
                        tab2.a |= 4;
                        tab2.d = longValue;
                    } else if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        tab tab3 = (tab) o2.b;
                        str2.getClass();
                        tab3.a |= 2;
                        tab3.c = str2;
                    } else if (obj instanceof Double) {
                        double doubleValue = ((Double) obj).doubleValue();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        tab tab4 = (tab) o2.b;
                        tab4.a |= 16;
                        tab4.e = doubleValue;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    tab tab5 = (tab) o.b;
                    tab tab6 = (tab) o2.i();
                    tab6.getClass();
                    tab5.a();
                    tab5.f.add(tab6);
                }
                if (((tab) o.b).f.size() > 0) {
                    arrayList.add((tab) o.i());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            E().c.a("Failed to gzip content", e);
            throw e;
        }
    }

    public static final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void a(StringBuilder sb, String str, taf taf) {
        Integer num;
        StringBuilder sb2 = sb;
        taf taf2 = taf;
        if (taf2 != null) {
            a(sb2, 3);
            sb.append(str);
            sb2.append(" {\n");
            if (taf2.b.size() != 0) {
                a(sb2, 4);
                sb2.append("results: ");
                aucv aucv = taf2.b;
                int size = aucv.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    Long l = (Long) aucv.get(i);
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l);
                    i++;
                    i2 = i3;
                }
                sb2.append(10);
            }
            if (taf2.a.size() != 0) {
                a(sb2, 4);
                sb2.append("status: ");
                aucv aucv2 = taf2.a;
                int size2 = aucv2.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size2) {
                    Long l2 = (Long) aucv2.get(i4);
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l2);
                    i4++;
                    i5 = i6;
                }
                sb2.append(10);
            }
            if (taf2.c.size() != 0) {
                a(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                aucx aucx = taf2.c;
                int size3 = aucx.size();
                int i7 = 0;
                int i8 = 0;
                while (i7 < size3) {
                    szy szy = (szy) aucx.get(i7);
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append((szy.a & 1) != 0 ? Integer.valueOf(szy.b) : null);
                    sb2.append(":");
                    sb2.append((szy.a & 2) != 0 ? Long.valueOf(szy.c) : null);
                    i7++;
                    i8 = i9;
                }
                sb2.append("}\n");
            }
            if (taf2.d.size() != 0) {
                a(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                aucx aucx2 = taf2.d;
                int size4 = aucx2.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size4) {
                    tag tag = (tag) aucx2.get(i10);
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    if ((tag.a & 1) != 0) {
                        num = Integer.valueOf(tag.b);
                    } else {
                        num = null;
                    }
                    sb2.append(num);
                    sb2.append(": [");
                    aucv aucv3 = tag.c;
                    int size5 = aucv3.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < size5) {
                        long longValue = ((Long) aucv3.get(i13)).longValue();
                        int i15 = i14 + 1;
                        if (i14 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue);
                        i13++;
                        i14 = i15;
                    }
                    sb2.append("]");
                    i10++;
                    i11 = i12;
                }
                sb2.append("}\n");
            }
            a(sb2, 3);
            sb2.append("}\n");
        }
    }

    static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean a(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        iva.a((Object) bArr);
        x().h();
        MessageDigest f = szj.f();
        if (f != null) {
            return szj.a(f.digest(bArr));
        }
        E().c.a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Parcelable a(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (ivv e) {
            E().c.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a(szz szz, String str) {
        tab b = b(szz, str);
        if (b == null) {
            return null;
        }
        int i = b.a;
        if ((i & 2) != 0) {
            return b.c;
        }
        if ((i & 4) != 0) {
            return Long.valueOf(b.d);
        }
        if ((i & 16) != 0) {
            return Double.valueOf(b.e);
        }
        if (!ayij.b() || !v().a(sud.aM) || b.f.size() <= 0) {
            return null;
        }
        aucx aucx = b.f;
        ArrayList arrayList = new ArrayList();
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            tab tab = (tab) aucx.get(i2);
            if (tab != null) {
                Bundle bundle = new Bundle();
                aucx aucx2 = tab.f;
                int size2 = aucx2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    tab tab2 = (tab) aucx2.get(i3);
                    int i4 = tab2.a;
                    if ((i4 & 2) != 0) {
                        bundle.putString(tab2.b, tab2.c);
                    } else if ((i4 & 4) != 0) {
                        bundle.putLong(tab2.b, tab2.d);
                    } else if ((i4 & 16) != 0) {
                        bundle.putDouble(tab2.b, tab2.e);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    public final List a(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                E().f.a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    E().f.a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (size2 >= 0 && ((Long) arrayList.get(size2)).longValue() == 0) {
            size = size2;
            size2--;
        }
        return arrayList.subList(0, size);
    }

    /* access modifiers changed from: package-private */
    public final void a(aucd aucd, Object obj) {
        iva.a(obj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tah tah = (tah) aucd.b;
        tah tah2 = tah.g;
        tah.a &= -5;
        tah.d = tah.g.d;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tah tah3 = (tah) aucd.b;
        int i = tah3.a & -9;
        tah3.a = i;
        tah3.e = 0;
        int i2 = i & -33;
        tah3.a = i2;
        tah3.f = 0.0d;
        if (obj instanceof String) {
            String str = (String) obj;
            str.getClass();
            tah3.a = i2 | 4;
            tah3.d = str;
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tah tah4 = (tah) aucd.b;
            tah4.a |= 8;
            tah4.e = longValue;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tah tah5 = (tah) aucd.b;
            tah5.a |= 32;
            tah5.f = doubleValue;
        } else {
            E().c.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(aucd aucd, String str, Object obj) {
        List unmodifiableList = Collections.unmodifiableList(((szz) aucd.b).b);
        int i = 0;
        while (true) {
            if (i >= unmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((tab) unmodifiableList.get(i)).b)) {
                break;
            } else {
                i++;
            }
        }
        aucd o = tab.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tab tab = (tab) o.b;
        str.getClass();
        int i2 = tab.a | 1;
        tab.a = i2;
        tab.b = str;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            tab tab2 = (tab) o.b;
            tab2.a |= 4;
            tab2.d = longValue;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            str2.getClass();
            tab.a = i2 | 2;
            tab.c = str2;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            tab tab3 = (tab) o.b;
            tab3.a |= 16;
            tab3.e = doubleValue;
        } else if (ayij.b() && v().a(sud.aM) && (obj instanceof Bundle[])) {
            o.U(a((Bundle[]) obj));
        }
        if (i >= 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            szz szz = (szz) aucd.b;
            tab tab4 = (tab) o.i();
            szz szz2 = szz.g;
            tab4.getClass();
            szz.a();
            szz.b.set(i, tab4);
            return;
        }
        aucd.p(o);
    }

    public final void a(StringBuilder sb, int i, String str, szp szp) {
        if (szp != null) {
            a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if ((szp.a & 1) != 0) {
                int a = szo.a(szp.b);
                if (a == 0) {
                    a = 1;
                }
                a(sb, i, "comparison_type", (Object) a != 1 ? a != 2 ? a != 3 ? a != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if ((szp.a & 2) != 0) {
                a(sb, i, "match_as_float", (Object) Boolean.valueOf(szp.c));
            }
            if (!ayjn.b() || !v().a(sud.aJ) || (szp.a & 4) != 0) {
                a(sb, i, "comparison_value", (Object) szp.d);
            }
            if (!ayjn.b() || !v().a(sud.aJ) || (szp.a & 8) != 0) {
                a(sb, i, "min_comparison_value", (Object) szp.e);
            }
            if (!ayjn.b() || !v().a(sud.aJ) || (szp.a & 16) != 0) {
                a(sb, i, "max_comparison_value", (Object) szp.f);
            }
            a(sb, i);
            sb.append("}\n");
        }
    }

    public final void a(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                tab tab = (tab) list.get(i3);
                if (tab != null) {
                    a(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!ayij.b() || !v().a(sud.aK)) {
                        a(sb, i2, "name", (Object) y().b(tab.b));
                        a(sb, i2, "string_value", (Object) tab.c);
                        a(sb, i2, "int_value", (Object) (tab.a & 4) != 0 ? Long.valueOf(tab.d) : null);
                        if ((tab.a & 16) != 0) {
                            d = Double.valueOf(tab.e);
                        }
                        a(sb, i2, "double_value", (Object) d);
                    } else {
                        if ((tab.a & 1) != 0) {
                            str = y().b(tab.b);
                        } else {
                            str = null;
                        }
                        a(sb, i2, "name", (Object) str);
                        if ((tab.a & 2) != 0) {
                            str2 = tab.c;
                        } else {
                            str2 = null;
                        }
                        a(sb, i2, "string_value", (Object) str2);
                        if ((tab.a & 4) != 0) {
                            l = Long.valueOf(tab.d);
                        } else {
                            l = null;
                        }
                        a(sb, i2, "int_value", (Object) l);
                        if ((tab.a & 16) != 0) {
                            d = Double.valueOf(tab.e);
                        }
                        a(sb, i2, "double_value", (Object) d);
                        if (tab.f.size() > 0) {
                            a(sb, i2, (List) tab.f);
                        }
                    }
                    a(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void a(StringBuilder sb, int i, szm szm) {
        String str;
        if (szm != null) {
            a(sb, i);
            sb.append("filter {\n");
            if ((szm.a & 4) != 0) {
                a(sb, i, "complement", (Object) Boolean.valueOf(szm.d));
            }
            if (!ayjn.b() || !v().a(sud.aJ) || (szm.a & 8) != 0) {
                a(sb, i, "param_name", (Object) y().b(szm.e));
            }
            int i2 = 1;
            if (!ayjn.b() || !v().a(sud.aJ) || (szm.a & 1) != 0) {
                int i3 = i + 1;
                szt szt = szm.b;
                if (szt == null) {
                    szt = szt.f;
                }
                if (szt != null) {
                    a(sb, i3);
                    sb.append("string_filter {\n");
                    if ((szt.a & 1) != 0) {
                        int a = szs.a(szt.b);
                        if (a != 0) {
                            i2 = a;
                        }
                        switch (i2) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        a(sb, i3, "match_type", (Object) str);
                    }
                    if (!ayjn.b() || !v().a(sud.aJ) || (szt.a & 2) != 0) {
                        a(sb, i3, "expression", (Object) szt.c);
                    }
                    if ((szt.a & 4) != 0) {
                        a(sb, i3, "case_sensitive", (Object) Boolean.valueOf(szt.d));
                    }
                    if (szt.e.size() > 0) {
                        a(sb, i3 + 1);
                        sb.append("expression_list {\n");
                        aucx aucx = szt.e;
                        int size = aucx.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            a(sb, i3 + 2);
                            sb.append((String) aucx.get(i4));
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    a(sb, i3);
                    sb.append("}\n");
                }
            }
            if (!ayjn.b() || !v().a(sud.aJ) || (szm.a & 2) != 0) {
                int i5 = i + 1;
                szp szp = szm.c;
                if (szp == null) {
                    szp = szp.g;
                }
                a(sb, i5, "number_filter", szp);
            }
            a(sb, i);
            sb.append("}\n");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(A().a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(EventParcel eventParcel, AppMetadata appMetadata) {
        iva.a((Object) eventParcel);
        iva.a((Object) appMetadata);
        if (!ayid.b() || !v().a(sud.aB)) {
            if (!TextUtils.isEmpty(appMetadata.b) || !TextUtils.isEmpty(appMetadata.r)) {
                return true;
            }
            if (!u().a || (!"_in".equals(eventParcel.a) && !"_ui".equals(eventParcel.a) && !"_ug".equals(eventParcel.a))) {
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(appMetadata.b) || !TextUtils.isEmpty(appMetadata.r)) {
            return true;
        } else {
            return false;
        }
    }
}
