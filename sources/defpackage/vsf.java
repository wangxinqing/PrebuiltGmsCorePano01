package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vsf {
    private static long o = 0;
    public long a = -1;
    public String b;
    public Uri c;
    public int d = 1;
    public Bundle e = new Bundle();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public List h = new ArrayList();
    public boolean i;
    public String j;
    public boolean k;
    public String l;
    public PendingIntent m;
    public boolean n;

    private static synchronized long c() {
        long j2;
        synchronized (vsf.class) {
            j2 = o;
            o = 1 + j2;
        }
        return j2;
    }

    public final ShareTarget a() {
        long j2;
        iva.b(!TextUtils.isEmpty(this.b), "ShareTarget deviceName must not be null or empty.");
        long j3 = this.a;
        if (j3 == -1) {
            long c2 = c();
            this.a = c2;
            j2 = c2;
        } else {
            j2 = j3;
        }
        return new ShareTarget(j2, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final void b() {
        this.k = true;
    }
}
