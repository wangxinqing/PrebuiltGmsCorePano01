package defpackage;

import com.google.android.gms.R;
import java.util.List;

/* renamed from: abhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abhh implements abmj {
    final /* synthetic */ abhk a;

    public abhh(abhk abhk) {
        this.a = abhk;
    }

    public final void a(List list) {
        avis a2 = abhm.a(list);
        if (a2 == null || (a2.a & 16) == 0) {
            abib abib = (abib) this.a;
            abib.c.b();
            abib.g = abib.f.a();
            abib.g.c();
            return;
        }
        abhk abhk = this.a;
        aviz aviz = a2.d;
        if (aviz == null) {
            aviz = aviz.b;
        }
        abib abib2 = (abib) abhk;
        abib2.b = true;
        abib2.c.b();
        abib2.a(aviz.a);
        List list2 = abib2.e;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((abia) list2.get(i)).e();
        }
        abib2.g = abib2.f.a(R.string.profile_merge_dismissed_succeed, R.string.profile_merge_undo, new abhy(abib2));
        abib2.g.c();
    }
}
