package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: lbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lbu implements lbl {
    public final String a() {
        return "parentsExtraHolder";
    }

    public final void a(DataHolder dataHolder) {
        Bundle bundle = dataHolder.f;
        if (bundle != null) {
            synchronized (dataHolder) {
                DataHolder dataHolder2 = (DataHolder) bundle.getParcelable("parentsExtraHolder");
                if (dataHolder2 != null) {
                    dataHolder2.close();
                    bundle.remove("parentsExtraHolder");
                }
            }
        }
    }
}
