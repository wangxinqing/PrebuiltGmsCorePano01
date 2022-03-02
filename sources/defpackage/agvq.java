package defpackage;

import android.util.Log;

/* renamed from: agvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agvq extends agvx {
    public agvq(agvw agvw, String str, Boolean bool) {
        super(agvw, str, bool);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (aeeg.c.matcher(str).matches()) {
                return true;
            }
            if (aeeg.d.matcher(str).matches()) {
                return false;
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
