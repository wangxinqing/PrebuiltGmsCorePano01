package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: lcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lcf implements lbl {
    public final String a() {
        return "customPropertiesExtraHolder";
    }

    public final void a(DataHolder dataHolder) {
        Bundle bundle = dataHolder.f;
        if (bundle != null) {
            synchronized (dataHolder) {
                DataHolder dataHolder2 = (DataHolder) bundle.getParcelable("customPropertiesExtraHolder");
                if (dataHolder2 != null) {
                    dataHolder2.close();
                    bundle.remove("customPropertiesExtraHolder");
                }
            }
        }
    }
}
