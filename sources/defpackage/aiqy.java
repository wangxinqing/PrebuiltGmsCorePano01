package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import java.util.Collections;
import java.util.List;

/* renamed from: aiqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiqy implements Runnable {
    private final aire a;
    private final PendingIntent b;
    private final String c;
    private final long d;
    private final boolean e;
    private final long f;
    private final boolean g;
    private final ajrb h;
    private final boolean i;

    public aiqy(aire aire, PendingIntent pendingIntent, String str, long j, boolean z, long j2, boolean z2, ajrb ajrb, boolean z3) {
        this.a = aire;
        this.b = pendingIntent;
        this.c = str;
        this.d = j;
        this.e = z;
        this.f = j2;
        this.g = z2;
        this.h = ajrb;
        this.i = z3;
    }

    public final void run() {
        int i2;
        Object obj;
        long j;
        long j2;
        boolean z;
        boolean z2;
        GoogleLocationChimeraService googleLocationChimeraService;
        aire aire = this.a;
        PendingIntent pendingIntent = this.b;
        String str = this.c;
        long j3 = this.d;
        boolean z3 = this.e;
        long j4 = this.f;
        boolean z4 = this.g;
        ajrb ajrb = this.h;
        boolean z5 = this.i;
        Object obj2 = aire.f;
        synchronized (obj2) {
            try {
                String hexString = Integer.toHexString(pendingIntent.hashCode());
                String targetPackage = pendingIntent.getTargetPackage();
                int length = String.valueOf(hexString).length() + 100 + String.valueOf(targetPackage).length();
                int length2 = String.valueOf(str).length();
                StringBuilder sb = new StringBuilder(length + length2);
                sb.append("adding location pendingIntent=");
                sb.append(hexString);
                sb.append(", packageName=");
                sb.append(targetPackage);
                sb.append(", tag=");
                sb.append(str);
                sb.append(", periodMillis=");
                sb.append(j3);
                sb.append(", trigger=");
                sb.append(z3);
                sb.toString();
                Object obj3 = obj2;
                if (!aydu.c()) {
                    try {
                        i2 = length2;
                        j = Math.max(j3, 5000);
                    } catch (Throwable th) {
                        th = th;
                        obj = i2;
                        throw th;
                    }
                } else {
                    j = Math.max(j3, 1000);
                }
                aipv aipv = aire.l;
                GoogleLocationChimeraService googleLocationChimeraService2 = aire.a;
                ajbg d2 = aire.d();
                aicn aicn = aipv.c;
                if (aicn == null) {
                    googleLocationChimeraService = googleLocationChimeraService2;
                    j2 = j4;
                    z2 = z5;
                    z = z4;
                } else {
                    int hashCode = pendingIntent.hashCode();
                    List singletonList = ajrb == null ? Collections.singletonList(pendingIntent.getTargetPackage()) : ajrb.b();
                    aico aico = aico.LOCATION_PENDING_INTENT_ADDED;
                    long b2 = aicn.b();
                    StringBuilder sb2 = new StringBuilder();
                    if (str != null) {
                        sb2.append(str);
                    }
                    googleLocationChimeraService = googleLocationChimeraService2;
                    sb2.append("/");
                    if (singletonList != null) {
                        int i3 = 0;
                        while (true) {
                            z2 = z5;
                            if (i3 >= singletonList.size()) {
                                break;
                            }
                            if (i3 != 0) {
                                sb2.append(",");
                            }
                            String str2 = (String) singletonList.get(i3);
                            sb2.append("");
                            i3++;
                            z5 = z2;
                        }
                    } else {
                        z2 = z5;
                    }
                    z = z4;
                    j2 = j4;
                    aicn.a((aicl) new aiqr(aico, b2, sb2.toString(), hashCode, (int) Math.min(j / 1000, 2147483647L), z3 ? 1 : 0, hashCode, j, str, singletonList));
                }
                Object obj4 = obj3;
                aire aire2 = aire;
                GoogleLocationChimeraService googleLocationChimeraService3 = googleLocationChimeraService;
                boolean z6 = z3;
                i2 = obj4;
                aipt aipt = new aipt(aipv, pendingIntent, j, j2, d2, z, ajrb, z2, str);
                aipt aipt2 = (aipt) aipv.a.put(pendingIntent, aipt);
                if (aipt2 != null) {
                    aipt2.a();
                }
                aipv.a(aipv.a.values());
                aiay aiay = aipv.i;
                if (aiay != null) {
                    aipv.a((Context) googleLocationChimeraService3, new aiay[]{aiay});
                }
                aire aire3 = aire2;
                aire3.a(aire3.l.g);
                aire3.c(z6);
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }
}
