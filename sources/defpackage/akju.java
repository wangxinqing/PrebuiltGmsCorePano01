package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: akju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akju implements akjo {
    public static final Comparator a = new akjp();
    public final akuo b;
    private akjt c = new akjs(this);
    private boolean d;

    public akju(akuo akuo) {
        this.b = akuo;
        this.d = false;
    }

    public static ou a(List list) {
        ou ouVar = new ou();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            akhx akhx = (akhx) list.get(i);
            if (!ouVar.containsKey(Integer.valueOf(akhx.h))) {
                ouVar.put(Integer.valueOf(akhx.h), Float.valueOf(akhx.f));
            }
        }
        return ouVar;
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() != 0) {
            ob obVar = new ob();
            obVar.add(((akhx) list.get(0)).b);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                akhx akhx = (akhx) it.next();
                if (obVar.contains(akhx.b)) {
                    obVar.clear();
                    obVar.addAll(akhx.g);
                    arrayList.add(akhx);
                }
            }
        }
        return arrayList;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final boolean a() {
        return this.c.c;
    }

    public final akhy b() {
        return this.c.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final void a(akhy akhy) {
        this.c = this.c.a(akhy);
    }
}
