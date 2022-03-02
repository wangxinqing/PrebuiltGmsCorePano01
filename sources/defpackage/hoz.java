package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hoz implements hok {
    final byte[] a;
    final Integer b;
    final /* synthetic */ hph c;

    public hoz(hph hph, byte[] bArr, Integer num) {
        this.c = hph;
        this.a = bArr;
        this.b = num;
    }

    public final byte[] a() {
        return b().k();
    }

    public final avsi b() {
        ArrayList arrayList = new ArrayList(this.c.j.size());
        for (hot hot : this.c.j.values()) {
            if (hot.b.e(this.b.intValue()) >= 0) {
                arrayList.add(hot);
            }
        }
        aucd o = avsi.e.o();
        long j = this.c.i;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avsi avsi = (avsi) o.b;
        avsi.a |= 1;
        avsi.b = j;
        byte[] bArr = this.a;
        if (bArr.length != 0) {
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            avsi avsi2 = (avsi) o.b;
            a2.getClass();
            avsi2.a |= 4;
            avsi2.d = a2;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hot hot2 = (hot) arrayList.get(i);
            oh ohVar = (oh) hot2.b.a(this.b.intValue());
            aucd o2 = avsh.d.o();
            long a3 = hph.a(hot2.a);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avsh avsh = (avsh) o2.b;
            avsh.a = 1;
            avsh.b = Long.valueOf(a3);
            ohVar.b();
            ArrayList arrayList2 = new ArrayList(ohVar.b());
            for (int i2 = 0; i2 < ohVar.b(); i2++) {
                aucd o3 = avsg.d.o();
                long a4 = ohVar.a(i2);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                avsg avsg = (avsg) o3.b;
                avsg.a |= 1;
                avsg.b = a4;
                long j2 = ((long[]) ohVar.b(i2))[0];
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                avsg avsg2 = (avsg) o3.b;
                avsg2.a |= 2;
                avsg2.c = j2;
                arrayList2.add((avsg) o3.i());
            }
            Collections.sort(arrayList2, hoy.a);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avsh avsh2 = (avsh) o2.b;
            avsh2.c();
            auab.a((Iterable) arrayList2, (List) avsh2.c);
            avsh avsh3 = (avsh) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avsi avsi3 = (avsi) o.b;
            avsh3.getClass();
            avsi3.c();
            avsi3.c.add(avsh3);
        }
        return (avsi) o.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hoz) {
            return b().equals(((hoz) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return b().toString();
    }
}
