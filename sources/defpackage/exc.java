package defpackage;

import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: exc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exc implements ax {
    private final exj a;

    public exc(exj exj) {
        this.a = exj;
    }

    public final void a(Object obj) {
        exj exj = this.a;
        List list = (List) obj;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (exj.g == null) {
            arrayList.add(0, pzh.a(exj.getString(R.string.credentials_assisted_choose_account_subtitle, exj.c.e)));
        }
        if (jgu.g(exj.getContext())) {
            arrayList.add(pzh.a());
        }
        exj.e.a((List) arrayList);
    }
}
