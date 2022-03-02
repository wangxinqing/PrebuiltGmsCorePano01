package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: ykr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykr {
    public static void a(Activity activity, PlusCommonExtras plusCommonExtras, String str) {
        Intent intent = activity.getIntent();
        if (TextUtils.isEmpty(plusCommonExtras.c)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
            if (TextUtils.isEmpty(stringExtra)) {
                String a = jhg.a(activity);
                if (!TextUtils.isEmpty(a)) {
                    plusCommonExtras.c = a;
                }
            } else {
                plusCommonExtras.c = stringExtra;
            }
        }
        if (TextUtils.isEmpty(plusCommonExtras.b)) {
            String stringExtra2 = intent.getStringExtra("com.google.android.gms.plus.intent.extra.GPSRC");
            if (!TextUtils.isEmpty(stringExtra2)) {
                plusCommonExtras.b = stringExtra2;
            } else {
                plusCommonExtras.b = str;
            }
        }
    }
}
