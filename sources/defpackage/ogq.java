package defpackage;

import android.content.Intent;
import android.os.Build;
import android.view.View;

/* renamed from: ogq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ogq implements View.OnClickListener {
    private final ogs a;

    public ogq(ogs ogs) {
        this.a = ogs;
    }

    public void onClick(View view) {
        ogs ogs = this.a;
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("account_types", new String[]{"com.google"});
        ogs.b.startActivity(intent);
        okg.l(ogs.b);
    }
}
