package defpackage;

import java.io.IOException;

/* renamed from: afqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afqi implements aoqb {
    private final afqn a;
    private final aflf b;

    public afqi(afqn afqn, aflf aflf) {
        this.a = afqn;
        this.b = aflf;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        aflf aflf = this.b;
        Void voidR = (Void) obj;
        afpf afpf = afqn.d;
        aucd aucd = (aucd) aflf.c(5);
        aucd.a((aucj) aflf);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aflf aflf2 = (aflf) aucd.b;
        aflf aflf3 = aflf.f;
        aflf2.a |= 8;
        aflf2.e = false;
        aflf aflf4 = (aflf) aucd.i();
        afkr a2 = afpf.d.a(aflf4);
        if (a2 == null || afpf.d.b(aflf4)) {
            aucd aucd2 = (aucd) aflf.c(5);
            aucd2.a((aucj) aflf);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aflf aflf5 = (aflf) aucd2.b;
            aflf5.a |= 8;
            aflf5.e = true;
            aflf aflf6 = (aflf) aucd2.i();
            afkr a3 = afpf.d.a(aflf6);
            if (a3 != null) {
                if (!afpf.d.b(aflf6)) {
                    afsh.b("%s: Failed to remove the downloaded version for group: '%s'; account: '%s'", "FileGroupManager", aflf.b, aflf.d);
                    afpf.b.b(1036);
                    String valueOf = String.valueOf(aflf.b);
                    return aorl.a((Throwable) new IOException(valueOf.length() == 0 ? new String("Failed to remove downloaded group: ") : "Failed to remove downloaded group: ".concat(valueOf)));
                } else if (!afpf.d.a(a3)) {
                    afsh.b("%s: Failed to add to stale for group: '%s'; account: '%s'", "FileGroupManager", aflf.b, aflf.d);
                    afpf.b.b(1036);
                    String valueOf2 = String.valueOf(aflf.b);
                    return aorl.a((Throwable) new IOException(valueOf2.length() == 0 ? new String("Failed to add downloaded group to stale: ") : "Failed to add downloaded group to stale: ".concat(valueOf2)));
                }
            }
            if (a2 == null) {
                return aorl.a((Object) null);
            }
            return aopr.a(aopr.a(afpf.d.b(), (amqy) new afoa(anax.j()), afpf.h), (aoqb) new afox(afpf, a2), afpf.h);
        }
        afsh.b("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", aflf.b, aflf.d);
        afpf.b.b(1036);
        String valueOf3 = String.valueOf(aflf.b);
        throw new IOException(valueOf3.length() == 0 ? new String("Failed to remove pending group: ") : "Failed to remove pending group: ".concat(valueOf3));
    }
}
