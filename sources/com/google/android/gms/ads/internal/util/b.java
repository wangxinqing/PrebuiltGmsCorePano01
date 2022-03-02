package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.util.client.e;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b {
    public final Runnable a;
    public volatile Thread b;
    public final e c;
    public final String d;

    public b() {
        this.a = new a(this);
    }

    public b(Context context, String str, String str2) {
        String str3;
        h a2 = com.google.android.gms.ads.internal.b.a();
        synchronized (a2.b) {
            str3 = a2.c;
            if (str3 == null) {
                if (str != null) {
                    try {
                        a2.c = com.google.android.gms.ads.internal.b.a.b.a(context);
                    } catch (Exception e) {
                    }
                    if (TextUtils.isEmpty(a2.c)) {
                        c.d();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            a2.c = a2.a(context);
                        } else {
                            a2.c = null;
                            h.a.post(new f(a2, context));
                            while (a2.c == null) {
                                try {
                                    a2.b.wait();
                                } catch (InterruptedException e2) {
                                    a2.c = a2.a();
                                    String valueOf = String.valueOf(a2.c);
                                    com.google.android.gms.ads.internal.util.client.c.c(valueOf.length() == 0 ? new String("Interrupted, use default user agent: ") : "Interrupted, use default user agent: ".concat(valueOf));
                                }
                            }
                        }
                    }
                    String valueOf2 = String.valueOf(a2.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + str.length());
                    sb.append(valueOf2);
                    sb.append(" (Mobile; ");
                    sb.append(str);
                    a2.c = sb.toString();
                    try {
                        if (jni.b(context).a()) {
                            a2.c = String.valueOf(a2.c).concat(";aia");
                        }
                    } catch (Exception e3) {
                        com.google.android.gms.ads.internal.b.b();
                        com.google.android.gms.ads.internal.state.b.a(e3, "AdUtil.getUserAgent");
                    }
                    a2.c = String.valueOf(a2.c).concat(")");
                    str3 = a2.c;
                } else {
                    str3 = a2.a();
                }
            }
        }
        this.a = new a(this);
        this.c = new e(str3);
        this.d = str2;
    }
}
