package defpackage;

import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ezv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezv implements ax {
    private final ezz a;

    public ezv(ezz ezz) {
        this.a = ezz;
    }

    public final void a(Object obj) {
        ezz ezz = this.a;
        List list = (List) obj;
        fbw fbw = ezz.d;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (ezz.c == null) {
            arrayList.add(0, pzh.a(ezz.getString(R.string.credentials_authorization_account_header_subtitle, ezz.e)));
        }
        if (jgu.g(ezz.getContext())) {
            arrayList.add(pzh.a());
        }
        fbw.a((List) arrayList);
    }
}
