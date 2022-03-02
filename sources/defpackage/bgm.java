package defpackage;

import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.clearcut.a;
import com.google.android.gms.ads.internal.clearcut.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* renamed from: bgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bgm {
    public static final ConditionVariable b = new ConditionVariable();
    protected static volatile b c = null;
    public static volatile Random e = null;
    public final bhm a;
    protected volatile Boolean d;

    public bgm(bhm bhm) {
        this.a = bhm;
        bhm.b.execute(new bgl(this));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            b.block();
            if (this.d.booleanValue() && c != null) {
                aucd o = com.google.ads.afma.b.i.o();
                String packageName = this.a.a.getPackageName();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                com.google.ads.afma.b bVar = (com.google.ads.afma.b) o.b;
                packageName.getClass();
                int i3 = bVar.a | 1;
                bVar.a = i3;
                bVar.b = packageName;
                int i4 = i3 | 2;
                bVar.a = i4;
                bVar.c = j;
                if (str != null) {
                    str.getClass();
                    bVar.a = i4 | 16;
                    bVar.f = str;
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    apev.a((Throwable) exc, new PrintWriter(stringWriter));
                    String stringWriter2 = stringWriter.toString();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    com.google.ads.afma.b bVar2 = (com.google.ads.afma.b) o.b;
                    stringWriter2.getClass();
                    bVar2.a |= 4;
                    bVar2.d = stringWriter2;
                    String name = exc.getClass().getName();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    com.google.ads.afma.b bVar3 = (com.google.ads.afma.b) o.b;
                    name.getClass();
                    bVar3.a |= 8;
                    bVar3.e = name;
                }
                a a2 = c.a(((com.google.ads.afma.b) o.i()).k());
                a2.b = i;
                if (i2 != -1) {
                    a2.a = i2;
                }
                a2.a();
            }
        } catch (Exception e2) {
        }
    }

    public final void a(int i, long j, String str) {
        a(i, -1, j, str, (Exception) null);
    }
}
