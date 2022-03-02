package defpackage;

import android.content.Context;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: ekx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekx {
    public static final iwd a = ehv.a("Change", "AccountStateStore");
    public static final fzh b = new ekw();
    public final Object c = new Object();
    public final Context d;
    public final String e;

    public ekx(Context context, String str) {
        iva.a((Object) context);
        this.d = context;
        iva.c(str);
        this.e = str;
    }

    public final synchronized void a(Map map) {
        iva.a((Object) map);
        synchronized (this.c) {
            FileOutputStream openFileOutput = this.d.openFileOutput(this.e, 0);
            try {
                aucd o = fyv.b.o();
                for (eku eku : map.values()) {
                    aucd o2 = fyt.d.o();
                    String str = eku.a.name;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    fyt fyt = (fyt) o2.b;
                    str.getClass();
                    fyt.a |= 1;
                    fyt.b = str;
                    String str2 = eku.a.type;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    fyt fyt2 = (fyt) o2.b;
                    str2.getClass();
                    fyt2.a |= 2;
                    fyt2.c = str2;
                    fyt fyt3 = (fyt) o2.i();
                    aucd o3 = fyu.e.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    fyu fyu = (fyu) o3.b;
                    fyt3.getClass();
                    fyu.b = fyt3;
                    int i = fyu.a | 1;
                    fyu.a = i;
                    String str3 = eku.b;
                    if (str3 != null) {
                        str3.getClass();
                        i |= 2;
                        fyu.a = i;
                        fyu.c = str3;
                    }
                    String str4 = eku.c;
                    if (str4 != null) {
                        str4.getClass();
                        fyu.a = i | 4;
                        fyu.d = str4;
                    }
                    fyu fyu2 = (fyu) o3.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    fyv fyv = (fyv) o.b;
                    fyu2.getClass();
                    if (!fyv.a.a()) {
                        fyv.a = aucj.a(fyv.a);
                    }
                    fyv.a.add(fyu2);
                }
                ((fyv) o.i()).a(openFileOutput);
                openFileOutput.close();
            } catch (IOException e2) {
                a.a((Throwable) e2);
            } catch (Throwable th) {
                try {
                    openFileOutput.close();
                } catch (IOException e3) {
                    a.a((Throwable) e3);
                }
                throw th;
            }
        }
    }
}
