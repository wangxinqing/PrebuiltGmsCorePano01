package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.List;

/* renamed from: fcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcf {
    private static final iwd a = ehv.b("GoogleSignInAccountCreator");

    public static GoogleSignInAccount a(Context context, String str, Account account, List list, String str2, String str3) {
        String str4;
        GoogleSignInAccount googleSignInAccount;
        Account account2 = account;
        List list2 = list;
        String str5 = str3;
        if (str2 == null) {
            try {
                String c = eig.c(context, account2.name);
                MessageDigest a2 = jhh.a("MD5");
                if (a2 != null) {
                    a2.update(String.format("%s:%s", new Object[]{c, str}).getBytes(Charset.forName("UTF-8")));
                    str4 = jjp.d(a2.digest());
                } else {
                    a.d("No MD5 digest instance was found", new Object[0]);
                    str4 = null;
                }
            } catch (eif | IOException | IllegalStateException e) {
                a.d("Failed to get the account id", e, new Object[0]);
                str4 = null;
            }
            if (str4 == null) {
                return null;
            }
            GoogleSignInAccount a3 = GoogleSignInAccount.a((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Uri) null, (Long) null, str4, new HashSet(list2));
            if (str5 != null) {
                a3.g = str5;
            }
            return a3;
        } else if (!qae.a(str2).a()) {
            return null;
        } else {
            if (list.size() == 1) {
                googleSignInAccount = GoogleSignInAccount.a(account2, (Scope) list2.get(0), new Scope[0]);
            } else {
                googleSignInAccount = GoogleSignInAccount.a(account2, (Scope) list2.get(0), (Scope[]) list2.subList(1, list.size()).toArray(new Scope[0]));
            }
            if (str5 != null) {
                googleSignInAccount.g = str5;
            }
            return googleSignInAccount;
        }
    }
}
