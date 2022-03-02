package defpackage;

/* renamed from: wgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wgl extends wgh {
    String a;
    wcd b;
    wcx c;
    vtx d;
    String f;

    public final String toString() {
        boolean z;
        Object[] objArr = new Object[3];
        boolean z2 = false;
        objArr[0] = this.a;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        objArr[1] = Boolean.valueOf(z);
        if (this.c != null) {
            z2 = true;
        }
        objArr[2] = Boolean.valueOf(z2);
        return String.format("IncomingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s>", objArr);
    }
}
