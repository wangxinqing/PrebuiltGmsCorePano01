package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: zks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zks extends ClickableSpan {
    final /* synthetic */ zkt a;

    public zks(zkt zkt) {
        this.a = zkt;
    }

    public void onClick(View view) {
        zkt zkt = this.a;
        zkt.c = zkt.e.isChecked();
        zkt zkt2 = this.a;
        zkt2.d = zkt2.e.isEnabled();
        this.a.i.l();
    }
}
