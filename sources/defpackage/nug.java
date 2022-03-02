package defpackage;

/* renamed from: nug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class nug {
    final ntx c;
    final String d;
    final int e;

    public nug(amnc amnc) {
        this.c = ntx.a(amnc);
        String str = amnc.h;
        iva.a((Object) str);
        this.d = str;
        this.e = amnc.q;
    }

    public abstract int a();

    /* access modifiers changed from: package-private */
    public final boolean a(amnc amnc) {
        return a(ntx.a(amnc), amnc.h);
    }

    public String toString() {
        String str;
        ntx ntx = this.c;
        String str2 = this.d;
        int a = a();
        String valueOf = String.valueOf(ntx);
        if (a == 0) {
            str = "null";
        } else if (a == 0) {
            throw null;
        } else if (a != 0) {
            str = Integer.toString(a - 1);
        } else {
            throw null;
        }
        String valueOf2 = String.valueOf(str);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
        sb.append("QueuedMessage for ");
        sb.append(valueOf);
        sb.append(" id=");
        sb.append(str2);
        sb.append(" reason=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ntx ntx, String str) {
        return this.c.equals(ntx) && this.d.equals(str);
    }
}
