package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

@Deprecated
/* renamed from: ixk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ixk {
    public static final ixk a;
    public final jhr b;
    private final Context c;
    private final ClientContext d;

    static {
        ClientContext clientContext = new ClientContext();
        clientContext.b = jhg.a;
        clientContext.e = "com.google.android.gms";
        a = a((Context) ihs.b(), clientContext);
    }

    protected ixk(Context context, ClientContext clientContext) {
        boolean z;
        jhr a2 = jhr.a(context);
        iva.a((Object) a2);
        this.b = a2;
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) clientContext);
        this.d = clientContext;
        if (clientContext.b >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Calling UID is not available.");
        iva.a((Object) this.d.e, (Object) "Calling package name is not available.");
    }

    public static ixk a(Context context, ClientContext clientContext) {
        return new ixk(context, clientContext);
    }

    public final int a(String str) {
        return a(str, true);
    }

    public final int a(String str, boolean z) {
        String a2;
        ClientContext clientContext = this.d;
        int i = clientContext.j;
        if (i >= 0) {
            jnh b2 = jni.b(this.c);
            ClientContext clientContext2 = this.d;
            return b2.a(str, i, clientContext2.b, clientContext2.e);
        }
        String str2 = clientContext.e;
        if (jni.b(this.c).a(str, str2) == -1) {
            return -1;
        }
        int i2 = this.d.b;
        if (!jkr.b() || (a2 = this.b.a(str)) == null) {
            return 0;
        }
        if ((!z ? this.b.d(a2, i2, str2) : this.b.c(a2, i2, str2)) != 0) {
            return -2;
        }
        return 0;
    }
}
