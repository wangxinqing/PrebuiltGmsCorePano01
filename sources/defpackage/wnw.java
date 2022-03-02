package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import java.util.LinkedList;
import java.util.List;

/* renamed from: wnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wnw extends wne {
    public final String c;
    public final List d;
    public final ParcelableGetOptions e;

    public final Pair a(Context context, wmr wmr, xpk xpk) {
        Bundle bundle = new Bundle();
        boolean z = false;
        bundle.putBoolean("response_complete", false);
        LinkedList linkedList = new LinkedList();
        if (this.e.d) {
            if (ayvr.b()) {
                this.b.a(xlz.CP2);
            }
            if (this.l != null) {
                linkedList.add(new wnl(this));
            } else {
                Log.w("BasePeopleOperation", "Can not query gaia map, no account provided");
            }
        }
        if (this.e.a) {
            if (ayvr.b()) {
                this.b.a(xlz.OFFLINE);
            }
            if (this.l != null) {
                linkedList.add(new wnm(this));
            } else {
                Log.w("BasePeopleOperation", "Can not query database, no account provided");
            }
        }
        if (!ayvo.a.a().a() && this.e.b) {
            if (ayvr.b()) {
                this.b.a(xlz.WEB);
            }
            linkedList.add(new wnn(this));
            linkedList.add(new wnq(this));
            linkedList.add(new wno(this));
            linkedList.add(new wnr(this));
            linkedList.add(new wnp(this));
        }
        linkedList.size();
        while (!linkedList.isEmpty()) {
            if (this.p) {
                return new Pair(xqy.d, (Object) null);
            }
            if (z) {
                a(xqy.c, bundle);
            }
            z = ((wnv) linkedList.remove()).a(context, xpk, bundle);
        }
        bundle.putBoolean("response_complete", true);
        return new Pair(xqy.c, bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnw(String str, int i, String str2, wzv wzv, String str3, String str4, List list, ParcelableGetOptions parcelableGetOptions) {
        super(wzv, str, i, str2, str3, str4, "IdentityGetByIds", 5384);
        this.c = str4;
        this.d = list;
        this.e = parcelableGetOptions;
    }
}
