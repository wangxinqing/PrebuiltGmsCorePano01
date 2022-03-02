package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: txg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class txg implements amsv {
    private final Context a;
    private final TrueWirelessHeadset b;

    public txg(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        this.a = context;
        this.b = trueWirelessHeadset;
    }

    public final Object a() {
        return this.a.getString(R.string.fast_pair_accessibility_battery_level_case, new Object[]{Integer.valueOf(this.b.d().b())});
    }
}
