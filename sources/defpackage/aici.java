package defpackage;

import java.io.DataInputStream;
import java.io.File;

/* renamed from: aici  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aici implements Comparable {
    public final File a;
    public final DataInputStream b;
    public final long c;
    public final short[] d;
    public final long e;

    public aici(File file, DataInputStream dataInputStream, long j, short[] sArr, long j2) {
        this.a = file;
        this.b = dataInputStream;
        this.c = j;
        this.d = sArr;
        this.e = j2;
    }

    public final long a() {
        return this.c + this.e;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (a() > ((aici) obj).a() ? 1 : (a() == ((aici) obj).a() ? 0 : -1));
    }
}
