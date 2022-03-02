package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: txh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class txh implements amsv {
    private final Context a;
    private final TrueWirelessHeadset b;

    public txh(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        this.a = context;
        this.b = trueWirelessHeadset;
    }

    public final Object a() {
        return this.a.getString(R.string.fast_pair_accessibility_battery_level_right, new Object[]{Integer.valueOf(this.b.c().b())});
    }
}
