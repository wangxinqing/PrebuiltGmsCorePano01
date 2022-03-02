package defpackage;

import java.util.List;

/* renamed from: ind  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ind implements Runnable {
    private final List a;
    private final inb b;
    private final ilw c;

    public ind(List list, inb inb, ilw ilw) {
        this.a = list;
        this.b = inb;
        this.c = ilw;
    }

    public final void run() {
        List list = this.a;
        inb inb = this.b;
        ilw ilw = this.c;
        int i = ing.a;
        try {
            boolean a2 = ing.a(list, inb);
            try {
                ilw.close();
            } finally {
                if (a2 && awyw.i()) {
                    inm.a(inb);
                }
            }
        } catch (Throwable th) {
            ilw.close();
            throw th;
        }
    }
}
