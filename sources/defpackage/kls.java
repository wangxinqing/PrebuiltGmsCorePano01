package defpackage;

import android.content.ContentValues;

/* renamed from: kls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kls extends kqi {
    private final String a;

    public kls(kqg kqg, String str) {
        super(kqg, klv.a, false);
        iva.c(str);
        this.a = str;
    }

    public final kqy a() {
        return klu.FILENAME.b.b(this.a);
    }

    /* access modifiers changed from: protected */
    public final void b(ContentValues contentValues) {
        contentValues.put(klu.FILENAME.b.a(), this.a);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("ContentFileDeletionLock [filename='");
        sb.append(str);
        sb.append("']");
        return sb.toString();
    }
}
