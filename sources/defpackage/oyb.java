package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.Thing;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: oyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyb {
    private static oyb c;
    private static oyb d;
    private static oyb e;
    private static ovp f;
    final ovp a;
    public final anax b;
    private final anaf g;

    private oyb(ovp ovp) {
        HashMap hashMap = new HashMap();
        aucx aucx = ovp.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            ovo ovo = (ovo) aucx.get(i);
            hashMap.put(ovo.b, ovo);
        }
        this.a = ovp;
        this.g = anaf.a((Map) hashMap);
        this.b = anax.a((Collection) ovp.b);
    }

    public static List a(Thing thing, String str) {
        int indexOf = str.indexOf(95);
        int i = 0;
        if (indexOf == -1) {
            String[] b2 = thing.b(str);
            if (b2 != null) {
                return Arrays.asList(b2);
            }
            long[] c2 = thing.c(str);
            if (c2 != null) {
                String[] strArr = new String[c2.length];
                while (i < c2.length) {
                    strArr[i] = Long.toString(c2[i]);
                    i++;
                }
                return Arrays.asList(strArr);
            }
            double[] d2 = thing.d(str);
            if (d2 != null) {
                String[] strArr2 = new String[d2.length];
                while (i < d2.length) {
                    strArr2[i] = Double.toString(d2[i]);
                    i++;
                }
                return Arrays.asList(strArr2);
            }
        } else {
            Thing[] a2 = thing.a(str.substring(0, indexOf));
            if (a2 != null) {
                ArrayList arrayList = new ArrayList();
                int length = a2.length;
                while (i < length) {
                    arrayList.addAll(a(a2[i], str.substring(indexOf + 1)));
                    i++;
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public static synchronized oyb b() {
        synchronized (oyb.class) {
            if (!axsm.b()) {
                oyb a2 = a();
                return a2;
            }
            oya c2 = c();
            ovp b2 = axrc.b();
            if (b2 != null) {
                c2.a(b2);
            }
            oyb oyb = new oyb(c2.a());
            e = oyb;
            return oyb;
        }
    }

    static oya c() {
        oya oya = new oya();
        oya.a(((Integer) ozx.cc.c()).intValue(), ((Integer) ozx.cd.c()).intValue(), Integer.parseInt((String) ozx.ce.c()), axsj.a.a().f());
        if (axsj.a.a().k()) {
            aucd o = ovo.f.o();
            int seconds = (int) TimeUnit.DAYS.toSeconds(30);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ovo ovo = (ovo) o.b;
            int i = ovo.a | 2;
            ovo.a = i;
            ovo.c = seconds;
            "StashRecord".getClass();
            int i2 = i | 1;
            ovo.a = i2;
            ovo.b = "StashRecord";
            ovo.a = i2 | 4;
            ovo.e = 1;
            aucd o2 = ovn.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ovn ovn = (ovn) o2.b;
            "name".getClass();
            int i3 = ovn.a | 1;
            ovn.a = i3;
            ovn.b = "name";
            ovn.c = 2;
            ovn.a = i3 | 2;
            o.n(o2);
            aucd o3 = ovn.h.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ovn ovn2 = (ovn) o3.b;
            "keywords".getClass();
            ovn2.a |= 1;
            ovn2.b = "keywords";
            o.n(o3);
            aucd o4 = ovn.h.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ovn ovn3 = (ovn) o4.b;
            "userId".getClass();
            int i4 = ovn3.a | 1;
            ovn3.a = i4;
            ovn3.b = "userId";
            ovn3.c = 1;
            ovn3.a = i4 | 2;
            o.n(o4);
            aucd o5 = ovn.h.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            ovn ovn4 = (ovn) o5.b;
            "userPayload".getClass();
            int i5 = ovn4.a | 1;
            ovn4.a = i5;
            ovn4.b = "userPayload";
            ovn4.c = 0;
            int i6 = i5 | 2;
            ovn4.a = i6;
            ovn4.a = i6 | 8;
            ovn4.e = 5;
            o.n(o5);
            aucd o6 = ovn.h.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            ovn ovn5 = (ovn) o6.b;
            "title".getClass();
            int i7 = ovn5.a | 1;
            ovn5.a = i7;
            ovn5.b = "title";
            ovn5.c = 0;
            int i8 = i7 | 2;
            ovn5.a = i8;
            ovn5.a = i8 | 8;
            ovn5.e = 4;
            o.n(o6);
            aucd o7 = ovn.h.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            ovn ovn6 = (ovn) o7.b;
            "content".getClass();
            int i9 = ovn6.a | 1;
            ovn6.a = i9;
            ovn6.b = "content";
            ovn6.c = 0;
            int i10 = i9 | 2;
            ovn6.a = i10;
            ovn6.a = i10 | 8;
            ovn6.e = 2;
            o.n(o7);
            aucd o8 = ovn.h.o();
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            ovn ovn7 = (ovn) o8.b;
            "lowPriorityContent".getClass();
            int i11 = ovn7.a | 1;
            ovn7.a = i11;
            ovn7.b = "lowPriorityContent";
            ovn7.c = 0;
            int i12 = i11 | 2;
            ovn7.a = i12;
            ovn7.a = i12 | 8;
            ovn7.e = 1;
            o.n(o8);
            aucd o9 = ovn.h.o();
            if (o9.c) {
                o9.c();
                o9.c = false;
            }
            ovn ovn8 = (ovn) o9.b;
            "salientTerms".getClass();
            int i13 = 1 | ovn8.a;
            ovn8.a = i13;
            ovn8.b = "salientTerms";
            ovn8.c = 0;
            int i14 = i13 | 2;
            ovn8.a = i14;
            ovn8.a = i14 | 8;
            ovn8.e = 3;
            o.n(o9);
            oya.a.a((ovo) o.i());
        }
        return oya;
    }

    public final ovo b(String str) {
        return a(str, true);
    }

    public static synchronized oyb a() {
        oyb oyb;
        synchronized (oyb.class) {
            ovp b2 = axrc.b();
            if (c == null || (pba.o() && !ius.a(f, b2))) {
                f = b2;
                oya c2 = c();
                if (b2 != null) {
                    c2.a(b2);
                }
                c = new oyb(c2.a());
            }
            oyb = c;
        }
        return oyb;
    }

    public static synchronized oyb a(Context context) {
        synchronized (oyb.class) {
            if (axsm.b()) {
                if (d == null) {
                    try {
                        d = new oyb((ovp) aucj.a((aucj) ovp.c, (InputStream) context.openFileInput("icing-predefined-type-configs")));
                    } catch (IOException e2) {
                        d = new oyb(c().a());
                    }
                }
                oyb oyb = d;
                return oyb;
            }
            oyb a2 = a();
            return a2;
        }
    }

    public static synchronized void a(Context context, oyb oyb, oyq oyq) {
        synchronized (oyb.class) {
            if (axsm.b() && !ius.a(d, oyb)) {
                try {
                    FileOutputStream openFileOutput = context.openFileOutput("icing-predefined-type-configs", 0);
                    oyb.a.a(openFileOutput);
                    openFileOutput.close();
                    d = oyb;
                } catch (IOException e2) {
                    oso.b("Cannot deploy PredefinedTypeIndexingConfig to disk");
                    oyq.b(6014);
                }
            }
        }
    }

    public final ovo a(String str, boolean z) {
        ovo ovo = (ovo) this.g.get(str);
        if (ovo != null) {
            return ovo;
        }
        if (z) {
            oso.c("Unsupported config type, fallback to Thing: %s", (Object) str);
        }
        return (ovo) this.g.get("Thing");
    }

    public final boolean a(String str) {
        return this.g.containsKey(str);
    }
}
