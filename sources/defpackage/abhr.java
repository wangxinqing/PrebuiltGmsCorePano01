package defpackage;

import android.view.View;

/* renamed from: abhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abhr implements View.OnClickListener {
    private final abhw a;

    public abhr(abhw abhw) {
        this.a = abhw;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [abhv, abhj] */
    public void onClick(View view) {
        abhw abhw = this.a;
        abhw.k.a.m.a(jth.ACCEPT_MERGE_BUTTON, jth.SMART_PROFILE_MERGE_CARD);
        ? r8 = abhw.f;
        abib abib = r8;
        abib.h = 1;
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
        avix.b = 3;
        avix.a = 1 | avix.a;
        aucd o2 = avit.b.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avit avit = (avit) o2.b;
        aviv.getClass();
        if (!avit.a.a()) {
            avit.a = aucj.a(avit.a);
        }
        avit.a.add(aviv);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avix avix2 = (avix) o.b;
        avit avit2 = (avit) o2.i();
        avit2.getClass();
        avix2.c = avit2;
        avix2.a |= 4;
        abmk.a(5, abhm.a((avix) o.i()), new abhg(r8));
    }
}
