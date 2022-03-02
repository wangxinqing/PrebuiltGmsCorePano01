package defpackage;

import java.util.Arrays;

/* renamed from: aure  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aure extends aurf {
    private final String a;

    public aure(String str) {
        amrl.a((Object) str);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aurf aurf = (aurf) obj;
        if (aurf.a() != 3) {
            return 3 - aurf.a();
        }
        aure aure = (aure) aurf;
        if (this.a.length() != aure.a.length()) {
            return this.a.length() - aure.a.length();
        }
        return this.a.compareTo(aure.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((aure) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.a});
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }
}
