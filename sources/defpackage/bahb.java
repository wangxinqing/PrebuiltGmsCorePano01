package defpackage;

import java.util.ArrayList;

/* renamed from: bahb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bahb {
    private final ArrayList a = new ArrayList();

    public final void a(Object obj) {
        this.a.add(obj);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void a(String str, Object obj) {
        ArrayList arrayList = this.a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        arrayList.add(sb.toString());
    }
}
