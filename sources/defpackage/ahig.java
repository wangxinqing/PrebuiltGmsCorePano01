package defpackage;

/* renamed from: ahig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahig implements ahic {
    private final ahic a;

    public ahig(ahic ahic) {
        this.a = ahic;
    }

    public static final int a(String str) {
        if (str != null) {
            return ahif.a[Math.abs(str.hashCode()) % ahif.a.length];
        }
        return ahif.a[0];
    }

    public final CharSequence a(agay agay) {
        String str;
        ahic ahic = this.a;
        if (agay == null) {
            return null;
        }
        for (String str2 : agay.a) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str2 = null;
            } else if (str2.length() > 2) {
                ahik ahik = ((ahie) ahic).a;
                amrl.b(ahik.e);
                ou ouVar = (ou) ahik.d.get();
                if (ouVar != null) {
                    int length = str2.length();
                    str = null;
                    for (int i = 0; i < length && ouVar != null; i++) {
                        ahij ahij = (ahij) ouVar.get(Character.valueOf(str2.charAt(i)));
                        if (ahij == null) {
                            break;
                        }
                        String str3 = ahij.a;
                        if (str3 != null) {
                            str = str3;
                        }
                        ouVar = ahij.b;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString();
                } else {
                    str2 = str;
                }
            }
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }
}
