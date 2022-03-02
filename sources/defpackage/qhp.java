package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: qhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhp extends qii {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhp(qij qij) {
        super(qij, "getApplicationIcon");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle, String str) {
        File f = this.b.e.f(str);
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (f != null) {
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open(f, 268435456);
            } catch (FileNotFoundException e) {
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("result", parcelFileDescriptor);
        return bundle2;
    }
}
