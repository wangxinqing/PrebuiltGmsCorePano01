package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: snw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snw extends igi {
    final /* synthetic */ ige c;
    final /* synthetic */ MdnsSearchOptions d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public snw(ige ige, ige ige2, MdnsSearchOptions mdnsSearchOptions) {
        super(ige);
        this.c = ige2;
        this.d = mdnsSearchOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        sol sol = (sol) ibf;
        ige ige = this.c;
        MdnsSearchOptions mdnsSearchOptions = this.d;
        igc igc = ige.b;
        if (igc != null) {
            synchronized (sol.a) {
                sob sob = (sob) sol.a.get(igc);
                if (sob == null) {
                    sob = new sob(ige);
                    sol.a.put(igc, sob);
                }
                soa soa = (soa) sol.x();
                Parcel aQ = soa.aQ();
                bhx.a(aQ, (IInterface) sob);
                bhx.a(aQ, (Parcelable) mdnsSearchOptions);
                soa.b(1, aQ);
            }
        }
        acwd.a((Object) null);
    }
}
