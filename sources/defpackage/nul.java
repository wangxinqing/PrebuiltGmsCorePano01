package defpackage;

import android.util.Log;
import java.util.Arrays;

/* renamed from: nul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nul {
    public final /* synthetic */ nun a;
    public final aucd b;
    private final nvl c;

    public nul(nun nun, aucd aucd) {
        nvl nvl;
        this.a = nun;
        this.b = aucd;
        nqj nqj = (nqj) aucd.i();
        int r = (int) axlf.a.a().r();
        if (r == 0) {
            nvl = new nvm(nqj);
        } else if (r != 1) {
            Log.e("GCM", "Invalid heartbeat algorithm selection. Using default.");
            nvl = new nvm(nqj);
        } else {
            nvl = new nvj(nqj);
        }
        this.c = nvl;
    }

    public final int a() {
        return this.c.a();
    }

    public final long b() {
        return ((nqj) this.b.b).c;
    }

    public final nqj c() {
        aucd aucd = this.b;
        aucd.a((aucj) this.c.b());
        return (nqj) aucd.i();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nul) {
            return c().equals(((nul) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c()});
    }

    public final String toString() {
        nqj nqj = (nqj) this.b.b;
        int i = nqj.h;
        String str = nqj.b;
        String valueOf = String.valueOf(this.c);
        long j = ((nqj) this.b.b).i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 83 + String.valueOf(valueOf).length());
        sb.append("Network type: ");
        sb.append(i);
        sb.append("\nId: ");
        sb.append(str);
        sb.append("\nHB algorithm: ");
        sb.append(valueOf);
        sb.append("\nReconnect delay: ");
        sb.append(j);
        return sb.toString();
    }

    public final synchronized void a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nqj nqj = (nqj) aucd.b;
        nqj nqj2 = nqj.k;
        nqj.a |= 2;
        nqj.c = currentTimeMillis;
        this.c.a(i);
    }
}
