package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: ato  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ato {
    final ByteArrayOutputStream a = new ByteArrayOutputStream();
    final DataOutputStream b = new DataOutputStream(this.a);
    public final int c;
    public final DataOutputStream d;

    public ato(int i, DataOutputStream dataOutputStream) {
        this.c = i;
        this.d = dataOutputStream;
    }
}
