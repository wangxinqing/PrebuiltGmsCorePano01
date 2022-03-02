package defpackage;

import java.util.List;

/* renamed from: qnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qnk implements acvv {
    private final List a;
    private final aucd b;

    public qnk(aucd aucd, List list) {
        this.b = aucd;
        this.a = list;
    }

    public final void a(Object obj) {
        aucd aucd = this.b;
        List list = this.a;
        Void voidR = (Void) obj;
        int i = qnn.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ansz ansz = ansz.k;
        ((ansz) aucd.b).h = ansx.a(3);
        int size = list.size();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((ansz) aucd.b).g = size;
        new Object[1][0] = Integer.valueOf(list.size());
    }
}
