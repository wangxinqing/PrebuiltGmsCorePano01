package defpackage;

import android.widget.CompoundButton;

/* renamed from: lua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lua implements CompoundButton.OnCheckedChangeListener {
    private final lui a;

    public lua(lui lui) {
        this.a = lui;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        lui lui = this.a;
        lui.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH);
        lui.d.b(z);
    }
}
