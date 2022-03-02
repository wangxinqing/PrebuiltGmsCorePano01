package defpackage;

import android.content.Intent;
import android.os.Build;
import android.view.View;

/* renamed from: xsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsp implements View.OnClickListener {
    private final xst a;

    public xsp(xst xst) {
        this.a = xst;
    }

    public void onClick(View view) {
        xst xst = this.a;
        if (Build.VERSION.SDK_INT >= 26) {
            xst.a(3);
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", xst.getActivity().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", xxc.a());
            xst.startActivity(intent);
        }
    }
}
