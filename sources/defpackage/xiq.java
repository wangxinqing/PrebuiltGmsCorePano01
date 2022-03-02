package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: xiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xiq {
    public static int a(Context context) {
        return context.getSharedPreferences("ppl_first_sdk", 0).getInt("com.google.android.gms.people.firstSdk", -1);
    }

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }
}
