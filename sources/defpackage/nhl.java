package defpackage;

import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: nhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhl {
    public static final nhl a = new nhl(0);
    public final nfz b;
    public final nfy c;
    public final int d;

    static {
        new FontMatchSpec("ResolvedFont FontMatchSpec For Failure");
    }

    private nhl() {
        this(0);
    }

    public static nhl a(int i) {
        return i != 0 ? new nhl(i) : a;
    }

    public final boolean a() {
        return this.c != null;
    }

    private nhl(int i) {
        this.b = null;
        this.c = null;
        this.d = i;
    }

    public nhl(nfz nfz, nfy nfy, int i) {
        iva.a((Object) nfz, (Object) "family");
        this.b = nfz;
        iva.a((Object) nfy, (Object) "font");
        this.c = nfy;
        this.d = i;
    }
}
