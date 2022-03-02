package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.io.PrintWriter;

/* renamed from: ahzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahzm extends ahzi implements jlp {
    public long a = 0;
    public boolean b;
    public long c = 0;
    private final Handler d;
    private final arnd e;
    private final jlq f;
    private boolean g;
    private final arne h;

    public ahzm(Context context, Handler handler) {
        jlq jlq = new jlq(context);
        arnd a2 = new aipq().a(context);
        ahzj ahzj = new ahzj(this);
        this.h = ahzj;
        this.d = handler;
        this.a = 5147455389092024324L;
        this.e = a2;
        this.f = jlq;
        a2.a((arne) ahzj, handler);
    }

    public final void a() {
        if (axyu.d() && !this.g) {
            this.g = true;
            this.f.a(this);
        }
    }

    public final void b() {
        if (this.g) {
            this.g = false;
            this.f.a();
            if (this.b) {
                this.b = false;
                this.c = 0;
                a(1);
            }
        }
    }

    public final void a(int i) {
        arnh a2 = this.e.a(this.a);
        if (a2 != null) {
            aucd o = arna.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arna arna = (arna) o.b;
            arna.b = i - 1;
            int i2 = arna.a | 1;
            arna.a = i2;
            boolean z = this.b;
            int i3 = i2 | 2;
            arna.a = i3;
            arna.c = z;
            long j = this.c;
            arna.a = i3 | 4;
            arna.d = j;
            arnk a3 = a2.a(129, 0, (audx) (arna) o.i());
            if (a3 == null) {
                long j2 = this.a;
                StringBuilder sb = new StringBuilder(61);
                sb.append("Unable to post notification to nano app: ");
                sb.append(j2);
                Log.e("WifiConnectionHelperNyc", sb.toString());
                return;
            }
            a3.a(ahzl.a);
        } else if (Log.isLoggable("WifiConnectionHelperNyc", 6)) {
            long j3 = this.a;
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("couldn't find the nano app: ");
            sb2.append(j3);
            Log.e("WifiConnectionHelperNyc", sb2.toString());
        }
    }

    public final void a(PrintWriter printWriter) {
        boolean z = this.g;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(69);
        sb.append("Has active CHRE connection status listener : ");
        sb.append(z);
        sb.append(". Connected : ");
        sb.append(z2);
        printWriter.println(sb.toString());
    }

    public final void a(boolean z, String str) {
        this.d.post(new ahzk(this, z, str));
    }
}
