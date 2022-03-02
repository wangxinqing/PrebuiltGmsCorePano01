package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* renamed from: baue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baue implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        CronetProvider cronetProvider = (CronetProvider) obj;
        CronetProvider cronetProvider2 = (CronetProvider) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
    }
}
