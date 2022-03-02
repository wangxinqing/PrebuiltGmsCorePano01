package defpackage;

import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: msq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msq implements amsv {
    private final mta a;
    private final TrueWirelessHeadset b;

    public msq(mta mta, TrueWirelessHeadset trueWirelessHeadset) {
        this.a = mta;
        this.b = trueWirelessHeadset;
    }

    public final Object a() {
        return this.a.getString(R.string.fast_pair_accessibility_battery_level_left, Integer.valueOf(this.b.b().b()));
    }
}
