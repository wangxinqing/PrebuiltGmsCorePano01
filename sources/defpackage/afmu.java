package defpackage;

import android.net.Uri;

/* renamed from: afmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afmu {
    public Uri a;
    public String b;
    public afmt c;
    public Integer d;
    public amzy e;

    public final void a(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void a(afmt afmt) {
        if (afmt != null) {
            this.c = afmt;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    public final void a(amzy amzy) {
        if (amzy != null) {
            this.e = amzy;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }
}
