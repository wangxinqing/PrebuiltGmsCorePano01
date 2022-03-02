package defpackage;

/* renamed from: agfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agfe {
    public final String a;

    public agfe(String str) {
        this.a = str;
    }

    public static agfe a(agfe agfe, agfe agfe2) {
        String valueOf = String.valueOf(agfe.a);
        String valueOf2 = String.valueOf(agfe2.a);
        return new agfe(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    public static String a(agfe agfe) {
        if (agfe != null) {
            return agfe.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agfe) {
            return this.a.equals(((agfe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public static agfe a(String str) {
        amrl.a((Object) str);
        return new agfe(str);
    }
}
