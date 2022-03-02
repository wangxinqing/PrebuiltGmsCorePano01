package defpackage;

import android.content.Context;
import com.google.ads.afma.b;
import java.util.concurrent.Executor;

/* renamed from: nnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnt {
    public static volatile int a = 1;
    private final Context b;
    private final Executor c;
    private final acwa d;

    public nnt(Context context, Executor executor, acwa acwa) {
        this.b = context;
        this.c = executor;
        this.d = acwa;
    }

    public final void a(int i, long j) {
        a(i, j, (Exception) null, (String) null, (String) null);
    }

    public final void a(int i, long j, Exception exc) {
        a(i, j, exc, (String) null, (String) null);
    }

    public final void a(int i, long j, Exception exc, String str, String str2) {
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
        int i3 = a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        b bVar2 = (b) o.b;
        int i4 = i3 - 1;
        if (i3 != 0) {
            bVar2.h = i4;
            bVar2.a |= 2048;
            if (exc != null) {
                String d2 = amtb.d(exc);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                b bVar3 = (b) o.b;
                d2.getClass();
                bVar3.a |= 4;
                bVar3.d = d2;
                String name = exc.getClass().getName();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                b bVar4 = (b) o.b;
                name.getClass();
                bVar4.a |= 8;
                bVar4.e = name;
            }
            if (str2 != null) {
                b bVar5 = (b) o.b;
                str2.getClass();
                bVar5.a |= 16;
                bVar5.f = str2;
            }
            if (str != null) {
                b bVar6 = (b) o.b;
                str.getClass();
                bVar6.a |= 1024;
                bVar6.g = str;
            }
            this.d.a(this.c, (acvf) new nns(o, i));
            return;
        }
        throw null;
    }
}
