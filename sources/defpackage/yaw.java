package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yaw {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long parseLong = Long.parseLong(str, 16);
        StringBuilder sb = new StringBuilder(21);
        sb.append("c");
        sb.append(parseLong);
        return sb.toString();
    }

    public static List a(amgi amgi) {
        ArrayList arrayList = new ArrayList();
        amgn amgn = amgi.c;
        if (amgn == null) {
            amgn = amgn.f;
        }
        aucv aucv = amgn.c;
        int size = aucv.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Long.toHexString(((Long) aucv.get(i)).longValue()));
        }
        return arrayList;
    }
}
