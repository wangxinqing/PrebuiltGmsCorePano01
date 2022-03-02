package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;

/* renamed from: wnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wnz extends wne {
    private final String c;
    private final ParcelableListOptions d;

    public final Pair a(Context context, wmr wmr, xpk xpk) {
        Bundle bundle = new Bundle();
        wsr b = wsr.b(this.d.c);
        xpr b2 = xpr.b(context);
        Bundle bundle2 = this.d.e;
        bundle2.putString("on_behalf_of", this.c);
        b2.d();
        xpr xpr = b2;
        wne.a(xpr, b, bundle2, xpk.a, new wnx(b, bundle), new wny());
        b2.e();
        bundle.putBoolean("response_complete", true);
        return new Pair(xqy.c, bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnz(String str, int i, String str2, wzv wzv, String str3, String str4, ParcelableListOptions parcelableListOptions) {
        super(wzv, str, i, str2, str3, str4, "IdentityList", 5385);
        this.c = str4;
        this.d = parcelableListOptions;
    }
}
