package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: mge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mge {
    public static String a(String str, int i) {
        StringBuilder sb = new StringBuilder(12);
        sb.append("s");
        sb.append(i);
        return iqk.a(TextUtils.join("-", Arrays.asList(new String[]{sb.toString(), "cc", "mo", "rp"})), str).toString();
    }
}
