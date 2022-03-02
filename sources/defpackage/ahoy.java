package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: ahoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoy {
    private static ahov a;

    public static synchronized ahov a() {
        ahov ahov;
        synchronized (ahoy.class) {
            ahov = a;
        }
        return ahov;
    }

    public static synchronized void a(Context context, ajaa ajaa, aizz aizz, aicn aicn) {
        synchronized (ahoy.class) {
            aiab a2 = aiab.a(aizz.b(), (ajrh) null);
            ExecutorService executorService = ((aiwu) ajaa).b;
            ahow ahow = new ahow(context);
            Account[] a3 = qub.a(context).a("com.google");
            String[] strArr = new String[a3.length];
            for (int i = 0; i < a3.length; i++) {
                strArr[i] = a3[i].name;
            }
            a = new ahov(context, a2, executorService, ahow, strArr, aicn);
        }
    }
}
