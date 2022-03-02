package defpackage;

import android.os.Bundle;

/* renamed from: rcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcm {
    public static int a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("vehicle_personal_confidence", -1);
        }
        return -1;
    }

    public static Bundle a(Bundle bundle, String str) {
        iva.b(true);
        iva.b(str.equals("vehicle_personal_confidence"));
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt(str, 100);
        return bundle;
    }
}
