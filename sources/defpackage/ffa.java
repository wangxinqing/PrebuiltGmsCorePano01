package defpackage;

import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ffa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ffa implements ax {
    private final ffe a;

    public ffa(ffe ffe) {
        this.a = ffe;
    }

    public final void a(Object obj) {
        ffe ffe = this.a;
        List list = (List) obj;
        fbw fbw = ffe.d;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (ffe.c == null) {
            arrayList.add(0, pzh.a(ffe.getString(R.string.credentials_saving_account_linking_token_account_header_title)));
        }
        if (jgu.g(ffe.getContext())) {
            arrayList.add(pzh.a());
        }
        fbw.a((List) arrayList);
    }
}
