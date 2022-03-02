package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zse extends zsd {
    private static final zsg a = zsg.a("DasherAccountLookupImpl");
    private Set b = null;
    private final qub c;

    public zse(qub qub) {
        this.c = qub;
        try {
            Account[] accountArr = (Account[]) qub.a("com.google", new String[]{"service_HOSTED"}).getResult();
            HashSet hashSet = new HashSet();
            for (Account account : accountArr) {
                if (!account.name.endsWith("@google.com")) {
                    hashSet.add(account.name);
                }
            }
            this.b = hashSet;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a.d("Cannot query dasher account from GmsAccountmanager, fall back to legacy dasher lookup.");
        }
    }

    public final boolean a(String str) {
        Set set = this.b;
        if (set == null) {
            return zsh.b(str);
        }
        return set.contains(str);
    }
}
