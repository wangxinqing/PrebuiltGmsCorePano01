package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: pxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxa {
    public static String a(osz osz) {
        if (oxe.a(osz.c)) {
            return osz.c;
        }
        if ((((Boolean) pba.m.c()).booleanValue() && "com.google.android.gms".equals(osz.e)) || (((Boolean) pba.n.c()).booleanValue() && ozq.f(osz))) {
            return osz.c;
        }
        if (!((Boolean) pba.q.c()).booleanValue()) {
            return null;
        }
        if (!osz.c.startsWith("messages/")) {
            return osz.c;
        }
        String[] split = TextUtils.split(osz.c, "/");
        if (split.length != 3) {
            return null;
        }
        String str = split[0];
        String decode = Uri.decode(split[1]);
        Account account = new Account(Uri.decode(split[2]), decode);
        anlj a = anln.b().a();
        a.a(account.type, amqn.c);
        a.a(account.name, amqn.c);
        return TextUtils.join("/", Arrays.asList(new String[]{str, decode, a.a().toString()}));
    }
}
