package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: chs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chs {
    public static int a(ContextManagerClientInfo contextManagerClientInfo, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        chr chr = new chr(countDownLatch);
        Object[] objArr = {countDownLatch, str};
        cbl w = cbi.w();
        bsz a = contextManagerClientInfo.a();
        bwn k = cbi.k();
        bvp a2 = bvq.a("NetworkManager#getConfig");
        a2.f();
        new cbw(w.a, a, chr, k, str).a(a2);
        try {
            if (!countDownLatch.await(10, TimeUnit.SECONDS)) {
                return 7;
            }
            Object[] objArr2 = {countDownLatch, Integer.toString(chr.b)};
            int i = chr.b;
            if (i == 0) {
                long a3 = cbi.i().a();
                Object[] objArr3 = {str, Long.valueOf(a3)};
                cbi.j().a.edit().putLong(str, a3).apply();
                return 0;
            } else if (i != 12) {
                return 7;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
                sb.append("Invalid API Key for package = ");
                sb.append(str);
                sb.append(". Status code received = ");
                sb.append(i);
                throw new SecurityException(sb.toString());
            }
        } catch (InterruptedException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("chs", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManager3PCredentialsVerifier] InterruptedException:Could not validate the API Key for package.");
            return 7;
        }
    }
}
