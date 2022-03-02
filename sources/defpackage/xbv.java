package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: xbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbv {
    public final DataHolder a;
    public final int b;
    public int c = -1;

    public xbv(DataHolder dataHolder) {
        this.a = dataHolder;
        this.b = dataHolder.h;
    }

    public final String a(String str) {
        DataHolder dataHolder = this.a;
        int i = this.c;
        return dataHolder.c(str, i, dataHolder.a(i));
    }

    public final boolean a() {
        int i = this.c + 1;
        this.c = i;
        return i >= 0 && i < this.b;
    }
}
