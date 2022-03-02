package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: ofp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofp {
    public final Context a;

    public ofp(Context context) {
        this.a = context;
    }

    private static final Long a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length > 0) {
            return Long.valueOf(str.substring(0, length));
        }
        return null;
    }

    public static void a(aoru aoru, Context context) {
        aoru.execute(new ofo(new ofp(context)));
    }

    public static final void a(File[] fileArr, long j) {
        Long l;
        for (File file : fileArr) {
            String name = file.getName();
            if (name.endsWith("_gH_async_help_psd")) {
                l = a(name, "_gH_async_help_psd");
            } else if (name.endsWith("_gH_async_feedback_psd")) {
                l = a(name, "_gH_async_feedback_psd");
            } else if (name.endsWith("_gH_async_feedback_psbd")) {
                l = a(name, "_gH_async_feedback_psbd");
            } else {
                l = name.endsWith("_gH_async_feedback_psbd_metrics") ? a(name, "_gH_async_feedback_psbd_metrics") : null;
            }
            if (l == null || j - l.longValue() > axmj.a.a().c() * 1000000) {
                file.delete();
            }
        }
    }
}
