package defpackage;

import android.content.Context;
import android.os.Build;
import com.android.volley.toolbox.ImageRequest;
import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aaxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxd {
    private final Context a;
    private final aayx b;
    private final aaxc c;
    private final aayy d;
    private final boolean e;

    public aaxd(Context context, aayx aayx, aaxc aaxc, aayy aayy, boolean z) {
        this.a = context;
        this.b = aayx;
        this.c = aaxc;
        this.d = aayy;
        this.e = z;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        byte[] a2;
        int i = Build.VERSION.SDK_INT;
        if (this.e || new SecureRandom().nextInt(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS) < 50) {
            long j2 = this.d.a.getLong("snet_app_ops_last_timestamp", -1);
            if (j2 == -1) {
                j2 = 0;
            }
            ancq a3 = this.c.a(j2);
            Set<String> m = a3.m();
            HashMap hashMap = new HashMap();
            for (String str : m) {
                File a4 = aaza.a(str, this.a);
                if (!(a4 == null || (a2 = aaza.a(a4)) == null)) {
                    hashMap.put(str, auay.a(a2));
                }
            }
            amxc p = amxc.p();
            for (String str2 : a3.m()) {
                auay auay = (auay) hashMap.get(str2);
                if (auay != null) {
                    p.a((Object) auay, (Iterable) a3.a(str2));
                }
            }
            aayx aayx = this.b;
            aayx.a();
            if (!p.k()) {
                for (auay auay2 : p.m()) {
                    List<aaxb> a5 = p.a(auay2);
                    aucd a6 = aayx.a(auay2);
                    for (aaxb aaxb : a5) {
                        aucd o = aasn.g.o();
                        int intValue = aaxb.a.intValue();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasn aasn = (aasn) o.b;
                        aasn.a |= 1;
                        aasn.b = intValue;
                        if (aaxb.b > 0) {
                            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(aaxb.b);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aasn aasn2 = (aasn) o.b;
                            aasn2.a |= 2;
                            aasn2.c = seconds;
                        }
                        if (aaxb.c > 0) {
                            int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(aaxb.c);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aasn aasn3 = (aasn) o.b;
                            aasn3.a |= 16;
                            aasn3.f = seconds2;
                        }
                        if (aaxb.d > 0) {
                            int seconds3 = (int) TimeUnit.MILLISECONDS.toSeconds(aaxb.d);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aasn aasn4 = (aasn) o.b;
                            aasn4.a |= 4;
                            aasn4.d = seconds3;
                        }
                        long j3 = aaxb.e;
                        if (j3 > 0) {
                            int min = (int) Math.min(2147483647L, j3);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aasn aasn5 = (aasn) o.b;
                            aasn5.a |= 8;
                            aasn5.e = min;
                        }
                        aasn aasn6 = (aasn) o.i();
                        if (a6.c) {
                            a6.c();
                            a6.c = false;
                        }
                        aask aask = (aask) a6.b;
                        aask aask2 = aask.e;
                        aasn6.getClass();
                        if (!aask.c.a()) {
                            aask.c = aucj.a(aask.c);
                        }
                        aask.c.add(aasn6);
                    }
                }
            }
            this.d.a("snet_app_ops_last_timestamp", j);
            return;
        }
        azft.c();
    }
}
