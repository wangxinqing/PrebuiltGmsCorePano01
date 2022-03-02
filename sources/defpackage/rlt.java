package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: rlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlt {
    private static final amsk a = amsk.a(",").a();

    public static Uri a(Context context, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder(30);
        sb.append("nanoAppUri");
        sb.append(j);
        String a2 = rlu.a(contentResolver, sb.toString(), 0, (String) null);
        if (a2 != null) {
            return Uri.parse(a2);
        }
        return null;
    }

    public static long b(Context context) {
        return rlu.a(context.getContentResolver(), "lowdLastDisplayedMillis", -9223372036854775807L);
    }

    public static long c(Context context) {
        return rlu.a(context.getContentResolver(), "lowdCurrentBackoffDurationMillis", 0);
    }

    public static Iterable d(Context context) {
        return aooj.a.a(a.a((CharSequence) rlu.a(context.getContentResolver(), "nanoAppIds", 0, "")));
    }

    public static void e(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            rlu.b(context.getContentResolver(), "nlpPromptConsent");
        }
    }

    public static void f(Context context) {
        rlu.c(context.getContentResolver(), "lowdCurrentBackoffDurationMillis");
    }

    public static void b(Context context, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder(30);
        sb.append("nanoAppUri");
        sb.append(j);
        contentResolver.call(rlu.a, "remove", sb.toString(), (Bundle) null);
    }

    public static void a(Context context, long j, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder(30);
        sb.append("nanoAppUri");
        sb.append(j);
        rlu.a(contentResolver, sb.toString(), uri.toString());
    }

    public static void a(Context context, Iterable iterable) {
        rlu.a(context.getContentResolver(), "nanoAppIds", TextUtils.join(",", iterable));
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return rlu.a(context.getContentResolver(), "nlpPromptConsent");
        }
        return true;
    }
}
