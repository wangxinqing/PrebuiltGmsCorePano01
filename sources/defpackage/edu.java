package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: edu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edu {
    public static void a(Context context) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.action.RESUME_HOTWORD");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", context.getPackageName());
        context.sendBroadcast(intent);
    }
}
