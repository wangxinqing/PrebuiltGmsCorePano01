package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import org.chromium.net.CronetEngine;

/* renamed from: izd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class izd extends iyo {
    public volatile baaf a;
    public boolean b;
    public final izf c;
    public String d;
    private volatile azzs e;
    private String f;
    private int g;
    private SSLSocketFactory h;
    private int j;
    private int k;
    private final Object l;
    private final CronetEngine m;

    public izd(Context context) {
        this(context, awgs.g(), (int) awgs.a.a().w(), context.getApplicationInfo().uid, 4102, (CronetEngine) div.b().c());
        a("Accept-Language", dja.b());
        if (!amrk.a(awgs.f())) {
            a("X-Server-Token", awgs.f());
        }
    }

    private final baaf e(ClientContext clientContext) {
        Map map;
        if (clientContext == null) {
            return this.a;
        }
        Bundle bundle = clientContext.i.getBundle("binary_headers");
        if (bundle == null || bundle.keySet().isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = new HashMap();
            for (String str : bundle.keySet()) {
                map.put(str, auay.a(bundle.getByteArray(str)));
            }
        }
        if (map.isEmpty()) {
            return this.a;
        }
        baaf baaf = new baaf();
        if (this.a != null) {
            baaf.a(this.a);
        }
        for (Map.Entry entry : map.entrySet()) {
            baaf.a(baab.a((String) entry.getKey(), baaf.e), (Object) ((auay) entry.getValue()).k());
        }
        return baaf;
    }

    /* access modifiers changed from: package-private */
    public final azxh a(long j2, TimeUnit timeUnit) {
        if (j2 >= 0 && timeUnit != null) {
            return azxh.a.a(j2, timeUnit).a(this.d);
        }
        return azxh.a.a(this.d);
    }

    public final void b() {
        if (this.e != null) {
            this.e.d();
        }
    }

    public final void h() {
        if (this.e != null) {
            this.e.c();
        }
    }

    /* access modifiers changed from: protected */
    public final baaj a(baaj baaj) {
        String str;
        azzs azzs;
        try {
            Context context = this.i;
            izm izm = new izm(baaj, this.f);
            SSLSocketFactory sSLSocketFactory = this.h;
            String str2 = izm.b;
            baaj baaj2 = izm.a;
            StringBuilder sb = new StringBuilder();
            if (sSLSocketFactory == null) {
                str = "http://";
            } else {
                str = "https://";
            }
            sb.append(str);
            sb.append(str2);
            sb.append("/");
            sb.append(baaj2.b);
            String sb2 = sb.toString();
            Bundle a2 = new opk(context).a(sb2);
            if (a2 != null) {
                if (a2.getString("block") != null) {
                    String string = a2.getString("name");
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 13 + String.valueOf(sb2).length());
                    sb3.append("Blocked by ");
                    sb3.append(string);
                    sb3.append(": ");
                    sb3.append(sb2);
                    Log.w("GrpcServerHelper", sb3.toString());
                    babj babj = babj.o;
                    String valueOf = String.valueOf(a2.getString("name"));
                    throw new babk(babj.a(valueOf.length() == 0 ? new String("Blocked by rule: ") : "Blocked by rule: ".concat(valueOf)));
                }
                String trim = a2.getString("rewrite").trim();
                if (trim != null) {
                    if (URLUtil.isHttpUrl(trim) || URLUtil.isHttpsUrl(trim)) {
                        Uri parse = Uri.parse(trim);
                        str2 = parse.getAuthority();
                        String path = parse.getPath();
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        if (!baaj2.b.equalsIgnoreCase(path)) {
                            baaj2 = baaj.a(baaj2.a, path, baaj2.d, baaj2.e);
                        }
                    }
                }
            }
            izm izm2 = new izm(baaj2, str2);
            String str3 = izm2.b;
            if (this.e == null || !this.f.equalsIgnoreCase(str3)) {
                synchronized (this.l) {
                    if (this.e == null || !this.f.equalsIgnoreCase(str3)) {
                        this.f = str3;
                        CronetEngine cronetEngine = this.m;
                        if (cronetEngine == null) {
                            Context context2 = this.i;
                            String str4 = this.f;
                            int i = this.g;
                            int i2 = this.j;
                            int i3 = this.k;
                            SSLSocketFactory sSLSocketFactory2 = this.h;
                            bami a3 = bami.a(str4, i);
                            iva.a((Object) sSLSocketFactory2);
                            a3.sslSocketFactory(sSLSocketFactory2);
                            a3.transportExecutor(new izk(i2, i3));
                            if (awzu.a.a().a()) {
                                babx babx = new babx(a3);
                                if (awzu.a.a().b()) {
                                    babx.b = context2.getApplicationContext();
                                }
                                azzs = new babw(babx.a.b(), babx.b);
                            } else {
                                azzs = a3.b();
                            }
                            this.e = azzs;
                        } else {
                            int i4 = this.g;
                            int i5 = this.j;
                            int i6 = this.k;
                            bacm a4 = bacm.a(str3, i4, cronetEngine);
                            a4.b(i5);
                            a4.a(izj.a(i6));
                            this.e = a4.b();
                        }
                    }
                }
            }
            return izm2.a;
        } catch (VolleyError e2) {
            return baaj;
        }
    }

    @Deprecated
    public izd(Context context, String str, int i) {
        this(context, str, i, -1, 150);
    }

    public izd(Context context, String str, int i, int i2, int i3) {
        this(context, str, i, i2, i3, (CronetEngine) null);
    }

    public izd(Context context, String str, int i, int i2, int i3, CronetEngine cronetEngine) {
        super(context);
        this.l = new Object();
        boolean z = true;
        this.b = true;
        this.f = str;
        this.g = i;
        if (izn.a == null) {
            synchronized (izn.class) {
                if (izn.a == null) {
                    izn.a = new izn();
                }
            }
        }
        izn izn = izn.a;
        if (cronetEngine == null) {
            SSLSocketFactory a2 = aamu.a(60000, context);
            iva.a((Object) a2);
            byte[][] bArr = {"h2".getBytes()};
            int i4 = 0;
            for (char c2 = 0; c2 <= 0; c2 = 1) {
                int length = bArr[0].length;
                if (length == 0 || length > 255) {
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("s.length == 0 || s.length > 255: ");
                    sb.append(length);
                    throw new IllegalArgumentException(sb.toString());
                }
                i4 += length + 1;
            }
            byte[] bArr2 = new byte[i4];
            int i5 = 0;
            for (char c3 = 0; c3 <= 0; c3 = 1) {
                byte[] bArr3 = bArr[0];
                int length2 = bArr3.length;
                bArr2[i5] = (byte) length2;
                i5++;
                int i6 = 0;
                while (i6 < length2) {
                    bArr2[i5] = bArr3[i6];
                    i6++;
                    i5++;
                }
            }
            ((aamu) a2).c = bArr2;
            this.h = a2;
        }
        this.j = i2;
        this.k = i3;
        this.c = izf.a;
        this.m = cronetEngine;
        if (cronetEngine == null && this.h == null) {
            z = false;
        }
        iva.a(z);
    }

    public izd(Context context, String str, int i, int i2, int i3, byte[] bArr) {
        this(context, str, i, i2, i3);
        a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        a("X-Android-Package", context.getPackageName());
        a("X-Android-Cert", jhg.h(context, context.getPackageName()));
    }

    public izd(Context context, byte[] bArr) {
        this(context, aybf.a.a().geocoderServerName(), 443, Binder.getCallingUid(), 1544);
        a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        a("X-Android-Package", context.getPackageName());
        a("X-Android-Cert", jhg.h(context, context.getPackageName()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.baaj r21, com.google.android.gms.common.internal.ClientContext r22, java.lang.Object r23, long r24, java.util.concurrent.TimeUnit r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r6 = r26
            java.lang.String r7 = "BaseGrpcServer"
            java.lang.String r8 = "IOException when getting auth token"
            baaj r9 = r20.a((defpackage.baaj) r21)
            azzs r0 = r1.e
            java.lang.String r10 = "grpc channel is null, cannot make grpc request"
            defpackage.iva.a((java.lang.Object) r0, (java.lang.Object) r10)
            java.lang.String r13 = r1.d(r2)     // Catch:{ VolleyError -> 0x00c5 }
            java.lang.String r17 = r1.c(r2)
            baaf r18 = r1.e(r2)
            android.content.Context r11 = r1.i
            azzs r12 = r1.e
            boolean r0 = r1.b
            r14 = r17
            r15 = r18
            r16 = r0
            azxi r0 = defpackage.izn.a(r11, r12, r13, r14, r15, r16)
            babj r10 = defpackage.babj.b
            r11 = 0
            azxh r12 = r1.a((long) r4, (java.util.concurrent.TimeUnit) r6)     // Catch:{ RuntimeException -> 0x004d, all -> 0x004b }
            java.lang.Object r0 = defpackage.izn.a(r0, r9, r3, r12)     // Catch:{ RuntimeException -> 0x004d, all -> 0x004b }
            izf r2 = r1.c
            r2.a((defpackage.baaj) r9, (defpackage.babj) r10)
            izf r2 = r1.c
        L_0x0047:
            r2.a()
            return r0
        L_0x004b:
            r0 = move-exception
            goto L_0x00b3
        L_0x004d:
            r0 = move-exception
            boolean r12 = r1.b     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
            if (r12 == 0) goto L_0x009b
            babj r12 = defpackage.babj.j     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
            babg r12 = r12.r     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
            babj r13 = defpackage.babj.a((java.lang.Throwable) r0)     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
            babg r13 = r13.r     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
            if (r12 != r13) goto L_0x009b
            babj r11 = defpackage.babj.a((java.lang.Throwable) r0)     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
            java.lang.String r16 = r1.d(r2)     // Catch:{ VolleyError -> 0x0089 }
            android.content.Context r14 = r1.i     // Catch:{ RuntimeException -> 0x0087 }
            azzs r15 = r1.e     // Catch:{ RuntimeException -> 0x0087 }
            r19 = 0
            azxi r0 = defpackage.izn.a(r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x0087 }
            azxh r2 = r1.a((long) r4, (java.util.concurrent.TimeUnit) r6)     // Catch:{ RuntimeException -> 0x0087 }
            java.lang.Object r0 = defpackage.izn.a(r0, r9, r3, r2)     // Catch:{ RuntimeException -> 0x0087 }
            izf r2 = r1.c
            r2.a((defpackage.baaj) r9, (defpackage.babj) r10)
            if (r11 == 0) goto L_0x0084
            izf r2 = r1.c
            r2.a((defpackage.baaj) r9, (defpackage.babj) r11)
        L_0x0084:
            izf r2 = r1.c
            goto L_0x0047
        L_0x0087:
            r0 = move-exception
            goto L_0x009d
        L_0x0089:
            r0 = move-exception
            r2 = r0
            babk r0 = new babk     // Catch:{ RuntimeException -> 0x0087 }
            babj r3 = defpackage.babj.o     // Catch:{ RuntimeException -> 0x0087 }
            babj r3 = r3.a((java.lang.String) r8)     // Catch:{ RuntimeException -> 0x0087 }
            babj r2 = r3.b((java.lang.Throwable) r2)     // Catch:{ RuntimeException -> 0x0087 }
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x0087 }
            throw r0     // Catch:{ RuntimeException -> 0x0087 }
        L_0x009b:
            throw r0     // Catch:{ RuntimeException -> 0x009c, all -> 0x004b }
        L_0x009c:
            r0 = move-exception
        L_0x009d:
            babj r10 = defpackage.babj.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00b2 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r7, r2)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00ad
            java.lang.String r2 = "Exception for gRPC call"
            android.util.Log.d(r7, r2, r0)     // Catch:{ all -> 0x00b2 }
        L_0x00ad:
            babk r0 = r10.c()     // Catch:{ all -> 0x00b2 }
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
        L_0x00b3:
            izf r2 = r1.c
            r2.a((defpackage.baaj) r9, (defpackage.babj) r10)
            if (r11 == 0) goto L_0x00bf
            izf r2 = r1.c
            r2.a((defpackage.baaj) r9, (defpackage.babj) r11)
        L_0x00bf:
            izf r2 = r1.c
            r2.a()
            throw r0
        L_0x00c5:
            r0 = move-exception
            r2 = r0
            babk r0 = new babk
            babj r3 = defpackage.babj.o
            babj r3 = r3.a((java.lang.String) r8)
            babj r2 = r3.b((java.lang.Throwable) r2)
            r0.<init>(r2)
            goto L_0x00d8
        L_0x00d7:
            throw r0
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izd.a(baaj, com.google.android.gms.common.internal.ClientContext, java.lang.Object, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final Object a(baaj baaj, Object obj, long j2, TimeUnit timeUnit) {
        baaj a2 = a(baaj);
        iva.a((Object) this.e, (Object) "grpc channel is null, cannot make grpc request");
        azxi a3 = izn.a(this.i, this.e, (String) null, (String) null, this.a, false);
        babj babj = babj.b;
        try {
            Object a4 = izn.a(a3, a2, obj, a(j2, timeUnit));
            this.c.a(a2, babj);
            this.c.a();
            return a4;
        } catch (RuntimeException e2) {
            babj = babj.a((Throwable) e2);
            if (Log.isLoggable("BaseGrpcServer", 3)) {
                Log.d("BaseGrpcServer", "Exception for gRPC call", e2);
            }
            throw babj.c();
        } catch (Throwable th) {
            th = th;
            this.c.a(a2, babj);
            this.c.a();
            throw th;
        }
    }

    public final void a(baaj baaj, ClientContext clientContext, Object obj, bape bape, long j2, TimeUnit timeUnit) {
        baaj a2 = a(baaj);
        izc izc = new izc(this, bape, a2);
        iva.a((Object) this.e, (Object) "grpc channel is null, cannot make grpc request");
        try {
            String d2 = d(clientContext);
            try {
                bapb.a(izn.a(this.i, this.e, d2, c(clientContext), e(clientContext), this.b).a(a2, a(j2, timeUnit)), obj, izc);
            } catch (RuntimeException e2) {
                if (Log.isLoggable("BaseGrpcServer", 3)) {
                    Log.d("BaseGrpcServer", "Exception for gRPC call", e2);
                }
                throw babj.a((Throwable) e2).c();
            }
        } catch (VolleyError e3) {
            throw new babk(babj.o.a("IOException when getting auth token").b((Throwable) e3));
        }
    }

    public final void a(String str) {
        if (this.a != null) {
            synchronized (this) {
                this.a.d(baab.a(str, baaf.a));
            }
        }
    }

    public final void a(String str, String str2) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new baaf();
                }
            }
        }
        synchronized (this) {
            this.a.a(baab.a(str, baaf.a), (Object) str2);
        }
    }
}
