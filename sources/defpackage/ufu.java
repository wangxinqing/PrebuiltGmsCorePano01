package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* renamed from: ufu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ufu extends tiq {
    public static final /* synthetic */ int b = 0;
    private static final ibq l = new ibq("Nearby.CONNECTIONS_API", n, m);
    private static final ibg m = new ibg();
    private static final ibn n = new ufj();
    public final udo a;

    public ufu(Context context, tis tis) {
        super(context, l, tis, ibx.a);
        this.a = udo.a((iby) this, (ibm) tis);
    }

    private final acwa a(uft uft) {
        return b((ihb) new ufi(uft));
    }

    public final void g(String str) {
        a((uft) new ues(str));
        i(str);
    }

    public final void h(String str) {
        ige a2 = this.a.a((iby) this, str, "connection");
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        this.a.a((iby) this, (igi) new uff(a2), (ihg) new ufg(igc));
    }

    public final void i(String str) {
        udo udo = this.a;
        udo.a((iby) this, udo.b(this, str, "connection"));
    }

    public final void p() {
        this.a.a((iby) this, "discovery").a((acvv) new uey());
    }

    public final void q() {
        a();
        p();
        a(uet.a).a((acvp) new ueu(this));
    }

    public final acwa a(String str) {
        return a((ufq) new ufb(str));
    }

    public final acwa a(String str, String str2, tim tim) {
        ige a2 = a((Object) new ufr(this, tim), tim.class.getName());
        h(str2);
        iha b2 = ihb.b();
        b2.a = new uez(str, str2, a2);
        acwa b3 = b(b2.a());
        b3.a((acvs) new ufe(this, str2));
        return b3;
    }

    public final acwa a(String str, String str2, tim tim, AdvertisingOptions advertisingOptions) {
        ige a2 = a((Object) new ufr(this, tim), tim.class.getName());
        ige a3 = this.a.a((iby) this, new Object(), "advertising");
        igc igc = a3.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        return this.a.a((iby) this, (igi) new ufn(a3, str, str2, a2, advertisingOptions), (ihg) new ufo(igc));
    }

    public final acwa a(String str, tiz tiz, DiscoveryOptions discoveryOptions) {
        ige a2 = this.a.a((iby) this, (Object) tiz, "discovery");
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        acwa a3 = this.a.a((iby) this, (igi) new ufp(a2, str, a2, discoveryOptions), (ihg) new ufd(igc));
        a3.a((acvv) new uex());
        return a3;
    }

    public final acwa a(String str, tjd tjd) {
        ige a2 = a((Object) tjd, tjd.class.getName());
        iha b2 = ihb.b();
        b2.a = new ufa(str, a2);
        return b(b2.a());
    }

    public final acwa a(ufq ufq) {
        return b((ihb) new ufh(ufq));
    }

    public final void a() {
        this.a.a((iby) this, "advertising");
    }

    public final void a(long j) {
        a((ufq) new uer(j));
    }

    public final void a(String str, tjc tjc) {
        iha b2 = ihb.b();
        b2.a = new ufc(str, tjc);
        b(b2.a());
    }
}
