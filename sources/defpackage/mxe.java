package defpackage;

import android.text.TextUtils;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* renamed from: mxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mxe implements acvz {
    static final acvz a = new mxe();

    private mxe() {
    }

    public final acwa a(Object obj) {
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = experimentTokens.c;
        if (bArr != null) {
            String a2 = mxf.a(bArr);
            if (!TextUtils.isEmpty(a2)) {
                arrayList.add(a2);
            }
        }
        byte[][] bArr2 = experimentTokens.i;
        if (bArr2 != null) {
            for (byte[] a3 : bArr2) {
                String a4 = mxf.a(a3);
                if (!TextUtils.isEmpty(a4)) {
                    arrayList.add(a4);
                }
            }
        }
        return acws.a((Object) arrayList);
    }
}
