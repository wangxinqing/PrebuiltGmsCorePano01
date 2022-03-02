package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ljy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljy {
    public static final ith a = new ith("RealtimeLoader", "");
    public static final ScheduledExecutorService b = qvj.b.c(2);
    public static final aloo c = new lju();
    public final Context d;
    public final lkm e;
    public final lkg f = new lkg();
    public final int g;
    public final lgy h;
    private SecureRandom i;

    public ljy(Context context, lkm lkm, lgy lgy) {
        int i2;
        this.d = context;
        this.e = lkm;
        try {
            i2 = jni.b(this.d).b(this.d.getPackageName(), 64).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            i2 = -1;
        }
        this.g = i2;
        this.h = lgy;
    }

    public final alrs a(String str) {
        List list;
        if (str != null) {
            try {
                list = Collections.unmodifiableList(new alxg(str).a);
            } catch (IllegalArgumentException e2) {
                throw new alry(e2);
            }
        } else {
            list = Collections.emptyList();
        }
        if (this.i == null) {
            this.i = new SecureRandom();
        }
        String hexString = Long.toHexString(Math.abs(this.i.nextLong()));
        return new alrs(new alrt(1, hexString, Collections.emptyList()), alyv.READ_WRITE, list, Collections.singletonList(alxk.a(hexString, "", "", "", true, "", "")), (String) null);
    }
}
