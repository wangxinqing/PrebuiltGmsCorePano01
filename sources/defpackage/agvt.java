package defpackage;

import android.util.Base64;
import android.util.Log;

/* renamed from: agvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agvt extends agvx {
    public agvt(agvw agvw, String str, byte[] bArr) {
        super(agvw, str, bArr);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return Base64.decode((String) obj, 3);
            } catch (IllegalArgumentException e) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid byte[] value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
