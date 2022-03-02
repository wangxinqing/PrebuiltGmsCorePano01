package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: aktc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktc extends aktf {
    private final Context b;
    private final ClientContext c;
    private final String d;
    private final String e;
    private final int f;
    private final List g;
    private final LatLngBounds h;
    private final PlacesParams i;
    private final iyn j;

    public aktc(iyn iyn, Context context, ClientContext clientContext, String str, String str2, LatLngBounds latLngBounds, int i2, List list, String str3, PlacesParams placesParams) {
        super(str3);
        this.j = iyn;
        this.b = context;
        this.c = clientContext;
        this.d = str;
        this.e = str2;
        this.f = i2;
        this.g = list;
        this.h = latLngBounds;
        this.i = placesParams;
    }

    public final /* bridge */ /* synthetic */ anui a(int i2, long j2, PlacesParams placesParams, Object obj) {
        asrj asrj = (asrj) obj;
        anui a = aktf.a(12, i2, j2, this.i);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
        aofn aofn = (aofn) aofo.e.o();
        int i3 = this.f;
        if (aofn.c) {
            aofn.c();
            aofn.c = false;
        }
        aofo aofo = (aofo) aofn.b;
        aofo.a |= 1;
        aofo.b = i3;
        if (this.g != null) {
            for (int i4 = 0; i4 < this.g.size(); i4++) {
                aofn.a(akig.a((String) this.g.get(i4)));
            }
        }
        if (asrj != null) {
            aucd o = aofp.d.o();
            String a2 = akig.a(asrj.d);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofp aofp = (aofp) o.b;
            a2.getClass();
            aofp.a |= 1;
            aofp.b = a2;
            int size = asrj.c.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofp aofp2 = (aofp) o.b;
            aofp2.a |= 2;
            aofp2.c = size;
            aofn.a(o);
            for (int i5 = 0; i5 < asrj.e.size(); i5++) {
                aucd o2 = aofp.d.o();
                String a3 = akig.a(((asri) asrj.e.get(i5)).b);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofp aofp3 = (aofp) o2.b;
                a3.getClass();
                aofp3.a |= 1;
                aofp3.b = a3;
                int size2 = ((asri) asrj.e.get(i5)).a.size();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofp aofp4 = (aofp) o2.b;
                aofp4.a |= 2;
                aofp4.c = size2;
                aofn.a((aofp) o2.i());
            }
        }
        aoei aoei = ((anui) aucd.b).c;
        if (aoei == null) {
            aoei = aoei.w;
        }
        aucd aucd2 = (aucd) aoei.c(5);
        aucd2.a((aucj) aoei);
        aodn aodn = ((aoei) aucd2.b).v;
        if (aodn == null) {
            aodn = aodn.q;
        }
        aucd aucd3 = (aucd) aodn.c(5);
        aucd3.a((aucj) aodn);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aofo aofo2 = (aofo) aofn.i();
        aofo2.getClass();
        aodn2.m = aofo2;
        aodn2.a |= 2048;
        aodn aodn3 = (aodn) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn3.getClass();
        aoei2.v = aodn3;
        aoei2.a |= 8388608;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anui anui = (anui) aucd.b;
        aoei aoei3 = (aoei) aucd2.i();
        anui anui2 = anui.p;
        aoei3.getClass();
        anui.c = aoei3;
        anui.a |= 2;
        return (anui) aucd.i();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        if (TextUtils.isEmpty(this.i.d)) {
            return (asrj) this.j.a(this.a, aksd.a(this.b, this.h, this.f, this.g, this.i).k(), (Object) asrj.f, this.d, this.e, azcl.c(), 10274);
        }
        Account account = new Account(this.i.d, "com.google");
        ClientContext clientContext = new ClientContext(this.c);
        clientContext.d = account;
        clientContext.c = account;
        return (asrj) this.j.a(clientContext, this.a, aksd.a(this.b, this.h, this.f, this.g, this.i).k(), (Object) asrj.f, azcl.c(), 10274);
    }
}
