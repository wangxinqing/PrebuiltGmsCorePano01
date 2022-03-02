package defpackage;

import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: fil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fil implements fcu {
    private final String a;

    public fil(String str) {
        iva.c(str);
        this.a = str;
    }

    public final aorr a(fde fde) {
        try {
            fgy fgy = (fgy) fgy.a.a();
            String str = this.a;
            synchronized (fgy.b) {
                String a2 = fgy.a(str);
                anax c = amym.a((Iterable) anfx.a.a((Iterable) amym.a(amym.a((Iterable) fgy.c.getStringSet(a2, new HashSet())).a(fgs.a).a(), Arrays.asList(new Long[]{Long.valueOf(System.currentTimeMillis())})), (int) awnp.b())).a(fgt.a).c();
                fgy.c.edit().putStringSet(a2, c).apply();
                c.size();
            }
            return aorl.a((Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            throw qbf.a(28442);
        }
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_RECORD_CANCELLED_SIGN_IN;
    }
}
