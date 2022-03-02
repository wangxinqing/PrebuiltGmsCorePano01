package defpackage;

import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abhg implements abmj {
    final /* synthetic */ abhj a;

    public abhg(abhj abhj) {
        this.a = abhj;
    }

    public final void a(List list) {
        int i;
        int i2;
        avis a2 = abhm.a(list);
        if (a2 == null || (a2.a & 8) == 0) {
            abib abib = (abib) this.a;
            abib.c.b();
            abib.g = abib.f.a();
            abib.g.c();
            return;
        }
        abhj abhj = this.a;
        aviu aviu = a2.c;
        if (aviu == null) {
            aviu = aviu.b;
        }
        abib abib2 = (abib) abhj;
        abib2.b = true;
        abib2.c.b();
        abib2.a(aviu.a);
        List list2 = abib2.e;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            abia abia = (abia) list2.get(i3);
            ArrayList arrayList = new ArrayList();
            aucx aucx = abib2.a.b;
            int size2 = aucx.size();
            int i4 = 0;
            while (i4 < size2) {
                aucx aucx2 = ((avja) aucx.get(i4)).d;
                int size3 = aucx2.size();
                int i5 = 0;
                while (true) {
                    i2 = i4 + 1;
                    if (i5 >= size3) {
                        break;
                    }
                    arrayList.add(((avjb) aucx2.get(i5)).a);
                    i5++;
                }
                i4 = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            aucx aucx3 = abib2.a.b;
            int size4 = aucx3.size();
            int i6 = 0;
            while (i6 < size4) {
                aucx aucx4 = ((avja) aucx3.get(i6)).c;
                int size5 = aucx4.size();
                int i7 = 0;
                while (true) {
                    i = i6 + 1;
                    if (i7 >= size5) {
                        break;
                    }
                    arrayList2.add(((avjb) aucx4.get(i7)).a);
                    i7++;
                }
                i6 = i;
            }
            abia.a(arrayList, arrayList2);
        }
        abib2.g = abib2.f.a(R.string.profile_merge_merged_succeed, R.string.profile_merge_undo, new abhx(abib2));
        abib2.g.c();
    }
}
