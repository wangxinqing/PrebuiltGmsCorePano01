package defpackage;

import android.content.Context;
import android.os.WorkSource;

/* renamed from: bvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvq {
    public static bvp a(String str) {
        return new bvp(str, "com.google.android.gms", (WorkSource) null);
    }

    public static bvp a(String str, Context context, String str2) {
        return new bvp(str, str2, jlr.a(context, str2));
    }
}
