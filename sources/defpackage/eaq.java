package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: eaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eaq {
    public static void a(Intent intent, Intent intent2) {
        intent2.addFlags(intent.getFlags() & 2100293648);
    }

    public static boolean a(Context context, Intent intent) {
        return (intent == null || intent.resolveActivity(context.getPackageManager()) == null) ? false : true;
    }

    public static boolean a(Intent intent) {
        String dataString = intent.getDataString();
        return "android.intent.action.VIEW".equals(intent.getAction()) && !TextUtils.isEmpty(dataString) && dataString.startsWith("market://details") && intent.getBooleanExtra("overlay", false) && !TextUtils.isEmpty(intent.getStringExtra("callerId"));
    }

    public static boolean a(String str) {
        return str.startsWith("https://play.google.com/store/apps");
    }
}
