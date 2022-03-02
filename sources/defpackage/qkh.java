package defpackage;

import android.os.Bundle;
import com.google.android.gms.instantapps.routing.InstantAppsChimeraContentProvider;
import java.io.IOException;

/* renamed from: qkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkh extends qfd {
    final /* synthetic */ InstantAppsChimeraContentProvider b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qkh(InstantAppsChimeraContentProvider instantAppsChimeraContentProvider) {
        super("getDomainFilterPackageMetadata");
        this.b = instantAppsChimeraContentProvider;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        String string;
        if (!this.b.a(qfc.a) || (string = bundle.getString("packageName")) == null) {
            return null;
        }
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putByteArray("result", this.b.e.b(string));
            return bundle2;
        } catch (IOException e) {
            qfp.a(this.b.getContext(), e.getMessage(), e, InstantAppsChimeraContentProvider.a);
            return null;
        }
    }
}
