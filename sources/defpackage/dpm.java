package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: dpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dpm {
    public int a;
    public final ByteArrayOutputStream b = new ByteArrayOutputStream();
    final /* synthetic */ dpn c;

    public dpm(dpn dpn) {
        this.c = dpn;
    }

    public final byte[] a() {
        return this.b.toByteArray();
    }
}
