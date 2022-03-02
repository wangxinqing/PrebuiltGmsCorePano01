package defpackage;

import android.content.Context;
import com.google.ads.afma.b;

/* renamed from: noa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class noa {
    private final hol a;
    private final Context b;

    public noa(Context context, hol hol) {
        this.a = hol;
        this.b = context;
    }

    public static noa a(Context context) {
        return new noa(context, hol.a(context, "GLAS"));
    }

    public final void a(int i, long j) {
        a(i, j, (Exception) null);
    }

    public final void a(int i, long j, Exception exc) {
        aucd o = b.i.o();
        String packageName = this.b.getPackageName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        b bVar = (b) o.b;
        packageName.getClass();
        int i2 = bVar.a | 1;
        bVar.a = i2;
        bVar.b = packageName;
        bVar.a = i2 | 2;
        bVar.c = j;
        if (exc != null) {
            String name = exc.getClass().getName();
            if (o.c) {
                o.c();
                o.c = false;
            }
            b bVar2 = (b) o.b;
            name.getClass();
            bVar2.a |= 8;
            bVar2.e = name;
        }
        hoi a2 = this.a.a(((b) o.i()).k());
        a2.b(i);
        a2.b();
    }
}
