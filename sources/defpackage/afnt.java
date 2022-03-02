package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afnt {
    public final Context a;
    public final afpi b;
    public final afqr c;
    public final afqu d;
    public final afsb e;
    public final aekn f;
    public final amri g;
    public final afmh h;
    public final Executor i;
    private final agzs j;

    public afnt(Context context, afpi afpi, afqr afqr, afqu afqu, afsb afsb, aekn aekn, agzs agzs, amri amri, afmh afmh, Executor executor) {
        this.a = context;
        this.b = afpi;
        this.c = afqr;
        this.d = afqu;
        this.e = afsb;
        this.f = aekn;
        this.j = agzs;
        this.g = amri;
        this.h = afmh;
        this.i = executor;
    }

    public final int a(Uri uri, List list) {
        int i2;
        try {
            if (!this.j.c(uri)) {
                return 0;
            }
            i2 = 0;
            for (Uri uri2 : this.j.f(uri)) {
                try {
                    try {
                        if (!list.contains(uri2)) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                        break;
                                    }
                                } else if (!this.j.d(uri2)) {
                                    uri2.getPath();
                                    this.j.a(uri2);
                                    i2++;
                                } else {
                                    i2 += a(uri2, list);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        this.e.b(1059);
                        afsh.a((Throwable) e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            }
            return i2;
        } catch (IOException e4) {
            e = e4;
            i2 = 0;
            this.e.b(1059);
            afsh.a((Throwable) e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
            return i2;
        }
    }
}
