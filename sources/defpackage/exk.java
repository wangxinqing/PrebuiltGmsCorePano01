package defpackage;

import android.view.View;

/* renamed from: exk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exk implements ax {
    private final ext a;

    public exk(ext ext) {
        this.a = ext;
    }

    public final void a(Object obj) {
        ext ext = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View view = ext.c;
        int i = !booleanValue ? 8 : 0;
        view.setVisibility(i);
        ext.d.setVisibility(i);
    }
}
