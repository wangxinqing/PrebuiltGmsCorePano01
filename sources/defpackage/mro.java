package defpackage;

import android.content.Context;
import android.widget.CompoundButton;

/* renamed from: mro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mro implements CompoundButton.OnCheckedChangeListener {
    private final mrt a;

    public mro(mrt mrt) {
        this.a = mrt;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        mrt mrt = this.a;
        mrt.d.c().edit().putBoolean("notification_settings_devcie", z).commit();
        Context context = mrt.getContext();
        Context context2 = mrt.getContext();
        boolean e = mrt.d.e();
        context.startService(arza.b(context2).setAction("com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS").putExtra("com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED", e).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED", mrt.d.d()));
        mtd.a(mrt.getContext(), asom.DEVICES_LIST_VIEW_NOTIFICATIONS_TOGGLED);
    }
}
