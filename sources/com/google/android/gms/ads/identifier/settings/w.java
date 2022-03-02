package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class w implements Closeable {
    final long a = ampt.a.a();
    final String b;
    final Context c;
    String d;

    public w(String str, Context context, String str2) {
        this.b = str;
        this.c = context;
        this.d = str2;
    }

    public final void close() {
        f.a(this.c, this.b, this.d, ampt.a.a() - this.a);
    }
}
