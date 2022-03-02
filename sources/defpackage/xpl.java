package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: xpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpl {
    public static final String[] a = {"https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.circles.write", "https://www.googleapis.com/auth/plus.media.upload", "https://www.googleapis.com/auth/plus.pages.manage", "https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.profiles.read", "https://www.googleapis.com/auth/plus.profiles.write", "https://www.googleapis.com/auth/plus.stream.read", "https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/plus.applications.manage", "https://www.googleapis.com/auth/plus.settings"};

    public static ClientContext a(Context context, Account account) {
        ClientContext clientContext;
        xip.a();
        if (Boolean.valueOf(ayrj.a.a().bF()).booleanValue()) {
            int myUid = Process.myUid();
            String str = account.name;
            String str2 = account.name;
            String packageName = context.getPackageName();
            clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        } else {
            clientContext = new ClientContext();
            clientContext.b = Process.myUid();
            clientContext.d = account;
            clientContext.c = account;
            clientContext.e = context.getPackageName();
            clientContext.f = context.getPackageName();
        }
        xip.a();
        String[] a2 = a(ayrj.a.a().b());
        if (a2.length > 0) {
            clientContext.a(a2);
        }
        clientContext.a("social_client_app_id", "80");
        return clientContext;
    }

    @Deprecated
    public static ClientContext a(Context context, String str, String str2) {
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        clientContext.a(a);
        clientContext.a("social_client_app_id", str2);
        return clientContext;
    }

    public static String[] a(String str) {
        return (String[]) anbs.a(amsk.a(',').b().a().a((CharSequence) str), String.class);
    }
}
