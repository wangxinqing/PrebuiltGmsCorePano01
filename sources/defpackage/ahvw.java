package defpackage;

/* renamed from: ahvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvw {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        StringBuilder sb = new StringBuilder(208);
        sb.append("UploadSummary [numFileOpenSucc=");
        sb.append(i);
        sb.append(", numFileOpenFailed=");
        sb.append(i2);
        sb.append(", numFileOpenInterrupted=");
        sb.append(i3);
        sb.append(", numInvalidFileFormat=");
        sb.append(i4);
        sb.append(", numGLocUploadSucc=");
        sb.append(i5);
        sb.append(", numGLocUploadFailed=");
        sb.append(i6);
        sb.append("]");
        return sb.toString();
    }
}
