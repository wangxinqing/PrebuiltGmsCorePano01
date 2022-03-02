package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: agvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agvu extends agvx {
    final /* synthetic */ agvv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agvu(agvw agvw, String str, Object obj, agvv agvv) {
        super(agvw, str, obj);
        this.a = agvv;
    }

    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException e) {
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
