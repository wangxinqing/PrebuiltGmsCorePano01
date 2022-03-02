package defpackage;

import android.os.IBinder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vad implements IBinder.DeathRecipient {
    public final String a;
    public final Map b = new ConcurrentHashMap();
    public boolean c = true;
    final /* synthetic */ vae d;

    public vad(vae vae, String str) {
        this.d = vae;
        iva.a((Object) str);
        this.a = str;
    }

    public final void binderDied() {
        if (this.c) {
            vae vae = this.d;
            jjg jjg = tgc.a;
            vae.a(this.a);
            for (vac a2 : vae.b) {
                a2.a(this.a);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package=");
        sb.append(this.a);
        if (this.b.isEmpty()) {
            sb.append(", no binders");
        } else {
            sb.append(",binder=");
            for (IBinder append : this.b.values()) {
                sb.append(append);
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
