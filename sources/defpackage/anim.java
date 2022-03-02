package defpackage;

/* renamed from: anim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum anim {
    STRING('s', anio.GENERAL, "-#", true),
    BOOLEAN('b', anio.BOOLEAN, "-", true),
    CHAR('c', anio.CHARACTER, "-", true),
    DECIMAL('d', anio.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', anio.INTEGRAL, "-#0(", false),
    HEX('x', anio.INTEGRAL, "-#0(", true),
    FLOAT('f', anio.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', anio.FLOAT, "-#0+ (", true),
    GENERAL('g', anio.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', anio.FLOAT, "-#0+ ", true);
    
    public static final anim[] k = null;
    public final char l;
    public final anio m;
    public final int n;
    public final String o;

    static {
        int i;
        k = new anim[26];
        for (anim anim : values()) {
            k[a(anim.l)] = anim;
        }
    }

    private anim(char c, anio anio, String str, boolean z) {
        this.l = c;
        this.m = anio;
        this.n = anin.a(str, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.o = sb.toString();
    }

    public static int a(char c) {
        return (c | ' ') - 'a';
    }
}
