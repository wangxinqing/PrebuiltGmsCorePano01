package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: tuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tuj extends arwm {
    final /* synthetic */ Context a;
    final /* synthetic */ tzi b;
    final /* synthetic */ String c;
    final /* synthetic */ asqm d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tuj(String str, Context context, tzi tzi, String str2, asqm asqm) {
        super(str);
        this.a = context;
        this.b = tzi;
        this.c = str2;
        this.d = asqm;
    }

    public final void run() {
        ttf ttf = (ttf) thl.a(this.a, ttf.class);
        String str = this.b.b;
        String str2 = this.c;
        tzi a2 = ttf.a(str);
        if (a2 != null) {
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            long a3 = ((jiq) thl.a(ttf.e, jiq.class)).a();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tzi tzi = (tzi) aucd.b;
            int i = tzi.a | 64;
            tzi.a = i;
            tzi.h = a3;
            str2.getClass();
            int i2 = i | 32;
            tzi.a = i2;
            tzi.g = str2;
            tzi.a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            tzi.j = true;
            ttf.a((tzi) aucd.i());
        }
        ((ttf) thl.a(this.a, ttf.class)).a(this.b.b, this.d.b);
    }
}
