package defpackage;

/* renamed from: jkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkq {
    public static String a(String str) {
        return String.format("com.google.android.gms.phenotype.%s.COMMITTED", new Object[]{str});
    }

    public static String b(String str) {
        return ((str.hashCode() == 325967270 && str.equals("com.google.android.gms")) ? (char) 0 : 65535) != 0 ? String.valueOf(str).concat("_ph_flags") : "direct_boot:gms_chimera_phenotype_flags";
    }
}
