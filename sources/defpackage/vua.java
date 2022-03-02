package defpackage;

import android.view.View;

/* renamed from: vua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vua implements View.OnClickListener {
    private final vue a;
    private final vud b;
    private final Object c;

    public vua(vue vue, vud vud, Object obj) {
        this.a = vue;
        this.b = vud;
        this.c = obj;
    }

    public void onClick(View view) {
        vue vue = this.a;
        vud vud = this.b;
        vue.f.a(vud.a, this.c);
    }
}
