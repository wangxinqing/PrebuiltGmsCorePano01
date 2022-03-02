package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: atgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgm extends atgh {
    private final atgp a;

    public atgm(atgp atgp) {
        atfz atfz = atfz.a;
        atfy.a(atgp, "DataRequestDispatcher");
        this.a = atgp;
        atfy.a(atfz, "ProtoUtils");
    }

    public final int a() {
        return 62;
    }

    public final boolean b() {
        return false;
    }

    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atgm)) {
            return false;
        }
        atgp atgp = this.a;
        atgp atgp2 = ((atgm) obj).a;
        return atgp == atgp2 || atgp.equals(atgp2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 3 + String.valueOf(valueOf).length());
        sb.append("[");
        sb.append(simpleName);
        sb.append("@");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void a(DataOutputStream dataOutputStream) {
        this.a.p();
        atfz.a((OutputStream) dataOutputStream, (audx) this.a.o());
    }

    public final boolean a(DataInputStream dataInputStream) {
        this.a.a((avxk) atfz.a((auef) avxk.d.c(7), dataInputStream));
        return true;
    }
}
