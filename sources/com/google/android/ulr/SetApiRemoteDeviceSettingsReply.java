package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SetApiRemoteDeviceSettingsReply extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("remoteDeviceInfoSource", FastJsonResponse$Field.f("remoteDeviceInfoSource"));
        a.put("userSettings", FastJsonResponse$Field.a("userSettings", ApiUserSettings.class));
    }

    public final Map a() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiUserSettings getUserSettings() {
        return (ApiUserSettings) this.c.get("userSettings");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }
}
