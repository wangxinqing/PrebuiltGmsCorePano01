package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ise  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ise {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final abai g;
    public Integer h;

    public ise(Account account, Set set, Map map, String str, String str2, abai abai) {
        this.a = account;
        this.b = set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
        this.d = map == null ? Collections.emptyMap() : map;
        this.e = str;
        this.f = str2;
        this.g = abai;
        HashSet hashSet = new HashSet(this.b);
        for (isd isd : this.d.values()) {
            Set set2 = isd.a;
            hashSet.addAll((Collection) null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static ise a(Context context) {
        return new ibz(context).a();
    }

    public final Account b() {
        Account account = this.a;
        return account == null ? new Account("<<default account>>", "com.google") : account;
    }

    @Deprecated
    public final String a() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final Set a(ibq ibq) {
        if (((isd) this.d.get(ibq)) == null) {
            return this.b;
        }
        throw null;
    }
}
