package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: cyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cyy implements View.OnClickListener {
    private final Uri a;

    public cyy(Uri uri) {
        this.a = uri;
    }

    public void onClick(View view) {
        Uri uri = this.a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        view.getContext().startActivity(intent);
    }
}
