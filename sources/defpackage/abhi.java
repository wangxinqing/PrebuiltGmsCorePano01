package defpackage;

import com.google.android.gms.R;
import java.util.List;

/* renamed from: abhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abhi implements abmj {
    final /* synthetic */ abhl a;

    public abhi(abhl abhl) {
        this.a = abhl;
    }

    public final void a(List list) {
        avis a2 = abhm.a(list);
        if (a2 == null || (a2.a & 32) == 0) {
            abib abib = (abib) this.a;
            abib.g = abib.f.a(R.string.profile_merge_undo_action_failed, R.string.common_retry, new abhz(abib));
            abib.g.c();
            return;
        }
        abhl abhl = this.a;
        avjf avjf = a2.e;
        if (avjf == null) {
            avjf = avjf.b;
        }
        abib abib2 = (abib) abhl;
        int i = 0;
        abib2.b = false;
        abib2.a(avjf.a);
        abib2.c.j.setVisibility(0);
        abib2.c.b();
        int i2 = abib2.h;
        if (i2 == 3) {
            List list2 = abib2.e;
            int size = list2.size();
            while (i < size) {
                ((abia) list2.get(i)).d();
                i++;
            }
        } else if (i2 == 4) {
            List list3 = abib2.e;
            int size2 = list3.size();
            while (i < size2) {
                ((abia) list3.get(i)).f();
                i++;
            }
        }
    }
}
