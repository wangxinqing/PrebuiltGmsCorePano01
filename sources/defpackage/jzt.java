package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: jzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzt extends ile {
    private jzs b;

    public jzt(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.f.setClassLoader(jzt.class.getClassLoader());
    }

    /* renamed from: b */
    public final jzr a(int i) {
        jzs jzs = this.b;
        if (jzs != null && jzs.b == i) {
            return jzs;
        }
        jzs jzs2 = new jzs(this.a, i);
        this.b = jzs2;
        return jzs2;
    }

    public final void c() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            lbm.a(dataHolder);
        }
        super.c();
    }
}
