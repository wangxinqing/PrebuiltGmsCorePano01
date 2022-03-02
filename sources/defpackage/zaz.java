package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: zaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zaz extends zax {
    private final String a;

    public zaz(String str) {
        this.a = str;
    }

    public final void a(Context context, yrr yrr) {
        String a2 = jgu.a(context, this.a);
        if (!TextUtils.isEmpty(a2)) {
            zaj.a(context.getContentResolver(), a2, this.a);
        }
        jgu.c(context, this.a);
    }
}
