package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hem implements bkm, cqi {
    private static volatile hem b = null;
    public final List a = new ArrayList();

    public static hem a() {
        hem hem = b;
        if (hem == null) {
            synchronized (hem.class) {
                hem = b;
                if (hem == null) {
                    hem = new hem();
                    bla.a((bkm) hem, true);
                    b = hem;
                }
            }
        }
        return hem;
    }

    public final void b(Context context, int i, String str) {
        a(context, i != 1 ? i != 2 ? i != 3 ? 77 : 76 : 75 : 74, str);
    }

    public final void a(Context context, int i) {
        a(context, i, (String) null, (Iterable) null);
    }

    public final void a(Context context, int i, String str) {
        a(context, i, str, (Iterable) null);
    }

    public final void a(Context context, int i, String str, Iterable iterable) {
        int i2 = i - 1;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("[");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        Log.i("ChmraDebugLogger", sb.toString());
        aucd o = aohl.u.o();
        aogg aogg = (aogg) aogj.f.o();
        if (aogg.c) {
            aogg.c();
            aogg.c = false;
        }
        aogj aogj = (aogj) aogg.b;
        aogj.b = i2;
        aogj.a |= 1;
        if (str != null) {
            if (str.length() > 128) {
                str = str.substring(0, 128);
            }
            if (aogg.c) {
                aogg.c();
                aogg.c = false;
            }
            aogj aogj2 = (aogj) aogg.b;
            str.getClass();
            aogj2.a |= 2;
            aogj2.c = str;
        }
        if (iterable != null) {
            aogj aogj3 = (aogj) aogg.b;
            if (!aogj3.d.a()) {
                aogj3.d = aucj.a(aogj3.d);
            }
            auab.a(iterable, (List) aogj3.d);
        }
        if (awxs.g()) {
            synchronized (this.a) {
                int size = this.a.size();
                if (size > 0) {
                    if (size > 9) {
                        int i3 = size - 9;
                        for (int i4 = i3; i4 < size; i4++) {
                            aogg.a((String) this.a.get(i4));
                        }
                        StringBuilder sb2 = new StringBuilder(21);
                        sb2.append("truncated ");
                        sb2.append(i3);
                        aogg.a(sb2.toString());
                    } else {
                        List list = this.a;
                        if (aogg.c) {
                            aogg.c();
                            aogg.c = false;
                        }
                        aogj aogj4 = (aogj) aogg.b;
                        aogj4.a();
                        auab.a((Iterable) list, (List) aogj4.e);
                    }
                }
            }
        }
        aogj aogj5 = (aogj) aogg.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohl aohl = (aohl) o.b;
        aogj5.getClass();
        aohl.j = aogj5;
        aohl.a |= 16;
        FileApkIntentOperation.a(context, 20, ((aohl) o.i()).k());
    }
}
