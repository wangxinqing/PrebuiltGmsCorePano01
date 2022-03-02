package defpackage;

import android.view.View;
import com.google.android.gms.family.model.MemberDataModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mnb implements View.OnClickListener {
    private final mng a;

    public mnb(mng mng) {
        this.a = mng;
    }

    public void onClick(View view) {
        mob mob = (mob) this.a.a;
        mob.c.b().a(32);
        ArrayList arrayList = new ArrayList();
        List list = mob.h.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MemberDataModel memberDataModel = (MemberDataModel) list.get(i);
            if (memberDataModel.h) {
                arrayList.add(memberDataModel);
            } else if (memberDataModel.g == 1) {
                arrayList.add(memberDataModel);
            }
        }
        mob.c.a(arrayList, mob.i.a.a(29));
    }
}
