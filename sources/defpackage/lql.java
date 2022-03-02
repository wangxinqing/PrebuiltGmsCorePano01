package defpackage;

import com.google.android.gms.drive.query.SortOrder;

/* renamed from: lql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lql implements lqs {
    public final boolean a;
    private final String b;
    private final int c;

    public lql(String str, int i, boolean z) {
        iva.a((Object) str);
        this.b = str;
        this.c = i;
        this.a = z;
    }

    static int a(jzt jzt) {
        int a2 = jzt.a();
        int i = 0;
        while (a2 > i) {
            int i2 = (a2 + i) / 2;
            if (jzt.a(i2).e()) {
                i = i2 + 1;
            } else {
                a2 = i2;
            }
        }
        return i;
    }

    public final String a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract void a(liw liw);

    public final int b() {
        return this.c;
    }

    public final SortOrder c() {
        liw liw = new liw();
        a(liw);
        return new SortOrder(liw.a, this.a);
    }
}
