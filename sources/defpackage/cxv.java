package defpackage;

import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: cxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxv {
    private final AccountParticleDisc a;
    private final agcf b;

    @Deprecated
    public cxv(AccountParticleDisc accountParticleDisc, agcf agcf) {
        amrl.a((Object) accountParticleDisc);
        this.a = accountParticleDisc;
        this.b = agcf;
    }

    public final void a(amri amri) {
        String str;
        if (!this.a.a()) {
            this.a.a((agbv) this.b, agbl.class);
        }
        int i = 0;
        String str2 = null;
        if (!amri.a() || amrk.a(((dii) amri.b()).a)) {
            this.a.a((Object) null);
            this.a.setTag(R.id.as_particle_disc_url_hash, 0);
            return;
        }
        String str3 = ((dii) amri.b()).a;
        String str4 = ((dii) amri.b()).b;
        agbl agbl = (agbl) this.a.h;
        if (agbl != null) {
            str2 = agbl.b();
            str = agbl.a();
        } else {
            str = null;
        }
        if (!str3.equals(str2) || !amqx.a(str4, str)) {
            if (!amrk.a(str3)) {
                agbk g = agbl.g();
                g.a(str3);
                if (!amrk.a(str4)) {
                    g.a = str4;
                }
                this.a.a((Object) g.a());
            }
            this.a.setTag(R.id.as_particle_disc_url_hash, Integer.valueOf(((dii) amri.b()).c));
            this.a.a((agbt) this.b);
            return;
        }
        Object tag = this.a.getTag(R.id.as_particle_disc_url_hash);
        if (tag instanceof Integer) {
            i = ((Integer) tag).intValue();
        }
        if (((dii) amri.b()).c != i) {
            this.a.a((agbt) this.b);
            this.a.setTag(R.id.as_particle_disc_url_hash, Integer.valueOf(((dii) amri.b()).c));
        }
    }
}
