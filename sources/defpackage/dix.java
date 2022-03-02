package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: dix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dix {
    public static anaf a(Intent intent) {
        anab h = anaf.h();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("extra.screen.")) {
                    String substring = str.substring(13);
                    if (extras.getString(str) != null) {
                        h.a(substring, extras.getString(str));
                    }
                }
            }
        }
        return h.a();
    }

    public static boolean b(Intent intent) {
        return intent.getBooleanExtra("extra.ignoreAccount", false);
    }
}
