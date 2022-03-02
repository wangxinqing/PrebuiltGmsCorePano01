package defpackage;

/* renamed from: anlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum anlk implements anlp {
    CRC_32("Hashing.crc32()"),
    ADLER_32("Hashing.adler32()");
    
    public final anli c;

    private anlk(String str) {
        this.c = new anlc(this, str);
    }
}
