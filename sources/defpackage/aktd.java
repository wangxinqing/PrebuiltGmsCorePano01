package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;

/* renamed from: aktd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktd extends aktf {
    private final Context b;
    private final ClientContext c;
    private final String d;
    private final String e;
    private final int f;
    private final List g;
    private final PlacesParams h;
    private final iyn i;

    public aktd(iyn iyn, Context context, ClientContext clientContext, String str, String str2, List list, int i2, String str3, PlacesParams placesParams) {
        super(str3);
        this.i = iyn;
        this.b = context;
        this.c = clientContext;
        this.d = str;
        this.e = str2;
        this.g = list;
        this.f = i2;
        this.h = placesParams;
    }

    public final /* bridge */ /* synthetic */ anui a(int i2, long j, PlacesParams placesParams, Object obj) {
        asro asro = (asro) obj;
        anui a = aktf.a(14, i2, j, this.h);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
        aucd o = aofq.c.o();
        if (asro != null) {
            int size = asro.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = ((asrn) asro.b.get(i3)).a;
                aucd o2 = aofr.d.o();
                String a2 = akig.a(str);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofr aofr = (aofr) o2.b;
                a2.getClass();
                aofr.a |= 1;
                aofr.b = a2;
                aucx aucx = ((asrn) asro.b.get(i3)).b;
                int size2 = aucx.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size2; i5++) {
                    i4 += ((asrm) aucx.get(i5)).a.size();
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofr aofr2 = (aofr) o2.b;
                aofr2.a |= 2;
                aofr2.c = i4;
                aofr aofr3 = (aofr) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aofq aofq = (aofq) o.b;
                aofr3.getClass();
                if (!aofq.a.a()) {
                    aofq.a = aucj.a(aofq.a);
                }
                aofq.a.add(aofr3);
                aoct a3 = akig.a(akig.b(str), str);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aofq aofq2 = (aofq) o.b;
                a3.getClass();
                if (!aofq2.b.a()) {
                    aofq2.b = aucj.a(aofq2.b);
                }
                aofq2.b.add(a3);
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
        aofq aofq3 = (aofq) o.i();
        aofq3.getClass();
        aodn2.o = aofq3;
        aodn2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
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
        if (TextUtils.isEmpty(this.h.d)) {
            return (asro) this.i.a(this.a, aksd.a(this.b, this.g, this.f, this.h).k(), (Object) asro.c, this.d, this.e, azcl.c(), 10276);
        }
        Account account = new Account(this.h.d, "com.google");
        ClientContext clientContext = new ClientContext(this.c);
        clientContext.d = account;
        clientContext.c = account;
        return (asro) this.i.a(clientContext, this.a, aksd.a(this.b, this.g, this.f, this.h).k(), (Object) asro.c, azcl.c(), 10276);
    }
}
