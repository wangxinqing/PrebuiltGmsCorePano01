package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: khq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khq {
    public final kkz a;
    public final String b;
    public final AppIdentity c;
    public final long d;
    public final Set e;

    private khq(kkz kkz) {
        iva.a((Object) kkz);
        this.a = kkz;
        this.b = "0";
        this.c = AppIdentity.a;
        this.d = Long.MAX_VALUE;
        this.e = Collections.unmodifiableSet(jzl.e);
    }

    public static khq a(kkz kkz) {
        return new khq(kkz);
    }

    public final boolean b() {
        return "378076965553".equals(this.b) || "86665574018".equals(this.b) || "745476177629".equals(this.b);
    }

    public final boolean c() {
        return this.e.contains(jzl.FULL);
    }

    public final boolean d() {
        return this.e.contains(jzl.FILE) && !c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            khq khq = (khq) obj;
            return ius.a(this.a, khq.a) && ius.a(this.c, khq.c) && ius.a(this.b, khq.b) && ius.a(this.e, khq.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e});
    }

    public final String toString() {
        return String.format("AuthorizedApp [account=%s, sdkAppId=%s, appIdentity=%s, expiryTimestamp=%s, scopes=%s]", new Object[]{this.a, this.b, this.c, new Date(this.d).toString(), this.e});
    }

    public final ClientContext a(Context context) {
        Account a2 = lrg.a(context, this.a.a);
        irk.a((Object) a2, (Object) "No account object found for app!");
        String str = this.c.b;
        ClientContext clientContext = new ClientContext();
        clientContext.b = jhg.i(context, str);
        clientContext.c = a2;
        clientContext.e = str;
        clientContext.f = str;
        for (jzl jzl : this.e) {
            clientContext.d(jzl.f);
        }
        return clientContext;
    }

    public khq(kkz kkz, String str, AppIdentity appIdentity, long j, Set set) {
        iva.a((Object) kkz);
        this.a = kkz;
        this.b = str;
        iva.a((Object) appIdentity);
        this.c = appIdentity;
        this.d = j;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.copyOf(set));
        this.e = unmodifiableSet;
        iva.b(!unmodifiableSet.isEmpty(), "At least one scope is required.");
        iva.b(!"0".equals(str), String.format("sdkAppId %s is only valid for a full access AuthorizedApp.", new Object[]{str}));
        iva.b(!appIdentity.equals(AppIdentity.a), "Superuser AppIdentity is only valid for a full access AuthorizedApp.");
    }

    public final boolean a() {
        return "0".equals(this.b);
    }

    public final boolean a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (this.e.contains((jzl) it.next())) {
                return true;
            }
        }
        return false;
    }
}
