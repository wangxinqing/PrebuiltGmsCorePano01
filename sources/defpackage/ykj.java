package defpackage;

import android.provider.DeviceConfig;

/* renamed from: ykj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ykj implements DeviceConfig.OnPropertiesChangedListener {
    private final ykk a;

    public ykj(ykk ykk) {
        this.a = ykk;
    }

    public final void onPropertiesChanged(DeviceConfig.Properties properties) {
        ykk ykk = this.a;
        if (ykg.b() && "rescue_party_namespace".equals(properties.getNamespace())) {
            for (String str : properties.getKeyset()) {
                String string = properties.getString(str, (String) null);
                if (str.contains("reset_platform_package") && string != null) {
                    ykk.a(str, string);
                }
            }
        }
    }
}
