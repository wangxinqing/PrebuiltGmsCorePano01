package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: agi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agi {
    public final agg a = new agg();
    private final Intent b = new Intent("android.intent.action.VIEW");

    public final agj a() {
        if (!this.b.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            fy.a(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
            this.b.putExtras(bundle);
        }
        this.b.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Intent intent = this.b;
        agh agh = new agh(this.a.a);
        Bundle bundle2 = new Bundle();
        Integer num = agh.a;
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        return new agj(this.b);
    }
}
