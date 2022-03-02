package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: tku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tku {
    public final tlk a;
    public final aoru b = tid.b();

    public tku(Context context) {
        tpm tpm = new tpm(context);
        this.a = tpm;
        ((anih) ((anih) tky.a.d()).a("tku", "<init>", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Instantiated ServiceControllerRouter %s.", (Object) this);
    }

    public static final byte[] a(String str, byte[] bArr) {
        String str2;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        if (!jlh.d(str)) {
            return str.getBytes(tlh.a);
        }
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        if (str4.startsWith(str3)) {
            str2 = jlh.c(str4);
        } else {
            String c = jlh.c(str3);
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1 + String.valueOf(str4).length());
            sb.append(c);
            sb.append(" ");
            sb.append(str4);
            str2 = sb.toString();
        }
        return str2.getBytes(tlh.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.a.a();
        ((anih) ((anih) tky.a.d()).a("tku", "b", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Completed shutdown of ServiceControllerRouter %s.", (Object) this);
    }

    public final void c(tlh tlh, boolean z) {
        a((Runnable) new tkm(this, tlh, z));
    }

    public final void d(tlh tlh, boolean z) {
        a((Runnable) new tko(this, tlh, z));
    }

    public final void b(tlh tlh, boolean z) {
        int i;
        if (tlh.k()) {
            tlk tlk = this.a;
            if (!z) {
                i = 8040;
            } else {
                i = 8041;
            }
            tlk.b(tlh, i);
        }
    }

    tku(tlk tlk) {
        this.a = tlk;
        ((anih) ((anih) tky.a.d()).a("tku", "<init>", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Instantiated ServiceControllerRouter %s.", (Object) this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Integer a(AcceptConnectionRequestParams acceptConnectionRequestParams, tlh tlh) {
        String str = acceptConnectionRequestParams.c;
        if (tlh.e(str)) {
            return 8003;
        }
        if (!tlh.g(str)) {
            return Integer.valueOf(this.a.a(tlh, str, acceptConnectionRequestParams.d, acceptConnectionRequestParams.e));
        }
        ((anih) ((anih) tky.a.c()).a("tku", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Client %d invoked acceptConnectionRequest() after having already accepted/rejected the connection to %s.", tlh.b(), (Object) str);
        return 8009;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Integer a(RejectConnectionRequestParams rejectConnectionRequestParams, tlh tlh) {
        String str = rejectConnectionRequestParams.b;
        if (tlh.e(str)) {
            return 8003;
        }
        if (!tlh.g(str)) {
            return Integer.valueOf(this.a.a(tlh, str));
        }
        ((anih) ((anih) tky.a.c()).a("tku", "a", 262, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Client %d invoked rejectConnectionRequest() after having already accepted/rejected the connection to %s.", tlh.b(), (Object) str);
        return 8009;
    }

    public final void a() {
        ((anih) ((anih) tky.a.d()).a("tku", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of ServiceControllerRouter %s.", (Object) this);
        a((Runnable) new tke(this));
        tid.a(this.b, "ServiceControllerRouter.offBinderSerializer");
    }

    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void a(tlh tlh) {
        for (String c : tlh.p()) {
            this.a.c(tlh, c);
        }
        for (String c2 : tlh.o()) {
            this.a.c(tlh, c2);
        }
        a(tlh, false);
        b(tlh, false);
        tlh.f();
        this.a.b();
    }

    public final void a(tlh tlh, boolean z) {
        int i;
        if (tlh.g()) {
            tlk tlk = this.a;
            if (!z) {
                i = 8040;
            } else {
                i = 8041;
            }
            tlk.a(tlh, i);
        }
    }

    public final void a(uha uha, Callable callable) {
        this.b.execute(new tkj(callable, uha));
    }
}
