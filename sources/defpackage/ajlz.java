package defpackage;

import android.content.Intent;
import android.os.Message;
import android.os.WorkSource;
import com.google.android.gms.location.WifiScan;
import com.google.android.ulr.ApiBleRate;
import java.util.List;

/* renamed from: ajlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ajlz extends jfo {
    final /* synthetic */ ajme a;
    private final jkb b;
    private final String f;
    private final jfp g;
    private final acrz h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ajlz(ajme ajme, jfp jfp, String str) {
        super(jfp);
        jkb a2 = jkb.a(ajme.b);
        this.a = ajme;
        this.h = new acrz(ajme.b, 1, str.concat("WL"), (String) null, "com.google.android.gms");
        this.b = a2;
        this.g = jfp;
        this.f = str;
    }

    public void a() {
        String valueOf = String.valueOf(this.f);
        ajix.a("GCoreUlr", valueOf.length() == 0 ? new String("Stopping handler for ") : "Stopping handler for ".concat(valueOf));
        this.g.quit();
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* access modifiers changed from: protected */
    public abstract void a(WifiScan wifiScan);

    /* access modifiers changed from: protected */
    public abstract void a(ApiBleRate apiBleRate);

    /* access modifiers changed from: protected */
    public abstract void a(List list);

    public final void handleMessage(Message message) {
        if (!this.b.a()) {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
            sb.append("DispatchingService ignoring event for non-foreground user: ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        if ((!this.f.equals("UlrDispSvcSlow") || !aztb.a.a().ay()) && (!this.f.equals("UlrDispSvcFast") || !aztb.a.a().ax())) {
            a(message);
        } else {
            try {
                this.h.a(aztb.S());
                if (this.h.e()) {
                    this.h.c((WorkSource) null);
                }
                a(message);
                if (this.h.e()) {
                    this.h.c();
                }
            } catch (Throwable th) {
                if (this.h.e()) {
                    this.h.c();
                }
                throw th;
            }
        }
        ajme ajme = this.a;
        int i = ajme.v;
        if (!ajme.c.a().d() && message.what == 1) {
            this.a.j.a(message.arg1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        String valueOf = String.valueOf(message);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("DispatchingService received message: ");
        sb.append(valueOf);
        sb.toString();
        int i = message.what;
        if (i == 1) {
            ajme ajme = this.a;
            int i2 = ajme.v;
            String c = ajme.h.b().c();
            if (c != null) {
                if (this.h.e()) {
                    this.h.c(jlr.a(this.a.b, c));
                }
                StringBuilder sb2 = new StringBuilder(c.length() + 20);
                sb2.append("Blaming upload on '");
                sb2.append(c);
                sb2.append("'");
                sb2.toString();
            }
            a((Intent) message.obj);
        } else if (i == 2) {
            a((List) message.obj);
        } else if (i == 3) {
            a((ApiBleRate) message.obj);
        } else if (i != 5) {
            String valueOf2 = String.valueOf(message);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 50);
            sb3.append("DispatchingService received unrecognized message: ");
            sb3.append(valueOf2);
            ajix.c("GCoreUlr", 30, sb3.toString());
        } else if (aztb.s()) {
            ajme ajme2 = this.a;
            int i3 = ajme.v;
            ajme2.c();
        } else {
            a((WifiScan) message.obj);
        }
    }
}
