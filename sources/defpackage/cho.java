package defpackage;

import java.util.Arrays;
import java.util.concurrent.Future;

/* renamed from: cho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cho extends cbm implements bve {
    private final bsz a;

    public cho(bsz bsz) {
        super("DeviceRegistrationSync", "device registration sync", new Object[0]);
        iva.a((Object) bsz);
        this.a = bsz;
    }

    public final Future a() {
        if (!this.a.b()) {
            iva.a(!isDone());
            new Object[1][0] = this.a;
            cbl w = cbi.w();
            chm a2 = cbi.v().a(this.a, false);
            if (a2.a() && !a2.a.c.isEmpty()) {
                bsz bsz = this.a;
                jya jya = a2.a;
                bwn k = cbi.k();
                bvp a3 = bvq.a("NetworkManager#registerDevice");
                if (bsz.b()) {
                    ((anih) ((anih) bxk.a.b()).a("cbl", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for registerDevice RPC.");
                    cbl.a(this, k, a3);
                } else {
                    a3.f();
                    new cca(w.a, bsz, jya, this, k).a(a3);
                }
            }
            return this;
        }
        new Object[1][0] = this.a;
        return buk.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cho) {
            return this.a.equals(((cho) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, getClass().getSimpleName()});
    }

    public final void a(atqi atqi) {
        jxz jxz;
        chm a2 = cbi.v().a(this.a, false);
        jxz jxz2 = jxz.NOT_SYNCED_MISSING_GCM_ID;
        jxz a3 = jxz.a(a2.a.d);
        if (a3 == null) {
            a3 = jxz.NOT_SYNCED_MISSING_GCM_ID;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) bxk.a.b()).a("cho", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DeviceRegistrationSync] Latest device registration is missing gcm id state but got synced.");
        } else if (ordinal == 1 || ordinal == 2) {
            new Object[1][0] = this.a;
            a2.a(jxz.SYNCED);
            chn.a(this.a, a2);
        } else {
            anih anih = (anih) ((anih) bxk.a.b()).a("cho", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            jya jya = a2.a;
            if ((jya.a & 4) != 0) {
                jxz = jxz.a(jya.d);
                if (jxz == null) {
                    jxz = jxz.NOT_SYNCED_MISSING_GCM_ID;
                }
            } else {
                jxz = null;
            }
            anih.a("[DeviceRegistrationSync] onSuccess: Unknown registration state=%s", (Object) jxz);
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        jxz jxz;
        atqi atqi = (atqi) obj;
        chm a2 = cbi.v().a(this.a, false);
        jxz jxz2 = jxz.NOT_SYNCED_MISSING_GCM_ID;
        jxz a3 = jxz.a(a2.a.d);
        if (a3 == null) {
            a3 = jxz.NOT_SYNCED_MISSING_GCM_ID;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) bxk.a.b()).a("cho", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DeviceRegistrationSync] Latest device registration is missing gcm id state but got synced.");
        } else if (ordinal == 1 || ordinal == 2) {
            new Object[1][0] = this.a;
            a2.a(jxz.SYNCED);
            chn.a(this.a, a2);
        } else {
            anih anih = (anih) ((anih) bxk.a.b()).a("cho", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            jya jya = a2.a;
            if ((jya.a & 4) != 0) {
                jxz = jxz.a(jya.d);
                if (jxz == null) {
                    jxz = jxz.NOT_SYNCED_MISSING_GCM_ID;
                }
            } else {
                jxz = null;
            }
            anih.a("[DeviceRegistrationSync] onSuccess: Unknown registration state=%s", (Object) jxz);
        }
    }
}
