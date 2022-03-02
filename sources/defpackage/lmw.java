package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: lmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmw extends ile {
    public lmw(DataHolder dataHolder) {
        super(dataHolder);
    }

    public final Object a(int i) {
        DataHolder dataHolder = this.a;
        int a = dataHolder.a(i);
        int b = dataHolder.b("valueType", i, a);
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            dataHolder.c("value", i, a);
            dataHolder.c("refType", i, a);
            throw null;
        } else if (b == 2) {
            return lmv.a(dataHolder.c("value", i, a));
        } else {
            if (b == 3) {
                return dataHolder.c("value", i, a);
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown object type: ");
            sb.append(b);
            throw new IllegalStateException(sb.toString());
        }
    }
}
