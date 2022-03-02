package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: whl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class whl implements Callable {
    private final Context a;

    public whl(Context context) {
        this.a = context;
    }

    public final Object call() {
        Context context = this.a;
        ArrayList arrayList = new ArrayList(jgu.d(context, context.getPackageName()));
        if (!ayni.a.a().be()) {
            try {
                arrayList.removeAll(Arrays.asList(eig.a(context, "com.google", new String[]{aeea.a("usm")})));
            } catch (eif | IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a(e);
                ((anih) anih.a("who", "c", 394, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to remove unicorn accounts.");
                return new ArrayList();
            }
        }
        if (ayni.M()) {
            return arrayList;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            for (Account account : (Account[]) qub.a(context).a("com.google", new String[]{"service_HOSTED"}).getResult()) {
                if (!ayni.M()) {
                    if (!ayni.a.a().by() || !account.name.endsWith("@google.com")) {
                        arrayList2.add(account);
                    }
                }
            }
            arrayList.removeAll(arrayList2);
            return arrayList;
        } catch (IOException e2) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e2);
            ((anih) anih2.a("who", "c", 420, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to remove dasher accounts.");
            return new ArrayList();
        }
    }
}
