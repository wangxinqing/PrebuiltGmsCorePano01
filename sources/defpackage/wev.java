package defpackage;

import java.util.ArrayList;

/* renamed from: wev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wev implements Runnable {
    private final wgu a;
    private final vnw b;

    public wev(wgu wgu, vnw vnw) {
        this.a = wgu;
        this.b = vnw;
    }

    public final void run() {
        wgu wgu = this.a;
        vnb vnb = this.b.g;
        if (vnb == null) {
            vnb = vnb.b;
        }
        ArrayList arrayList = new ArrayList();
        aucx aucx = vnb.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            vnq vnq = (vnq) aucx.get(i);
            aucd o = vhn.i.o();
            auay auay = vnq.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            vhn vhn = (vhn) o.b;
            auay.getClass();
            int i2 = vhn.a | 2;
            vhn.a = i2;
            vhn.c = auay;
            auay auay2 = vnq.b;
            auay2.getClass();
            int i3 = i2 | 1;
            vhn.a = i3;
            vhn.b = auay2;
            long j = vnq.f;
            int i4 = i3 | 16;
            vhn.a = i4;
            vhn.f = j;
            long j2 = vnq.e;
            int i5 = i4 | 8;
            vhn.a = i5;
            vhn.e = j2;
            auay auay3 = vnq.d;
            auay3.getClass();
            int i6 = i5 | 4;
            vhn.a = i6;
            vhn.d = auay3;
            auay auay4 = vnq.g;
            auay4.getClass();
            int i7 = i6 | 32;
            vhn.a = i7;
            vhn.g = auay4;
            auay auay5 = vnq.h;
            auay5.getClass();
            vhn.a = i7 | 64;
            vhn.h = auay5;
            arrayList.add((vhn) o.i());
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            wgu.m.a((vhn) arrayList.get(i8));
        }
    }
}
