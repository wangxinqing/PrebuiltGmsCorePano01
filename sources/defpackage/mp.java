package defpackage;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: mp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mp {
    public static mq a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return mq.a(configuration.getLocales());
        }
        return mq.a(configuration.locale);
    }
}
