package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;

/* renamed from: prk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prk extends pre {
    public final aagp b;
    public final oyq c;
    final Runnable d = new prj(this);
    private final pxs e;
    private final pas f;
    private final UsageInfo[] g;
    private final String h;

    public prk(dux dux, aagp aagp, pas pas, pxs pxs, oyq oyq, UsageInfo[] usageInfoArr, String str) {
        super(dux, "ReportUsage");
        this.e = pxs;
        this.b = aagp;
        this.c = oyq;
        this.f = pas;
        this.g = usageInfoArr;
        this.h = str;
    }

    public final void a(Context context) {
        int i;
        String valueOf = String.valueOf(this.h);
        oso.a(valueOf.length() == 0 ? new String("Recording usage report from ") : "Recording usage report from ".concat(valueOf));
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.e.a(this.g, this.h, currentTimeMillis, pxq.a(context, currentTimeMillis), this.d);
        aono a2 = prn.a(context, this.h, this.g, hya.a(context));
        oso.a("UserActionNotificationResult: %d", (Object) Integer.valueOf(a2.a()));
        if (!a) {
            i = 8;
        } else {
            i = 0;
        }
        try {
            this.a.a(new Status(i, (String) null, (PendingIntent) null));
        } catch (RemoteException e2) {
            oso.c((Throwable) e2, "Client died during reportUsage", new Object[0]);
        }
        boolean booleanValue = ((Boolean) ozx.n.c()).booleanValue();
        boolean a3 = this.f.a(this.f.a());
        if (booleanValue && a3) {
            oyq oyq = this.c;
            aucd o = aoky.d.o();
            String str = this.h;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoky aoky = (aoky) o.b;
            str.getClass();
            aoky.a |= 1;
            aoky.b = str;
            aoky.c = a2.a();
            aoky.a |= 2;
            aoky aoky2 = (aoky) o.i();
            long o2 = axrp.a.a().o();
            if (oyq.a(o2)) {
                aucd o3 = aoji.R.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aoji aoji = (aoji) o3.b;
                int i2 = aoji.a | 524288;
                aoji.a = i2;
                aoji.s = o2;
                aoky2.getClass();
                aoji.g = aoky2;
                aoji.a = i2 | 16;
                oyq.a("astats", o3);
            }
        }
    }
}
