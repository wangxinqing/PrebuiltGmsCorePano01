package defpackage;

import android.widget.ImageView;

/* renamed from: yrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yrn implements icm {
    final /* synthetic */ String a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ yrp c;

    public yrn(yrp yrp, String str, ImageView imageView) {
        this.c = yrp;
        this.a = str;
        this.b = imageView;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlj wlj = (wlj) icl;
        if (wlj.aO().c() && wlj.b() != null) {
            new yro(this.c, wlj.b(), this.a, this.b).execute(new Void[0]);
        }
    }
}
