package defpackage;

import java.util.List;

/* renamed from: ahhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahhy {
    private Integer a;
    private List b;

    /* access modifiers changed from: package-private */
    public final ahhz a() {
        String str = this.a == null ? " violationType" : "";
        if (this.b == null) {
            str = str.concat(" stackTrace");
        }
        if (str.isEmpty()) {
            return new ahhl(this.a.intValue(), this.b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null stackTrace");
    }
}
