package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: aeby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeby {
    public static aecc a(List list, Object obj) {
        int a;
        int a2;
        int a3;
        int a4;
        List list2;
        List list3 = list;
        Object obj2 = obj;
        aucd o = aecc.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aecc aecc = (aecc) o.b;
        aecc.b = 1;
        int i = aecc.a | 1;
        aecc.a = i;
        if (obj2 != null) {
            aucd o2 = aecb.p.o();
            if (obj2 instanceof String) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc2 = (aecc) o.b;
                aecc2.b = 2;
                aecc2.a = 1 | aecc2.a;
                String str = (String) obj2;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb = (aecb) o2.b;
                str.getClass();
                aecb.a |= 2;
                aecb.c = str;
            } else if (obj2 instanceof Integer) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc3 = (aecc) o.b;
                aecc3.b = 6;
                aecc3.a = 1 | aecc3.a;
                int intValue = ((Integer) obj2).intValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb2 = (aecb) o2.b;
                aecb2.a |= 32;
                aecb2.g = intValue;
            } else if (obj2 instanceof Long) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc4 = (aecc) o.b;
                aecc4.b = 5;
                aecc4.a = 1 | aecc4.a;
                long longValue = ((Long) obj2).longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb3 = (aecb) o2.b;
                aecb3.a |= 16;
                aecb3.f = longValue;
            } else if (obj2 instanceof Double) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc5 = (aecc) o.b;
                aecc5.b = 3;
                aecc5.a = 1 | aecc5.a;
                double doubleValue = ((Double) obj2).doubleValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb4 = (aecb) o2.b;
                aecb4.a |= 4;
                aecb4.d = doubleValue;
            } else if (obj2 instanceof Float) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc6 = (aecc) o.b;
                aecc6.b = 4;
                aecc6.a = 1 | aecc6.a;
                float floatValue = ((Float) obj2).floatValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb5 = (aecb) o2.b;
                aecb5.a |= 8;
                aecb5.e = floatValue;
            } else if (obj2 instanceof Boolean) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc7 = (aecc) o.b;
                aecc7.b = 8;
                aecc7.a = 1 | aecc7.a;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb6 = (aecb) o2.b;
                aecb6.a |= 128;
                aecb6.i = booleanValue;
            } else if (obj2 instanceof Byte) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc8 = (aecc) o.b;
                aecc8.b = 7;
                aecc8.a = 1 | aecc8.a;
                byte byteValue = ((Byte) obj2).byteValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb7 = (aecb) o2.b;
                aecb7.a |= 64;
                aecb7.h = byteValue;
            } else if (obj2 instanceof byte[]) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc9 = (aecc) o.b;
                aecc9.b = 1;
                aecc9.a |= 1;
                auay a5 = auay.a((byte[]) obj2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb8 = (aecb) o2.b;
                a5.getClass();
                aecb8.a = 1 | aecb8.a;
                aecb8.b = a5;
            } else if (obj2 instanceof String[]) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc10 = (aecc) o.b;
                aecc10.b = 11;
                aecc10.a = 1 | aecc10.a;
                List asList = Arrays.asList((String[]) obj2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb9 = (aecb) o2.b;
                if (!aecb9.l.a()) {
                    aecb9.l = aucj.a(aecb9.l);
                }
                auab.a((Iterable) asList, (List) aecb9.l);
            } else if (obj2 instanceof long[]) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc11 = (aecc) o.b;
                aecc11.b = 12;
                aecc11.a = 1 | aecc11.a;
                List a6 = aook.a((long[]) obj2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb10 = (aecb) o2.b;
                if (!aecb10.m.a()) {
                    aecb10.m = aucj.a(aecb10.m);
                }
                auab.a((Iterable) a6, (List) aecb10.m);
            } else if (obj2 instanceof float[]) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc12 = (aecc) o.b;
                aecc12.b = 15;
                aecc12.a = 1 | aecc12.a;
                float[] fArr = (float[]) obj2;
                int length = fArr.length;
                if (length == 0) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = new aood(fArr, 0, length);
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb11 = (aecb) o2.b;
                if (!aecb11.n.a()) {
                    aecb11.n = aucj.a(aecb11.n);
                }
                auab.a((Iterable) list2, (List) aecb11.n);
            } else if (obj2 instanceof Asset) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc13 = (aecc) o.b;
                aecc13.b = 13;
                aecc13.a = 1 | aecc13.a;
                list3.add((Asset) obj2);
                long size = (long) (list.size() - 1);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb12 = (aecb) o2.b;
                aecb12.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                aecb12.o = size;
            } else if (obj2 instanceof adyn) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc14 = (aecc) o.b;
                aecc14.b = 9;
                aecc14.a |= 1;
                adyn adyn = (adyn) obj2;
                TreeSet treeSet = new TreeSet(adyn.c());
                aecd[] aecdArr = new aecd[treeSet.size()];
                Iterator it = treeSet.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    aucd o3 = aecd.d.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aecd aecd = (aecd) o3.b;
                    str2.getClass();
                    aecd.a |= 1;
                    aecd.b = str2;
                    aecc a7 = a(list3, adyn.b(str2));
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aecd aecd2 = (aecd) o3.b;
                    a7.getClass();
                    aecd2.c = a7;
                    aecd2.a |= 2;
                    aecdArr[i2] = (aecd) o3.i();
                    i2++;
                }
                List asList2 = Arrays.asList(aecdArr);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aecb aecb13 = (aecb) o2.b;
                if (!aecb13.j.a()) {
                    aecb13.j = aucj.a(aecb13.j);
                }
                auab.a((Iterable) asList2, (List) aecb13.j);
            } else if (!(obj2 instanceof ArrayList)) {
                String valueOf = String.valueOf(obj.getClass().getSimpleName());
                throw new RuntimeException(valueOf.length() == 0 ? new String("newFieldValueFromValue: unexpected value ") : "newFieldValueFromValue: unexpected value ".concat(valueOf));
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aecc aecc15 = (aecc) o.b;
                aecc15.b = 10;
                aecc15.a |= 1;
                ArrayList arrayList = (ArrayList) obj2;
                int size2 = arrayList.size();
                Object obj3 = null;
                int i3 = 0;
                int i4 = 14;
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    aecc a8 = a(list3, obj4);
                    int a9 = aeca.a(a8.b);
                    if ((a9 != 0 && a9 == 14) || (((a2 = aeca.a(a8.b)) != 0 && a2 == 2) || (((a3 = aeca.a(a8.b)) != 0 && a3 == 6) || ((a4 = aeca.a(a8.b)) != 0 && a4 == 9)))) {
                        if (i4 != 14 || ((a = aeca.a(a8.b)) != 0 && a == 14)) {
                            int a10 = aeca.a(a8.b);
                            if (a10 == 0) {
                                a10 = 1;
                            }
                            if (a10 != i4) {
                                String valueOf2 = String.valueOf(obj3.getClass());
                                String valueOf3 = String.valueOf(obj4.getClass());
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 80 + String.valueOf(valueOf3).length());
                                sb.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                                sb.append(valueOf2);
                                sb.append(" and a ");
                                sb.append(valueOf3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            int a11 = aeca.a(a8.b);
                            if (a11 != 0) {
                                i4 = a11;
                            } else {
                                i4 = 1;
                            }
                            obj3 = obj4;
                        }
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aecb aecb14 = (aecb) o2.b;
                        a8.getClass();
                        if (!aecb14.k.a()) {
                            aecb14.k = aucj.a(aecb14.k);
                        }
                        aecb14.k.add(a8);
                        i3++;
                    } else {
                        String valueOf4 = String.valueOf(obj4.getClass());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 130);
                        sb2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        sb2.append(valueOf4);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aecc aecc16 = (aecc) o.b;
            aecb aecb15 = (aecb) o2.i();
            aecb15.getClass();
            aecc16.c = aecb15;
            aecc16.a |= 2;
            return (aecc) o.i();
        }
        aecc.b = 14;
        aecc.a = 1 | i;
        return (aecc) o.i();
    }

    public static void a(List list, adyn adyn, String str, aecc aecc) {
        aecc aecc2;
        List list2 = list;
        adyn adyn2 = adyn;
        String str2 = str;
        aecc aecc3 = aecc;
        int a = aeca.a(aecc3.b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        Object obj = null;
        int i2 = 14;
        if (a != 14) {
            aecb aecb = aecc3.c;
            if (aecb == null) {
                aecb = aecb.p;
            }
            if (a == 1) {
                adyn2.a.put(str2, aecb.b.k());
                return;
            }
            if (a == 11) {
                adyn2.a.put(str2, (String[]) aecb.l.toArray(new String[0]));
            } else if (a == 12) {
                adyn2.a.put(str2, aook.a((Collection) aecb.m));
            } else if (a == 15) {
                adyn2.a.put(str2, aooe.a(aecb.n));
            } else if (a == 2) {
                adyn2.a(str2, aecb.c);
            } else if (a == 3) {
                adyn2.a(str2, aecb.d);
            } else if (a == 4) {
                adyn2.a(str2, aecb.e);
            } else if (a == 5) {
                adyn2.a(str2, aecb.f);
            } else if (a == 6) {
                adyn2.a(str2, aecb.g);
            } else if (a == 7) {
                adyn2.a.put(str2, Byte.valueOf((byte) aecb.h));
            } else if (a == 8) {
                adyn2.a(str2, aecb.i);
            } else if (a == 13) {
                adyn2.a.put(str2, (Asset) list2.get((int) aecb.o));
            } else {
                int i3 = 9;
                if (a == 9) {
                    adyn adyn3 = new adyn();
                    aucx aucx = aecb.j;
                    int size = aucx.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        aecd aecd = (aecd) aucx.get(i4);
                        String str3 = aecd.b;
                        aecc aecc4 = aecd.c;
                        if (aecc4 == null) {
                            aecc4 = aecc.d;
                        }
                        a(list2, adyn3, str3, aecc4);
                    }
                    adyn2.a(str2, adyn3);
                } else if (a == 10) {
                    aucx aucx2 = aecb.k;
                    int size2 = aucx2.size();
                    int i5 = 0;
                    int i6 = 14;
                    while (true) {
                        String str4 = "null";
                        if (i5 >= size2) {
                            ArrayList arrayList = new ArrayList(aecb.k.size());
                            aucx aucx3 = aecb.k;
                            int size3 = aucx3.size();
                            int i7 = 0;
                            while (i7 < size3) {
                                aecc aecc5 = (aecc) aucx3.get(i7);
                                int a2 = aeca.a(aecc5.b);
                                if (a2 != 0 && a2 == i2) {
                                    arrayList.add(obj);
                                } else if (i6 == i3) {
                                    adyn adyn4 = new adyn();
                                    aecb aecb2 = aecc5.c;
                                    if (aecb2 == null) {
                                        aecb2 = aecb.p;
                                    }
                                    aucx aucx4 = aecb2.j;
                                    int size4 = aucx4.size();
                                    for (int i8 = 0; i8 < size4; i8++) {
                                        aecd aecd2 = (aecd) aucx4.get(i8);
                                        String str5 = aecd2.b;
                                        aecc aecc6 = aecd2.c;
                                        if (aecc6 == null) {
                                            aecc6 = aecc.d;
                                        }
                                        a(list2, adyn4, str5, aecc6);
                                    }
                                    arrayList.add(adyn4);
                                } else if (i6 == 2) {
                                    aecb aecb3 = aecc5.c;
                                    if (aecb3 == null) {
                                        aecb3 = aecb.p;
                                    }
                                    arrayList.add(aecb3.c);
                                } else if (i6 != 6) {
                                    if (i6 != 0) {
                                        str4 = Integer.toString(i6);
                                    }
                                    String valueOf = String.valueOf(str4);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                                    sb.append("Unexpected typeOfArrayList: ");
                                    sb.append(valueOf);
                                    throw new IllegalArgumentException(sb.toString());
                                } else {
                                    aecb aecb4 = aecc5.c;
                                    if (aecb4 == null) {
                                        aecb4 = aecb.p;
                                    }
                                    arrayList.add(Integer.valueOf(aecb4.g));
                                }
                                i7++;
                                obj = null;
                                i2 = 14;
                                i3 = 9;
                            }
                            if (i6 == 14) {
                                adyn2.b(str2, arrayList);
                                return;
                            } else if (i6 == 9) {
                                adyn2.a(str2, arrayList);
                                return;
                            } else if (i6 == 2) {
                                adyn2.b(str2, arrayList);
                                return;
                            } else if (i6 != 6) {
                                if (i6 != 0) {
                                    str4 = Integer.toString(i6);
                                }
                                String valueOf2 = String.valueOf(str4);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                sb2.append("Unexpected typeOfArrayList: ");
                                sb2.append(valueOf2);
                                throw new IllegalStateException(sb2.toString());
                            } else {
                                adyn2.a.put(str2, arrayList);
                                return;
                            }
                        } else {
                            aecc2 = (aecc) aucx2.get(i5);
                            if (i6 != 14) {
                                int a3 = aeca.a(aecc2.b);
                                if (a3 == 0) {
                                    a3 = 1;
                                }
                                if (a3 != i6) {
                                    if (i6 != 0) {
                                        str4 = Integer.toString(i6);
                                    }
                                    String valueOf3 = String.valueOf(str4);
                                    int a4 = aeca.a(aecc2.b);
                                    if (a4 != 0) {
                                        i = a4;
                                    }
                                    String valueOf4 = String.valueOf(Integer.toString(i));
                                    int length = String.valueOf(str).length();
                                    StringBuilder sb3 = new StringBuilder(length + 104 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
                                    sb3.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                                    sb3.append(str2);
                                    sb3.append(" contains items of type ");
                                    sb3.append(valueOf3);
                                    sb3.append(" and ");
                                    sb3.append(valueOf4);
                                    throw new IllegalArgumentException(sb3.toString());
                                }
                            } else {
                                int a5 = aeca.a(aecc2.b);
                                if (a5 == 0 || a5 != 9) {
                                    int a6 = aeca.a(aecc2.b);
                                    if (a6 == 0 || a6 != 2) {
                                        int a7 = aeca.a(aecc2.b);
                                        if (a7 != 0) {
                                            if (a7 == 6) {
                                            }
                                        }
                                        int a8 = aeca.a(aecc2.b);
                                        if (a8 != 0 && a8 == 14) {
                                        }
                                    }
                                }
                                i6 = aeca.a(aecc2.b);
                                if (i6 == 0) {
                                    i6 = 1;
                                }
                            }
                            i5++;
                            obj = null;
                            i2 = 14;
                            i3 = 9;
                        }
                    }
                    int a9 = aeca.a(aecc2.b);
                    if (a9 != 0) {
                        i = a9;
                    }
                    String valueOf5 = String.valueOf(Integer.toString(i));
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 37 + String.valueOf(str).length());
                    sb4.append("Unexpected TypedValue type: ");
                    sb4.append(valueOf5);
                    sb4.append(" for key ");
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                } else {
                    String valueOf6 = String.valueOf(Integer.toString(a));
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 32);
                    sb5.append("populateBundle: unexpected type ");
                    sb5.append(valueOf6);
                    throw new RuntimeException(sb5.toString());
                }
            }
        } else {
            adyn2.a(str2, (String) null);
        }
    }
}
