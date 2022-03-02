package defpackage;

import android.content.Context;

/* renamed from: ajhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhi {
    public final Context a;
    public ajhl b;
    public final ou c = new ou();

    public ajhi(Context context) {
        iva.a((Object) context);
        this.a = context;
    }

    public final void a() {
        b();
        c();
    }

    public final void b() {
        ajhl ajhl = this.b;
        if (ajhl != null) {
            ajhl.b();
            this.b = null;
        }
    }

    public final void c() {
        int i = 0;
        while (true) {
            ou ouVar = this.c;
            if (i < ouVar.h) {
                ((ajhl) ouVar.c(i)).b();
                i++;
            } else {
                ouVar.clear();
                return;
            }
        }
    }
}
