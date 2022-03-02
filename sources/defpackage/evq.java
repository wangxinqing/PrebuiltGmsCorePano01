package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: evq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evq implements fcu {
    public final String a;
    public final BeginSignInRequest b;
    private final Context c;
    private final String d;
    private final hol e;

    public evq(Context context, String str, String str2, BeginSignInRequest beginSignInRequest, hol hol) {
        iva.a((Object) context);
        this.c = context;
        iva.c(str);
        this.d = str;
        iva.c(str2);
        this.a = str2;
        iva.a((Object) beginSignInRequest);
        this.b = beginSignInRequest;
        this.e = hol;
    }

    public final aorr a(fde fde) {
        aucd o = antp.e.o();
        aucd o2 = antn.d.o();
        boolean z = this.b.b.a;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        antn antn = (antn) o2.b;
        int i = antn.a | 1;
        antn.a = i;
        antn.b = z;
        boolean z2 = this.b.b.d;
        antn.a = i | 2;
        antn.c = z2;
        antn antn2 = (antn) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antp antp = (antp) o.b;
        antn2.getClass();
        antp.c = antn2;
        antp.a |= 2;
        aucd o3 = anto.c.o();
        boolean z3 = this.b.a.a;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anto anto = (anto) o3.b;
        anto.a |= 1;
        anto.b = z3;
        anto anto2 = (anto) o3.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antp antp2 = (antp) o.b;
        anto2.getClass();
        antp2.b = anto2;
        int i2 = antp2.a | 1;
        antp2.a = i2;
        String str = this.d;
        str.getClass();
        antp2.a = i2 | 4;
        antp2.d = str;
        antp antp3 = (antp) o.i();
        hol hol = this.e;
        aucd o4 = anty.n.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        anty anty = (anty) o4.b;
        anty.b = 9;
        int i3 = anty.a | 1;
        anty.a = i3;
        String str2 = this.a;
        str2.getClass();
        int i4 = i3 | 2;
        anty.a = i4;
        anty.c = str2;
        antp3.getClass();
        anty.j = antp3;
        anty.a = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        hol.a((audx) o4.i()).b();
        try {
            if (((fgy) fgy.a.a()).a(this.d, (int) awnp.a.a().a(), TimeUnit.MINUTES) < awnp.b()) {
                return aopr.a(new fib(this.c, this.d, this.b).a(fde), (amqy) new evp(this), (Executor) aoqm.a);
            }
            throw qbf.a(28436);
        } catch (PackageManager.NameNotFoundException e2) {
            throw qbf.a(28442);
        }
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_BEGIN_SIGNIN;
    }
}
