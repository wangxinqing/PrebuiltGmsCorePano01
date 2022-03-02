package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: ths  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ths {
    public static String a() {
        String g = jhg.g();
        return (TextUtils.isEmpty(g) || "unknown".equals(g)) ? UUID.randomUUID().toString() : g;
    }
}
