package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: akkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkd implements akle {
    final /* synthetic */ akke a;
    private final akln b;
    private final Collection c;
    private final int d;
    private final int e;

    public akkd(akke akke, akln akln, Collection collection, int i, int i2) {
        this.a = akke;
        this.b = akln;
        this.c = collection;
        this.d = i;
        this.e = i2;
    }

    public final void a(Collection collection, Collection collection2) {
        akka akka = this.a.j;
        if (akka != null) {
            akln akln = this.b;
            if (akka.a != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    astz astz = (astz) it.next();
                    akkk a2 = akkk.a(astz);
                    if (a2 != null) {
                        arrayList.add(a2);
                    } else {
                        akof a3 = aklz.a();
                        String valueOf = String.valueOf(astz);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Unable to create candidate from proto: ");
                        sb.append(valueOf);
                        a3.b(sb.toString());
                    }
                }
                if (akuo.a()) {
                    arrayList.addAll(akkj.a((List) arrayList));
                }
                akjy akjy = (akjy) akka.a;
                if (akjy.d) {
                    akjy.e.a(akln, arrayList);
                    for (akje a4 : akjy.c.values()) {
                        a4.a(akln, arrayList);
                    }
                }
            } else {
                aklz.a();
            }
            akke.a(this.a);
            akma akma = this.a.c;
            int size = collection.size();
            int size2 = this.c.size();
            int i = this.d;
            int size3 = collection2.size();
            int i2 = this.e;
            aucd o = aobb.h.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aobb aobb = (aobb) o.b;
            int i3 = aobb.a | 1;
            aobb.a = i3;
            aobb.b = size;
            int i4 = i3 | 2;
            aobb.a = i4;
            aobb.c = size2;
            int i5 = i4 | 4;
            aobb.a = i5;
            aobb.d = i;
            int i6 = i5 | 8;
            aobb.a = i6;
            aobb.e = size3;
            int i7 = i6 | 16;
            aobb.a = i7;
            aobb.f = false;
            aobb.g = i2 - 1;
            aobb.a = i7 | 32;
            akun akun = (akun) akma;
            akun.a(akun.a((aobb) o.i()));
            return;
        }
        aklz.a().b("Candidate selection completed while InferenceDataManager stopped - ignoring");
    }
}
