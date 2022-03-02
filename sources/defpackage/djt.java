package defpackage;

import android.view.View;

/* renamed from: djt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class djt implements View.OnClickListener {
    private final djx a;

    public djt(djx djx) {
        this.a = djx;
    }

    public void onClick(View view) {
        djx djx = this.a;
        djw djw = djx.c;
        if (djw != null) {
            djw.a(djx, 1);
        }
    }
}
