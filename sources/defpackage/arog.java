package defpackage;

import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: arog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arog extends aroc {
    private final ContextHubManager a;

    public arog(ContextHubManager contextHubManager) {
        this.a = contextHubManager;
    }

    public final arnk a(ContextHubInfo contextHubInfo, arnh arnh) {
        return null;
    }

    public final arnk a(ContextHubInfo contextHubInfo, arnh arnh, int i, int i2, byte[] bArr) {
        return null;
    }

    public final arnk a(ContextHubInfo contextHubInfo, byte[] bArr) {
        return null;
    }

    public final List a(ContextHubInfo contextHubInfo) {
        return null;
    }

    public final Integer b(ContextHubInfo contextHubInfo, arnh arnh) {
        return null;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (int contextHubInfo : this.a.getContextHubHandles()) {
            arrayList.add(this.a.getContextHubInfo(contextHubInfo));
        }
        return arrayList;
    }
}
