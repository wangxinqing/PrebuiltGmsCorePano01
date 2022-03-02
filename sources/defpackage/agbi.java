package defpackage;

/* renamed from: agbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agbi extends agbl {
    private final String a;
    private final String b;
    private final boolean c;

    public agbi(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return null;
    }

    public final String d() {
        return null;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agbl)) {
            return false;
        }
        agbl agbl = (agbl) obj;
        String str = this.a;
        if (str == null ? agbl.a() == null : str.equals(agbl.a())) {
            return this.b.equals(agbl.b()) && agbl.c() == null && agbl.d() == null && this.c == agbl.e() && agbl.f() == null;
        }
    }

    public final String f() {
        return null;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 583896283) ^ (!this.c ? 1237 : 1231)) * 1000003;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf((Object) null).length();
        StringBuilder sb = new StringBuilder(length + 99 + length2 + length3 + String.valueOf((Object) null).length() + String.valueOf((Object) null).length());
        sb.append("DeviceOwner{displayName=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", givenName=null, familyName=null, isG1User=");
        sb.append(z);
        sb.append(", obfuscatedGaiaId=null}");
        return sb.toString();
    }
}
