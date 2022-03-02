package defpackage;

import android.view.View;

/* renamed from: abhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abhs implements View.OnClickListener {
    private final abhw a;

    public abhs(abhw abhw) {
        this.a = abhw;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [abhv, abhk] */
    public void onClick(View view) {
        abhw abhw = this.a;
        abhw.k.a.m.a(jth.DISMISS_MERGE_BUTTON, jth.SMART_PROFILE_MERGE_CARD);
        ? r8 = abhw.f;
        abib abib = r8;
        abib.h = 2;
        abib.c.a();
        abhm abhm = abib.d;
        aviv aviv = abib.a.a;
        if (aviv == null) {
            aviv = aviv.a;
        }
        abmk abmk = abhm.a;
        aucd o = avix.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avix avix = (avix) o.b;
        avix.b = 4;
        avix.a = 1 | avix.a;
        aucd o2 = aviy.b.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aviy aviy = (aviy) o2.b;
        aviv.getClass();
        if (!aviy.a.a()) {
            aviy.a = aucj.a(aviy.a);
        }
        aviy.a.add(aviv);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avix avix2 = (avix) o.b;
        aviy aviy2 = (aviy) o2.i();
        aviy2.getClass();
        avix2.d = aviy2;
        avix2.a |= 8;
        abmk.a(6, abhm.a((avix) o.i()), new abhh(r8));
    }
}
