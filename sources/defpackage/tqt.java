package defpackage;

import com.google.android.gms.nearby.connection.Strategy;
import java.util.Arrays;
import java.util.List;

/* renamed from: tqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class tqt extends tql {
    public tqt(tph tph, tob tob, tnq tnq, tlt tlt) {
        super(tph, tob, tnq, tlt);
    }

    /* access modifiers changed from: protected */
    public boolean c(tlh tlh) {
        return !e(tlh) && !f(tlh);
    }

    /* access modifiers changed from: protected */
    public List d() {
        return Arrays.asList(new asoe[]{asoe.WEB_RTC, asoe.WIFI_LAN, asoe.WIFI_DIRECT, asoe.WIFI_HOTSPOT, asoe.BLUETOOTH, asoe.BLE, asoe.NFC});
    }

    /* access modifiers changed from: protected */
    public asoe e() {
        return asoe.WIFI_HOTSPOT;
    }

    public Strategy g() {
        return Strategy.b;
    }

    public int h() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public boolean d(tlh tlh) {
        return !e(tlh);
    }
}
