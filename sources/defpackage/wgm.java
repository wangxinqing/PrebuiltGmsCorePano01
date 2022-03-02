package defpackage;

/* renamed from: wgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wgm extends wgh {
    String a;
    wcd b;
    wcx c;
    vtx d;
    String f;
    boolean g;
    tjc[] h = new tjc[0];
    tjc[] i = new tjc[0];
    tjc[] j = new tjc[0];

    public final String toString() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[7];
        boolean z3 = false;
        objArr[0] = this.a;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        objArr[1] = Boolean.valueOf(z);
        if (this.c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        objArr[2] = Boolean.valueOf(z2);
        if (this.d != null) {
            z3 = true;
        }
        objArr[3] = Boolean.valueOf(z3);
        objArr[4] = Integer.valueOf(this.h.length);
        objArr[5] = Integer.valueOf(this.i.length);
        objArr[6] = Integer.valueOf(this.j.length);
        return String.format("OutgoingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, hasCallback: %s, textPayloadsSize: %s, filePayloadsSize: %s, wifiCredentialPayloadsSize: %s>", objArr);
    }
}
