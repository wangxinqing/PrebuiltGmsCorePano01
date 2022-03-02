package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: cln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cln {
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    public final ArrayList c = new ArrayList();
    public String d;
    private long e;

    public cln() {
        a();
    }

    public final void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = null;
        this.e = cbi.i().a();
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final jyk c() {
        aucd o = jyk.g.o();
        long j = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        jyk jyk = (jyk) o.b;
        jyk.a |= 1;
        jyk.b = j;
        long a2 = cbi.i().a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        jyk jyk2 = (jyk) o.b;
        jyk2.a |= 2;
        jyk2.c = a2;
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            clm clm = (clm) this.a.get(str);
            aucd o2 = jyj.l.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj = (jyj) o2.b;
            str.getClass();
            jyj.a |= 1;
            jyj.b = str;
            for (int i2 = 0; i2 < 16; i2++) {
                int i3 = clm.b[i2];
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                jyj jyj2 = (jyj) o2.b;
                if (!jyj2.c.a()) {
                    jyj2.c = aucj.a(jyj2.c);
                }
                jyj2.c.d(i3);
            }
            long a3 = clm.a(0);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj3 = (jyj) o2.b;
            jyj3.a |= 2;
            jyj3.d = a3;
            long b2 = clm.b(0);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj4 = (jyj) o2.b;
            jyj4.a |= 4;
            jyj4.e = b2;
            long c2 = clm.c(0);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj5 = (jyj) o2.b;
            jyj5.a |= 8;
            jyj5.f = c2;
            long d2 = clm.d(0);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj6 = (jyj) o2.b;
            jyj6.a = 16 | jyj6.a;
            jyj6.g = d2;
            long a4 = clm.a(1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj7 = (jyj) o2.b;
            jyj7.a |= 32;
            jyj7.h = a4;
            long b3 = clm.b(1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj8 = (jyj) o2.b;
            jyj8.a |= 64;
            jyj8.i = b3;
            long c3 = clm.c(1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj9 = (jyj) o2.b;
            jyj9.a |= 128;
            jyj9.j = c3;
            long d3 = clm.d(1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jyj jyj10 = (jyj) o2.b;
            jyj10.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            jyj10.k = d3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyk jyk3 = (jyk) o.b;
            jyj jyj11 = (jyj) o2.i();
            jyj11.getClass();
            if (!jyk3.d.a()) {
                jyk3.d = aucj.a(jyk3.d);
            }
            jyk3.d.add(jyj11);
        }
        if (this.b.size() > 0) {
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                cll cll = (cll) this.b.valueAt(i4);
                ArrayList arrayList2 = new ArrayList(cll.b.keySet());
                Collections.sort(arrayList2);
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = (String) arrayList2.get(i5);
                    aucd o3 = jyi.h.o();
                    atjv atjv = cll.a;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    jyi jyi = (jyi) o3.b;
                    jyi.b = atjv.bA;
                    jyi.a |= 1;
                    String a5 = bsx.a(str2);
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    jyi jyi2 = (jyi) o3.b;
                    a5.getClass();
                    jyi2.a |= 32;
                    jyi2.g = a5;
                    clk clk = (clk) cll.b.get(str2);
                    int i6 = clk != null ? clk.a : 0;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    jyi jyi3 = (jyi) o3.b;
                    jyi3.a |= 2;
                    jyi3.c = i6;
                    clk clk2 = (clk) cll.b.get(str2);
                    int i7 = clk2 != null ? clk2.b : 0;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    jyi jyi4 = (jyi) o3.b;
                    jyi4.a |= 4;
                    jyi4.d = i7;
                    clk clk3 = (clk) cll.b.get(str2);
                    int i8 = clk3 != null ? clk3.c : 0;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    jyi jyi5 = (jyi) o3.b;
                    jyi5.a |= 8;
                    jyi5.e = i8;
                    clk clk4 = (clk) cll.b.get(str2);
                    int i9 = clk4 != null ? clk4.d : 0;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    jyi jyi6 = (jyi) o3.b;
                    jyi6.a |= 16;
                    jyi6.f = i9;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    jyk jyk4 = (jyk) o.b;
                    jyi jyi7 = (jyi) o3.i();
                    jyi7.getClass();
                    if (!jyk4.e.a()) {
                        jyk4.e = aucj.a(jyk4.e);
                    }
                    jyk4.e.add(jyi7);
                }
            }
        }
        if (!this.c.isEmpty()) {
            ArrayList arrayList3 = this.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyk jyk5 = (jyk) o.b;
            if (!jyk5.f.a()) {
                jyk5.f = aucj.a(jyk5.f);
            }
            auab.a((Iterable) arrayList3, (List) jyk5.f);
        }
        return (jyk) o.i();
    }

    public final void a(bvp bvp) {
        String str = bvp.a;
        clm clm = (clm) this.a.get(str);
        if (clm == null) {
            clm = new clm(str);
            this.a.put(str, clm);
        }
        if (TextUtils.equals(bvp.a, clm.a)) {
            int[] iArr = clm.b;
            int i = bvp.f;
            iArr[i] = iArr[i] + 1;
            if (i == 0) {
                clm.a(bvp.d(), 0);
                clm.a(bvp.e(), 1);
                return;
            }
            return;
        }
        ((anih) ((anih) bxk.a.b()).a("cln", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WorkInfoSummary] Could not add work info: %s", (Object) bvp);
    }
}
