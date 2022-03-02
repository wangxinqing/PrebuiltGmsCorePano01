package defpackage;

import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abpb implements acvf {
    static final acvf a = new abpb();

    private abpb() {
    }

    public final Object a(acwa acwa) {
        EsimActivationPayload esimActivationPayload;
        int i = abpg.b;
        List<acwa> list = (List) acwa.d();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (acwa acwa2 : list) {
                if (acwa2.b() && (esimActivationPayload = (EsimActivationPayload) acwa2.d()) != null) {
                    arrayList.add(esimActivationPayload);
                }
            }
        }
        return arrayList;
    }
}
