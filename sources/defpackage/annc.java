package defpackage;

import java.io.File;

/* renamed from: annc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class annc extends anmm {
    public final File a;
    public final anax b;

    public annc(File file, anna... annaArr) {
        amrl.a((Object) file);
        this.a = file;
        this.b = anax.a((Object[]) annaArr);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("Files.asByteSink(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
