package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: obg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obg extends LinearLayout {
    private List a;

    public obg(Context context) {
        super(context);
    }

    public final void a(ocz ocz) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(ocz);
    }

    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            List list = this.a;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ocz) list.get(i2)).e();
                }
            }
        }
    }
}
