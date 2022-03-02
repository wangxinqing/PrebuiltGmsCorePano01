package defpackage;

/* renamed from: autn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum autn {
    NONE(1, "InvalidDoNotUseForJCA"),
    AES_256_CBC(2, "AES/CBC/PKCS5Padding");
    
    public final String c;
    public final int d;

    private autn(int i, String str) {
        this.d = i;
        this.c = str;
    }
}
