package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aawf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aawf {
    private static final String a = aawf.class.getSimpleName();

    aawf() {
    }

    static SparseArray a(aavq aavq) {
        int i;
        aavq aavq2 = aavq;
        if (aavq2 == null || aavq2.b.size() == 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        aucx aucx = aavq2.b;
        int size = aucx.size();
        int i2 = 0;
        while (i2 < size) {
            aavp aavp = (aavp) aucx.get(i2);
            int i3 = aavp.a;
            aawe aawe = new aawe();
            int a2 = aavo.a(aavp.b);
            int i4 = 1;
            if (a2 != 0 && a2 == 3) {
                aawe.e = true;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            int i5 = 0;
            while (true) {
                if (i5 >= aavp.c.size()) {
                    i = i2;
                    break;
                }
                aavz aavz = (aavz) aavp.c.get(i5);
                aavi aavi = aavi.COMPRESSION_TYPE_UNSPECIFIED;
                aavi a3 = aavi.a(aavz.b);
                if (a3 == null) {
                    a3 = aavi.COMPRESSION_TYPE_UNSPECIFIED;
                }
                int ordinal = a3.ordinal();
                if (ordinal == 1) {
                    i = i2;
                    aavt aavt = aavz.c;
                    if (aavt == null) {
                        aavt = aavt.d;
                    }
                    if ((aavt.a & 2) != 0) {
                        aavt aavt2 = aavz.c;
                        if (aavt2 == null) {
                            aavt2 = aavt.d;
                        }
                        int i6 = aavt2.b;
                        aavt aavt3 = aavz.c;
                        if (aavt3 == null) {
                            aavt3 = aavt.d;
                        }
                        if (aavt3.c.a() % i6 == 0) {
                            int i7 = 0;
                            while (true) {
                                aavt aavt4 = aavz.c;
                                if (aavt4 == null) {
                                    aavt4 = aavt.d;
                                }
                                if (i7 >= aavt4.c.a()) {
                                    break;
                                }
                                try {
                                    aavt aavt5 = aavz.c;
                                    if (aavt5 == null) {
                                        aavt5 = aavt.d;
                                    }
                                    int i8 = i7 + i6;
                                    arrayList.add(new aaae(Arrays.copyOfRange(aavt5.c.k(), i7, i8)));
                                    i7 = i8;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    z = false;
                                }
                            }
                        } else {
                            Log.e(a, "Additions bytes not multiple of prefix");
                            z = false;
                        }
                    }
                } else if (ordinal != 2) {
                    Log.e(a, "Unrecognized compression type for additions");
                    i = i2;
                    z = false;
                } else if ((aavz.a & 8) != 0) {
                    aavv aavv = aavz.e;
                    if (aavv == null) {
                        aavv = aavv.e;
                    }
                    i = i2;
                    long j = aavv.a;
                    aavv aavv2 = aavz.e;
                    if (aavv2 == null) {
                        aavv2 = aavv.e;
                    }
                    int i9 = aavv2.b;
                    aavv aavv3 = aavz.e;
                    if (aavv3 == null) {
                        aavv3 = aavv.e;
                    }
                    int i10 = aavv3.c;
                    aavv aavv4 = aavz.e;
                    if (aavv4 == null) {
                        aavv4 = aavv.e;
                    }
                    List a4 = aawk.a(j, i9, i10, aavv4.d.k());
                    if (a4 != null) {
                        arrayList.addAll(a4);
                    } else {
                        z = false;
                    }
                } else {
                    i = i2;
                }
                if (!z) {
                    break;
                }
                i5++;
                i2 = i;
            }
            if (z) {
                PriorityQueue priorityQueue = new PriorityQueue();
                if (!aawe.e) {
                    int i11 = 0;
                    while (i11 < aavp.d.size()) {
                        aavz aavz2 = (aavz) aavp.d.get(i11);
                        aavi aavi2 = aavi.COMPRESSION_TYPE_UNSPECIFIED;
                        aavi a5 = aavi.a(aavz2.b);
                        if (a5 == null) {
                            a5 = aavi.COMPRESSION_TYPE_UNSPECIFIED;
                        }
                        int ordinal2 = a5.ordinal();
                        if (ordinal2 != i4) {
                            if (ordinal2 != 2) {
                                Log.e(a, "Unrecognized compression type for removals");
                                z = false;
                            } else if ((aavz2.a & 16) != 0) {
                                aavv aavv5 = aavz2.f;
                                if (aavv5 == null) {
                                    aavv5 = aavv.e;
                                }
                                long j2 = aavv5.a;
                                aavv aavv6 = aavz2.f;
                                if (aavv6 == null) {
                                    aavv6 = aavv.e;
                                }
                                int i12 = aavv6.b;
                                aavv aavv7 = aavz2.f;
                                if (aavv7 == null) {
                                    aavv7 = aavv.e;
                                }
                                int i13 = aavv7.c;
                                aavv aavv8 = aavz2.f;
                                if (aavv8 == null) {
                                    aavv8 = aavv.e;
                                }
                                List b = aawk.b(j2, i12, i13, aavv8.d.k());
                                if (b != null) {
                                    priorityQueue.addAll(b);
                                } else {
                                    z = false;
                                }
                            }
                        } else if ((aavz2.a & 4) != 0) {
                            aavu aavu = aavz2.d;
                            if (aavu == null) {
                                aavu = aavu.b;
                            }
                            priorityQueue.addAll(aavu.a);
                        }
                        i11++;
                        i4 = 1;
                    }
                    if (!z) {
                    }
                }
                aawe.a = arrayList;
                if (priorityQueue.isEmpty()) {
                    priorityQueue = null;
                }
                aawe.b = priorityQueue;
                aawe.d = aavp.e.k();
                aavf aavf = aavp.f;
                if (aavf == null) {
                    aavf = aavf.b;
                }
                aawe.c = aavf.a.k();
                sparseArray.put(i3, aawe);
            }
            i2 = i + 1;
        }
        return sparseArray;
    }

    static Map a(Set set, aavs aavs) {
        HashMap hashMap = new HashMap();
        aucx aucx = aavs.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aawd aawd = (aawd) aucx.get(i);
            if ((aawd.a & 8) != 0) {
                aavw aavw = aawd.c;
                if (aavw == null) {
                    aavw = aavw.c;
                }
                if (aavw.b.a() != 0) {
                    aavw aavw2 = aawd.c;
                    if (aavw2 == null) {
                        aavw2 = aavw.c;
                    }
                    aaae aaae = new aaae(aavw2.b.k());
                    if (hashMap.containsKey(aaae)) {
                        ((List) hashMap.get(aaae)).add(aawd);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aawd);
                        hashMap.put(aaae, arrayList);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            aaae aaae2 = (aaae) entry.getKey();
            aucd o = aavs.e.o();
            o.ag((List) entry.getValue());
            aavj aavj = aavs.c;
            if (aavj == null) {
                aavj = aavj.b;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aavs aavs2 = (aavs) o.b;
            aavj.getClass();
            aavs2.c = aavj;
            aavs2.a |= 1;
            aavj aavj2 = aavs.d;
            if (aavj2 == null) {
                aavj2 = aavj.b;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aavs aavs3 = (aavs) o.b;
            aavj2.getClass();
            aavs3.d = aavj2;
            aavs3.a |= 2;
            hashMap2.put(aaae2, (aavs) o.i());
        }
        if (!(set == null || (aavs.a & 2) == 0)) {
            aavj aavj3 = aavs.d;
            if (aavj3 == null) {
                aavj3 = aavj.b;
            }
            if (aavj3.a != 0) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    aaae aaae3 = (aaae) it.next();
                    if (!hashMap2.containsKey(aaae3)) {
                        aucd o2 = aavs.e.o();
                        aavj aavj4 = aavs.c;
                        if (aavj4 == null) {
                            aavj4 = aavj.b;
                        }
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aavs aavs4 = (aavs) o2.b;
                        aavj4.getClass();
                        aavs4.c = aavj4;
                        aavs4.a |= 1;
                        aavj aavj5 = aavs.d;
                        if (aavj5 == null) {
                            aavj5 = aavj.b;
                        }
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aavs aavs5 = (aavs) o2.b;
                        aavj5.getClass();
                        aavs5.d = aavj5;
                        aavs5.a |= 2;
                        hashMap2.put(aaae3, (aavs) o2.i());
                    }
                }
            }
        }
        return hashMap2;
    }

    static JSONObject a(List list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                jSONObject2.put("threat_type", Integer.toString(((Integer) it.next()).intValue()));
                jSONArray.put(i, jSONObject2);
                i++;
            }
            if (i > 0) {
                jSONObject.put("matches", jSONArray);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    static JSONObject a(Set set, List list, Set set2) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (set2 != null) {
            int size = list.size();
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                aawd aawd = (aawd) list.get(i2);
                if (set.contains(Integer.valueOf(aawd.b))) {
                    aavw aavw = aawd.c;
                    if (aavw == null) {
                        aavw = aavw.c;
                    }
                    if ((aavw.a & 1) != 0) {
                        aavw aavw2 = aawd.c;
                        if (aavw2 == null) {
                            aavw2 = aavw.c;
                        }
                        if (set2.contains(new aaae(aavw2.b.k()))) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("threat_type", Integer.toString(aawd.b));
                                if ((aawd.a & 16) != 0) {
                                    aavy aavy = aawd.d;
                                    if (aavy == null) {
                                        aavy = aavy.b;
                                    }
                                    aucx aucx = aavy.a;
                                    int size2 = aucx.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        aavx aavx = (aavx) aucx.get(i3);
                                        try {
                                            jSONObject2.put(aavx.a.l(), aavx.b.l());
                                        } catch (JSONException e) {
                                        }
                                    }
                                }
                                try {
                                    jSONArray.put(i, jSONObject2);
                                    i++;
                                } catch (JSONException e2) {
                                }
                                z = true;
                            } catch (JSONException e3) {
                                z = true;
                            }
                        }
                    }
                }
            }
            if (z) {
                try {
                    jSONObject.put("matches", jSONArray);
                } catch (JSONException e4) {
                }
            }
        }
        return jSONObject;
    }

    static boolean a(aavs aavs) {
        return aavs.b.size() > 0;
    }
}
