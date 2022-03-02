package defpackage;

/* renamed from: avog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avog implements auco {
    RTC_VERSION_UNSET(1),
    TELEPHONY_TYPE_UNSET(2),
    USING_WIFI_UNSET(3),
    BACKGROUND_DATA_ON_UNSET(4),
    BATTERY_LEVEL_UNSET(5),
    WIFI_SIGNAL_STRENGTH_UNSET(6),
    NETWORK_METERED_UNSET(7),
    ACCESSIBILITY_MODE_UNSET(8),
    NETWORK_VOLTE_ENABLED_UNSET(9),
    PHONE_TYPE_UNSET(10);
    
    private final int k;

    private avog(int i) {
        this.k = i;
    }

    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}
