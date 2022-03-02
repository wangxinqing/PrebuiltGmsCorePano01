package defpackage;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.devices.OptionalModuleActivityProxy$InstallCompleteReceiver;

/* renamed from: ttp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttp {
    public final bjs a;
    OptionalModuleActivityProxy$InstallCompleteReceiver b;
    private final ComponentName c;
    private final tvg d;

    public ttp(bjs bjs, String str, tvg tvg) {
        this.a = bjs;
        this.c = new ComponentName(bjs, str);
        this.d = tvg;
    }

    public final void a(Intent intent) {
        intent.setComponent(this.c);
        if (this.d.b()) {
            this.a.startActivity(intent);
            this.a.finish();
            return;
        }
        ((anih) tsp.a.d()).a("OptionalModule activity:%s for action: %s is not found, start downloading fastpair module", (Object) intent.getComponent().getClassName(), (Object) intent.getAction());
        this.b = new OptionalModuleActivityProxy$InstallCompleteReceiver(this.a, intent);
        this.d.a();
        bjs bjs = this.a;
        ProgressDialog.show(bjs, (CharSequence) null, bjs.getResources().getString(R.string.common_loading), false, true, new tto(this)).setCanceledOnTouchOutside(false);
    }

    public final void a(bjs bjs) {
        OptionalModuleActivityProxy$InstallCompleteReceiver optionalModuleActivityProxy$InstallCompleteReceiver = this.b;
        if (optionalModuleActivityProxy$InstallCompleteReceiver != null) {
            optionalModuleActivityProxy$InstallCompleteReceiver.a(bjs);
        }
    }
}
