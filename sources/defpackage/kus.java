package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: kus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kus implements icl, ici {
    public final Status a;
    public final jzt b;
    public final boolean c;

    public kus(Status status, jzt jzt, boolean z) {
        this.a = status;
        this.b = jzt;
        this.c = z;
    }

    public final Status aO() {
        return this.a;
    }

    public final void c() {
        jzt jzt = this.b;
        if (jzt != null) {
            jzt.c();
        }
    }
}
