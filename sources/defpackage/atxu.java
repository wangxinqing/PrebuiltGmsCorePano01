package defpackage;

/* renamed from: atxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atxu implements apyi {
    public static final agfe a = agfe.a("footprints.oneplatform.FootprintsService.");
    public static final apyg b = new atxo();
    public static final apyg c = new atxp();
    public static final apyg d = new atxq();
    public static final apyg e = new atxr();
    public static final apyg f = new atxs();
    public static final apyg g = new atxt();
    public static final atxu h = new atxu();
    private static final agfe j = agfe.a("footprints.oneplatform.FootprintsService/");
    private static final agfe l = agfe.a("footprints-pa.googleapis.com");
    public final anax i = anax.j().a();
    private final anaf k;

    static {
        agfe.a("footprints.oneplatform.FootprintsService");
    }

    private atxu() {
        amzt j2 = amzy.j();
        j2.c("autopush-footprints-pa.sandbox.googleapis.com");
        j2.c("autopushsearchqual-footprints-pa.sandbox.googleapis.com");
        j2.c("staging-footprints-pa.sandbox.googleapis.com");
        j2.c("footprints-pa.googleapis.com");
        j2.a();
        anax.a(b, c, d, e, f, g, new apyg[0]);
        anab h2 = anaf.h();
        h2.a("Read", b);
        h2.a("Write", c);
        h2.a("GetActivityControlsSettings", d);
        h2.a("UpdateActivityControlsSettings", e);
        h2.a("GetSettingText", f);
        h2.a("GetDeletions", g);
        this.k = h2.a();
        anaf.h().a();
    }

    public final agfe a() {
        return l;
    }

    public final String b() {
        return null;
    }

    public final apyg a(String str) {
        String str2 = j.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.k.containsKey(substring)) {
            return (apyg) this.k.get(substring);
        }
        return null;
    }
}
