package com.google.android.gms.ads.internal.report;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.ads.internal.flag.g;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.c;
import com.google.android.gms.ads.internal.util.client.e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class d implements f {
    public static final Object a = new Object();
    public static f b = null;
    public static f c = null;
    public final Object d = new Object();
    public final WeakHashMap e = new WeakHashMap();
    private final Context f;
    private final ExecutorService g = qvj.b.a();
    private final VersionInfoParcel h;

    public d(Context context, VersionInfoParcel versionInfoParcel) {
        this.f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.h = versionInfoParcel;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (a.a(stackTraceElement.getClassName())) {
                        z = true;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        z2 = true;
                    }
                }
            }
            if (z && !z2) {
                a(th, "");
            }
        }
    }

    public final void a(Throwable th, String str) {
        boolean z;
        String str2;
        if (a.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            apev.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (Math.random() < 1.0d) {
                ArrayList arrayList = new ArrayList();
                try {
                    z = jni.b(this.f).a();
                } catch (Throwable th2) {
                    c.b("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f.getPackageName();
                } catch (Throwable th3) {
                    c.c("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.h.a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", n.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "306753009").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", com.google.android.gms.ads.internal.client.c.c()).appendQueryParameter("sampling_rate", Integer.toString(1)).appendQueryParameter("pb_tm", String.valueOf(g.a.a())).toString());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    this.g.execute(new a(new e((String) null), (String) arrayList.get(i)));
                }
            }
        }
    }
}
