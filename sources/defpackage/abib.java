package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abib implements abhj, abhk, abhl, abhv, abir {
    public final avjd a;
    public boolean b;
    public final abhw c;
    public final abhm d;
    public final List e = new ArrayList();
    public final abhq f;
    public akax g;
    public int h;
    private auay i;

    public abib(abhw abhw, avjd avjd, abhm abhm, abhq abhq) {
        this.c = abhw;
        abhw.f = this;
        this.a = avjd;
        this.d = abhm;
        this.f = abhq;
    }

    public final void a() {
        this.c.b.setVisibility(0);
        this.c.j.setVisibility(4);
        this.c.a();
        akax akax = this.g;
        if (akax != null) {
            akax.d();
        }
        this.g = null;
        abhm abhm = this.d;
        auay auay = this.i;
        abmk abmk = abhm.a;
        aucd o = avix.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avix avix = (avix) o.b;
        avix.b = 5;
        avix.a |= 1;
        aucd o2 = avje.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avje avje = (avje) o2.b;
        auay.getClass();
        avje.a |= 1;
        avje.b = auay;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avix avix2 = (avix) o.b;
        avje avje2 = (avje) o2.i();
        avje2.getClass();
        avix2.e = avje2;
        avix2.a |= 16;
        abmk.a(7, abhm.a((avix) o.i()), new abhi(this));
    }

    public final void a(Bundle bundle) {
        bundle.putBoolean("mergeCardHasDismissed", this.b);
    }

    public final void a(auay auay) {
        if (!auay.j()) {
            this.i = auay;
        }
    }
}
